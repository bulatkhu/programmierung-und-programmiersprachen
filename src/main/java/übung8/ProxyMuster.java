package übung8;

import java.util.ArrayList;

public class ProxyMuster {
    public static void main(String[] args) {
        try {
            ProxyInternetConnection internet = new ProxyInternetConnection(false);
            internet.connectToHost("x.com");
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}

interface InternetConnection {
    public void connectToHost(String host) throws Exception;
}

class NetworkInternetConnection implements InternetConnection {
    @Override
    public void connectToHost(String host) {
        System.out.printf("Connection to %s established successfully%n", host);
    }
}

class ProxyInternetConnection implements InternetConnection {
    private InternetConnection internetConnection = new NetworkInternetConnection();
    private ArrayList<String> whiteList = new ArrayList<>();
    private ArrayList<String> blackList = new ArrayList<>();
    private boolean useWhitelist;

    public ProxyInternetConnection(boolean useWhitelist) {
        this.useWhitelist = useWhitelist;

        whiteList.add("google.com");
        whiteList.add("chat.openai.com");

        blackList.add("x.com");
        blackList.add("facebook.com");
    }

    @Override
    public void connectToHost(String host) throws Exception {
        if (useWhitelist) {
            if (whiteList.contains(host)) {
                internetConnection.connectToHost(host);
                return;
            }

            throw new Exception(String.format("Access denied for host: %s %n", host));
        }

        if (blackList.contains(host)) {
            throw new Exception(String.format("Access denied for host: %s %n", host));
        }

        internetConnection.connectToHost(host);
    }
}
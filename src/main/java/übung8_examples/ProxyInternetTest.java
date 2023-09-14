package übung8_examples;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternetTest {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet(new RealInternet());
        internet.connectTo("banned.com");
        internet.connectTo("google.com");
    }
}

interface Internet {
    void connectTo(String host);
}

class RealInternet implements Internet {
    @Override
    public void connectTo(String host) {
        System.out.println("Opened connection to " + host);
    }
}

class ProxyInternet extends RealInternet implements Internet {
    private ArrayList<String> bannedHosts = new ArrayList<>(List.of(
            "banned.com",
            "banned1.com"
    ));
    private Internet internet;

    public ProxyInternet(Internet internet) {
        this.internet = internet;
    }

    @Override
    public void connectTo(String host) {
        if (bannedHosts.contains(host)) {
            System.out.println("Access denied for host: " + host);
            return;
        }
        this.internet.connectTo(host);
    }
}
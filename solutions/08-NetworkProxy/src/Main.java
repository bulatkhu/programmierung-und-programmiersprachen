public class Main {
    public static void main(String[] args) {
        NetworkInternetConnection con = new NetworkInternetConnection();

        BlockingInternetConnection proxy = new BlockingInternetConnection(con,
                BlockingInternetConnection.BlockMode.USE_BLACKLIST);

            connect(proxy, "reddit.com");
            connect(proxy, "tagesschau.de");
            connect(proxy, "rub.de");

            proxy.setBlockMode(BlockingInternetConnection.BlockMode.USE_WHITELIST);
            connect(proxy, "reddit.com");
            connect(proxy, "tagesschau.de");
            connect(proxy, "rub.de");

    }

    private static void connect(InternetConnection connection, String host) {
        try {
            connection.connectToHost(host);
        } catch (NetworkInternetException e) {
            System.out.println("Network Access Error: Could not access " + e.getHost()
                    + "\nMessage: " + e.getMessage());
        }
    }
}

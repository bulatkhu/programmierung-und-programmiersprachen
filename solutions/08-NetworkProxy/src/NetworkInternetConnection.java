public class NetworkInternetConnection implements InternetConnection {
    @Override
    public void connectToHost(String host) throws NetworkInternetException {
        System.out.println("Accessing " + host);
    }
}

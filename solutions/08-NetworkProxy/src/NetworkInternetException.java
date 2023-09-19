public class NetworkInternetException extends Exception {
    private String host;
    private int errorCode;

    public NetworkInternetException(String message, String host, int errorCode) {
        super(message);
        this.errorCode = errorCode;
        this.host = host;
    }

    public String getHost() {
        return host;
    }

    public int getErrorCode() {
        return errorCode;
    }
}

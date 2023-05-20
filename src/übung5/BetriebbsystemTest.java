package übung5;

public class BetriebbsystemTest {
    public static void main(String[] args) {
        boolean isWin =
                System.getProperty("os.name").startsWith("Windows");
        boolean isMac = System.getProperty("os.name").startsWith("Mac");
        boolean isLinux =
                System.getProperty("os.name").startsWith("Linux");

        Strategie str;
        if (isWin) {
            str = new WindowsStrategie();
        } else if (isMac) {
            str = new MacStrategie();
        } else if (isLinux) {
            str = new LinuxStrategie();
        } else {
            str = null;
            System.out.println("OS nicht feststellbar");
        }

        Betriebssystem bs = new Betriebssystem(str);
        System.out.println(bs);
    }
}

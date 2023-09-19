import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BlockingInternetConnection implements InternetConnection {

    private InternetConnection connection;
    public enum BlockMode {
        USE_WHITELIST,
        USE_BLACKLIST,
        DISABLE
    }
    private BlockMode blockMode;

    private List<String> whitelist, blacklist;

    public BlockingInternetConnection(InternetConnection connection, BlockMode blockMode) {
        this.connection = connection;
        this.blockMode = blockMode;

        try {
            whitelist = Files.readAllLines(Path.of("whitelist.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            blacklist = Files.readAllLines(Path.of("blacklist.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void connectToHost(String host) throws NetworkInternetException {

        if(blockMode == BlockMode.USE_WHITELIST) {
            if(whitelist.contains(host)) {
                connection.connectToHost(host);
            }
            else {
                throw new NetworkInternetException(host + " not in Whitelist. Blocked!", host, 403);
            }
        }

        if(blockMode == BlockMode.USE_BLACKLIST) {
            if(!blacklist.contains(host)) {
                connection.connectToHost(host);
            }
            else {
                throw new NetworkInternetException(host + " on Blacklist. Blocked!", host, 418);
            }
        }

        if(blockMode == BlockMode.DISABLE) {
            connection.connectToHost(host);
        }
    }

    public BlockMode getBlockMode() {
        return blockMode;
    }

    public void setBlockMode(BlockMode blockMode) {
        this.blockMode = blockMode;
    }
}

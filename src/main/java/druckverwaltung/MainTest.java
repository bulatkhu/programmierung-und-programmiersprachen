package druckverwaltung;

import java.util.LinkedList;

public class MainTest {
    public static void main(String[] args) {
        Farbdrucker farbdrucker = new Farbdrucker();
        VirtualDrucker virtualdrucker = new VirtualDrucker();

        VirtualDruckCommand command1 = new VirtualDruckCommand(virtualdrucker, "datei 1", "output");
        VirtualDruckCommand command2 = new VirtualDruckCommand(virtualdrucker, "datei 2", "output");

        FarbDruckerCommand command3 = new FarbDruckerCommand(farbdrucker, true, "datei 3");
        FarbDruckerCommand command4 = new FarbDruckerCommand(farbdrucker, false, "datei 4");

        DruckZentrum druckZentrum = new DruckZentrum();

        druckZentrum.druckAnfordern(command1);
        druckZentrum.druckAnfordern(command2);
        druckZentrum.druckAnfordern(command3);
        druckZentrum.druckAnfordern(command4);

        druckZentrum.druckeAbbrechen();

        druckZentrum.druckeNaechste();
        druckZentrum.druckeNaechste();
        druckZentrum.druckeNaechste();
    }
}

class DruckZentrum {
    private Farbdrucker farbdrucker = new Farbdrucker();
    private VirtualDrucker virtualDrucker = new VirtualDrucker();
    private LinkedList<DruckCommand> commands = new LinkedList<>();

    public void druckeNaechste() {
        DruckCommand command = commands.removeLast();
        if (command != null) {
            command.drucken();
//            System.out.printf("Printing the last file: %s%n", command.getDatei());
        }
    }

    public void druckAnfordern(DruckCommand cmd) {
        commands.add(cmd);
        System.out.printf("File: %s added to the printing queue%n", cmd.getDatei());
    }

    public void druckeAbbrechen() {
        var cmd = commands.removeLast();
        if (cmd != null) {
            System.out.printf("Last file: %s printing has been canceled%n", cmd.getDatei());
        }
    }

    public void printQueueContent() {
        commands.forEach(command -> {
            System.out.printf("File: %s added to the printing queue%n", command.getDatei());
        });
    }
}

class VirtualDruckCommand implements DruckCommand {
    private final String datei;
    private final String output;
    private final VirtualDrucker drucker;

    public VirtualDruckCommand(VirtualDrucker drucker, String datei, String output) {
        this.drucker = drucker;
        this.datei = datei;
        this.output = output;
    }

    public void drucken() {
        drucker.drucken(datei, output);
    }

    public String getDatei() {
        return datei;
    }
}

class FarbDruckerCommand implements DruckCommand {
    private final boolean isBeidseitig;
    private final String datei;
    private final Farbdrucker farbdrucker;

    public FarbDruckerCommand(Farbdrucker farbdrucker, boolean isBeidseitig, String datei) {
        this.isBeidseitig = isBeidseitig;
        this.datei = datei;
        this.farbdrucker = farbdrucker;
    }

    @Override
    public void drucken() {
        farbdrucker.setBeidseitig(isBeidseitig);
        farbdrucker.drucken(datei);
    }

    public String getDatei() {
        return datei;
    }
}

interface DruckCommand {
    public void drucken();
    public String getDatei();
}

class Farbdrucker {
    private boolean isBeidseitig;

    public void setBeidseitig(boolean value) {
        isBeidseitig = value;
    }

    public void drucken(String datei) {
        System.out.printf("Printing using color printer data: %s | both sides: %s%n", datei, isBeidseitig);
    }
}

class VirtualDrucker {
    public void drucken(String datei, String output) {
        System.out.printf("Printing using virtual printer data: %s | output: %s%n", datei, output);

    }
}
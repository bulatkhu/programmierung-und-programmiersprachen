import javax.swing.*;
import java.awt.event.*;

public class UniplanerGUI extends JDialog {
    private JPanel contentPane;
    private JList<Veranstaltung> listVeranstaltungen;
    private JButton loeschenButton;
    private JButton hinzufuegenButton;
    private JTextField nameTextField;
    private JComboBox<String> wochentagComboBox;
    private JSpinner dauerSpinner;
    private JTextField uhrzeitTextField;
    private JRadioButton vorlesungRadioButton;
    private JRadioButton übungRadioButton;
    private JTextArea notizenTextArea;
    private JButton speichernButton;
    private JPanel customPanel;

    public UniplanerGUI() {
        setContentPane(contentPane);
        setModal(true);

        setTitle("Uniplaner");

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onClosing();
            }
        });

        customPanel.add(new StundenplanViz());

        JMenuBar menuBar = new JMenuBar();
        JMenu dateiMenu = new JMenu("Datei");
        menuBar.add(dateiMenu);
        JMenuItem quitMenuItem = new JMenuItem("Beenden");
        quitMenuItem.addActionListener(e -> onClosing());
        dateiMenu.add(quitMenuItem);
        setJMenuBar(menuBar);

        DefaultListModel<Veranstaltung> listModel = new DefaultListModel<>();
        Veranstaltung v1 = new Veranstaltung("ProPro");
        v1.setNotizen("Klausurtermin am 15.09.");
        v1.setTyp(Veranstaltung.Typ.VORLESUNG);
        v1.setUhrzeit("16:15");

        Veranstaltung v2 = new Veranstaltung("WebEng");
        v2.setWochentag("Dienstag");
        v2.setTyp(Veranstaltung.Typ.UEBUNG);
        v2.setUhrzeit("10:15");


        listModel.addElement(v1);
        listModel.addElement(v2);
        listVeranstaltungen.setModel(listModel);

        listVeranstaltungen.addListSelectionListener(e -> {
            if(e.getValueIsAdjusting())
                return;

            Veranstaltung ausgewaehlt = listVeranstaltungen.getSelectedValue();
            if(ausgewaehlt == null) {
                return;
            }

            nameTextField.setText(ausgewaehlt.getName());
            wochentagComboBox.setSelectedItem(ausgewaehlt.getWochentag());
            uhrzeitTextField.setText(ausgewaehlt.getUhrzeit());
            dauerSpinner.setValue(ausgewaehlt.getDauer());
            vorlesungRadioButton.setSelected(ausgewaehlt.getTyp() == Veranstaltung.Typ.VORLESUNG);
            übungRadioButton.setSelected(ausgewaehlt.getTyp() == Veranstaltung.Typ.UEBUNG);
            notizenTextArea.setText(ausgewaehlt.getNotizen());
        });

        speichernButton.addActionListener(e -> {
            Veranstaltung ausgewaehlt = listVeranstaltungen.getSelectedValue();
            if(ausgewaehlt == null) {
                return;
            }

            ausgewaehlt.setName(nameTextField.getText());
            ausgewaehlt.setWochentag(wochentagComboBox.getSelectedItem() + "");
            ausgewaehlt.setUhrzeit(uhrzeitTextField.getText());
            ausgewaehlt.setDauer((Integer) dauerSpinner.getValue());
            ausgewaehlt.setTyp(vorlesungRadioButton.isSelected() ? Veranstaltung.Typ.VORLESUNG : Veranstaltung.Typ.UEBUNG);
            ausgewaehlt.setNotizen(notizenTextArea.getText());

            listVeranstaltungen.updateUI();
        });


        hinzufuegenButton.addActionListener(e -> {
            listModel.addElement(new Veranstaltung("Neue Veranstaltung"));
            listVeranstaltungen.setSelectedIndex(listModel.size() - 1);
        });

        loeschenButton.addActionListener(e -> {
            int index = listVeranstaltungen.getSelectedIndex();
            if(index >= 0)
                listModel.remove(index);
            if(index < listModel.size())
                listVeranstaltungen.setSelectedIndex(index);
            else
                listVeranstaltungen.setSelectedIndex(listModel.size() - 1);
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onClosing();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onClosing() {
        // add your code here if necessary
        dispose();
    }

    public static void main(String[] args) {
        UniplanerGUI dialog = new UniplanerGUI();
        dialog.setSize(700, 500);
        dialog.setVisible(true);
        System.exit(0);
    }
}

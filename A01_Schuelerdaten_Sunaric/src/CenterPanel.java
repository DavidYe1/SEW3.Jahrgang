import javax.swing.*;
import java.awt.*;

/**
 * Panel , welches sich in der Mitte des Frames befindet
 *
 * @author Dragana Sunaric
 * @version 2015/09/11
 */
class CenterPanel extends JPanel {
    private final JTextField vName;
    private final JTextField nName;
    private final JTextField gebDatum;
    private final JRadioButton weib;

    /**
     * Kontruktor f�r das CenterPanel
     */
    public CenterPanel() {
        /*
		 * Initialisierung der Attribute 
		 */
        this.vName = new JTextField();
        this.nName = new JTextField();
        this.gebDatum = new JTextField();
        this.weib = new JRadioButton("weiblich", true);
        JRadioButton maenn = new JRadioButton("maennlich");
        ButtonGroup bg = new ButtonGroup();
        bg.add(this.weib);
        bg.add(maenn);
		
		/*
		 * Visualisierung der Attribute + Labels
		 */
        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        this.add(new JLabel("Familienname: "), gbc);
        gbc.gridx = 1;
        this.add(this.nName, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        this.add(new JLabel("Vorname: "), gbc);
        gbc.gridx = 1;
        this.add(this.vName, gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
        this.add(new JLabel("Geschlecht: "), gbc);
        gbc.gridx = 1;
        this.add(this.weib, gbc);
        gbc.gridy = 3;
        this.add(maenn, gbc);
        gbc.gridx = 0;
        gbc.gridy = 4;
        this.add(new JLabel("Geburtsdatum (dd.mm.yyyy): "), gbc);
        gbc.gridx = 1;
        this.add(this.gebDatum, gbc);
        this.setVisible(true);
    }

    /**
     * Methode welche alle Textboxes als "" initialisiert
     */
    public void resetTextboxes() {
        this.nName.setText("");
        this.vName.setText("");
        this.gebDatum.setText("");
    }

    /**
     * Methode , welche den Vornamen zur�ckgibt
     *
     * @return den Vornamen
     */
    public String getvName() {
        return this.vName.getText();
    }

    /**
     * Methode , welche den Nachnamen zur�ckgibt
     *
     * @return den Nachnamen
     */
    public String getnName() {
        return this.nName.getText();
    }

    /**
     * Methode , welche das Geburtsdatum als String zur�ckgibt
     *
     * @return das Geburtsdatum
     */
    public String getGebDatum() {
        return this.gebDatum.getText();
    }

    /**
     * Methode , welche das Geschlecht zur�ckgibt
     *
     * @return das Geschlecht
     */
    public boolean getGesch() {
        return this.weib.isSelected();
    }

    /**
     * setze den Text der gebdatum Textbox rot
     */
    public void redTextBox() {
        this.gebDatum.setForeground(Color.RED);
    }

    /**
     * setze den Text der gebdatum Textbox schwarz
     */
    public void blackTextBox() {
        this.gebDatum.setForeground(Color.BLACK);
    }
}

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Controller Klasse (Actionlistener)
 *
 * @author Dragana Sunaric
 * @version 2015/09/11
 */
class Controller implements ActionListener {
    private final View v;
    private final Schueler m;
    private final CenterPanel cP;

    /**
     * Kontruktor f�r den Controller
     */
    public Controller() {
        this.cP = new CenterPanel();
        SouthPanel sP = new SouthPanel(this);
        this.v = new View(this, sP, this.cP);
        this.m = new Schueler();
    }

    /**
     * bearbeitet Events
     *
     * @param e
     */
    public void actionPerformed(ActionEvent e) {
        if (this.v.isExitButton(e)) System.exit(0);
        if (this.v.isSaveButton(e)) {
            this.m.setVorName(this.cP.getvName());
            this.m.setFamName(this.cP.getnName());
            this.m.setGeschlecht(this.cP.getGesch());
            if (!this.m.setGebDatum(this.cP.getGebDatum())) this.cP.redTextBox();
            else {
                this.cP.blackTextBox();
                this.m.printAll();

            }
        }
        if (this.v.isResetButton(e)) this.v.resetTextboxes();
    }
}

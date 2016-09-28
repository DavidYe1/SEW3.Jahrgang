import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * View Klasse , erstellt ein Frame
 *
 * @author Dragana Sunaric
 * @version 2015/09/11
 */
class View extends JFrame {
    private final CenterPanel cP;//Panel - center
    private final SouthPanel sP;//Panel - south

    /**
     * Konstruktor f�r das Frame
     *
     * @param c  , der Controller
     * @param sp , Panel f�r den unteren Gereich des Frames
     * @param cp , Panel f�r den mittleren Bereich des Frames
     */
    public View(Controller c, SouthPanel sp, CenterPanel cp) {
        super();
        this.setSize(500, 300);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        this.cP = cp;
        this.sP = sp;
        JLabel l = null;
        l = new JLabel("Schuelerdaten", SwingConstants.CENTER);
        Font f1 = l.getFont();
        Font f2 = f1.deriveFont(Font.BOLD, 30);
        l.setFont(f2);
        this.add(l, BorderLayout.NORTH);
        this.add(this.cP, BorderLayout.CENTER);
        this.add(this.sP, BorderLayout.SOUTH);
        this.setVisible(true);
    }

    /**
     * Methode welche angibt ob der resset button gedr�ckt wurde oder nicht
     *
     * @param e , das ActionEvent
     * @return true - wenn der reset button gedruckt wurde
     * false - wenn nicht
     */
    public boolean isResetButton(ActionEvent e) {
        return this.sP.isResetButton(e);
    }

    /**
     * Methode welche angibt ob der save button gedr�ckt wurde oder nicht
     *
     * @param e , das ActionEvent
     * @return true - wenn der save button gedruckt wurde
     * false - wenn nicht
     */
    public boolean isSaveButton(ActionEvent e) {
        return this.sP.isSaveButton(e);
    }

    /**
     * Methode welche angibt ob der exit button gedr�ckt wurde oder nicht
     *
     * @param e , das ActionEvent
     * @return true - wenn der exit button gedruckt wurde
     * false - wenn nicht
     */
    public boolean isExitButton(ActionEvent e) {
        return this.sP.isExitButton(e);
    }

    /**
     * ruft methode auf , welche alle textboxes mit "" initialisiert
     */
    public void resetTextboxes() {
        this.cP.resetTextboxes();
    }
}

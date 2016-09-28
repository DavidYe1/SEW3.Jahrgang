import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * Panel welches sich im unteren Teil des Frames befindet
 *
 * @author Dragana Sunaric
 * @version 2015/09/11
 */
class SouthPanel extends JPanel {
    private final JButton reset;
    private final JButton save;
    private final JButton exit;

    /**
     * Konstrukor der Klasse SouthPanel
     *
     * @param c
     */
    public SouthPanel(Controller c) {
        super();
        this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        this.add(Box.createHorizontalGlue());
        this.add(Box.createRigidArea(new Dimension(100, 0)));
        this.reset = new JButton("reset");
        this.save = new JButton("save");
        this.exit = new JButton("exit");
        this.add(this.reset);
        this.add(Box.createRigidArea(new Dimension(37, 0)));
        this.add(this.save);
        this.add(Box.createRigidArea(new Dimension(38, 0)));
        this.add(this.exit);
        this.add(Box.createRigidArea(new Dimension(100, 0)));
        this.reset.addActionListener(c);
        this.save.addActionListener(c);
        this.exit.addActionListener(c);
    }

    /**
     * @param e , das Actionevent
     * @return true - wenn reset buton gedr�ckt wurde
     * false - wenn nicht
     */
    public boolean isResetButton(ActionEvent e) {
        return e.getSource() == this.reset;
    }

    /**
     * @param e , das Actionevent
     * @return true - wenn save buton gedr�ckt wurde
     * false - wenn nicht
     */
    public boolean isSaveButton(ActionEvent e) {
        return e.getSource() == this.save;
    }

    /**
     * @param e , das Actionevent
     * @return true - wenn exit buton gedr�ckt wurde
     * false - wenn nicht
     */
    public boolean isExitButton(ActionEvent e) {
        return e.getSource() == this.exit;
    }
}

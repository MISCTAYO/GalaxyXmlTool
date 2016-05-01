package xmltoolgui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by msproteo on 10/12/15.
 */
public class TranslucentPane extends JPanel {

    public TranslucentPane() {
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setComposite(AlphaComposite.SrcOver.derive(0.85f));
        g2d.setColor(getBackground());
        g2d.fillRect(0, 0, getWidth(), getHeight());

    }

}
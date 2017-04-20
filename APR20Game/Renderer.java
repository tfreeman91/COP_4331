package pong;

import java.awt.*;
import javax.swing.*;

public class Renderer extends JPanel
{
    private static final long serialVersionUID = 1L;

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        try {
            Pong.pong.render((Graphics2D) g);
        }
        catch (Exception ex) {
        }
    }
}
import javax.swing.*;
import java.awt.*;

public class HexagonoApp extends JFrame {

    public HexagonoApp() {
        setTitle("Hexágono en el Plano Cartesiano");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // Establecer el color para las líneas y cuadrantes
        g.setColor(Color.BLUE);

        // Dibujar ejes X e Y
        g.drawLine(200, 0, 200, 400);
        g.drawLine(0, 200, 400, 200);

        // Dibujar líneas para cuadrantes
        g.drawLine(200, 0, 200, 200);
        g.drawLine(0, 200, 200, 200);
        g.drawLine(200, 0, 0, 200);

        g.drawLine(200, 400, 200, 200);
        g.drawLine(400, 200, 200, 200);
        g.drawLine(200, 400, 400, 200);

        // Dibujar el hexágono
        int[] xPoints = {200, 250, 350, 400, 350, 250};
        int[] yPoints = {150, 100, 100, 150, 200, 200};
        int nPoints = 6;

        g.drawPolygon(xPoints, yPoints, nPoints);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new HexagonoApp());
    }
}



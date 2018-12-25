import javax.swing.*;
import java.awt.*;

public class Decorations extends JPanel {

    private Color color = new Color(224,224,224);
    private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    Decorations(int[][] matrix){
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.setPreferredSize(new Dimension(screenSize.width/2, screenSize.width/2-370));

        JPanel rare5Panel = new Rare5Deco(matrix);
        rare5Panel.setBackground(color);
        JPanel rare6Panel = new Rare6Deco(matrix);
        rare6Panel.setBackground(color);
        JPanel rare7Panel = new Rare7Deco(matrix);
        rare7Panel.setBackground(color);
        JPanel rare8Panel = new Rare8Deco(matrix);
        rare8Panel.setBackground(color);

        tabbedPane.addTab("Rare 5", rare5Panel);
        tabbedPane.addTab("Rare 6", rare6Panel);
        tabbedPane.addTab("Rare 7", rare7Panel);
        tabbedPane.addTab("Rare 8", rare8Panel);

        add(tabbedPane);
    }
}

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.io.PrintWriter;

public class Times extends JPanel {
    private Color color = new Color(224,224,224);
    private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    private int gap = (screenSize.width/2-300)*6/165;
    private Dimension wideGap = new Dimension(5, gap);
    private Dimension widerGap = new Dimension(5, gap*7/5);
    private JTextArea DevNormMin, KirinNormMin, NergNormMin, VaalNormMin, TeoNormMin, DaoNormMin, LunaNormMin, XenoNormMin, 
            DevTempMin, KirinTempMin, NergTempMin, VaalTempMin, TeoTempMin, DaoTempMin, LunaTempMin, XenoTempMin,
            DevArchMin, KirinArchMin, NergArchMin, VaalArchMin, TeoArchMin, DaoArchMin, LunaArchMin, XenoArchMin,
            DevNormSec, KirinNormSec, NergNormSec, VaalNormSec, TeoNormSec, DaoNormSec, LunaNormSec, XenoNormSec,
            DevTempSec, KirinTempSec, NergTempSec, VaalTempSec, TeoTempSec, DaoTempSec, LunaTempSec, XenoTempSec,
            DevArchSec, KirinArchSec, NergArchSec, VaalArchSec, TeoArchSec, DaoArchSec, LunaArchSec, XenoArchSec;

    Times(int[][] matrix){

        setPreferredSize(new Dimension(screenSize.width/2, screenSize.width/2-370));
        Box timeBox = Box.createHorizontalBox();

        Box DevNameBox = Box.createHorizontalBox();
        JLabel DevLabel = new JLabel("恐暴龙");
        DevLabel.setForeground(new Color(0, 102, 0));
        DevNameBox.add(DevLabel);

        Box KirinNameBox = Box.createHorizontalBox();
        JLabel KirinLabel = new JLabel("麒麟    ");
        KirinLabel.setForeground(new Color(255, 255, 255));
        KirinNameBox.add(KirinLabel);

        Box NergNameBox = Box.createHorizontalBox();
        JLabel NergLabel = new JLabel("灭尽龙");
        NergLabel.setForeground(new Color(204, 204, 204));
        NergNameBox.add(NergLabel);

        Box VaalNameBox = Box.createHorizontalBox();
        JLabel VaalLabel = new JLabel("尸套龙");
        VaalLabel.setForeground(new Color(224, 224, 224));
        VaalNameBox.add(VaalLabel);

        Box TeoNameBox = Box.createHorizontalBox();
        JLabel TeoLabel = new JLabel("炎王龙");
        TeoLabel.setForeground(new Color(190, 0, 0));
        TeoNameBox.add(TeoLabel);

        Box DaoNameBox = Box.createHorizontalBox();
        JLabel DaoLabel = new JLabel("钢龙   ");
        DaoLabel.setForeground(new Color(204, 204, 204));
        DaoNameBox.add(DaoLabel);

        Box LunaNameBox = Box.createHorizontalBox();
        JLabel LunaLabel = new JLabel("炎妃龙");
        LunaLabel.setForeground(new Color(68, 90, 232));
        LunaNameBox.add(LunaLabel);

        Box XenoNameBox = Box.createHorizontalBox();
        JLabel XenoLabel = new JLabel("冥灯龙");
        XenoLabel.setForeground(new Color(255, 255, 255));
        XenoNameBox.add(XenoLabel);

        Box NameBox = Box.createVerticalBox();
        NameBox.add(Box.createRigidArea(new Dimension(5, 4*gap)));
        NameBox.add(DevNameBox);
        NameBox.add(Box.createRigidArea(widerGap));
        NameBox.add(KirinNameBox);
        NameBox.add(Box.createRigidArea(widerGap));
        NameBox.add(NergNameBox);
        NameBox.add(Box.createRigidArea(widerGap));
        NameBox.add(VaalNameBox);
        NameBox.add(Box.createRigidArea(widerGap));
        NameBox.add(TeoNameBox);
        NameBox.add(Box.createRigidArea(widerGap));
        NameBox.add(DaoNameBox);
        NameBox.add(Box.createRigidArea(widerGap));
        NameBox.add(LunaNameBox);
        NameBox.add(Box.createRigidArea(widerGap));
        NameBox.add(XenoNameBox);
        NameBox.add(Box.createRigidArea(widerGap));
        
        Box NormBox = NormBoxGen(matrix);
        Box TempBox = TempBoxGen(matrix);
        Box ArchBox = ArchBoxGen(matrix);

        timeBox.add(NameBox);
        timeBox.add(Box.createRigidArea(new Dimension(70, 5)));
        timeBox.add(NormBox);
        timeBox.add(Box.createRigidArea(new Dimension(70, 5)));
        timeBox.add(TempBox);
        timeBox.add(Box.createRigidArea(new Dimension(70, 5)));
        timeBox.add(ArchBox);
        
        add(timeBox);
    }
    
    private Box NormBoxGen(int[][] matrix){
        Box DevNormBox = Box.createHorizontalBox();
        DevNormMin = new JTextArea();
        DevNormMin.setPreferredSize(new Dimension(50, 25));
        DevNormMin.setText(Integer.toString(matrix[7][0]));
        DevNormSec = new JTextArea();
        DevNormSec.setPreferredSize(new Dimension(50, 25));
        DevNormSec.setText(Integer.toString(matrix[7][1]));
        DevNormBox.add(DevNormMin);
        DevNormBox.add(new JLabel("<html><font color='white'>:</font></html>"));
        DevNormBox.add(DevNormSec);

        Box KirinNormBox = Box.createHorizontalBox();
        KirinNormMin = new JTextArea();
        KirinNormMin.setPreferredSize(new Dimension(50, 25));
        KirinNormMin.setText(Integer.toString(matrix[7][6]));
        KirinNormSec = new JTextArea();
        KirinNormSec.setPreferredSize(new Dimension(50, 25));
        KirinNormSec.setText(Integer.toString(matrix[7][7]));
        KirinNormBox.add(KirinNormMin);
        KirinNormBox.add(new JLabel("<html><font color='white'>:</font></html>"));
        KirinNormBox.add(KirinNormSec);

        Box NergNormBox = Box.createHorizontalBox();
        NergNormMin = new JTextArea();
        NergNormMin.setPreferredSize(new Dimension(50, 25));
        NergNormMin.setText(Integer.toString(matrix[7][12]));
        NergNormSec = new JTextArea();
        NergNormSec.setPreferredSize(new Dimension(50, 25));
        NergNormSec.setText(Integer.toString(matrix[7][13]));
        NergNormBox.add(NergNormMin);
        NergNormBox.add(new JLabel("<html><font color='white'>:</font></html>"));
        NergNormBox.add(NergNormSec);

        Box VaalNormBox = Box.createHorizontalBox();
        VaalNormMin = new JTextArea();
        VaalNormMin.setPreferredSize(new Dimension(50, 25));
        VaalNormMin.setText(Integer.toString(matrix[7][18]));
        VaalNormSec = new JTextArea();
        VaalNormSec.setPreferredSize(new Dimension(50, 25));
        VaalNormSec.setText(Integer.toString(matrix[7][19]));
        VaalNormBox.add(VaalNormMin);
        VaalNormBox.add(new JLabel("<html><font color='white'>:</font></html>"));
        VaalNormBox.add(VaalNormSec);

        Box TeoNormBox = Box.createHorizontalBox();
        TeoNormMin = new JTextArea();
        TeoNormMin.setPreferredSize(new Dimension(50, 25));
        TeoNormMin.setText(Integer.toString(matrix[7][24]));
        TeoNormSec = new JTextArea();
        TeoNormSec.setPreferredSize(new Dimension(50, 25));
        TeoNormSec.setText(Integer.toString(matrix[7][25]));
        TeoNormBox.add(TeoNormMin);
        TeoNormBox.add(new JLabel("<html><font color='white'>:</font></html>"));
        TeoNormBox.add(TeoNormSec);

        Box DaoNormBox = Box.createHorizontalBox();
        DaoNormMin = new JTextArea();
        DaoNormMin.setPreferredSize(new Dimension(50, 25));
        DaoNormMin.setText(Integer.toString(matrix[7][30]));
        DaoNormSec = new JTextArea();
        DaoNormSec.setPreferredSize(new Dimension(50, 25));
        DaoNormSec.setText(Integer.toString(matrix[7][31]));
        DaoNormBox.add(DaoNormMin);
        DaoNormBox.add(new JLabel("<html><font color='white'>:</font></html>"));
        DaoNormBox.add(DaoNormSec);

        Box LunaNormBox = Box.createHorizontalBox();
        LunaNormMin = new JTextArea();
        LunaNormMin.setPreferredSize(new Dimension(50, 25));
        LunaNormMin.setText(Integer.toString(matrix[7][36]));
        LunaNormSec = new JTextArea();
        LunaNormSec.setPreferredSize(new Dimension(50, 25));
        LunaNormSec.setText(Integer.toString(matrix[7][37]));
        LunaNormBox.add(LunaNormMin);
        LunaNormBox.add(new JLabel("<html><font color='white'>:</font></html>"));
        LunaNormBox.add(LunaNormSec);

        Box XenoNormBox = Box.createHorizontalBox();
        XenoNormMin = new JTextArea();
        XenoNormMin.setPreferredSize(new Dimension(50, 25));
        XenoNormMin.setText(Integer.toString(matrix[7][42]));
        XenoNormSec = new JTextArea();
        XenoNormSec.setPreferredSize(new Dimension(50, 25));
        XenoNormSec.setText(Integer.toString(matrix[7][43]));
        XenoNormBox.add(XenoNormMin);
        XenoNormBox.add(new JLabel("<html><font color='white'>:</font></html>"));
        XenoNormBox.add(XenoNormSec);

        Box NormBox = Box.createVerticalBox();
        JLabel NormLabel = new JLabel("普通");
        NormLabel.setForeground(Color.white);
        NormBox.add(Box.createRigidArea(new Dimension(5, 2*gap)));
        NormBox.add(NormLabel);
        NormBox.add(Box.createRigidArea(wideGap));
        NormBox.add(DevNormBox);
        NormBox.add(Box.createRigidArea(wideGap));
        NormBox.add(KirinNormBox);
        NormBox.add(Box.createRigidArea(wideGap));
        NormBox.add(NergNormBox);
        NormBox.add(Box.createRigidArea(wideGap));
        NormBox.add(VaalNormBox);
        NormBox.add(Box.createRigidArea(wideGap));
        NormBox.add(TeoNormBox);
        NormBox.add(Box.createRigidArea(wideGap));
        NormBox.add(DaoNormBox);
        NormBox.add(Box.createRigidArea(wideGap));
        NormBox.add(LunaNormBox);
        NormBox.add(Box.createRigidArea(wideGap));
        NormBox.add(XenoNormBox);
        NormBox.add(Box.createRigidArea(wideGap));
        NormLabel.setAlignmentY(CENTER_ALIGNMENT);
        DevNormBox.setAlignmentY(CENTER_ALIGNMENT);
        
        return NormBox;
    }
    
    private Box TempBoxGen(int[][] matrix){
        Box DevTempBox = Box.createHorizontalBox();
        DevTempMin = new JTextArea();
        DevTempMin.setPreferredSize(new Dimension(50, 25));
        DevTempMin.setText(Integer.toString(matrix[7][2]));
        DevTempSec = new JTextArea();
        DevTempSec.setPreferredSize(new Dimension(50, 25));
        DevTempSec.setText(Integer.toString(matrix[7][3]));
        DevTempBox.add(DevTempMin);
        DevTempBox.add(new JLabel("<html><font color='white'>:</font></html>"));
        DevTempBox.add(DevTempSec);

        Box KirinTempBox = Box.createHorizontalBox();
        KirinTempMin = new JTextArea();
        KirinTempMin.setPreferredSize(new Dimension(50, 25));
        KirinTempMin.setText(Integer.toString(matrix[7][8]));
        KirinTempSec = new JTextArea();
        KirinTempSec.setPreferredSize(new Dimension(50, 25));
        KirinTempSec.setText(Integer.toString(matrix[7][9]));
        KirinTempBox.add(KirinTempMin);
        KirinTempBox.add(new JLabel("<html><font color='white'>:</font></html>"));
        KirinTempBox.add(KirinTempSec);

        Box NergTempBox = Box.createHorizontalBox();
        NergTempMin = new JTextArea();
        NergTempMin.setPreferredSize(new Dimension(50, 25));
        NergTempMin.setText(Integer.toString(matrix[7][14]));
        NergTempSec = new JTextArea();
        NergTempSec.setPreferredSize(new Dimension(50, 25));
        NergTempSec.setText(Integer.toString(matrix[7][15]));
        NergTempBox.add(NergTempMin);
        NergTempBox.add(new JLabel("<html><font color='white'>:</font></html>"));
        NergTempBox.add(NergTempSec);

        Box VaalTempBox = Box.createHorizontalBox();
        VaalTempMin = new JTextArea();
        VaalTempMin.setPreferredSize(new Dimension(50, 25));
        VaalTempMin.setText(Integer.toString(matrix[7][20]));
        VaalTempSec = new JTextArea();
        VaalTempSec.setPreferredSize(new Dimension(50, 25));
        VaalTempSec.setText(Integer.toString(matrix[7][21]));
        VaalTempBox.add(VaalTempMin);
        VaalTempBox.add(new JLabel("<html><font color='white'>:</font></html>"));
        VaalTempBox.add(VaalTempSec);

        Box TeoTempBox = Box.createHorizontalBox();
        TeoTempMin = new JTextArea();
        TeoTempMin.setPreferredSize(new Dimension(50, 25));
        TeoTempMin.setText(Integer.toString(matrix[7][26]));
        TeoTempSec = new JTextArea();
        TeoTempSec.setPreferredSize(new Dimension(50, 25));
        TeoTempSec.setText(Integer.toString(matrix[7][27]));
        TeoTempBox.add(TeoTempMin);
        TeoTempBox.add(new JLabel("<html><font color='white'>:</font></html>"));
        TeoTempBox.add(TeoTempSec);

        Box DaoTempBox = Box.createHorizontalBox();
        DaoTempMin = new JTextArea();
        DaoTempMin.setPreferredSize(new Dimension(50, 25));
        DaoTempMin.setText(Integer.toString(matrix[7][32]));
        DaoTempSec = new JTextArea();
        DaoTempSec.setPreferredSize(new Dimension(50, 25));
        DaoTempSec.setText(Integer.toString(matrix[7][33]));
        DaoTempBox.add(DaoTempMin);
        DaoTempBox.add(new JLabel("<html><font color='white'>:</font></html>"));
        DaoTempBox.add(DaoTempSec);

        Box LunaTempBox = Box.createHorizontalBox();
        LunaTempMin = new JTextArea();
        LunaTempMin.setPreferredSize(new Dimension(50, 25));
        LunaTempMin.setText(Integer.toString(matrix[7][38]));
        LunaTempSec = new JTextArea();
        LunaTempSec.setPreferredSize(new Dimension(50, 25));
        LunaTempSec.setText(Integer.toString(matrix[7][39]));
        LunaTempBox.add(LunaTempMin);
        LunaTempBox.add(new JLabel("<html><font color='white'>:</font></html>"));
        LunaTempBox.add(LunaTempSec);

        Box XenoTempBox = Box.createHorizontalBox();
        XenoTempMin = new JTextArea();
        XenoTempMin.setPreferredSize(new Dimension(50, 25));
        XenoTempMin.setText(Integer.toString(matrix[7][44]));
        XenoTempSec = new JTextArea();
        XenoTempSec.setPreferredSize(new Dimension(50, 25));
        XenoTempSec.setText(Integer.toString(matrix[7][45]));
        XenoTempBox.add(XenoTempMin);
        XenoTempBox.add(new JLabel("<html><font color='white'>:</font></html>"));
        XenoTempBox.add(XenoTempSec);

        Box TempBox = Box.createVerticalBox();
        JLabel TempLabel = new JLabel("厉战");
        TempLabel.setForeground(Color.white);
        TempBox.add(Box.createRigidArea(new Dimension(5, 2*gap)));
        TempBox.add(TempLabel);
        TempBox.add(Box.createRigidArea(wideGap));
        TempBox.add(DevTempBox);
        TempBox.add(Box.createRigidArea(wideGap));
        TempBox.add(KirinTempBox);
        TempBox.add(Box.createRigidArea(wideGap));
        TempBox.add(NergTempBox);
        TempBox.add(Box.createRigidArea(wideGap));
        TempBox.add(VaalTempBox);
        TempBox.add(Box.createRigidArea(wideGap));
        TempBox.add(TeoTempBox);
        TempBox.add(Box.createRigidArea(wideGap));
        TempBox.add(DaoTempBox);
        TempBox.add(Box.createRigidArea(wideGap));
        TempBox.add(LunaTempBox);
        TempBox.add(Box.createRigidArea(wideGap));
        TempBox.add(Box.createRigidArea(new Dimension(5, gap*13/12)));
        TempBox.add(Box.createRigidArea(wideGap));
        TempLabel.setAlignmentY(CENTER_ALIGNMENT);
        DevTempBox.setAlignmentY(CENTER_ALIGNMENT);

        return TempBox;
    }
    
    private Box ArchBoxGen(int[][] matrix){
        Box DevArchBox = Box.createHorizontalBox();
        DevArchMin = new JTextArea();
        DevArchMin.setPreferredSize(new Dimension(50, 25));
        DevArchMin.setText(Integer.toString(matrix[7][4]));
        DevArchSec = new JTextArea();
        DevArchSec.setPreferredSize(new Dimension(50, 25));
        DevArchSec.setText(Integer.toString(matrix[7][5]));
        DevArchBox.add(DevArchMin);
        DevArchBox.add(new JLabel("<html><font color='white'>:</font></html>"));
        DevArchBox.add(DevArchSec);

        Box KirinArchBox = Box.createHorizontalBox();
        KirinArchMin = new JTextArea();
        KirinArchMin.setPreferredSize(new Dimension(50, 25));
        KirinArchMin.setText(Integer.toString(matrix[7][10]));
        KirinArchSec = new JTextArea();
        KirinArchSec.setPreferredSize(new Dimension(50, 25));
        KirinArchSec.setText(Integer.toString(matrix[7][11]));
        KirinArchBox.add(KirinArchMin);
        KirinArchBox.add(new JLabel("<html><font color='white'>:</font></html>"));
        KirinArchBox.add(KirinArchSec);

        Box NergArchBox = Box.createHorizontalBox();
        NergArchMin = new JTextArea();
        NergArchMin.setPreferredSize(new Dimension(50, 25));
        NergArchMin.setText(Integer.toString(matrix[7][16]));
        NergArchSec = new JTextArea();
        NergArchSec.setPreferredSize(new Dimension(50, 25));
        NergArchSec.setText(Integer.toString(matrix[7][17]));
        NergArchBox.add(NergArchMin);
        NergArchBox.add(new JLabel("<html><font color='white'>:</font></html>"));
        NergArchBox.add(NergArchSec);

        Box VaalArchBox = Box.createHorizontalBox();
        VaalArchMin = new JTextArea();
        VaalArchMin.setPreferredSize(new Dimension(50, 25));
        VaalArchMin.setText(Integer.toString(matrix[7][22]));
        VaalArchSec = new JTextArea();
        VaalArchSec.setPreferredSize(new Dimension(50, 25));
        VaalArchSec.setText(Integer.toString(matrix[7][23]));
        VaalArchBox.add(VaalArchMin);
        VaalArchBox.add(new JLabel("<html><font color='white'>:</font></html>"));
        VaalArchBox.add(VaalArchSec);

        Box TeoArchBox = Box.createHorizontalBox();
        TeoArchMin = new JTextArea();
        TeoArchMin.setPreferredSize(new Dimension(50, 25));
        TeoArchMin.setText(Integer.toString(matrix[7][28]));
        TeoArchSec = new JTextArea();
        TeoArchSec.setPreferredSize(new Dimension(50, 25));
        TeoArchSec.setText(Integer.toString(matrix[7][29]));
        TeoArchBox.add(TeoArchMin);
        TeoArchBox.add(new JLabel("<html><font color='white'>:</font></html>"));
        TeoArchBox.add(TeoArchSec);

        Box DaoArchBox = Box.createHorizontalBox();
        DaoArchMin = new JTextArea();
        DaoArchMin.setPreferredSize(new Dimension(50, 25));
        DaoArchMin.setText(Integer.toString(matrix[7][34]));
        DaoArchSec = new JTextArea();
        DaoArchSec.setPreferredSize(new Dimension(50, 25));
        DaoArchSec.setText(Integer.toString(matrix[7][35]));
        DaoArchBox.add(DaoArchMin);
        DaoArchBox.add(new JLabel("<html><font color='white'>:</font></html>"));
        DaoArchBox.add(DaoArchSec);

        Box LunaArchBox = Box.createHorizontalBox();
        LunaArchMin = new JTextArea();
        LunaArchMin.setPreferredSize(new Dimension(50, 25));
        LunaArchMin.setText(Integer.toString(matrix[7][40]));
        LunaArchSec = new JTextArea();
        LunaArchSec.setPreferredSize(new Dimension(50, 25));
        LunaArchSec.setText(Integer.toString(matrix[7][41]));
        LunaArchBox.add(LunaArchMin);
        LunaArchBox.add(new JLabel("<html><font color='white'>:</font></html>"));
        LunaArchBox.add(LunaArchSec);

        Box XenoArchBox = Box.createHorizontalBox();
        XenoArchMin = new JTextArea();
        XenoArchMin.setPreferredSize(new Dimension(50, 25));
        XenoArchMin.setText(Integer.toString(matrix[7][46]));
        XenoArchSec = new JTextArea();
        XenoArchSec.setPreferredSize(new Dimension(50, 25));
        XenoArchSec.setText(Integer.toString(matrix[7][47]));
        XenoArchBox.add(XenoArchMin);
        XenoArchBox.add(new JLabel("<html><font color='white'>:</font></html>"));
        XenoArchBox.add(XenoArchSec);

        JButton saveButton = new JButton("保存");
        saveButton.setFont(new Font("黑体", Font.PLAIN, 16));
        saveButton.setBackground(Color.black);
        saveButton.setForeground(Color.white);
        saveButton.addActionListener(e -> {
            matrix[7][0] = Integer.parseInt(DevNormMin.getText());
            matrix[7][1] = Integer.parseInt(DevNormSec.getText());
            matrix[7][2] = Integer.parseInt(DevTempMin.getText());
            matrix[7][3] = Integer.parseInt(DevTempSec.getText());
            matrix[7][4] = Integer.parseInt(DevArchMin.getText());
            matrix[7][5] = Integer.parseInt(DevArchSec.getText());
            matrix[7][6] = Integer.parseInt(KirinNormMin.getText());
            matrix[7][7] = Integer.parseInt(KirinNormSec.getText());
            matrix[7][8] = Integer.parseInt(KirinTempMin.getText());
            matrix[7][9] = Integer.parseInt(KirinTempSec.getText());
            matrix[7][10] = Integer.parseInt(KirinArchMin.getText());
            matrix[7][11] = Integer.parseInt(KirinArchSec.getText());
            matrix[7][12] = Integer.parseInt(NergNormMin.getText());
            matrix[7][13] = Integer.parseInt(NergNormSec.getText());
            matrix[7][14] = Integer.parseInt(NergTempMin.getText());
            matrix[7][15] = Integer.parseInt(NergTempSec.getText());
            matrix[7][16] = Integer.parseInt(NergArchMin.getText());
            matrix[7][17] = Integer.parseInt(NergArchSec.getText());
            matrix[7][18] = Integer.parseInt(VaalNormMin.getText());
            matrix[7][19] = Integer.parseInt(VaalNormSec.getText());
            matrix[7][20] = Integer.parseInt(VaalTempMin.getText());
            matrix[7][21] = Integer.parseInt(VaalTempSec.getText());
            matrix[7][22] = Integer.parseInt(VaalArchMin.getText());
            matrix[7][23] = Integer.parseInt(VaalArchSec.getText());
            matrix[7][24] = Integer.parseInt(TeoNormMin.getText());
            matrix[7][25] = Integer.parseInt(TeoNormSec.getText());
            matrix[7][26] = Integer.parseInt(TeoTempMin.getText());
            matrix[7][27] = Integer.parseInt(TeoTempSec.getText());
            matrix[7][28] = Integer.parseInt(TeoArchMin.getText());
            matrix[7][29] = Integer.parseInt(TeoArchSec.getText());
            matrix[7][30] = Integer.parseInt(DaoNormMin.getText());
            matrix[7][31] = Integer.parseInt(DaoNormSec.getText());
            matrix[7][32] = Integer.parseInt(DaoTempMin.getText());
            matrix[7][33] = Integer.parseInt(DaoTempSec.getText());
            matrix[7][34] = Integer.parseInt(DaoArchMin.getText());
            matrix[7][35] = Integer.parseInt(DaoArchSec.getText());
            matrix[7][36] = Integer.parseInt(LunaNormMin.getText());
            matrix[7][37] = Integer.parseInt(LunaNormSec.getText());
            matrix[7][38] = Integer.parseInt(LunaTempMin.getText());
            matrix[7][39] = Integer.parseInt(LunaTempSec.getText());
            matrix[7][40] = Integer.parseInt(LunaArchMin.getText());
            matrix[7][41] = Integer.parseInt(LunaArchSec.getText());
            matrix[7][42] = Integer.parseInt(XenoNormMin.getText());
            matrix[7][43] = Integer.parseInt(XenoNormSec.getText());
            matrix[7][44] = Integer.parseInt(XenoTempMin.getText());
            matrix[7][45] = Integer.parseInt(XenoTempSec.getText());
            matrix[7][46] = Integer.parseInt(XenoArchMin.getText());
            matrix[7][47] = Integer.parseInt(XenoArchSec.getText());
            mainFrame.writeData(matrix);
        });

        Box ArchBox = Box.createVerticalBox();
        JLabel ArchLabel = new JLabel("厉战王");
        ArchLabel.setForeground(Color.white);
        ArchBox.add(Box.createRigidArea(new Dimension(5, 2*gap)));
        ArchBox.add(ArchLabel);
        ArchBox.add(Box.createRigidArea(wideGap));
        ArchBox.add(Box.createRigidArea(new Dimension(5, gap*13/12)));
        ArchBox.add(Box.createRigidArea(wideGap));
        ArchBox.add(KirinArchBox);
        ArchBox.add(Box.createRigidArea(wideGap));
        ArchBox.add(Box.createRigidArea(new Dimension(5, gap*13/12)));
        ArchBox.add(Box.createRigidArea(wideGap));
        ArchBox.add(VaalArchBox);
        ArchBox.add(Box.createRigidArea(wideGap));
        ArchBox.add(Box.createRigidArea(new Dimension(5, gap*13/12)));
        ArchBox.add(Box.createRigidArea(wideGap));
        ArchBox.add(Box.createRigidArea(new Dimension(5, gap*13/12)));
        ArchBox.add(Box.createRigidArea(wideGap));
        ArchBox.add(Box.createRigidArea(new Dimension(5, gap*13/12)));
        ArchBox.add(Box.createRigidArea(wideGap));
        ArchBox.add(saveButton);
//        ArchBox.add(Box.createRigidArea(new Dimension(5, gap*13/12)));
        ArchBox.add(Box.createRigidArea(wideGap));
        ArchLabel.setAlignmentY(CENTER_ALIGNMENT);
        DevArchBox.setAlignmentY(CENTER_ALIGNMENT);
        saveButton.setAlignmentY(CENTER_ALIGNMENT);

        return ArchBox;
    }
}

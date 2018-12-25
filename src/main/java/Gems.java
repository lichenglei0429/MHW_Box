import javax.swing.*;
import java.awt.*;
import java.io.PrintWriter;

public class Gems extends JPanel {
    private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    private int gap = (screenSize.width/2-300)*15/220;
    Gems(int[][] matrix) {
        setPreferredSize(new Dimension(screenSize.width/2, screenSize.width/2-300));

        Box mainBox = Box.createVerticalBox();
        mainBox.add(Box.createRigidArea(new Dimension(5, gap-10)));
        mainBox.add(initTicket(matrix));
        mainBox.add(Box.createRigidArea(new Dimension(5, gap+10)));
        mainBox.add(initCarve(matrix));
        add(mainBox);
    }

    private Box initTicket(int[][] matrix){
        SpinnerModel silverValue = new SpinnerNumberModel(matrix[0][0], 0, 9999, 1);
        SpinnerModel goldValue = new SpinnerNumberModel(matrix[0][1], 0, 9999, 1);

        JLabel silverTicket = new JLabel("银之龙人票据");
        silverTicket.setForeground(new Color(224, 224, 224));
        JLabel goldTicket = new JLabel("金之龙人票据");
        goldTicket.setForeground(new Color(255, 255, 102));

        JSpinner silverSpinner = new JSpinner(silverValue);
        JSpinner goldSpinner = new JSpinner(goldValue);

        Box ticket = Box.createHorizontalBox();
        ticket.add(Box.createRigidArea(new Dimension(160, 5)));
        ticket.add(silverTicket);
        ticket.add(silverSpinner);
        ticket.add(Box.createRigidArea(new Dimension(160, 5)));
        ticket.add(goldTicket);
        ticket.add(goldSpinner);
        ticket.add(Box.createRigidArea(new Dimension(160, 5)));

        return ticket;
    }

    private Box initCarve(int[][] matrix){
        Box carveBox = Box.createHorizontalBox();
        carveBox.add(initPlate(matrix));
        carveBox.add(Box.createRigidArea(new Dimension(50,5)));
        carveBox.add(initGem(matrix));

        return carveBox;
    }

    private Box initPlate(int[][] matrix){
        SpinnerModel AnjaPlateValue = new SpinnerNumberModel(matrix[1][0], 0, 9999, 1);
        SpinnerModel RthanPlateValue = new SpinnerNumberModel(matrix[1][1], 0, 9999, 1);
        SpinnerModel OdoPlateValue = new SpinnerNumberModel(matrix[1][2], 0, 9999, 1);
        SpinnerModel LegiPlateValue = new SpinnerNumberModel(matrix[1][3], 0, 9999, 1);
        SpinnerModel RthaloPlateValue = new SpinnerNumberModel(matrix[1][4], 0, 9999, 1);

        JLabel AnjaPlateLabel = new JLabel("蛮颚龙的逆鳞    ");
        AnjaPlateLabel.setForeground(new Color(255, 204, 204));
        JLabel RthanPlateLabel = new JLabel("雌火龙的逆鳞    ");
        RthanPlateLabel.setForeground(new Color(102, 224, 0));
        JLabel OdoPlateLabel = new JLabel("惨爪龙的逆鳞    ");
        OdoPlateLabel.setForeground(new Color(153, 0, 0));
        JLabel LegiPlateLabel = new JLabel("风漂龙的逆鳞    ");
        LegiPlateLabel.setForeground(new Color(79, 130, 249));
        JLabel RthaloPlateLabel = new JLabel("雄火龙的逆鳞    ");
        RthaloPlateLabel.setForeground(new Color(190, 0, 0));

        JSpinner AnjaPlateSpinner = new JSpinner(AnjaPlateValue);
        AnjaPlateSpinner.addChangeListener(e -> {
            matrix[1][0] = (Integer)AnjaPlateSpinner.getValue();
            mainFrame.writeData(matrix);
        });
        JSpinner RthanPlateSpinner = new JSpinner(RthanPlateValue);
        RthanPlateSpinner.addChangeListener(e -> {
            matrix[1][1] = (Integer)RthanPlateSpinner.getValue();
            mainFrame.writeData(matrix);
        });
        JSpinner OdoPlateSpinner = new JSpinner(OdoPlateValue);
        OdoPlateSpinner.addChangeListener(e -> {
            matrix[1][2] = (Integer)OdoPlateSpinner.getValue();
            mainFrame.writeData(matrix);
        });
        JSpinner LegiPlateSpinner = new JSpinner(LegiPlateValue);
        LegiPlateSpinner.addChangeListener(e -> {
            matrix[1][3] = (Integer)LegiPlateSpinner.getValue();
            mainFrame.writeData(matrix);
        });
        JSpinner RthaloPlateSpinner = new JSpinner(RthaloPlateValue);
        RthaloPlateSpinner.addChangeListener(e -> {
            matrix[1][4] = (Integer)RthaloPlateSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        Box AnjaPlateBox = Box.createHorizontalBox();
        AnjaPlateBox.add(AnjaPlateLabel);
        AnjaPlateBox.add(AnjaPlateSpinner);
        Box RthanPlateBox = Box.createHorizontalBox();
        RthanPlateBox.add(RthanPlateLabel);
        RthanPlateBox.add(RthanPlateSpinner);
        Box OdoPlateBox = Box.createHorizontalBox();
        OdoPlateBox.add(OdoPlateLabel);
        OdoPlateBox.add(OdoPlateSpinner);
        Box LegiPlateBox = Box.createHorizontalBox();
        LegiPlateBox.add(LegiPlateLabel);
        LegiPlateBox.add(LegiPlateSpinner);
        Box RthaloPlateBox = Box.createHorizontalBox();
        RthaloPlateBox.add(RthaloPlateLabel);
        RthaloPlateBox.add(RthaloPlateSpinner);

        Box PlateBox = Box.createVerticalBox();
        PlateBox.add(AnjaPlateBox);
        PlateBox.add(Box.createRigidArea(new Dimension(5, gap)));
        PlateBox.add(RthanPlateBox);
        PlateBox.add(Box.createRigidArea(new Dimension(5, gap)));
        PlateBox.add(OdoPlateBox);
        PlateBox.add(Box.createRigidArea(new Dimension(5, gap)));
        PlateBox.add(LegiPlateBox);
        PlateBox.add(Box.createRigidArea(new Dimension(5, gap)));
        PlateBox.add(RthaloPlateBox);
        PlateBox.add(Box.createRigidArea(new Dimension(5, gap+26)));

        return PlateBox;
    }

    private Box initGem(int[][] matrix){
        SpinnerModel BirdGemValue = new SpinnerNumberModel(matrix[2][0], 0, 9999, 1);
        SpinnerModel WyvGemValue = new SpinnerNumberModel(matrix[2][1], 0, 9999, 1);
        SpinnerModel ZoraGemValue = new SpinnerNumberModel(matrix[2][2], 0, 9999, 1);
        SpinnerModel RthanGemValue = new SpinnerNumberModel(matrix[2][3], 0, 9999, 1);
        SpinnerModel AnjaGemValue = new SpinnerNumberModel(matrix[2][4], 0, 9999, 1);
        SpinnerModel LegiGemValue = new SpinnerNumberModel(matrix[2][5], 0, 9999, 1);
        SpinnerModel OdoGemValue = new SpinnerNumberModel(matrix[2][6], 0, 9999, 1);
        SpinnerModel RthaloGemValue = new SpinnerNumberModel(matrix[2][7], 0, 9999, 1);
        SpinnerModel UragGemValue = new SpinnerNumberModel(matrix[2][8], 0, 9999, 1);
        SpinnerModel BazeGemValue = new SpinnerNumberModel(matrix[2][9], 0, 9999, 1);
        SpinnerModel NergGemValue = new SpinnerNumberModel(matrix[2][10], 0, 9999, 1);
        SpinnerModel VaalGemValue = new SpinnerNumberModel(matrix[2][11], 0, 9999, 1);
        SpinnerModel TeoGemValue = new SpinnerNumberModel(matrix[2][12], 0, 9999, 1);
        SpinnerModel DaoGemValue = new SpinnerNumberModel(matrix[2][13], 0, 9999, 1);
        SpinnerModel XenoGemValue = new SpinnerNumberModel(matrix[2][14], 0, 9999, 1);
        SpinnerModel DevGemValue = new SpinnerNumberModel(matrix[2][15], 0, 9999, 1);
        SpinnerModel KulGemValue = new SpinnerNumberModel(matrix[2][16], 0, 9999, 1);
        SpinnerModel LunaGemValue = new SpinnerNumberModel(matrix[2][17], 0, 9999, 1);

        JLabel BirdGemLabel = new JLabel("鸟龙玉                ");
        BirdGemLabel.setForeground(new Color(48, 93, 198));
        JLabel WyvGemLabel = new JLabel("龙玉                    ");
        WyvGemLabel.setForeground(new Color(68, 223, 255));
        JLabel ZoraGemLabel = new JLabel("熔山龙的宝玉    ");
        ZoraGemLabel.setForeground(new Color(255, 204, 204));
        JLabel RthanGemLabel = new JLabel("雌火龙的红玉    ");
        RthanGemLabel.setForeground(new Color(102, 224, 0));
        JLabel AnjaGemLabel = new JLabel("蛮颚龙的宝玉    ");
        AnjaGemLabel.setForeground(new Color(255, 204, 204));
        JLabel LegiGemLabel = new JLabel("风漂龙的宝玉    ");
        LegiGemLabel.setForeground(new Color(79, 130, 249));
        JLabel OdoGemLabel = new JLabel("惨爪龙的宝玉    ");
        OdoGemLabel.setForeground(new Color(153, 0, 0));
        JLabel RthaloGemLabel = new JLabel("火龙的红玉        ");
        RthaloGemLabel.setForeground(new Color(190, 0, 0));
        JLabel UragGemLabel = new JLabel("爆锤龙的红玉    ");
        UragGemLabel.setForeground(new Color(255, 255, 0));
        JLabel BazeGemLabel = new JLabel("爆鳞龙的宝玉    ");
        BazeGemLabel.setForeground(new Color(255, 255, 255));
        JLabel NergGemLabel = new JLabel("灭尽龙的宝玉    ");
        NergGemLabel.setForeground(new Color(204, 204, 204));
        JLabel VaalGemLabel = new JLabel("尸套龙的宝玉    ");
        VaalGemLabel.setForeground(new Color(224, 224, 224));
        JLabel TeoGemLabel = new JLabel("炎龙的宝玉        ");
        TeoGemLabel.setForeground(new Color(190, 0, 0));
        JLabel DaoGemLabel = new JLabel("钢龙的宝玉        ");
        DaoGemLabel.setForeground(new Color(204, 204, 204));
        JLabel XenoGemLabel = new JLabel("冥灯龙的幽玉    ");
        XenoGemLabel.setForeground(new Color(255, 255, 255));
        JLabel DevGemLabel = new JLabel("恐暴龙的宝玉    ");
        DevGemLabel.setForeground(new Color(0, 102, 0));
        JLabel KulGemLabel = new JLabel("炫辉龙的金煌玉");
        KulGemLabel.setForeground(new Color(245, 231, 48));
        JLabel LunaGemLabel = new JLabel("炎妃龙的宝玉    ");
        LunaGemLabel.setForeground(new Color(68, 90, 232));

        JSpinner BirdGemSpinner = new JSpinner(BirdGemValue);
        BirdGemSpinner.addChangeListener(e -> {
            matrix[2][0] = (Integer)BirdGemSpinner.getValue();
            mainFrame.writeData(matrix);
        });
        JSpinner WyvGemSpinner = new JSpinner(WyvGemValue);
        WyvGemSpinner.addChangeListener(e -> {
            matrix[2][1] = (Integer)WyvGemSpinner.getValue();
            mainFrame.writeData(matrix);
        });
        JSpinner ZoraGemSpinner = new JSpinner(ZoraGemValue);
        ZoraGemSpinner.addChangeListener(e -> {
            matrix[2][2] = (Integer)ZoraGemSpinner.getValue();
            mainFrame.writeData(matrix);
        });
        JSpinner RthanGemSpinner = new JSpinner(RthanGemValue);
        RthanGemSpinner.addChangeListener(e -> {
            matrix[2][3] = (Integer)RthanGemSpinner.getValue();
            mainFrame.writeData(matrix);
        });
        JSpinner AnjaGemSpinner = new JSpinner(AnjaGemValue);
        AnjaGemSpinner.addChangeListener(e -> {
            matrix[2][4] = (Integer)AnjaGemSpinner.getValue();
            mainFrame.writeData(matrix);
        });
        JSpinner LegiGemSpinner = new JSpinner(LegiGemValue);
        LegiGemSpinner.addChangeListener(e -> {
            matrix[2][5] = (Integer)LegiGemSpinner.getValue();
            mainFrame.writeData(matrix);
        });
        JSpinner OdoGemSpinner = new JSpinner(OdoGemValue);
        OdoGemSpinner.addChangeListener(e -> {
            matrix[2][6] = (Integer)OdoGemSpinner.getValue();
            mainFrame.writeData(matrix);
        });
        JSpinner RthaloGemSpinner = new JSpinner(RthaloGemValue);
        RthaloGemSpinner.addChangeListener(e -> {
            matrix[2][7] = (Integer)RthaloGemSpinner.getValue();
            mainFrame.writeData(matrix);
        });
        JSpinner UragGemSpinner = new JSpinner(UragGemValue);
        UragGemSpinner.addChangeListener(e -> {
            matrix[2][8] = (Integer)UragGemSpinner.getValue();
            mainFrame.writeData(matrix);
        });
        JSpinner BazeGemSpinner = new JSpinner(BazeGemValue);
        BazeGemSpinner.addChangeListener(e -> {
            matrix[2][9] = (Integer)BazeGemSpinner.getValue();
            mainFrame.writeData(matrix);
        });
        JSpinner NergGemSpinner = new JSpinner(NergGemValue);
        NergGemSpinner.addChangeListener(e -> {
            matrix[2][10] = (Integer)NergGemSpinner.getValue();
            mainFrame.writeData(matrix);
        });
        JSpinner VaalGemSpinner = new JSpinner(VaalGemValue);
        VaalGemSpinner.addChangeListener(e -> {
            matrix[2][11] = (Integer)VaalGemSpinner.getValue();
            mainFrame.writeData(matrix);
        });
        JSpinner TeoGemSpinner = new JSpinner(TeoGemValue);
        TeoGemSpinner.addChangeListener(e -> {
            matrix[2][12] = (Integer)TeoGemSpinner.getValue();
            mainFrame.writeData(matrix);
        });
        JSpinner DaoGemSpinner = new JSpinner(DaoGemValue);
        DaoGemSpinner.addChangeListener(e -> {
            matrix[2][13] = (Integer)DaoGemSpinner.getValue();
            mainFrame.writeData(matrix);
        });
        JSpinner XenoGemSpinner = new JSpinner(XenoGemValue);
        XenoGemSpinner.addChangeListener(e -> {
            matrix[2][14] = (Integer)XenoGemSpinner.getValue();
            mainFrame.writeData(matrix);
        });
        JSpinner DevGemSpinner = new JSpinner(DevGemValue);
        DevGemSpinner.addChangeListener(e -> {
            matrix[2][15] = (Integer)DevGemSpinner.getValue();
            mainFrame.writeData(matrix);
        });
        JSpinner KulGemSpinner = new JSpinner(KulGemValue);
        KulGemSpinner.addChangeListener(e -> {
            matrix[2][16] = (Integer)KulGemSpinner.getValue();
            mainFrame.writeData(matrix);
        });
        JSpinner LunaGemSpinner = new JSpinner(LunaGemValue);
        LunaGemSpinner.addChangeListener(e -> {
            matrix[2][17] = (Integer)LunaGemSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        Box BirdGemBox = Box.createHorizontalBox();
        BirdGemBox.add(BirdGemLabel);
        BirdGemBox.add(BirdGemSpinner);
        Box WyvGemBox = Box.createHorizontalBox();
        WyvGemBox.add(WyvGemLabel);
        WyvGemBox.add(WyvGemSpinner);
        Box ZoraGemBox = Box.createHorizontalBox();
        ZoraGemBox.add(ZoraGemLabel);
        ZoraGemBox.add(ZoraGemSpinner);
        Box RthanGemBox = Box.createHorizontalBox();
        RthanGemBox.add(RthanGemLabel);
        RthanGemBox.add(RthanGemSpinner);
        Box AnjaGemBox = Box.createHorizontalBox();
        AnjaGemBox.add(AnjaGemLabel);
        AnjaGemBox.add(AnjaGemSpinner);
        Box LegiGemBox = Box.createHorizontalBox();
        LegiGemBox.add(LegiGemLabel);
        LegiGemBox.add(LegiGemSpinner);
        Box OdoGemBox = Box.createHorizontalBox();
        OdoGemBox.add(OdoGemLabel);
        OdoGemBox.add(OdoGemSpinner);
        Box RthaloGemBox = Box.createHorizontalBox();
        RthaloGemBox.add(RthaloGemLabel);
        RthaloGemBox.add(RthaloGemSpinner);
        Box UragGemBox = Box.createHorizontalBox();
        UragGemBox.add(UragGemLabel);
        UragGemBox.add(UragGemSpinner);
        Box BazeGemBox = Box.createHorizontalBox();
        BazeGemBox.add(BazeGemLabel);
        BazeGemBox.add(BazeGemSpinner);
        Box NergGemBox = Box.createHorizontalBox();
        NergGemBox.add(NergGemLabel);
        NergGemBox.add(NergGemSpinner);
        Box VaalGemBox = Box.createHorizontalBox();
        VaalGemBox.add(VaalGemLabel);
        VaalGemBox.add(VaalGemSpinner);
        Box TeoGemBox = Box.createHorizontalBox();
        TeoGemBox.add(TeoGemLabel);
        TeoGemBox.add(TeoGemSpinner);
        Box DaoGemBox = Box.createHorizontalBox();
        DaoGemBox.add(DaoGemLabel);
        DaoGemBox.add(DaoGemSpinner);
        Box XenoGemBox = Box.createHorizontalBox();
        XenoGemBox.add(XenoGemLabel);
        XenoGemBox.add(XenoGemSpinner);
        Box DevGemBox = Box.createHorizontalBox();
        DevGemBox.add(DevGemLabel);
        DevGemBox.add(DevGemSpinner);
        Box KulGemBox = Box.createHorizontalBox();
        KulGemBox.add(KulGemLabel);
        KulGemBox.add(KulGemSpinner);
        Box LunaGemBox = Box.createHorizontalBox();
        LunaGemBox.add(LunaGemLabel);
        LunaGemBox.add(LunaGemSpinner);

        Box GemBox1 = Box.createVerticalBox();
        GemBox1.add(BirdGemBox);
        GemBox1.add(Box.createRigidArea(new Dimension(5, gap)));
        GemBox1.add(WyvGemBox);
        GemBox1.add(Box.createRigidArea(new Dimension(5, gap)));
        GemBox1.add(ZoraGemBox);
        GemBox1.add(Box.createRigidArea(new Dimension(5, gap)));
        GemBox1.add(RthanGemBox);
        GemBox1.add(Box.createRigidArea(new Dimension(5, gap)));
        GemBox1.add(AnjaGemBox);
        GemBox1.add(Box.createRigidArea(new Dimension(5, gap)));
        GemBox1.add(LegiGemBox);

        Box GemBox2 = Box.createVerticalBox();
        GemBox2.add(OdoGemBox);
        GemBox2.add(Box.createRigidArea(new Dimension(5, gap)));
        GemBox2.add(RthaloGemBox);
        GemBox2.add(Box.createRigidArea(new Dimension(5, gap)));
        GemBox2.add(UragGemBox);
        GemBox2.add(Box.createRigidArea(new Dimension(5, gap)));
        GemBox2.add(BazeGemBox);
        GemBox2.add(Box.createRigidArea(new Dimension(5, gap)));
        GemBox2.add(NergGemBox);
        GemBox2.add(Box.createRigidArea(new Dimension(5, gap)));
        GemBox2.add(VaalGemBox);

        Box GemBox3 = Box.createVerticalBox();
        GemBox3.add(TeoGemBox);
        GemBox3.add(Box.createRigidArea(new Dimension(5, gap)));
        GemBox3.add(DaoGemBox);
        GemBox3.add(Box.createRigidArea(new Dimension(5, gap)));
        GemBox3.add(XenoGemBox);
        GemBox3.add(Box.createRigidArea(new Dimension(5, gap)));
        GemBox3.add(DevGemBox);
        GemBox3.add(Box.createRigidArea(new Dimension(5, gap)));
        GemBox3.add(KulGemBox);
        GemBox3.add(Box.createRigidArea(new Dimension(5, gap)));
        GemBox3.add(LunaGemBox);

        Box GemBox = Box.createHorizontalBox();
        GemBox.add(GemBox1);
        GemBox.add(Box.createRigidArea(new Dimension(50,5)));
        GemBox.add(GemBox2);
        GemBox.add(Box.createRigidArea(new Dimension(50,5)));
        GemBox.add(GemBox3);

        return GemBox;
    }
}

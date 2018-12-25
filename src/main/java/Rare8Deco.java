import javax.swing.*;
import java.awt.*;

public class Rare8Deco extends JPanel {

    private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    private int gap = (screenSize.width/2-300)*6/165;
    private Dimension wideGap = new Dimension(5, gap);

    Rare8Deco(int[][] matrix) {
        Box box8 = Box.createHorizontalBox();
        Box box81 = Box.createVerticalBox();
        Box box82 = Box.createVerticalBox();
        Box box83 = Box.createVerticalBox();
        Box box84 = Box.createVerticalBox();

        SpinnerModel paoshuValue = new SpinnerNumberModel(matrix[6][0], 0, 3, 1);
        JLabel paoshuLabel = new JLabel("炮术珠    ");
        JSpinner paoshuSpinner = new JSpinner(paoshuValue);
        if((Integer)paoshuSpinner.getValue() == 3){
            paoshuLabel.setForeground(new Color(180,180,180));
        }
        Box paoshuBox = Box.createHorizontalBox();
        paoshuBox.add(paoshuLabel);
        paoshuBox.add(paoshuSpinner);
        paoshuBox.add(new JLabel("  /3"));
        paoshuSpinner.addChangeListener(e -> {
            if ((Integer) paoshuSpinner.getValue() == 3) {
                paoshuLabel.setForeground(new Color(180, 180, 180));
            } else {
                paoshuLabel.setForeground(new Color(0, 0, 0));
            }
            matrix[6][0] = (Integer)paoshuSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel ronghaoValue = new SpinnerNumberModel(matrix[6][1], 0, 3, 1);
        JLabel ronghaoLabel = new JLabel("茸好珠    ");
        JSpinner ronghaoSpinner = new JSpinner(ronghaoValue);
        if((Integer)ronghaoSpinner.getValue() == 3){
            ronghaoLabel.setForeground(new Color(180,180,180));
        }
        Box ronghaoBox = Box.createHorizontalBox();
        ronghaoBox.add(ronghaoLabel);
        ronghaoBox.add(ronghaoSpinner);
        ronghaoBox.add(new JLabel("  /3"));
        ronghaoSpinner.addChangeListener(e -> {
            if ((Integer) ronghaoSpinner.getValue() == 3) {
                ronghaoLabel.setForeground(new Color(180, 180, 180));
            } else {
                ronghaoLabel.setForeground(new Color(0, 0, 0));
            }
            matrix[6][1] = (Integer)ronghaoSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel chaoxinValue = new SpinnerNumberModel(matrix[6][2], 0, 3, 1);
        JLabel chaoxinLabel = new JLabel("超心珠    ");
        JSpinner chaoxinSpinner = new JSpinner(chaoxinValue);
        if((Integer)chaoxinSpinner.getValue() == 3){
            chaoxinLabel.setForeground(new Color(180,180,180));
        }
        Box chaoxinBox = Box.createHorizontalBox();
        chaoxinBox.add(chaoxinLabel);
        chaoxinBox.add(chaoxinSpinner);
        chaoxinBox.add(new JLabel("  /3"));
        chaoxinSpinner.addChangeListener(e -> {
            if ((Integer) chaoxinSpinner.getValue() == 3) {
                chaoxinLabel.setForeground(new Color(180, 180, 180));
            } else {
                chaoxinLabel.setForeground(new Color(0, 0, 0));
            }
            matrix[6][2] = (Integer)chaoxinSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel suoduanValue = new SpinnerNumberModel(matrix[6][3], 0, 3, 1);
        JLabel suoduanLabel = new JLabel("缩短珠    ");
        JSpinner suoduanSpinner = new JSpinner(suoduanValue);
        if((Integer)suoduanSpinner.getValue() == 3){
            suoduanLabel.setForeground(new Color(180,180,180));
        }
        Box suoduanBox = Box.createHorizontalBox();
        suoduanBox.add(suoduanLabel);
        suoduanBox.add(suoduanSpinner);
        suoduanBox.add(new JLabel("  /3"));
        suoduanSpinner.addChangeListener(e -> {
            if ((Integer) suoduanSpinner.getValue() == 3) {
                suoduanLabel.setForeground(new Color(180, 180, 180));
            } else {
                suoduanLabel.setForeground(new Color(0, 0, 0));
            }
            matrix[6][3] = (Integer)suoduanSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel badaoValue = new SpinnerNumberModel(matrix[6][4], 0, 3, 1);
        JLabel badaoLabel = new JLabel("拔刀珠    ");
        JSpinner badaoSpinner = new JSpinner(badaoValue);
        if((Integer)badaoSpinner.getValue() == 3){
            badaoLabel.setForeground(new Color(180,180,180));
        }
        Box badaoBox = Box.createHorizontalBox();
        badaoBox.add(badaoLabel);
        badaoBox.add(badaoSpinner);
        badaoBox.add(new JLabel("  /3"));
        badaoSpinner.addChangeListener(e -> {
            if ((Integer) badaoSpinner.getValue() == 3) {
                badaoLabel.setForeground(new Color(180, 180, 180));
            } else {
                badaoLabel.setForeground(new Color(0, 0, 0));
            }
            matrix[6][4] = (Integer)badaoSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel qiangzouValue = new SpinnerNumberModel(matrix[6][5], 0, 3, 1);
        JLabel qiangzouLabel = new JLabel("强走珠    ");
        JSpinner qiangzouSpinner = new JSpinner(qiangzouValue);
        if((Integer)qiangzouSpinner.getValue() == 3){
            qiangzouLabel.setForeground(new Color(180,180,180));
        }
        Box qiangzouBox = Box.createHorizontalBox();
        qiangzouBox.add(qiangzouLabel);
        qiangzouBox.add(qiangzouSpinner);
        qiangzouBox.add(new JLabel("  /3"));
        qiangzouSpinner.addChangeListener(e -> {
            if ((Integer) qiangzouSpinner.getValue() == 3) {
                qiangzouLabel.setForeground(new Color(180, 180, 180));
            } else {
                qiangzouLabel.setForeground(new Color(0, 0, 0));
            }
            matrix[6][5] = (Integer)qiangzouSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel qianggongValue = new SpinnerNumberModel(matrix[6][6], 0, 1, 1);
        JLabel qianggongLabel = new JLabel("强弓珠    ");
        JSpinner qianggongSpinner = new JSpinner(qianggongValue);
        if((Integer)qianggongSpinner.getValue() == 1){
            qianggongLabel.setForeground(new Color(180,180,180));
        }
        Box qianggongBox = Box.createHorizontalBox();
        qianggongBox.add(qianggongLabel);
        qianggongBox.add(qianggongSpinner);
        qianggongBox.add(new JLabel("  /1"));
        qianggongSpinner.addChangeListener(e -> {
            if ((Integer) qianggongSpinner.getValue() == 1) {
                qianggongLabel.setForeground(new Color(180, 180, 180));
            } else {
                qianggongLabel.setForeground(new Color(0, 0, 0));
            }
            matrix[6][6] = (Integer)qianggongSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel xinyanValue = new SpinnerNumberModel(matrix[6][7], 0, 1, 1);
        JLabel xinyanLabel = new JLabel("心眼珠    ");
        JSpinner xinyanSpinner = new JSpinner(xinyanValue);
        if((Integer)xinyanSpinner.getValue() == 1){
            xinyanLabel.setForeground(new Color(180,180,180));
        }
        Box xinyanBox = Box.createHorizontalBox();
        xinyanBox.add(xinyanLabel);
        xinyanBox.add(xinyanSpinner);
        xinyanBox.add(new JLabel("  /1"));
        xinyanSpinner.addChangeListener(e -> {
            if ((Integer) xinyanSpinner.getValue() == 1) {
                xinyanLabel.setForeground(new Color(180, 180, 180));
            } else {
                xinyanLabel.setForeground(new Color(0, 0, 0));
            }
            matrix[6][7] = (Integer)xinyanSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel jiefangValue = new SpinnerNumberModel(matrix[6][8], 0, 3, 1);
        JLabel jiefangLabel = new JLabel("解放珠    ");
        JSpinner jiefangSpinner = new JSpinner(jiefangValue);
        if((Integer)jiefangSpinner.getValue() == 3){
            jiefangLabel.setForeground(new Color(180,180,180));
        }
        Box jiefangBox = Box.createHorizontalBox();
        jiefangBox.add(jiefangLabel);
        jiefangBox.add(jiefangSpinner);
        jiefangBox.add(new JLabel("  /3"));
        jiefangSpinner.addChangeListener(e -> {
            if ((Integer) jiefangSpinner.getValue() == 3) {
                jiefangLabel.setForeground(new Color(180, 180, 180));
            } else {
                jiefangLabel.setForeground(new Color(0, 0, 0));
            }
            matrix[6][8] = (Integer)jiefangSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel jiangValue = new SpinnerNumberModel(matrix[6][9], 0, 5, 1);
        JLabel jiangLabel = new JLabel("匠珠        ");
        JSpinner jiangSpinner = new JSpinner(jiangValue);
        if((Integer)jiangSpinner.getValue() == 5){
            jiangLabel.setForeground(new Color(180,180,180));
        }
        Box jiangBox = Box.createHorizontalBox();
        jiangBox.add(jiangLabel);
        jiangBox.add(jiangSpinner);
        jiangBox.add(new JLabel("  /5"));
        jiangSpinner.addChangeListener(e -> {
            if ((Integer) jiangSpinner.getValue() == 5) {
                jiangLabel.setForeground(new Color(180, 180, 180));
            } else {
                jiangLabel.setForeground(new Color(0, 0, 0));
            }
            matrix[6][9] = (Integer)jiangSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel guantongValue = new SpinnerNumberModel(matrix[6][10], 0, 1, 1);
        JLabel guantongLabel = new JLabel("贯通珠    ");
        JSpinner guantongSpinner = new JSpinner(guantongValue);
        if((Integer)guantongSpinner.getValue() == 1){
            guantongLabel.setForeground(new Color(180,180,180));
        }
        Box guantongBox = Box.createHorizontalBox();
        guantongBox.add(guantongLabel);
        guantongBox.add(guantongSpinner);
        guantongBox.add(new JLabel("  /1"));
        guantongSpinner.addChangeListener(e -> {
            if ((Integer) guantongSpinner.getValue() == 1) {
                guantongLabel.setForeground(new Color(180, 180, 180));
            } else {
                guantongLabel.setForeground(new Color(0, 0, 0));
            }
            matrix[6][10] = (Integer)guantongSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel sandanValue = new SpinnerNumberModel(matrix[6][11], 0, 1, 1);
        JLabel sandanLabel = new JLabel("散弹珠    ");
        JSpinner sandanSpinner = new JSpinner(sandanValue);
        if((Integer)sandanSpinner.getValue() == 1){
            sandanLabel.setForeground(new Color(180,180,180));
        }
        Box sandanBox = Box.createHorizontalBox();
        sandanBox.add(sandanLabel);
        sandanBox.add(sandanSpinner);
        sandanBox.add(new JLabel("  /1"));
        sandanSpinner.addChangeListener(e -> {
            if ((Integer) sandanSpinner.getValue() == 1) {
                sandanLabel.setForeground(new Color(180, 180, 180));
            } else {
                sandanLabel.setForeground(new Color(0, 0, 0));
            }
            matrix[6][11] = (Integer)sandanSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        box81.add(Box.createRigidArea(new Dimension(5, 2*gap)));
        box81.add(paoshuBox);
        box82.add(Box.createRigidArea(new Dimension(5, 2*gap)));
        box82.add(ronghaoBox);
        box83.add(Box.createRigidArea(new Dimension(5, 2*gap)));
        box83.add(chaoxinBox);
        box84.add(Box.createRigidArea(new Dimension(5, 2*gap)));
        box84.add(suoduanBox);
        box81.add(Box.createRigidArea(wideGap));
        box81.add(badaoBox);
        box82.add(Box.createRigidArea(wideGap));
        box82.add(qiangzouBox);
        box83.add(Box.createRigidArea(wideGap));
        box83.add(qianggongBox);
        box84.add(Box.createRigidArea(wideGap));
        box84.add(xinyanBox);
        box81.add(Box.createRigidArea(wideGap));
        box81.add(jiefangBox);
        box82.add(Box.createRigidArea(wideGap));
        box82.add(jiangBox);
        box83.add(Box.createRigidArea(wideGap));
        box83.add(guantongBox);
        box84.add(Box.createRigidArea(wideGap));
        box84.add(sandanBox);

        box81.add(Box.createRigidArea(new Dimension(5, 13 * gap)));

        box82.add(Box.createRigidArea(new Dimension(5, 13 * gap)));

        box83.add(Box.createRigidArea(new Dimension(5, 13 * gap)));

        box84.add(Box.createRigidArea(new Dimension(5, 13 * gap)));

        box8.add(box81);
        box8.add(Box.createRigidArea(new Dimension(4 * gap, 5)));
        box8.add(box82);
        box8.add(Box.createRigidArea(new Dimension(4 * gap, 5)));
        box8.add(box83);
        box8.add(Box.createRigidArea(new Dimension(4 * gap, 5)));
        box8.add(box84);

        add(box8);
    }

}
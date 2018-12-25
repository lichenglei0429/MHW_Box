import javax.swing.*;
import java.awt.*;

public class Rare7Deco extends JPanel {

    private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    private int gap = (screenSize.width/2-300)*6/165;
    private Dimension wideGap = new Dimension(5, gap);

    Rare7Deco(int[][] matrix){
        Box box7 = Box.createHorizontalBox();
        Box box71 = Box.createVerticalBox();
        Box box72 = Box.createVerticalBox();
        Box box73 = Box.createVerticalBox();
        Box box74 = Box.createVerticalBox();

        SpinnerModel gongjiValue = new SpinnerNumberModel(matrix[5][0], 0, 7, 1);
        JLabel gongjiLabel = new JLabel("攻击珠    ");
        JSpinner gongjiSpinner = new JSpinner(gongjiValue);
        if((Integer)gongjiSpinner.getValue() == 7){
            gongjiLabel.setForeground(new Color(180,180,180));
        }
        Box gongjiBox = Box.createHorizontalBox();
        gongjiBox.add(gongjiLabel);
        gongjiBox.add(gongjiSpinner);
        gongjiBox.add(new JLabel("  /7"));
        gongjiSpinner.addChangeListener(e -> {
            if((Integer)gongjiSpinner.getValue() == 7){
                gongjiLabel.setForeground(new Color(180,180,180));
            }else{
                gongjiLabel.setForeground(new Color(0,0,0));
            }
            matrix[5][0] = (Integer)gongjiSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel mabiValue = new SpinnerNumberModel(matrix[5][1], 0, 3, 1);
        JLabel mabiLabel = new JLabel("麻痹珠    ");
        JSpinner mabiSpinner = new JSpinner(mabiValue);
        if((Integer)mabiSpinner.getValue() ==3){
            mabiLabel.setForeground(new Color(180,180,180));
        }
        Box mabiBox = Box.createHorizontalBox();
        mabiBox.add(mabiLabel);
        mabiBox.add(mabiSpinner);
        mabiBox.add(new JLabel("  /3"));
        mabiSpinner.addChangeListener(e -> {
            if((Integer)mabiSpinner.getValue() == 3){
                mabiLabel.setForeground(new Color(180,180,180));
            }else{
                mabiLabel.setForeground(new Color(0,0,0));
            }
            matrix[5][1] = (Integer)mabiSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel shuimianValue = new SpinnerNumberModel(matrix[5][2], 0, 3, 1);
        JLabel shuimianLabel = new JLabel("睡眠珠    ");
        JSpinner shuimianSpinner = new JSpinner(shuimianValue);
        if((Integer)shuimianSpinner.getValue() ==3){
            shuimianLabel.setForeground(new Color(180,180,180));
        }
        Box shuimianBox = Box.createHorizontalBox();
        shuimianBox.add(shuimianLabel);
        shuimianBox.add(shuimianSpinner);
        shuimianBox.add(new JLabel("  /3"));
        shuimianSpinner.addChangeListener(e -> {
            if((Integer)shuimianSpinner.getValue() == 3){
                shuimianLabel.setForeground(new Color(180,180,180));
            }else{
                shuimianLabel.setForeground(new Color(0,0,0));
            }
            matrix[5][2] = (Integer)shuimianSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel baopoValue = new SpinnerNumberModel(matrix[5][3], 0, 3, 1);
        JLabel baopoLabel = new JLabel("爆破珠    ");
        JSpinner baopoSpinner = new JSpinner(baopoValue);
        if((Integer)baopoSpinner.getValue() ==3){
            baopoLabel.setForeground(new Color(180,180,180));
        }
        Box baopoBox = Box.createHorizontalBox();
        baopoBox.add(baopoLabel);
        baopoBox.add(baopoSpinner);
        baopoBox.add(new JLabel("  /3"));
        baopoSpinner.addChangeListener(e -> {
            if((Integer)baopoSpinner.getValue() == 3){
                baopoLabel.setForeground(new Color(180,180,180));
            }else{
                baopoLabel.setForeground(new Color(0,0,0));
            }
            matrix[5][3] = (Integer)baopoSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel tesheValue = new SpinnerNumberModel(matrix[5][4], 0, 3, 1);
        JLabel tesheLabel = new JLabel("特射珠    ");
        JSpinner tesheSpinner = new JSpinner(tesheValue);
        if((Integer)tesheSpinner.getValue() ==3){
            tesheLabel.setForeground(new Color(180,180,180));
        }
        Box tesheBox = Box.createHorizontalBox();
        tesheBox.add(tesheLabel);
        tesheBox.add(tesheSpinner);
        tesheBox.add(new JLabel("  /3"));
        tesheSpinner.addChangeListener(e -> {
            if((Integer)tesheSpinner.getValue() == 3){
                tesheLabel.setForeground(new Color(180,180,180));
            }else{
                tesheLabel.setForeground(new Color(0,0,0));
            }
            matrix[5][4] = (Integer)tesheSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel tiebiValue = new SpinnerNumberModel(matrix[5][5], 0, 5, 1);
        JLabel tiebiLabel = new JLabel("铁壁珠    ");
        JSpinner tiebiSpinner = new JSpinner(tiebiValue);
        if((Integer)tiebiSpinner.getValue() == 5){
            tiebiLabel.setForeground(new Color(180,180,180));
        }
        Box tiebiBox = Box.createHorizontalBox();
        tiebiBox.add(tiebiLabel);
        tiebiBox.add(tiebiSpinner);
        tiebiBox.add(new JLabel("  /5"));
        tiebiSpinner.addChangeListener(e -> {
            if((Integer)tiebiSpinner.getValue() == 5){
                tiebiLabel.setForeground(new Color(180,180,180));
            }else{
                tiebiLabel.setForeground(new Color(0,0,0));
            }
            matrix[5][5] = (Integer)tiebiSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel quankaiValue = new SpinnerNumberModel(matrix[5][6], 0, 5, 1);
        JLabel quankaiLabel = new JLabel("全开珠    ");
        JSpinner quankaiSpinner = new JSpinner(quankaiValue);
        if((Integer)quankaiSpinner.getValue() == 5){
            quankaiLabel.setForeground(new Color(180,180,180));
        }
        Box quankaiBox = Box.createHorizontalBox();
        quankaiBox.add(quankaiLabel);
        quankaiBox.add(quankaiSpinner);
        quankaiBox.add(new JLabel("  /5"));
        quankaiSpinner.addChangeListener(e -> {
            if((Integer)quankaiSpinner.getValue() == 5){
                quankaiLabel.setForeground(new Color(180,180,180));
            }else{
                quankaiLabel.setForeground(new Color(0,0,0));
            }
            matrix[5][6] = (Integer)quankaiSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel tiaozhanValue = new SpinnerNumberModel(matrix[5][7], 0, 5, 1);
        JLabel tiaozhanLabel = new JLabel("挑战珠    ");
        JSpinner tiaozhanSpinner = new JSpinner(tiaozhanValue);
        if((Integer)tiaozhanSpinner.getValue() == 5){
            tiaozhanLabel.setForeground(new Color(180,180,180));
        }
        Box tiaozhanBox = Box.createHorizontalBox();
        tiaozhanBox.add(tiaozhanLabel);
        tiaozhanBox.add(tiaozhanSpinner);
        tiaozhanBox.add(new JLabel("  /5"));
        tiaozhanSpinner.addChangeListener(e -> {
            if((Integer)tiaozhanSpinner.getValue() == 5){
                tiaozhanLabel.setForeground(new Color(180,180,180));
            }else{
                tiaozhanLabel.setForeground(new Color(0,0,0));
            }
            matrix[5][7] = (Integer)tiaozhanSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel wushangValue = new SpinnerNumberModel(matrix[5][8], 0, 3, 1);
        JLabel wushangLabel = new JLabel("无伤珠    ");
        JSpinner wushangSpinner = new JSpinner(wushangValue);
        if((Integer)wushangSpinner.getValue() ==3){
            wushangLabel.setForeground(new Color(180,180,180));
        }
        Box wushangBox = Box.createHorizontalBox();
        wushangBox.add(wushangLabel);
        wushangBox.add(wushangSpinner);
        wushangBox.add(new JLabel("  /3"));
        wushangSpinner.addChangeListener(e -> {
            if((Integer)wushangSpinner.getValue() == 3){
                wushangLabel.setForeground(new Color(180,180,180));
            }else{
                wushangLabel.setForeground(new Color(0,0,0));
            }
            matrix[5][8] = (Integer)wushangSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel diliValue = new SpinnerNumberModel(matrix[5][9], 0, 5, 1);
        JLabel diliLabel = new JLabel("底力珠    ");
        JSpinner diliSpinner = new JSpinner(diliValue);
        if((Integer)diliSpinner.getValue() == 5){
            diliLabel.setForeground(new Color(180,180,180));
        }
        Box diliBox = Box.createHorizontalBox();
        diliBox.add(diliLabel);
        diliBox.add(diliSpinner);
        diliBox.add(new JLabel("  /5"));
        diliSpinner.addChangeListener(e -> {
            if((Integer)diliSpinner.getValue() == 5){
                diliLabel.setForeground(new Color(180,180,180));
            }else{
                diliLabel.setForeground(new Color(0,0,0));
            }
            matrix[5][9] = (Integer)diliSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel nishangValue = new SpinnerNumberModel(matrix[5][10], 0, 5, 1);
        JLabel nishangLabel = new JLabel("逆上珠    ");
        JSpinner nishangSpinner = new JSpinner(nishangValue);
        if((Integer)nishangSpinner.getValue() == 5){
            nishangLabel.setForeground(new Color(180,180,180));
        }
        Box nishangBox = Box.createHorizontalBox();
        nishangBox.add(nishangLabel);
        nishangBox.add(nishangSpinner);
        nishangBox.add(new JLabel("  /5"));
        nishangSpinner.addChangeListener(e -> {
            if((Integer)nishangSpinner.getValue() == 5){
                nishangLabel.setForeground(new Color(180,180,180));
            }else{
                nishangLabel.setForeground(new Color(0,0,0));
            }
            matrix[5][10] = (Integer)nishangSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel zengdanValue = new SpinnerNumberModel(matrix[5][11], 0, 1, 1);
        JLabel zengdanLabel = new JLabel("增弹珠    ");
        JSpinner zengdanSpinner = new JSpinner(zengdanValue);
        if((Integer)zengdanSpinner.getValue() == 1){
            zengdanLabel.setForeground(new Color(180,180,180));
        }
        Box zengdanBox = Box.createHorizontalBox();
        zengdanBox.add(zengdanLabel);
        zengdanBox.add(zengdanSpinner);
        zengdanBox.add(new JLabel("  /1"));
        zengdanSpinner.addChangeListener(e -> {
            if((Integer)zengdanSpinner.getValue() == 1){
                zengdanLabel.setForeground(new Color(180,180,180));
            }else{
                zengdanLabel.setForeground(new Color(0,0,0));
            }
            matrix[5][11] = (Integer)zengdanSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel zaoqiValue = new SpinnerNumberModel(matrix[5][12], 0, 3, 1);
        JLabel zaoqiLabel = new JLabel("早气珠    ");
        JSpinner zaoqiSpinner = new JSpinner(zaoqiValue);
        if((Integer)zaoqiSpinner.getValue() ==3){
            zaoqiLabel.setForeground(new Color(180,180,180));
        }
        Box zaoqiBox = Box.createHorizontalBox();
        zaoqiBox.add(zaoqiLabel);
        zaoqiBox.add(zaoqiSpinner);
        zaoqiBox.add(new JLabel("  /3"));
        zaoqiSpinner.addChangeListener(e -> {
            if((Integer)zaoqiSpinner.getValue() == 3){
                zaoqiLabel.setForeground(new Color(180,180,180));
            }else{
                zaoqiLabel.setForeground(new Color(0,0,0));
            }
            matrix[5][12] = (Integer)zaoqiSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel hunshenValue = new SpinnerNumberModel(matrix[5][13], 0, 3, 1);
        JLabel hunshenLabel = new JLabel("浑身珠    ");
        JSpinner hunshenSpinner = new JSpinner(hunshenValue);
        if((Integer)hunshenSpinner.getValue() ==3){
            hunshenLabel.setForeground(new Color(180,180,180));
        }
        Box hunshenBox = Box.createHorizontalBox();
        hunshenBox.add(hunshenLabel);
        hunshenBox.add(hunshenSpinner);
        hunshenBox.add(new JLabel("  /3"));
        hunshenSpinner.addChangeListener(e -> {
            if((Integer)hunshenSpinner.getValue() == 3){
                hunshenLabel.setForeground(new Color(180,180,180));
            }else{
                hunshenLabel.setForeground(new Color(0,0,0));
            }
            matrix[5][13] = (Integer)hunshenSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel angyangValue = new SpinnerNumberModel(matrix[5][14], 0, 3, 1);
        JLabel angyangLabel = new JLabel("昂扬珠    ");
        JSpinner angyangSpinner = new JSpinner(angyangValue);
        if((Integer)angyangSpinner.getValue() ==3){
            angyangLabel.setForeground(new Color(180,180,180));
        }
        Box angyangBox = Box.createHorizontalBox();
        angyangBox.add(angyangLabel);
        angyangBox.add(angyangSpinner);
        angyangBox.add(new JLabel("  /3"));
        angyangSpinner.addChangeListener(e -> {
            if((Integer)angyangSpinner.getValue() == 3){
                angyangLabel.setForeground(new Color(180,180,180));
            }else{
                angyangLabel.setForeground(new Color(0,0,0));
            }
            matrix[5][14] = (Integer)angyangSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel qiangbiValue = new SpinnerNumberModel(matrix[5][15], 0, 1, 1);
        JLabel qiangbiLabel = new JLabel("强壁珠    ");
        JSpinner qiangbiSpinner = new JSpinner(qiangbiValue);
        if((Integer)qiangbiSpinner.getValue() == 1){
            qiangbiLabel.setForeground(new Color(180,180,180));
        }
        Box qiangbiBox = Box.createHorizontalBox();
        qiangbiBox.add(qiangbiLabel);
        qiangbiBox.add(qiangbiSpinner);
        qiangbiBox.add(new JLabel("  /1"));
        qiangbiSpinner.addChangeListener(e -> {
            if((Integer)qiangbiSpinner.getValue() == 1){
                qiangbiLabel.setForeground(new Color(180,180,180));
            }else{
                qiangbiLabel.setForeground(new Color(0,0,0));
            }
            matrix[5][15] = (Integer)qiangbiSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel gangrenValue = new SpinnerNumberModel(matrix[5][16], 0, 1, 1);
        JLabel gangrenLabel = new JLabel("刚刃珠    ");
        JSpinner gangrenSpinner = new JSpinner(gangrenValue);
        if((Integer)gangrenSpinner.getValue() == 1){
            gangrenLabel.setForeground(new Color(180,180,180));
        }
        Box gangrenBox = Box.createHorizontalBox();
        gangrenBox.add(gangrenLabel);
        gangrenBox.add(gangrenSpinner);
        gangrenBox.add(new JLabel("  /1"));
        gangrenSpinner.addChangeListener(e -> {
            if((Integer)gangrenSpinner.getValue() == 1){
                gangrenLabel.setForeground(new Color(180,180,180));
            }else{
                gangrenLabel.setForeground(new Color(0,0,0));
            }
            matrix[5][16] = (Integer)gangrenSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel bipingValue = new SpinnerNumberModel(matrix[5][17], 0, 1, 1);
        JLabel bipingLabel = new JLabel("痹瓶珠    ");
        JSpinner bipingSpinner = new JSpinner(bipingValue);
        if((Integer)bipingSpinner.getValue() == 1){
            bipingLabel.setForeground(new Color(180,180,180));
        }
        Box bipingBox = Box.createHorizontalBox();
        bipingBox.add(bipingLabel);
        bipingBox.add(bipingSpinner);
        bipingBox.add(new JLabel("  /1"));
        bipingSpinner.addChangeListener(e -> {
            if((Integer)bipingSpinner.getValue() == 1){
                bipingLabel.setForeground(new Color(180,180,180));
            }else{
                bipingLabel.setForeground(new Color(0,0,0));
            }
            matrix[5][17] = (Integer)bipingSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel mianpingValue = new SpinnerNumberModel(matrix[5][18], 0, 1, 1);
        JLabel mianpingLabel = new JLabel("眠瓶珠    ");
        JSpinner mianpingSpinner = new JSpinner(mianpingValue);
        if((Integer)mianpingSpinner.getValue() == 1){
            mianpingLabel.setForeground(new Color(180,180,180));
        }
        Box mianpingBox = Box.createHorizontalBox();
        mianpingBox.add(mianpingLabel);
        mianpingBox.add(mianpingSpinner);
        mianpingBox.add(new JLabel("  /1"));
        mianpingSpinner.addChangeListener(e -> {
            if((Integer)mianpingSpinner.getValue() == 1){
                mianpingLabel.setForeground(new Color(180,180,180));
            }else{
                mianpingLabel.setForeground(new Color(0,0,0));
            }
            matrix[5][18] = (Integer)mianpingSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel baopingValue = new SpinnerNumberModel(matrix[5][19], 0, 1, 1);
        JLabel baopingLabel = new JLabel("爆瓶珠    ");
        JSpinner baopingSpinner = new JSpinner(baopingValue);
        if((Integer)baopingSpinner.getValue() == 1){
            baopingLabel.setForeground(new Color(180,180,180));
        }
        Box baopingBox = Box.createHorizontalBox();
        baopingBox.add(baopingLabel);
        baopingBox.add(baopingSpinner);
        baopingBox.add(new JLabel("  /1"));
        baopingSpinner.addChangeListener(e -> {
            if((Integer)baopingSpinner.getValue() == 1){
                baopingLabel.setForeground(new Color(180,180,180));
            }else{
                baopingLabel.setForeground(new Color(0,0,0));
            }
            matrix[5][19] = (Integer)baopingSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel qiangdanValue = new SpinnerNumberModel(matrix[5][20], 0, 1, 1);
        JLabel qiangdanLabel = new JLabel("强弹珠    ");
        JSpinner qiangdanSpinner = new JSpinner(qiangdanValue);
        if((Integer)qiangdanSpinner.getValue() == 1){
            qiangdanLabel.setForeground(new Color(180,180,180));
        }
        Box qiangdanBox = Box.createHorizontalBox();
        qiangdanBox.add(qiangdanLabel);
        qiangdanBox.add(qiangdanSpinner);
        qiangdanBox.add(new JLabel("  /1"));
        qiangdanSpinner.addChangeListener(e -> {
            if((Integer)qiangdanSpinner.getValue() == 1){
                qiangdanLabel.setForeground(new Color(180,180,180));
            }else{
                qiangdanLabel.setForeground(new Color(0,0,0));
            }
            matrix[5][20] = (Integer)qiangdanSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel longfengValue = new SpinnerNumberModel(matrix[5][21], 0, 1, 1);
        JLabel longfengLabel = new JLabel("龙封珠    ");
        JSpinner longfengSpinner = new JSpinner(longfengValue);
        if((Integer)longfengSpinner.getValue() == 1){
            longfengLabel.setForeground(new Color(180,180,180));
        }
        Box longfengBox = Box.createHorizontalBox();
        longfengBox.add(longfengLabel);
        longfengBox.add(longfengSpinner);
        longfengBox.add(new JLabel("  /1"));
        longfengSpinner.addChangeListener(e -> {
            if((Integer)longfengSpinner.getValue() == 1){
                longfengLabel.setForeground(new Color(180,180,180));
            }else{
                longfengLabel.setForeground(new Color(0,0,0));
            }
            matrix[5][21] = (Integer)longfengSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        box71.add(Box.createRigidArea(new Dimension(5, 2*gap)));
        box71.add(gongjiBox);
        box72.add(Box.createRigidArea(new Dimension(5, 2*gap)));
        box72.add(mabiBox);
        box73.add(Box.createRigidArea(new Dimension(5, 2*gap)));
        box73.add(shuimianBox);
        box74.add(Box.createRigidArea(new Dimension(5, 2*gap)));
        box74.add(baopoBox);
        box71.add(Box.createRigidArea(wideGap));
        box71.add(tesheBox);
        box72.add(Box.createRigidArea(wideGap));
        box72.add(tiebiBox);
        box73.add(Box.createRigidArea(wideGap));
        box73.add(quankaiBox);
        box74.add(Box.createRigidArea(wideGap));
        box74.add(tiaozhanBox);
        box71.add(Box.createRigidArea(wideGap));
        box71.add(wushangBox);
        box72.add(Box.createRigidArea(wideGap));
        box72.add(diliBox);
        box73.add(Box.createRigidArea(wideGap));
        box73.add(nishangBox);
        box74.add(Box.createRigidArea(wideGap));
        box74.add(zengdanBox);
        box71.add(Box.createRigidArea(wideGap));
        box71.add(zaoqiBox);
        box72.add(Box.createRigidArea(wideGap));
        box72.add(hunshenBox);
        box73.add(Box.createRigidArea(wideGap));
        box73.add(angyangBox);
        box74.add(Box.createRigidArea(wideGap));
        box74.add(qiangbiBox);
        box71.add(Box.createRigidArea(wideGap));
        box71.add(gangrenBox);
        box72.add(Box.createRigidArea(wideGap));
        box72.add(bipingBox);
        box73.add(Box.createRigidArea(wideGap));
        box73.add(mianpingBox);
        box74.add(Box.createRigidArea(wideGap));
        box74.add(baopingBox);
        box71.add(Box.createRigidArea(wideGap));
        box71.add(qiangdanBox);
        box72.add(Box.createRigidArea(wideGap));
        box72.add(longfengBox);

        box71.add(Box.createRigidArea(new Dimension(5, 7*gap)));
        box72.add(Box.createRigidArea(new Dimension(5, 7*gap)));
        box73.add(Box.createRigidArea(new Dimension(5, 9*gap)));
        box74.add(Box.createRigidArea(new Dimension(5, 9*gap)));

        box7.add(box71);
        box7.add(Box.createRigidArea(new Dimension(4*gap, 5)));
        box7.add(box72);
        box7.add(Box.createRigidArea(new Dimension(4*gap, 5)));
        box7.add(box73);
        box7.add(Box.createRigidArea(new Dimension(4*gap, 5)));
        box7.add(box74);

        add(box7);
    }

}

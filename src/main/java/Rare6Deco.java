import javax.swing.*;
import java.awt.*;

public class Rare6Deco extends JPanel {

    private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    private int gap = (screenSize.width/2-300)*6/165;
    private Dimension wideGap = new Dimension(5, gap);

    Rare6Deco(int[][] matrix){
        Box box6 = Box.createHorizontalBox();
        Box box61 = Box.createVerticalBox();
        Box box62 = Box.createVerticalBox();
        Box box63 = Box.createVerticalBox();
        Box box64 = Box.createVerticalBox();

        SpinnerModel naijueValue = new SpinnerNumberModel(matrix[4][0], 0, 3, 1);
        JLabel naijueLabel = new JLabel("耐绝珠    ");
        JSpinner naijueSpinner = new JSpinner(naijueValue);
        if((Integer)naijueSpinner.getValue()==3){
            naijueLabel.setForeground(new Color(180,180,180));
        }
        Box naijueBox = Box.createHorizontalBox();
        naijueBox.add(naijueLabel);
        naijueBox.add(naijueSpinner);
        naijueBox.add(new JLabel("  /3"));
        naijueSpinner.addChangeListener(e -> {
            if((Integer)naijueSpinner.getValue() == 3){
                naijueLabel.setForeground(new Color(180,180,180));
            }else{
                naijueLabel.setForeground(new Color(0,0,0));
            }
            matrix[4][0] = (Integer)naijueSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel fangyuValue = new SpinnerNumberModel(matrix[4][1], 0, 7, 1);
        JLabel fangyuLabel = new JLabel("防御珠    ");
        JSpinner fangyuSpinner = new JSpinner(fangyuValue);
        if((Integer)fangyuSpinner.getValue()==7){
            fangyuLabel.setForeground(new Color(180,180,180));
        }
        Box fangyuBox = Box.createHorizontalBox();
        fangyuBox.add(fangyuLabel);
        fangyuBox.add(fangyuSpinner);
        fangyuBox.add(new JLabel("  /7"));
        fangyuSpinner.addChangeListener(e -> {
            if((Integer)fangyuSpinner.getValue() == 7){
                fangyuLabel.setForeground(new Color(180,180,180));
            }else{
                fangyuLabel.setForeground(new Color(0,0,0));
            }
            matrix[4][1] = (Integer)fangyuSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel tiliValue = new SpinnerNumberModel(matrix[4][2], 0, 3, 1);
        JLabel tiliLabel = new JLabel("体力珠    ");
        JSpinner tiliSpinner = new JSpinner(tiliValue);
        if((Integer)tiliSpinner.getValue()==3){
            tiliLabel.setForeground(new Color(180,180,180));
        }
        Box tiliBox = Box.createHorizontalBox();
        tiliBox.add(tiliLabel);
        tiliBox.add(tiliSpinner);
        tiliBox.add(new JLabel("  /3"));
        tiliSpinner.addChangeListener(e -> {
            if((Integer)tiliSpinner.getValue() == 3){
                tiliLabel.setForeground(new Color(180,180,180));
            }else{
                tiliLabel.setForeground(new Color(0,0,0));
            }
            matrix[4][2] = (Integer)tiliSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel zaofuValue = new SpinnerNumberModel(matrix[4][3], 0, 3, 1);
        JLabel zaofuLabel = new JLabel("早复珠    ");
        JSpinner zaofuSpinner = new JSpinner(zaofuValue);
        if((Integer)zaofuSpinner.getValue()==3){
            zaofuLabel.setForeground(new Color(180,180,180));
        }
        Box zaofuBox = Box.createHorizontalBox();
        zaofuBox.add(zaofuLabel);
        zaofuBox.add(zaofuSpinner);
        zaofuBox.add(new JLabel("  /3"));
        zaofuSpinner.addChangeListener(e -> {
            if((Integer)zaofuSpinner.getValue() == 3){
                zaofuLabel.setForeground(new Color(180,180,180));
            }else{
                zaofuLabel.setForeground(new Color(0,0,0));
            }
            matrix[4][3] = (Integer)zaofuSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel naishuValue = new SpinnerNumberModel(matrix[4][4], 0, 3, 1);
        JLabel naishuLabel = new JLabel("耐属珠    ");
        JSpinner naishuSpinner = new JSpinner(naishuValue);
        if((Integer)naishuSpinner.getValue()==3){
            naishuLabel.setForeground(new Color(180,180,180));
        }
        Box naishuBox = Box.createHorizontalBox();
        naishuBox.add(naishuLabel);
        naishuBox.add(naishuSpinner);
        naishuBox.add(new JLabel("  /3"));
        naishuSpinner.addChangeListener(e -> {
            if((Integer)naishuSpinner.getValue() == 3){
                naishuLabel.setForeground(new Color(180,180,180));
            }else{
                naishuLabel.setForeground(new Color(0,0,0));
            }
            matrix[4][4] = (Integer)naishuSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel huoyanValue = new SpinnerNumberModel(matrix[4][5], 0, 5, 1);
        JLabel huoyanLabel = new JLabel("火炎珠    ");
        JSpinner huoyanSpinner = new JSpinner(huoyanValue);
        if((Integer)huoyanSpinner.getValue()==5){
            huoyanLabel.setForeground(new Color(180,180,180));
        }
        Box huoyanBox = Box.createHorizontalBox();
        huoyanBox.add(huoyanLabel);
        huoyanBox.add(huoyanSpinner);
        huoyanBox.add(new JLabel("  /5"));
        huoyanSpinner.addChangeListener(e -> {
            if((Integer)huoyanSpinner.getValue() == 5){
                huoyanLabel.setForeground(new Color(180,180,180));
            }else{
                huoyanLabel.setForeground(new Color(0,0,0));
            }
            matrix[4][5] = (Integer)huoyanSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel liushuiValue = new SpinnerNumberModel(matrix[4][6], 0, 5, 1);
        JLabel liushuiLabel = new JLabel("流水珠    ");
        JSpinner liushuiSpinner = new JSpinner(liushuiValue);
        if((Integer)liushuiSpinner.getValue()==5){
            liushuiLabel.setForeground(new Color(180,180,180));
        }
        Box liushuiBox = Box.createHorizontalBox();
        liushuiBox.add(liushuiLabel);
        liushuiBox.add(liushuiSpinner);
        liushuiBox.add(new JLabel("  /5"));
        liushuiSpinner.addChangeListener(e -> {
            if((Integer)liushuiSpinner.getValue() == 5){
                liushuiLabel.setForeground(new Color(180,180,180));
            }else{
                liushuiLabel.setForeground(new Color(0,0,0));
            }
            matrix[4][6] = (Integer)liushuiSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel bingjieValue = new SpinnerNumberModel(matrix[4][7], 0, 5, 1);
        JLabel bingjieLabel = new JLabel("冰结珠    ");
        JSpinner bingjieSpinner = new JSpinner(bingjieValue);
        if((Integer)bingjieSpinner.getValue()==5){
            bingjieLabel.setForeground(new Color(180,180,180));
        }
        Box bingjieBox = Box.createHorizontalBox();
        bingjieBox.add(bingjieLabel);
        bingjieBox.add(bingjieSpinner);
        bingjieBox.add(new JLabel("  /5"));
        bingjieSpinner.addChangeListener(e -> {
            if((Integer)bingjieSpinner.getValue() == 5){
                bingjieLabel.setForeground(new Color(180,180,180));
            }else{
                bingjieLabel.setForeground(new Color(0,0,0));
            }
            matrix[4][7] = (Integer)bingjieSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel leiguangValue = new SpinnerNumberModel(matrix[4][8], 0, 5, 1);
        JLabel leiguangLabel = new JLabel("雷光珠    ");
        JSpinner leiguangSpinner = new JSpinner(leiguangValue);
        if((Integer)leiguangSpinner.getValue()==5){
            leiguangLabel.setForeground(new Color(180,180,180));
        }
        Box leiguangBox = Box.createHorizontalBox();
        leiguangBox.add(leiguangLabel);
        leiguangBox.add(leiguangSpinner);
        leiguangBox.add(new JLabel("  /5"));
        leiguangSpinner.addChangeListener(e -> {
            if((Integer)leiguangSpinner.getValue() == 5){
                leiguangLabel.setForeground(new Color(180,180,180));
            }else{
                leiguangLabel.setForeground(new Color(0,0,0));
            }
            matrix[4][8] = (Integer)leiguangSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel polongValue = new SpinnerNumberModel(matrix[4][9], 0, 5, 1);
        JLabel polongLabel = new JLabel("破龙珠    ");
        JSpinner polongSpinner = new JSpinner(polongValue);
        if((Integer)polongSpinner.getValue()==5){
            polongLabel.setForeground(new Color(180,180,180));
        }
        Box polongBox = Box.createHorizontalBox();
        polongBox.add(polongLabel);
        polongBox.add(polongSpinner);
        polongBox.add(new JLabel("  /5"));
        polongSpinner.addChangeListener(e -> {
            if((Integer)polongSpinner.getValue() == 5){
                polongLabel.setForeground(new Color(180,180,180));
            }else{
                polongLabel.setForeground(new Color(0,0,0));
            }
            matrix[4][9] = (Integer)polongSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel duValue = new SpinnerNumberModel(matrix[4][10], 0, 3, 1);
        JLabel duLabel = new JLabel("毒珠        ");
        JSpinner duSpinner = new JSpinner(duValue);
        if((Integer)duSpinner.getValue()==3){
            duLabel.setForeground(new Color(180,180,180));
        }
        Box duBox = Box.createHorizontalBox();
        duBox.add(duLabel);
        duBox.add(duSpinner);
        duBox.add(new JLabel("  /3"));
        duSpinner.addChangeListener(e -> {
            if((Integer)duSpinner.getValue() == 3){
                duLabel.setForeground(new Color(180,180,180));
            }else{
                duLabel.setForeground(new Color(0,0,0));
            }
            matrix[4][10] = (Integer)duSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel darenValue = new SpinnerNumberModel(matrix[4][11], 0, 7, 1);
        JLabel darenLabel = new JLabel("达人珠    ");
        JSpinner darenSpinner = new JSpinner(darenValue);
        if((Integer)darenSpinner.getValue()==7){
            darenLabel.setForeground(new Color(180,180,180));
        }
        Box darenBox = Box.createHorizontalBox();
        darenBox.add(darenLabel);
        darenBox.add(darenSpinner);
        darenBox.add(new JLabel("  /7"));
        darenSpinner.addChangeListener(e -> {
            if((Integer)darenSpinner.getValue() == 7){
                darenLabel.setForeground(new Color(180,180,180));
            }else{
                darenLabel.setForeground(new Color(0,0,0));
            }
            matrix[4][11] = (Integer)darenSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel duoqiValue = new SpinnerNumberModel(matrix[4][12], 0, 3, 1);
        JLabel duoqiLabel = new JLabel("夺气珠    ");
        JSpinner duoqiSpinner = new JSpinner(duoqiValue);
        if((Integer)duoqiSpinner.getValue()==3){
            duoqiLabel.setForeground(new Color(180,180,180));
        }
        Box duoqiBox = Box.createHorizontalBox();
        duoqiBox.add(duoqiLabel);
        duoqiBox.add(duoqiSpinner);
        duoqiBox.add(new JLabel("  /3"));
        duoqiSpinner.addChangeListener(e -> {
            if((Integer)duoqiSpinner.getValue() == 3){
                duoqiLabel.setForeground(new Color(180,180,180));
            }else{
                duoqiLabel.setForeground(new Color(0,0,0));
            }
            matrix[4][12] = (Integer)duoqiSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel gudiValue = new SpinnerNumberModel(matrix[4][13], 0, 1, 1);
        JLabel gudiLabel = new JLabel("鼓笛珠    ");
        JSpinner gudiSpinner = new JSpinner(gudiValue);
        if((Integer)gudiSpinner.getValue()==1){
            gudiLabel.setForeground(new Color(180,180,180));
        }
        Box gudiBox = Box.createHorizontalBox();
        gudiBox.add(gudiLabel);
        gudiBox.add(gudiSpinner);
        gudiBox.add(new JLabel("  /1"));
        gudiSpinner.addChangeListener(e -> {
            if((Integer)gudiSpinner.getValue() == 1){
                gudiLabel.setForeground(new Color(180,180,180));
            }else{
                gudiLabel.setForeground(new Color(0,0,0));
            }
            matrix[4][13] = (Integer)gudiSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel sunaValue = new SpinnerNumberModel(matrix[4][14], 0, 3, 1);
        JLabel sunaLabel = new JLabel("速纳珠    ");
        JSpinner sunaSpinner = new JSpinner(sunaValue);
        if((Integer)sunaSpinner.getValue()==3){
            sunaLabel.setForeground(new Color(180,180,180));
        }
        Box sunaBox = Box.createHorizontalBox();
        sunaBox.add(sunaLabel);
        sunaBox.add(sunaSpinner);
        sunaBox.add(new JLabel("  /3"));
        sunaSpinner.addChangeListener(e -> {
            if((Integer)sunaSpinner.getValue() == 3){
                sunaLabel.setForeground(new Color(180,180,180));
            }else{
                sunaLabel.setForeground(new Color(0,0,0));
            }
            matrix[4][14] = (Integer)sunaSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel youaiValue = new SpinnerNumberModel(matrix[4][15], 0, 5, 1);
        JLabel youaiLabel = new JLabel("友爱珠    ");
        JSpinner youaiSpinner = new JSpinner(youaiValue);
        if((Integer)youaiSpinner.getValue()==5){
            youaiLabel.setForeground(new Color(180,180,180));
        }
        Box youaiBox = Box.createHorizontalBox();
        youaiBox.add(youaiLabel);
        youaiBox.add(youaiSpinner);
        youaiBox.add(new JLabel("  /5"));
        youaiSpinner.addChangeListener(e -> {
            if((Integer)youaiSpinner.getValue() == 5){
                youaiLabel.setForeground(new Color(180,180,180));
            }else{
                youaiLabel.setForeground(new Color(0,0,0));
            }
            matrix[4][15] = (Integer)youaiSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel chixuValue = new SpinnerNumberModel(matrix[4][16], 0, 3, 1);
        JLabel chixuLabel = new JLabel("持续珠    ");
        JSpinner chixuSpinner = new JSpinner(chixuValue);
        if((Integer)chixuSpinner.getValue()==3){
            chixuLabel.setForeground(new Color(180,180,180));
        }
        Box chixuBox = Box.createHorizontalBox();
        chixuBox.add(chixuLabel);
        chixuBox.add(chixuSpinner);
        chixuBox.add(new JLabel("  /3"));
        chixuSpinner.addChangeListener(e -> {
            if((Integer)chixuSpinner.getValue() == 3){
                chixuLabel.setForeground(new Color(180,180,180));
            }else{
                chixuLabel.setForeground(new Color(0,0,0));
            }
            matrix[4][16] = (Integer)chixuSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel kuaichiValue = new SpinnerNumberModel(matrix[4][17], 0, 3, 1);
        JLabel kuaichiLabel = new JLabel("快吃珠    ");
        JSpinner kuaichiSpinner = new JSpinner(kuaichiValue);
        if((Integer)kuaichiSpinner.getValue()==3){
            kuaichiLabel.setForeground(new Color(180,180,180));
        }
        Box kuaichiBox = Box.createHorizontalBox();
        kuaichiBox.add(kuaichiLabel);
        kuaichiBox.add(kuaichiSpinner);
        kuaichiBox.add(new JLabel("  /3"));
        kuaichiSpinner.addChangeListener(e -> {
            if((Integer)kuaichiSpinner.getValue() == 3){
                kuaichiLabel.setForeground(new Color(180,180,180));
            }else{
                kuaichiLabel.setForeground(new Color(0,0,0));
            }
            matrix[4][17] = (Integer)kuaichiSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel yanmoValue = new SpinnerNumberModel(matrix[4][18], 0, 3, 1);
        JLabel yanmoLabel = new JLabel("研磨珠    ");
        JSpinner yanmoSpinner = new JSpinner(yanmoValue);
        if((Integer)yanmoSpinner.getValue()==3){
            yanmoLabel.setForeground(new Color(180,180,180));
        }
        Box yanmoBox = Box.createHorizontalBox();
        yanmoBox.add(yanmoLabel);
        yanmoBox.add(yanmoSpinner);
        yanmoBox.add(new JLabel("  /3"));
        yanmoSpinner.addChangeListener(e -> {
            if((Integer)yanmoSpinner.getValue() == 3){
                yanmoLabel.setForeground(new Color(180,180,180));
            }else{
                yanmoLabel.setForeground(new Color(0,0,0));
            }
            matrix[4][18] = (Integer)yanmoSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel baoshiValue = new SpinnerNumberModel(matrix[4][19], 0, 3, 1);
        JLabel baoshiLabel = new JLabel("爆师珠    ");
        JSpinner baoshiSpinner = new JSpinner(baoshiValue);
        if((Integer)baoshiSpinner.getValue()==3){
            baoshiLabel.setForeground(new Color(180,180,180));
        }
        Box baoshiBox = Box.createHorizontalBox();
        baoshiBox.add(baoshiLabel);
        baoshiBox.add(baoshiSpinner);
        baoshiBox.add(new JLabel("  /3"));
        baoshiSpinner.addChangeListener(e -> {
            if((Integer)baoshiSpinner.getValue() == 3){
                baoshiLabel.setForeground(new Color(180,180,180));
            }else{
                baoshiLabel.setForeground(new Color(0,0,0));
            }
            matrix[4][19] = (Integer)baoshiSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel toushiValue = new SpinnerNumberModel(matrix[4][20], 0, 3, 1);
        JLabel toushiLabel = new JLabel("投石珠    ");
        JSpinner toushiSpinner = new JSpinner(toushiValue);
        if((Integer)toushiSpinner.getValue()==3){
            toushiLabel.setForeground(new Color(180,180,180));
        }
        Box toushiBox = Box.createHorizontalBox();
        toushiBox.add(toushiLabel);
        toushiBox.add(toushiSpinner);
        toushiBox.add(new JLabel("  /3"));
        toushiSpinner.addChangeListener(e -> {
            if((Integer)toushiSpinner.getValue() == 3){
                toushiLabel.setForeground(new Color(180,180,180));
            }else{
                toushiLabel.setForeground(new Color(0,0,0));
            }
            matrix[4][20] = (Integer)toushiSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel zhiyuValue = new SpinnerNumberModel(matrix[4][21], 0, 3, 1);
        JLabel zhiyuLabel = new JLabel("治愈珠    ");
        JSpinner zhiyuSpinner = new JSpinner(zhiyuValue);
        if((Integer)zhiyuSpinner.getValue()==3){
            zhiyuLabel.setForeground(new Color(180,180,180));
        }
        Box zhiyuBox = Box.createHorizontalBox();
        zhiyuBox.add(zhiyuLabel);
        zhiyuBox.add(zhiyuSpinner);
        zhiyuBox.add(new JLabel("  /3"));
        zhiyuSpinner.addChangeListener(e -> {
            if((Integer)zhiyuSpinner.getValue() == 3){
                zhiyuLabel.setForeground(new Color(180,180,180));
            }else{
                zhiyuLabel.setForeground(new Color(0,0,0));
            }
            matrix[4][21] = (Integer)zhiyuSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel fangfengValue = new SpinnerNumberModel(matrix[4][22], 0, 5, 1);
        JLabel fangfengLabel = new JLabel("防风珠    ");
        JSpinner fangfengSpinner = new JSpinner(fangfengValue);
        if((Integer)fangfengSpinner.getValue()==5){
            fangfengLabel.setForeground(new Color(180,180,180));
        }
        Box fangfengBox = Box.createHorizontalBox();
        fangfengBox.add(fangfengLabel);
        fangfengBox.add(fangfengSpinner);
        fangfengBox.add(new JLabel("  /5"));
        fangfengSpinner.addChangeListener(e -> {
            if((Integer)fangfengSpinner.getValue() == 5){
                fangfengLabel.setForeground(new Color(180,180,180));
            }else{
                fangfengLabel.setForeground(new Color(0,0,0));
            }
            matrix[4][22] = (Integer)fangfengSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel naizhenValue = new SpinnerNumberModel(matrix[4][23], 0, 5, 1);
        JLabel naizhenLabel = new JLabel("耐震珠    ");
        JSpinner naizhenSpinner = new JSpinner(naizhenValue);
        if((Integer)naizhenSpinner.getValue()==5){
            naizhenLabel.setForeground(new Color(180,180,180));
        }
        Box naizhenBox = Box.createHorizontalBox();
        naizhenBox.add(naizhenLabel);
        naizhenBox.add(naizhenSpinner);
        naizhenBox.add(new JLabel("  /5"));
        naizhenSpinner.addChangeListener(e -> {
            if((Integer)naizhenSpinner.getValue() == 5){
                naizhenLabel.setForeground(new Color(180,180,180));
            }else{
                naizhenLabel.setForeground(new Color(0,0,0));
            }
            matrix[4][23] = (Integer)naizhenSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel tongjiValue = new SpinnerNumberModel(matrix[4][24], 0, 3, 1);
        JLabel tongjiLabel = new JLabel("痛击珠    ");
        JSpinner tongjiSpinner = new JSpinner(tongjiValue);
        if((Integer)tongjiSpinner.getValue()==3){
            tongjiLabel.setForeground(new Color(180,180,180));
        }
        Box tongjiBox = Box.createHorizontalBox();
        tongjiBox.add(tongjiLabel);
        tongjiBox.add(tongjiSpinner);
        tongjiBox.add(new JLabel("  /3"));
        tongjiSpinner.addChangeListener(e -> {
            if((Integer)tongjiSpinner.getValue() == 3){
                tongjiLabel.setForeground(new Color(180,180,180));
            }else{
                tongjiLabel.setForeground(new Color(0,0,0));
            }
            matrix[4][24] = (Integer)tongjiSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel zhongjiValue = new SpinnerNumberModel(matrix[4][25], 0, 3, 1);
        JLabel zhongjiLabel = new JLabel("重击珠    ");
        JSpinner zhongjiSpinner = new JSpinner(zhongjiValue);
        if((Integer)zhongjiSpinner.getValue()==3){
            zhongjiLabel.setForeground(new Color(180,180,180));
        }
        Box zhongjiBox = Box.createHorizontalBox();
        zhongjiBox.add(zhongjiLabel);
        zhongjiBox.add(zhongjiSpinner);
        zhongjiBox.add(new JLabel("  /3"));
        zhongjiSpinner.addChangeListener(e -> {
            if((Integer)zhongjiSpinner.getValue() == 3){
                zhongjiLabel.setForeground(new Color(180,180,180));
            }else{
                zhongjiLabel.setForeground(new Color(0,0,0));
            }
            matrix[4][25] = (Integer)zhongjiSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel koValue = new SpinnerNumberModel(matrix[4][26], 0, 3, 1);
        JLabel koLabel = new JLabel("KO珠      ");
        JSpinner koSpinner = new JSpinner(koValue);
        if((Integer)koSpinner.getValue()==3){
            koLabel.setForeground(new Color(180,180,180));
        }
        Box koBox = Box.createHorizontalBox();
        koBox.add(koLabel);
        koBox.add(koSpinner);
        koBox.add(new JLabel("  /3"));
        koSpinner.addChangeListener(e -> {
            if((Integer)koSpinner.getValue() == 3){
                koLabel.setForeground(new Color(180,180,180));
            }else{
                koLabel.setForeground(new Color(0,0,0));
            }
            matrix[4][26] = (Integer)koSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel tishuValue = new SpinnerNumberModel(matrix[4][27], 0, 5, 1);
        JLabel tishuLabel = new JLabel("体术珠    ");
        JSpinner tishuSpinner = new JSpinner(tishuValue);
        if((Integer)tishuSpinner.getValue()==5){
            tishuLabel.setForeground(new Color(180,180,180));
        }
        Box tishuBox = Box.createHorizontalBox();
        tishuBox.add(tishuLabel);
        tishuBox.add(tishuSpinner);
        tishuBox.add(new JLabel("  /5"));
        tishuSpinner.addChangeListener(e -> {
            if((Integer)tishuSpinner.getValue() == 5){
                tishuLabel.setForeground(new Color(180,180,180));
            }else{
                tishuLabel.setForeground(new Color(0,0,0));
            }
            matrix[4][27] = (Integer)tishuSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel huibiValue = new SpinnerNumberModel(matrix[4][28], 0, 5, 1);
        JLabel huibiLabel = new JLabel("回避珠    ");
        JSpinner huibiSpinner = new JSpinner(huibiValue);
        if((Integer)huibiSpinner.getValue()==5){
            huibiLabel.setForeground(new Color(180,180,180));
        }
        Box huibiBox = Box.createHorizontalBox();
        huibiBox.add(huibiLabel);
        huibiBox.add(huibiSpinner);
        huibiBox.add(new JLabel("  /5"));
        huibiSpinner.addChangeListener(e -> {
            if((Integer)huibiSpinner.getValue() == 5){
                huibiLabel.setForeground(new Color(180,180,180));
            }else{
                huibiLabel.setForeground(new Color(0,0,0));
            }
            matrix[4][28] = (Integer)huibiSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel tiaoyueValue = new SpinnerNumberModel(matrix[4][29], 0, 3, 1);
        JLabel tiaoyueLabel = new JLabel("跳跃珠    ");
        JSpinner tiaoyueSpinner = new JSpinner(tiaoyueValue);
        if((Integer)tiaoyueSpinner.getValue()==3){
            tiaoyueLabel.setForeground(new Color(180,180,180));
        }
        Box tiaoyueBox = Box.createHorizontalBox();
        tiaoyueBox.add(tiaoyueLabel);
        tiaoyueBox.add(tiaoyueSpinner);
        tiaoyueBox.add(new JLabel("  /3"));
        tiaoyueSpinner.addChangeListener(e -> {
            if((Integer)tiaoyueSpinner.getValue() == 3){
                tiaoyueLabel.setForeground(new Color(180,180,180));
            }else{
                tiaoyueLabel.setForeground(new Color(0,0,0));
            }
            matrix[4][29] = (Integer)tiaoyueSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel huazouValue = new SpinnerNumberModel(matrix[4][30], 0, 1, 1);
        JLabel huazouLabel = new JLabel("滑走珠    ");
        JSpinner huazouSpinner = new JSpinner(huazouValue);
        if((Integer)huazouSpinner.getValue()==1){
            huazouLabel.setForeground(new Color(180,180,180));
        }
        Box huazouBox = Box.createHorizontalBox();
        huazouBox.add(huazouLabel);
        huazouBox.add(huazouSpinner);
        huazouBox.add(new JLabel("  /1"));
        huazouSpinner.addChangeListener(e -> {
            if((Integer)huazouSpinner.getValue() == 1){
                huazouLabel.setForeground(new Color(180,180,180));
            }else{
                huazouLabel.setForeground(new Color(0,0,0));
            }
            matrix[4][30] = (Integer)huazouSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel wujiValue = new SpinnerNumberModel(matrix[4][31], 0, 1, 1);
        JLabel wujiLabel = new JLabel("无击珠    ");
        JSpinner wujiSpinner = new JSpinner(wujiValue);
        if((Integer)wujiSpinner.getValue()==1){
            wujiLabel.setForeground(new Color(180,180,180));
        }
        Box wujiBox = Box.createHorizontalBox();
        wujiBox.add(wujiLabel);
        wujiBox.add(wujiSpinner);
        wujiBox.add(new JLabel("  /1"));
        wujiSpinner.addChangeListener(e -> {
            if((Integer)wujiSpinner.getValue() == 1){
                wujiLabel.setForeground(new Color(180,180,180));
            }else{
                wujiLabel.setForeground(new Color(0,0,0));
            }
            matrix[4][31] = (Integer)wujiSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel fangyinValue = new SpinnerNumberModel(matrix[4][32], 0, 5, 1);
        JLabel fangyinLabel = new JLabel("防音珠    ");
        JSpinner fangyinSpinner = new JSpinner(fangyinValue);
        if((Integer)fangyinSpinner.getValue()==5){
            fangyinLabel.setForeground(new Color(180,180,180));
        }
        Box fangyinBox = Box.createHorizontalBox();
        fangyinBox.add(fangyinLabel);
        fangyinBox.add(fangyinSpinner);
        fangyinBox.add(new JLabel("  /5"));
        fangyinSpinner.addChangeListener(e -> {
            if((Integer)fangyinSpinner.getValue() == 5){
                fangyinLabel.setForeground(new Color(180,180,180));
            }else{
                fangyinLabel.setForeground(new Color(0,0,0));
            }
            matrix[4][32] = (Integer)fangyinSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel dupingValue = new SpinnerNumberModel(matrix[4][33], 0, 1, 1);
        JLabel dupingLabel = new JLabel("毒瓶珠    ");
        JSpinner dupingSpinner = new JSpinner(dupingValue);
        if((Integer)dupingSpinner.getValue()==1){
            dupingLabel.setForeground(new Color(180,180,180));
        }
        Box dupingBox = Box.createHorizontalBox();
        dupingBox.add(dupingLabel);
        dupingBox.add(dupingSpinner);
        dupingBox.add(new JLabel("  /1"));
        dupingSpinner.addChangeListener(e -> {
            if((Integer)dupingSpinner.getValue() == 1){
                dupingLabel.setForeground(new Color(180,180,180));
            }else{
                dupingLabel.setForeground(new Color(0,0,0));
            }
            matrix[4][33] = (Integer)dupingSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel naichongValue = new SpinnerNumberModel(matrix[4][34], 0, 3, 1);
        JLabel naichongLabel = new JLabel("耐冲珠    ");
        JSpinner naichongSpinner = new JSpinner(naichongValue);
        if((Integer)naichongSpinner.getValue()==3){
            naichongLabel.setForeground(new Color(180,180,180));
        }
        Box naichongBox = Box.createHorizontalBox();
        naichongBox.add(naichongLabel);
        naichongBox.add(naichongSpinner);
        naichongBox.add(new JLabel("  /3"));
        naichongSpinner.addChangeListener(e -> {
            if((Integer)naichongSpinner.getValue() == 3){
                naichongLabel.setForeground(new Color(180,180,180));
            }else{
                naichongLabel.setForeground(new Color(0,0,0));
            }
            matrix[4][34] = (Integer)naichongSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        box61.add(Box.createRigidArea(new Dimension(5, 2*gap)));
        box61.add(naijueBox);
        box62.add(Box.createRigidArea(new Dimension(5, 2*gap)));
        box62.add(fangyuBox);
        box63.add(Box.createRigidArea(new Dimension(5, 2*gap)));
        box63.add(tiliBox);
        box64.add(Box.createRigidArea(new Dimension(5, 2*gap)));
        box64.add(zaofuBox);
        box61.add(Box.createRigidArea(wideGap));
        box61.add(naishuBox);
        box62.add(Box.createRigidArea(wideGap));
        box62.add(huoyanBox);
        box63.add(Box.createRigidArea(wideGap));
        box63.add(liushuiBox);
        box64.add(Box.createRigidArea(wideGap));
        box64.add(bingjieBox);
        box61.add(Box.createRigidArea(wideGap));
        box61.add(leiguangBox);
        box62.add(Box.createRigidArea(wideGap));
        box62.add(polongBox);
        box63.add(Box.createRigidArea(wideGap));
        box63.add(duBox);
        box64.add(Box.createRigidArea(wideGap));
        box64.add(darenBox);
        box61.add(Box.createRigidArea(wideGap));
        box61.add(duoqiBox);
        box62.add(Box.createRigidArea(wideGap));
        box62.add(gudiBox);
        box63.add(Box.createRigidArea(wideGap));
        box63.add(sunaBox);
        box64.add(Box.createRigidArea(wideGap));
        box64.add(youaiBox);
        box61.add(Box.createRigidArea(wideGap));
        box61.add(chixuBox);
        box62.add(Box.createRigidArea(wideGap));
        box62.add(kuaichiBox);
        box63.add(Box.createRigidArea(wideGap));
        box63.add(yanmoBox);
        box64.add(Box.createRigidArea(wideGap));
        box64.add(baoshiBox);
        box61.add(Box.createRigidArea(wideGap));
        box61.add(toushiBox);
        box62.add(Box.createRigidArea(wideGap));
        box62.add(zhiyuBox);
        box63.add(Box.createRigidArea(wideGap));
        box63.add(fangfengBox);
        box64.add(Box.createRigidArea(wideGap));
        box64.add(naizhenBox);
        box61.add(Box.createRigidArea(wideGap));
        box61.add(tongjiBox);
        box62.add(Box.createRigidArea(wideGap));
        box62.add(zhongjiBox);
        box63.add(Box.createRigidArea(wideGap));
        box63.add(koBox);
        box64.add(Box.createRigidArea(wideGap));
        box64.add(tishuBox);
        box61.add(Box.createRigidArea(wideGap));
        box61.add(huibiBox);
        box62.add(Box.createRigidArea(wideGap));
        box62.add(tiaoyueBox);
        box63.add(Box.createRigidArea(wideGap));
        box63.add(huazouBox);
        box64.add(Box.createRigidArea(wideGap));
        box64.add(wujiBox);
        box61.add(Box.createRigidArea(wideGap));
        box61.add(fangyinBox);
        box62.add(Box.createRigidArea(wideGap));
        box62.add(dupingBox);
        box63.add(Box.createRigidArea(wideGap));
        box63.add(naichongBox);

        box61.add(Box.createRigidArea(new Dimension(5, gap)));
        box62.add(Box.createRigidArea(new Dimension(5, gap)));
        box63.add(Box.createRigidArea(new Dimension(5, gap)));
        box64.add(Box.createRigidArea(new Dimension(5, 3*gap)));

        box6.add(box61);
        box6.add(Box.createRigidArea(new Dimension(4*gap, 5)));
        box6.add(box62);
        box6.add(Box.createRigidArea(new Dimension(4*gap, 5)));
        box6.add(box63);
        box6.add(Box.createRigidArea(new Dimension(4*gap, 5)));
        box6.add(box64);

        add(box6);

    }

}
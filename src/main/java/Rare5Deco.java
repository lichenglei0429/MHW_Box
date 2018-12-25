import javax.swing.*;
import java.awt.*;

public class Rare5Deco extends JPanel {

    private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    private int gap = (screenSize.width/2-300)*6/165;
    private Dimension wideGap = new Dimension(5, gap);

    Rare5Deco(int[][] matrix){
        Box box5 = Box.createHorizontalBox();
        Box box51 = Box.createVerticalBox();
        Box box52 = Box.createVerticalBox();
        Box box53 = Box.createVerticalBox();
        Box box54 = Box.createVerticalBox();

        SpinnerModel naiduValue = new SpinnerNumberModel(matrix[3][0], 0, 3, 1);
        JLabel naiduLabel = new JLabel("耐毒珠    ");
        JSpinner naiduSpinner = new JSpinner(naiduValue);
        if((Integer)naiduSpinner.getValue()==3){
            naiduLabel.setForeground(new Color(180,180,180));
        }
        Box naiduBox = Box.createHorizontalBox();
        naiduBox.add(naiduLabel);
        naiduBox.add(naiduSpinner);
        naiduBox.add(new JLabel("  /3"));
        naiduSpinner.addChangeListener(e -> {
            if((Integer)naiduSpinner.getValue() == 3){
                naiduLabel.setForeground(new Color(180,180,180));
            }else{
                naiduLabel.setForeground(new Color(0,0,0));
            }
            matrix[3][0] = (Integer)naiduSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel naimaValue = new SpinnerNumberModel(matrix[3][1], 0, 3, 1);
        JLabel naimaLabel = new JLabel("耐麻珠    ");
        JSpinner naimaSpinner = new JSpinner(naimaValue);
        if((Integer)naimaSpinner.getValue()==3){
            naimaLabel.setForeground(new Color(180,180,180));
        }
        Box naimaBox = Box.createHorizontalBox();
        naimaBox.add(naimaLabel);
        naimaBox.add(naimaSpinner);
        naimaBox.add(new JLabel("  /3"));
        naimaSpinner.addChangeListener(e -> {
            if((Integer)naimaSpinner.getValue() == 3){
                naimaLabel.setForeground(new Color(180,180,180));
            }else{
                naimaLabel.setForeground(new Color(0,0,0));
            }
            matrix[3][1] = (Integer)naimaSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel naimianValue = new SpinnerNumberModel(matrix[3][2], 0, 3, 1);
        JLabel naimianLabel = new JLabel("耐眠珠    ");
        JSpinner naimianSpinner = new JSpinner(naimianValue);
        if((Integer)naimianSpinner.getValue()==3){
            naimianLabel.setForeground(new Color(180,180,180));
        }
        Box naimianBox = Box.createHorizontalBox();
        naimianBox.add(naimianLabel);
        naimianBox.add(naimianSpinner);
        naimianBox.add(new JLabel("  /3"));
        naimianSpinner.addChangeListener(e -> {
            if((Integer)naimianSpinner.getValue() == 3){
                naimianLabel.setForeground(new Color(180,180,180));
            }else{
                naimianLabel.setForeground(new Color(0,0,0));
            }
            matrix[3][2] = (Integer)naimianSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel naibaoValue = new SpinnerNumberModel(matrix[3][3], 0, 3, 1);
        JLabel naibaoLabel = new JLabel("耐爆珠    ");
        JSpinner naibaoSpinner = new JSpinner(naibaoValue);
        if((Integer)naibaoSpinner.getValue()==3){
            naibaoLabel.setForeground(new Color(180,180,180));
        }
        Box naibaoBox = Box.createHorizontalBox();
        naibaoBox.add(naibaoLabel);
        naibaoBox.add(naibaoSpinner);
        naibaoBox.add(new JLabel("  /3"));
        naibaoSpinner.addChangeListener(e -> {
            if((Integer)naibaoSpinner.getValue() == 3){
                naibaoLabel.setForeground(new Color(180,180,180));
            }else{
                naibaoLabel.setForeground(new Color(0,0,0));
            }
            matrix[3][3] = (Integer)naibaoSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel nailieValue = new SpinnerNumberModel(matrix[3][4], 0, 3, 1);
        JLabel nailieLabel = new JLabel("耐裂珠    ");
        JSpinner nailieSpinner = new JSpinner(nailieValue);
        if((Integer)nailieSpinner.getValue()==3){
            nailieLabel.setForeground(new Color(180,180,180));
        }
        Box nailieBox = Box.createHorizontalBox();
        nailieBox.add(nailieLabel);
        nailieBox.add(nailieSpinner);
        nailieBox.add(new JLabel("  /3"));
        nailieSpinner.addChangeListener(e -> {
            if((Integer)nailieSpinner.getValue() == 3){
                nailieLabel.setForeground(new Color(180,180,180));
            }else{
                nailieLabel.setForeground(new Color(0,0,0));
            }
            matrix[3][4] = (Integer)nailieSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel naifangValue = new SpinnerNumberModel(matrix[3][5], 0, 3, 1);
        JLabel naifangLabel = new JLabel("耐防珠    ");
        JSpinner naifangSpinner = new JSpinner(naifangValue);
        if((Integer)naifangSpinner.getValue()==3){
            naifangLabel.setForeground(new Color(180,180,180));
        }
        Box naifangBox = Box.createHorizontalBox();
        naifangBox.add(naifangLabel);
        naifangBox.add(naifangSpinner);
        naifangBox.add(new JLabel("  /3"));
        naifangSpinner.addChangeListener(e -> {
            if((Integer)naifangSpinner.getValue() == 3){
                naifangLabel.setForeground(new Color(180,180,180));
            }else{
                naifangLabel.setForeground(new Color(0,0,0));
            }
            matrix[3][5] = (Integer)naifangSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel naihuoValue = new SpinnerNumberModel(matrix[3][6], 0, 3, 1);
        JLabel naihuoLabel = new JLabel("耐火珠    ");
        JSpinner naihuoSpinner = new JSpinner(naihuoValue);
        if((Integer)naihuoSpinner.getValue()==3){
            naihuoLabel.setForeground(new Color(180,180,180));
        }
        Box naihuoBox = Box.createHorizontalBox();
        naihuoBox.add(naihuoLabel);
        naihuoBox.add(naihuoSpinner);
        naihuoBox.add(new JLabel("  /3"));
        naihuoSpinner.addChangeListener(e -> {
            if((Integer)naihuoSpinner.getValue() == 3){
                naihuoLabel.setForeground(new Color(180,180,180));
            }else{
                naihuoLabel.setForeground(new Color(0,0,0));
            }
            matrix[3][6] = (Integer)naihuoSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel naishuiValue = new SpinnerNumberModel(matrix[3][7], 0, 3, 1);
        JLabel naishuiLabel = new JLabel("耐水珠    ");
        JSpinner naishuiSpinner = new JSpinner(naishuiValue);
        if((Integer)naishuiSpinner.getValue()==3){
            naishuiLabel.setForeground(new Color(180,180,180));
        }
        Box naishuiBox = Box.createHorizontalBox();
        naishuiBox.add(naishuiLabel);
        naishuiBox.add(naishuiSpinner);
        naishuiBox.add(new JLabel("  /3"));
        naishuiSpinner.addChangeListener(e -> {
            if((Integer)naishuiSpinner.getValue() == 3){
                naishuiLabel.setForeground(new Color(180,180,180));
            }else{
                naishuiLabel.setForeground(new Color(0,0,0));
            }
            matrix[3][7] = (Integer)naishuiSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel naibingValue = new SpinnerNumberModel(matrix[3][8], 0, 3, 1);
        JLabel naibingLabel = new JLabel("耐冰珠    ");
        JSpinner naibingSpinner = new JSpinner(naibingValue);
        if((Integer)naibingSpinner.getValue()==3){
            naibingLabel.setForeground(new Color(180,180,180));
        }
        Box naibingBox = Box.createHorizontalBox();
        naibingBox.add(naibingLabel);
        naibingBox.add(naibingSpinner);
        naibingBox.add(new JLabel("  /3"));
        naibingSpinner.addChangeListener(e -> {
            if((Integer)naibingSpinner.getValue() == 3){
                naibingLabel.setForeground(new Color(180,180,180));
            }else{
                naibingLabel.setForeground(new Color(0,0,0));
            }
            matrix[3][8] = (Integer)naibingSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel naileiValue = new SpinnerNumberModel(matrix[3][9], 0, 3, 1);
        JLabel naileiLabel = new JLabel("耐雷珠    ");
        JSpinner naileiSpinner = new JSpinner(naileiValue);
        if((Integer)naileiSpinner.getValue()==3){
            naileiLabel.setForeground(new Color(180,180,180));
        }
        Box naileiBox = Box.createHorizontalBox();
        naileiBox.add(naileiLabel);
        naileiBox.add(naileiSpinner);
        naileiBox.add(new JLabel("  /3"));
        naileiSpinner.addChangeListener(e -> {
            if((Integer)naileiSpinner.getValue() == 3){
                naileiLabel.setForeground(new Color(180,180,180));
            }else{
                naileiLabel.setForeground(new Color(0,0,0));
            }
            matrix[3][9] = (Integer)naileiSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel nailongValue = new SpinnerNumberModel(matrix[3][10], 0, 3, 1);
        JLabel nailongLabel = new JLabel("耐龙珠    ");
        JSpinner nailongSpinner = new JSpinner(nailongValue);
        if((Integer)nailongSpinner.getValue()==3){
            nailongLabel.setForeground(new Color(180,180,180));
        }
        Box nailongBox = Box.createHorizontalBox();
        nailongBox.add(nailongLabel);
        nailongBox.add(nailongSpinner);
        nailongBox.add(new JLabel("  /3"));
        nailongSpinner.addChangeListener(e -> {
            if((Integer)nailongSpinner.getValue() == 3){
                nailongLabel.setForeground(new Color(180,180,180));
            }else{
                nailongLabel.setForeground(new Color(0,0,0));
            }
            matrix[3][10] = (Integer)nailongSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel nijingValue = new SpinnerNumberModel(matrix[3][11], 0, 1, 1);
        JLabel nijingLabel = new JLabel("逆境珠    ");
        JSpinner nijingSpinner = new JSpinner(nijingValue);
        if((Integer)nijingSpinner.getValue()==1){
            nijingLabel.setForeground(new Color(180,180,180));
        }
        Box nijingBox = Box.createHorizontalBox();
        nijingBox.add(nijingLabel);
        nijingBox.add(nijingSpinner);
        nijingBox.add(new JLabel("  /1"));
        nijingSpinner.addChangeListener(e -> {
            if((Integer)nijingSpinner.getValue() == 1){
                nijingLabel.setForeground(new Color(180,180,180));
            }else{
                nijingLabel.setForeground(new Color(0,0,0));
            }
            matrix[3][11] = (Integer)nijingSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel paoshouValue = new SpinnerNumberModel(matrix[3][12], 0, 2, 1);
        JLabel paoshouLabel = new JLabel("炮手珠    ");
        JSpinner paoshouSpinner = new JSpinner(paoshouValue);
        if((Integer)paoshouSpinner.getValue()==2){
            paoshouLabel.setForeground(new Color(180,180,180));
        }
        Box paoshouBox = Box.createHorizontalBox();
        paoshouBox.add(paoshouLabel);
        paoshouBox.add(paoshouSpinner);
        paoshouBox.add(new JLabel("  /2"));
        paoshouSpinner.addChangeListener(e -> {
            if((Integer)paoshouSpinner.getValue() == 2){
                paoshouLabel.setForeground(new Color(180,180,180));
            }else{
                paoshouLabel.setForeground(new Color(0,0,0));
            }
            matrix[3][12] = (Integer)paoshouSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel wushiValue = new SpinnerNumberModel(matrix[3][13], 0, 3, 1);
        JLabel wushiLabel = new JLabel("无食珠    ");
        JSpinner wushiSpinner = new JSpinner(wushiValue);
        if((Integer)wushiSpinner.getValue()==3){
            wushiLabel.setForeground(new Color(180,180,180));
        }
        Box wushiBox = Box.createHorizontalBox();
        wushiBox.add(wushiLabel);
        wushiBox.add(wushiSpinner);
        wushiBox.add(new JLabel("  /3"));
        wushiSpinner.addChangeListener(e -> {
            if((Integer)wushiSpinner.getValue() == 3){
                wushiLabel.setForeground(new Color(180,180,180));
            }else{
                wushiLabel.setForeground(new Color(0,0,0));
            }
            matrix[3][13] = (Integer)wushiSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel jieshiValue = new SpinnerNumberModel(matrix[3][14], 0, 1, 1);
        JLabel jieshiLabel = new JLabel("节食珠    ");
        JSpinner jieshiSpinner = new JSpinner(jieshiValue);
        if((Integer)jieshiSpinner.getValue()==1){
            jieshiLabel.setForeground(new Color(180,180,180));
        }
        Box jieshiBox = Box.createHorizontalBox();
        jieshiBox.add(jieshiLabel);
        jieshiBox.add(jieshiSpinner);
        jieshiBox.add(new JLabel("  /1"));
        jieshiSpinner.addChangeListener(e -> {
            if((Integer)jieshiSpinner.getValue() == 1){
                jieshiLabel.setForeground(new Color(180,180,180));
            }else{
                jieshiLabel.setForeground(new Color(0,0,0));
            }
            matrix[3][14] = (Integer)jieshiSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel jiahuValue = new SpinnerNumberModel(matrix[3][15], 0, 3, 1);
        JLabel jiahuLabel = new JLabel("加护珠    ");
        JSpinner jiahuSpinner = new JSpinner(jiahuValue);
        if((Integer)jiahuSpinner.getValue()==3){
            jiahuLabel.setForeground(new Color(180,180,180));
        }
        Box jiahuBox = Box.createHorizontalBox();
        jiahuBox.add(jiahuLabel);
        jiahuBox.add(jiahuSpinner);
        jiahuBox.add(new JLabel("  /3"));
        jiahuSpinner.addChangeListener(e -> {
            if((Integer)jiahuSpinner.getValue() == 3){
                jiahuLabel.setForeground(new Color(180,180,180));
            }else{
                jiahuLabel.setForeground(new Color(0,0,0));
            }
            matrix[3][15] = (Integer)jiahuSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel zhishiValue = new SpinnerNumberModel(matrix[3][16], 0, 5, 1);
        JLabel zhishiLabel = new JLabel("指示珠    ");
        JSpinner zhishiSpinner = new JSpinner(zhishiValue);
        if((Integer)zhishiSpinner.getValue()==5){
            zhishiLabel.setForeground(new Color(180,180,180));
        }
        Box zhishiBox = Box.createHorizontalBox();
        zhishiBox.add(zhishiLabel);
        zhishiBox.add(zhishiSpinner);
        zhishiBox.add(new JLabel("  /5"));
        zhishiSpinner.addChangeListener(e -> {
            if((Integer)zhishiSpinner.getValue() == 5){
                zhishiLabel.setForeground(new Color(180,180,180));
            }else{
                zhishiLabel.setForeground(new Color(0,0,0));
            }
            matrix[3][16] = (Integer)zhishiSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel zhixueValue = new SpinnerNumberModel(matrix[3][17], 0, 4, 1);
        JLabel zhixueLabel = new JLabel("植学珠    ");
        JSpinner zhixueSpinner = new JSpinner(zhixueValue);
        if((Integer)zhixueSpinner.getValue()==4){
            zhixueLabel.setForeground(new Color(180,180,180));
        }
        Box zhixueBox = Box.createHorizontalBox();
        zhixueBox.add(zhixueLabel);
        zhixueBox.add(zhixueSpinner);
        zhixueBox.add(new JLabel("  /4"));
        zhixueSpinner.addChangeListener(e -> {
            if((Integer)zhixueSpinner.getValue() == 4){
                zhixueLabel.setForeground(new Color(180,180,180));
            }else{
                zhixueLabel.setForeground(new Color(0,0,0));
            }
            matrix[3][17] = (Integer)zhixueSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel dixueValue = new SpinnerNumberModel(matrix[3][18], 0, 3, 1);
        JLabel dixueLabel = new JLabel("地学珠    ");
        JSpinner dixueSpinner = new JSpinner(dixueValue);
        if((Integer)dixueSpinner.getValue()==3){
            dixueLabel.setForeground(new Color(180,180,180));
        }
        Box dixueBox = Box.createHorizontalBox();
        dixueBox.add(dixueLabel);
        dixueBox.add(dixueSpinner);
        dixueBox.add(new JLabel("  /3"));
        dixueSpinner.addChangeListener(e -> {
            if((Integer)dixueSpinner.getValue() == 3){
                dixueLabel.setForeground(new Color(180,180,180));
            }else{
                dixueLabel.setForeground(new Color(0,0,0));
            }
            matrix[3][18] = (Integer)dixueSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel qianfuValue = new SpinnerNumberModel(matrix[3][19], 0, 3, 1);
        JLabel qianfuLabel = new JLabel("潜伏珠    ");
        JSpinner qianfuSpinner = new JSpinner(qianfuValue);
        if((Integer)qianfuSpinner.getValue()==3){
            qianfuLabel.setForeground(new Color(180,180,180));
        }
        Box qianfuBox = Box.createHorizontalBox();
        qianfuBox.add(qianfuLabel);
        qianfuBox.add(qianfuSpinner);
        qianfuBox.add(new JLabel("  /3"));
        qianfuSpinner.addChangeListener(e -> {
            if((Integer)qianfuSpinner.getValue() == 3){
                qianfuLabel.setForeground(new Color(180,180,180));
            }else{
                qianfuLabel.setForeground(new Color(0,0,0));
            }
            matrix[3][19] = (Integer)qianfuSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel yanfuValue = new SpinnerNumberModel(matrix[3][20], 0, 3, 1);
        JLabel yanfuLabel = new JLabel("烟复珠    ");
        JSpinner yanfuSpinner = new JSpinner(yanfuValue);
        if((Integer)yanfuSpinner.getValue()==3){
            yanfuLabel.setForeground(new Color(180,180,180));
        }
        Box yanfuBox = Box.createHorizontalBox();
        yanfuBox.add(yanfuLabel);
        yanfuBox.add(yanfuSpinner);
        yanfuBox.add(new JLabel("  /3"));
        yanfuSpinner.addChangeListener(e -> {
            if((Integer)yanfuSpinner.getValue() == 3){
                yanfuLabel.setForeground(new Color(180,180,180));
            }else{
                yanfuLabel.setForeground(new Color(0,0,0));
            }
            matrix[3][20] = (Integer)yanfuSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel zhaoduValue = new SpinnerNumberModel(matrix[3][21], 0, 3, 1);
        JLabel zhaoduLabel = new JLabel("沼渡珠    ");
        JSpinner zhaoduSpinner = new JSpinner(zhaoduValue);
        if((Integer)zhaoduSpinner.getValue()==3){
            zhaoduLabel.setForeground(new Color(180,180,180));
        }
        Box zhaoduBox = Box.createHorizontalBox();
        zhaoduBox.add(zhaoduLabel);
        zhaoduBox.add(zhaoduSpinner);
        zhaoduBox.add(new JLabel("  /3"));
        zhaoduSpinner.addChangeListener(e -> {
            if((Integer)zhaoduSpinner.getValue() == 3){
                zhaoduLabel.setForeground(new Color(180,180,180));
            }else{
                zhaoduLabel.setForeground(new Color(0,0,0));
            }
            matrix[3][21] = (Integer)zhaoduSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel biaobenValue = new SpinnerNumberModel(matrix[3][22], 0, 3, 1);
        JLabel biaobenLabel = new JLabel("标本珠    ");
        JSpinner biaobenSpinner = new JSpinner(biaobenValue);
        if((Integer)biaobenSpinner.getValue()==3){
            biaobenLabel.setForeground(new Color(180,180,180));
        }
        Box biaobenBox = Box.createHorizontalBox();
        biaobenBox.add(biaobenLabel);
        biaobenBox.add(biaobenSpinner);
        biaobenBox.add(new JLabel("  /3"));
        biaobenSpinner.addChangeListener(e -> {
            if((Integer)biaobenSpinner.getValue() == 3){
                biaobenLabel.setForeground(new Color(180,180,180));
            }else{
                biaobenLabel.setForeground(new Color(0,0,0));
            }
            matrix[3][22] = (Integer)biaobenSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel xiujueValue = new SpinnerNumberModel(matrix[3][23], 0, 1, 1);
        JLabel xiujueLabel = new JLabel("嗅觉珠    ");
        JSpinner xiujueSpinner = new JSpinner(xiujueValue);
        if((Integer)xiujueSpinner.getValue()==1){
            xiujueLabel.setForeground(new Color(180,180,180));
        }
        Box xiujueBox = Box.createHorizontalBox();
        xiujueBox.add(xiujueLabel);
        xiujueBox.add(xiujueSpinner);
        xiujueBox.add(new JLabel("  /1"));
        xiujueSpinner.addChangeListener(e -> {
            if((Integer)xiujueSpinner.getValue() == 1){
                xiujueLabel.setForeground(new Color(180,180,180));
            }else{
                xiujueLabel.setForeground(new Color(0,0,0));
            }
            matrix[3][23] = (Integer)xiujueSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel weiheValue = new SpinnerNumberModel(matrix[3][24], 0, 3, 1);
        JLabel weiheLabel = new JLabel("威吓珠    ");
        JSpinner weiheSpinner = new JSpinner(weiheValue);
        if((Integer)weiheSpinner.getValue()==3){
            weiheLabel.setForeground(new Color(180,180,180));
        }
        Box weiheBox = Box.createHorizontalBox();
        weiheBox.add(weiheLabel);
        weiheBox.add(weiheSpinner);
        weiheBox.add(new JLabel("  /3"));
        weiheSpinner.addChangeListener(e -> {
            if((Integer)weiheSpinner.getValue() == 3){
                weiheLabel.setForeground(new Color(180,180,180));
            }else{
                weiheLabel.setForeground(new Color(0,0,0));
            }
            matrix[3][24] = (Integer)weiheSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel jueluValue = new SpinnerNumberModel(matrix[3][25], 0, 1, 1);
        JLabel jueluLabel = new JLabel("绝路珠    ");
        JSpinner jueluSpinner = new JSpinner(jueluValue);
        if((Integer)jueluSpinner.getValue()==1){
            jueluLabel.setForeground(new Color(180,180,180));
        }
        Box jueluBox = Box.createHorizontalBox();
        jueluBox.add(jueluLabel);
        jueluBox.add(jueluSpinner);
        jueluBox.add(new JLabel("  /1"));
        jueluSpinner.addChangeListener(e -> {
            if((Integer)jueluSpinner.getValue() == 1){
                jueluLabel.setForeground(new Color(180,180,180));
            }else{
                jueluLabel.setForeground(new Color(0,0,0));
            }
            matrix[3][25] = (Integer)jueluSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel zhengbeiValue = new SpinnerNumberModel(matrix[3][26], 0, 3, 1);
        JLabel zhengbeiLabel = new JLabel("整备珠    ");
        JSpinner zhengbeiSpinner = new JSpinner(zhengbeiValue);
        if((Integer)zhengbeiSpinner.getValue()==3){
            zhengbeiLabel.setForeground(new Color(180,180,180));
        }
        Box zhengbeiBox = Box.createHorizontalBox();
        zhengbeiBox.add(zhengbeiLabel);
        zhengbeiBox.add(zhengbeiSpinner);
        zhengbeiBox.add(new JLabel("  /3"));
        zhengbeiSpinner.addChangeListener(e -> {
            if((Integer)zhengbeiSpinner.getValue() == 3){
                zhengbeiLabel.setForeground(new Color(180,180,180));
            }else{
                zhengbeiLabel.setForeground(new Color(0,0,0));
            }
            matrix[3][26] = (Integer)zhengbeiSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel naizhangValue = new SpinnerNumberModel(matrix[3][27], 0, 3, 1);
        JLabel naizhangLabel = new JLabel("耐瘴珠    ");
        JSpinner naizhangSpinner = new JSpinner(naizhangValue);
        if((Integer)naizhangSpinner.getValue()==3){
            naizhangLabel.setForeground(new Color(180,180,180));
        }
        Box naizhangBox = Box.createHorizontalBox();
        naizhangBox.add(naizhangLabel);
        naizhangBox.add(naizhangSpinner);
        naizhangBox.add(new JLabel("  /3"));
        naizhangSpinner.addChangeListener(e -> {
            if((Integer)naizhangSpinner.getValue() == 3){
                naizhangLabel.setForeground(new Color(180,180,180));
            }else{
                naizhangLabel.setForeground(new Color(0,0,0));
            }
            matrix[3][27] = (Integer)naizhangSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        SpinnerModel feiyanValue = new SpinnerNumberModel(matrix[3][28], 0, 1, 1);
        JLabel feiyanLabel = new JLabel("飞燕珠    ");
        JSpinner feiyanSpinner = new JSpinner(feiyanValue);
        if((Integer)feiyanSpinner.getValue()==1){
            feiyanLabel.setForeground(new Color(180,180,180));
        }
        Box feiyanBox = Box.createHorizontalBox();
        feiyanBox.add(feiyanLabel);
        feiyanBox.add(feiyanSpinner);
        feiyanBox.add(new JLabel("  /1"));
        feiyanSpinner.addChangeListener(e -> {
            if((Integer)feiyanSpinner.getValue() == 1){
                feiyanLabel.setForeground(new Color(180,180,180));
            }else{
                feiyanLabel.setForeground(new Color(0,0,0));
            }
            matrix[3][28] = (Integer)feiyanSpinner.getValue();
            mainFrame.writeData(matrix);
        });

        box51.add(Box.createRigidArea(new Dimension(5, 2*gap)));
        box51.add(naiduBox);
        box52.add(Box.createRigidArea(new Dimension(5, 2*gap)));
        box52.add(naimaBox);
        box53.add(Box.createRigidArea(new Dimension(5, 2*gap)));
        box53.add(naimianBox);
        box54.add(Box.createRigidArea(new Dimension(5, 2*gap)));
        box54.add(naibaoBox);
        box51.add(Box.createRigidArea(wideGap));
        box51.add(nailieBox);
        box52.add(Box.createRigidArea(wideGap));
        box52.add(naifangBox);
        box53.add(Box.createRigidArea(wideGap));
        box53.add(naihuoBox);
        box54.add(Box.createRigidArea(wideGap));
        box54.add(naishuiBox);
        box51.add(Box.createRigidArea(wideGap));
        box51.add(naibingBox);
        box52.add(Box.createRigidArea(wideGap));
        box52.add(naileiBox);
        box53.add(Box.createRigidArea(wideGap));
        box53.add(nailongBox);
        box54.add(Box.createRigidArea(wideGap));
        box54.add(nijingBox);
        box51.add(Box.createRigidArea(wideGap));
        box51.add(paoshouBox);
        box52.add(Box.createRigidArea(wideGap));
        box52.add(wushiBox);
        box53.add(Box.createRigidArea(wideGap));
        box53.add(jieshiBox);
        box54.add(Box.createRigidArea(wideGap));
        box54.add(jiahuBox);
        box51.add(Box.createRigidArea(wideGap));
        box51.add(zhishiBox);
        box52.add(Box.createRigidArea(wideGap));
        box52.add(zhixueBox);
        box53.add(Box.createRigidArea(wideGap));
        box53.add(dixueBox);
        box54.add(Box.createRigidArea(wideGap));
        box54.add(qianfuBox);
        box51.add(Box.createRigidArea(wideGap));
        box51.add(yanfuBox);
        box52.add(Box.createRigidArea(wideGap));
        box52.add(zhaoduBox);
        box53.add(Box.createRigidArea(wideGap));
        box53.add(biaobenBox);
        box54.add(Box.createRigidArea(wideGap));
        box54.add(xiujueBox);
        box51.add(Box.createRigidArea(wideGap));
        box51.add(weiheBox);
        box52.add(Box.createRigidArea(wideGap));
        box52.add(jueluBox);
        box53.add(Box.createRigidArea(wideGap));
        box53.add(zhengbeiBox);
        box54.add(Box.createRigidArea(wideGap));
        box54.add(naizhangBox);
        box51.add(Box.createRigidArea(wideGap));
        box51.add(feiyanBox);

        box51.add(Box.createRigidArea(new Dimension(5, gap)));
        box52.add(Box.createRigidArea(new Dimension(5, 3*gap)));
        box53.add(Box.createRigidArea(new Dimension(5, 3*gap)));
        box54.add(Box.createRigidArea(new Dimension(5, 3*gap)));

        box5.add(box51);
        box5.add(Box.createRigidArea(new Dimension(4*gap, 5)));
        box5.add(box52);
        box5.add(Box.createRigidArea(new Dimension(4*gap, 5)));
        box5.add(box53);
        box5.add(Box.createRigidArea(new Dimension(4*gap, 5)));
        box5.add(box54);

        add(box5);
    }
}

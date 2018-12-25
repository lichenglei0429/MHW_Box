import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class mainFrame extends JFrame implements ActionListener, ChangeListener{

    static public int[][] matrix = {{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {59,59,59,59,59,59,59,59,59,59,59,59,59,59,59,59,59,59,59,59,59,59,59,59,59,59,59,59,59,59,59,59,
                    59,59,59,59,59,59,59,59,59,59,59,59,59,59,59,59}};

    public mainFrame(){
        initUI();
    }
    private void initUI(){
        Color color = new Color(64,64,64);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        setTitle("MHW计数器");
        setResizable(true);
        setBackground(color);

        setLocation(screenSize.width/4,screenSize.width/4-300);
        setSize(screenSize.width/2,screenSize.width/2-300);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we)
            {
                String ObjButtons[] = {"是","否"};
                int PromptResult = JOptionPane.showOptionDialog(null,"确认退出程序？（竞速记录需要手动点击保存，其他数据将自动保存）","关闭",JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE,null,ObjButtons,ObjButtons[1]);
                if(PromptResult==JOptionPane.YES_OPTION)
                {
                    System.exit(0);
                }
            }
        });

        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.setBackground(color);

        ImageIcon jewelIcon = scale("src/main/java/img/jewel.gif");
        ImageIcon decoIcon = scale("src/main/java/img/deco.gif");
        ImageIcon timeIcon = scale("src/main/java/img/time.gif");
        ImageIcon stoneIcon = scale("src/main/java/img/sstone.gif");
        ImageIcon crownIcon = scale("src/main/java/img/size.gif");

        JPanel jewelPanel = new Gems(matrix);
        jewelPanel.setBackground(color);
        JPanel decoPanel = new Decorations(matrix);
        decoPanel.setBackground(color);
        JPanel crownPanel = new Crown();
        crownPanel.setBackground(color);
        JPanel timePanel = new Times(matrix);
        timePanel.setBackground(color);

        tabbedPane.addTab("宝玉", jewelIcon, jewelPanel, "记录逆鳞/宝玉数量");
        tabbedPane.addTab("装饰品", decoIcon, decoPanel, "记录装饰品数量");
//        tabbedPane.addTab("大小金", crownIcon, crownPanel, "记录大小金获得情况");
        tabbedPane.addTab("竞速", timeIcon, timePanel, "记录竞速时间");

        add(tabbedPane);
    }

    public ImageIcon scale(String path){
//        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
//        URL resource = classLoader.getResource(path);
//        ImageIcon icon = new ImageIcon(resource);
        try {
            BufferedImage image = ImageIO.read(new File(path));
            Image scaled = image.getScaledInstance(25, 25 , Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(scaled);
            return icon;
        }catch (IOException e) { }
        return null;
    }

    public static int[][] create2DIntMatrixFromFile(String filename) throws Exception {
        int[][] matrix = null;
        BufferedReader buffer = new BufferedReader(new FileReader(filename));
        String line;
        int row = 0;
        int size = 0;

        while ((line = buffer.readLine()) != null) {
            String[] vals = line.trim().split("\\s+");
            if (matrix == null) {
                size = vals.length;
                matrix = new int[8][size];
            }
            for (int col = 0; col < size; col++) {
                matrix[row][col] = Integer.parseInt(vals[col]);
            }
            row++;
        }
        return matrix;
    }

    public static void writeData(int[][] matrix) {
        String str;
        int size = matrix[0].length;
        try{
            PrintWriter writer = new PrintWriter("src/main/java/data/userdata.txt", "UTF-8");
            if (matrix != null) {
                for (int row = 0; row < 8; row++) {
                    str = "";
                    for (int col = 0; col < size; col++) {
                        str = str + String.format("%2d",  matrix[row][col]) + " ";
                    }
                    writer.println(str);
                }
            }
            writer.close();
        }catch(Exception Ignored){}
    }

    public static void main(String[] args){
        try {
            matrix = create2DIntMatrixFromFile("src/main/java/data/userdata.txt");
        } catch (Exception e) {
            writeData(matrix);
        }
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch(Exception ignored){}
        mainFrame mhw = new mainFrame();
        mhw.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void stateChanged(ChangeEvent e) {

    }
}
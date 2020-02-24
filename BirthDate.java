import javax.swing.*;
import java.awt.*;

public class BirthDate extends JFrame {
    private JPanel contentPane;
    public BirthDate(){
        setTitle("下拉列表框选择生日");
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100,100,300,65);

        //创建一个面板
        contentPane=new JPanel();
        //设置颜色
        contentPane.setBackground(new Color(153,204,255));
        //设置布局为流布局
        contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        //增加到容器中
        setContentPane(contentPane);

        JLabel jl=new JLabel("生日");
        jl.setFont(new Font("宋体",Font.PLAIN,14));
        contentPane.add(jl);

        JComboBox comboBoxYear = new JComboBox();
        comboBoxYear.setModel(new DefaultComboBoxModel(new String[] {"1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017"}));
        contentPane.add(comboBoxYear);
        JLabel labelYear = new JLabel("年");
        labelYear.setFont(new Font("宋体", Font.PLAIN, 14));
        contentPane.add(labelYear);

        JComboBox comboBoxMonth = new JComboBox();
        comboBoxMonth.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
        contentPane.add(comboBoxMonth);
        JLabel labelMonth = new JLabel("月");
        labelMonth.setFont(new Font("宋体", Font.PLAIN, 14));
        contentPane.add(labelMonth);

        JComboBox comboBoxDay = new JComboBox();
        comboBoxDay.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
        contentPane.add(comboBoxDay);
        JLabel labelDay = new JLabel("日");
        labelDay.setFont(new Font("宋体", Font.PLAIN, 14));
        contentPane.add(labelDay);


    }
    public static void main(String[] args) {
        BirthDate frame = new BirthDate();
        frame.setVisible(true);
    }
}

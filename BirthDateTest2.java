import com.sun.deploy.util.JVMParameterConverter;

import javax.swing.*;
import java.awt.*;

public class BirthDateTest2 extends JFrame {
    private JPanel contentPane;

    public BirthDateTest2(){
        setTitle("生日时间");
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100,100,300,65);
        Container container=getContentPane();

        contentPane =new JPanel();
        contentPane.setBackground(new Color(153,204,255));
        contentPane.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
        container.add(contentPane);

       JLabel jl=new JLabel("你的生日");
       jl.setFont(new Font("宋体",Font.PLAIN,15));
       contentPane.add(jl);

       JComboBox jc1=new JComboBox();
        jc1.setModel(new DefaultComboBoxModel(new String[] {"1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017"}));
        contentPane.add(jc1);
        JLabel jl1=new JLabel("年");
        jl.setFont(new Font("宋体",Font.PLAIN,15));
        contentPane.add(jl1);

        JComboBox jc2=new JComboBox();
        jc2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
        contentPane.add(jc2);
        JLabel jl2=new JLabel("月");
        jl.setFont(new Font("宋体",Font.PLAIN,15));
        contentPane.add(jl2);

        JComboBox jc3=new JComboBox();
        jc3.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
        contentPane.add(jc3);
        JLabel jl3=new JLabel("日");
        jl.setFont(new Font("宋体",Font.PLAIN,15));
        contentPane.add(jl3);



    }

    public static void main(String[] args) {
        new BirthDateTest2();
    }
}

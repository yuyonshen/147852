import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JListTest extends JFrame {
    public JListTest(){
        Container cp=getContentPane();
        cp.setLayout(null);
        String[] contents={"列表1","列表2","列表3","列表4","列表5","列表6"};
        JList<String> jl=new JList<String>(contents);
        JScrollPane js=new JScrollPane(jl);
        js.setBounds(10,10,100,100);
        cp.add(js);

        JTextArea jt=new JTextArea();
        JScrollPane scrollpane=new JScrollPane(jt);
        scrollpane.setBounds(118,10,73,80);
        cp.add(scrollpane);
        JButton jb=new JButton("确定");
        jb.setBounds(120,96,71,23);
        cp.add(jb);

        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                java.util.List<String> values=jl.getSelectedValuesList();
                jt.setText("");
                for(String value:values){
                    jt.append(value +"\n");
                }
            }
        });
        setTitle("在这个窗体中使用了列表框");
        setSize(217,168);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JListTest();
    }
}

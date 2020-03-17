import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JListTest2 extends JFrame {
    public JListTest2(){
        Container container =getContentPane();
        container.setLayout(null);
        String[] contents={"列表1","列表2","裂变3","列表4","列表5","列表6"};
        JList<String> jl=new JList<>(contents);
        JScrollPane js=new JScrollPane(jl);
        js.setBounds(10,10,100,100);
        container.add(js);

        JTextArea jt=new JTextArea();
        JScrollPane js2=new JScrollPane(jt);
        js2.setBounds(118,10,73,80);
        container.add(js2);
        JButton jb=new JButton("确认");
        jb.setBounds(120,96,71,23);
        container.add(jb);
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                java.util.List<String> values=jl.getSelectedValuesList();
                jt.setText("");
                for(String value:values){
                    jt.append(value+"\n");
                }

            }
        });
        setTitle("这个窗体使用了列表框");
        setVisible(true);
        setSize(217,167);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JListTest2();
    }
}

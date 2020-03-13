import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

public class CharacterUnicode4 extends JFrame {
    private JPanel contentPane;
    private JTextField charInputField;
    private JTextField codeOutputField;
    private JFormattedTextField codeInputField;
    private JTextField charOutputField;

    public static void main(String[] args) {
        CharacterUnicode4 frame = new CharacterUnicode4();
        frame.setVisible(true);
    }

    public CharacterUnicode4(){
        Container container=getContentPane();
        setTitle("字符与Unicode码转换");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100,100,450,171);
        contentPane=new JPanel();
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        contentPane.setLayout(new BorderLayout(0,0));
        container.add(contentPane);

        JPanel panel=new JPanel();
        panel.setBorder(new TitledBorder(null,"字符与Unicode码转换",TitledBorder.LEADING,
                TitledBorder.TOP,null,new Color(59,59,59)));
        contentPane.add(panel,BorderLayout.CENTER);




        charInputField=new JTextField();
        panel.add(charInputField);
        charInputField.setColumns(10);

        JButton codeButton = new JButton("转换为Uncode码");
        codeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                do_codeButton_actionPerformed(e);
            }
        });
        panel.add(codeButton);

        codeOutputField = new JTextField();
        codeOutputField.setEditable(false);
        panel.add(codeOutputField);
        codeOutputField.setColumns(10);

        codeInputField = new JFormattedTextField(NumberFormat.getIntegerInstance());
        panel.add(codeInputField);
        codeInputField.setColumns(10);

        JButton charButton=new JButton("转换为字符");
        charButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                do_charButton_actionPerformed(e);
            }
        });
        panel.add(charButton);

        charOutputField = new JTextField();
        charOutputField.setEditable(false);
        panel.add(charOutputField);
        charOutputField.setColumns(10);
    }
    public void do_codeButton_actionPerformed(ActionEvent e){
        String text = charInputField.getText();
        char[] charArray = text.toCharArray();
        StringBuilder builder=new StringBuilder();
        for(char c:charArray){
            builder.append((int) c +" ");
        }
        codeOutputField.setText(builder.toString());
    }
    public void do_charButton_actionPerformed(ActionEvent e){
        Number value = (Number) codeInputField.getValue();
        long code = value.longValue();
        charOutputField.setText(((char) code) + "");


    }
}

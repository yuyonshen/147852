import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Meetinginfo extends JFrame {
    private JPanel contentPane;//成员面板
    private JTextField tTime;////成员文本框
    //成员列表框
    private JComboBox<String> cboxDepartment;
    private JComboBox<String> cboxBoardroom;
    private JList<String> listPerson;

    public Meetinginfo(){
    setResizable(false);//窗口大小不可变
    setFont(new Font("宋体", Font.PLAIN,14));
    setTitle("公司召开会议");
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    setBounds(100,100,440,300);

    contentPane=new JPanel();
    contentPane.setBorder(new EmptyBorder(5,5,5,5));
    setContentPane(contentPane);
    contentPane.setLayout(null);

    JButton jb=new JButton("确定");
    jb.addActionListener(new ActionListener() {
        //创建一个可变字符串
        StringBuilder builder=new StringBuilder();
        @Override
        public void actionPerformed(ActionEvent e) {
            Object[] values = listPerson.getSelectedValues();
            for (int i = 0; i < values.length; i++) {

                builder.append(values[i]).append("��");
            }
            System.out.println("================??????????????================");
            System.out.println(cboxDepartment.getSelectedItem());
            System.out.println(cboxBoardroom.getSelectedItem());
            System.out.println(tTime.getText());
            System.out.println(builder.toString());
        }
    });
        jb.setFont(new Font("宋体", Font.PLAIN, 14));
        jb.setBounds(260, 230, 150, 23);
        contentPane.add(jb);

        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(null, "选择地址", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        panel.setBounds(10, 10, 207, 209);
        contentPane.add(panel);
        panel.setLayout(null);
        //创建标签并设置字体大小，位置
        JLabel lblDepartment = new JLabel("部门");
        lblDepartment.setFont(new Font("宋体", Font.PLAIN, 12));
        lblDepartment.setBounds(28, 40, 48, 15);
        panel.add(lblDepartment);
        //创建下拉列表框，设置大小，位置
        cboxDepartment = new JComboBox<String>();
        cboxDepartment.setModel(new DefaultComboBoxModel<String>(new String[] { "部门", "个人", "领导","人事" }));
        cboxDepartment.setBounds(70, 37, 125, 21);
        panel.add(cboxDepartment);
        //创建标签
        JLabel lblBoardroom = new JLabel("地方");
        lblBoardroom.setFont(new Font("宋体", Font.PLAIN, 12));
        lblBoardroom.setBounds(21, 81, 54, 15);
        panel.add(lblBoardroom);
        //创建下拉列表框
        cboxBoardroom = new JComboBox<String>();
        cboxBoardroom.setModel(new DefaultComboBoxModel<String>(new String[] { "办公室","家", "会议室" }));
        cboxBoardroom.setBounds(70, 78, 125, 21);
        panel.add(cboxBoardroom);
        //创建标签
        JLabel lblTime = new JLabel("事件后");
        lblTime.setFont(new Font("宋体", Font.PLAIN, 12));
        lblTime.setBounds(10, 123, 69, 15);
        panel.add(lblTime);
        //创建文本框
        tTime = new JTextField();
        tTime.setBounds(70, 120, 125, 21);
        panel.add(tTime);
        tTime.setColumns(10);
        //创建一个面板
        JPanel pSelect = new JPanel();
        pSelect.setBorder(new TitledBorder(null, "事件", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        pSelect.setBounds(217, 10, 207, 209);
        contentPane.add(pSelect);
        pSelect.setLayout(new BorderLayout(0, 0));

        JScrollPane scrollPane = new JScrollPane();
        pSelect.add(scrollPane, BorderLayout.CENTER);

        listPerson = new JList<String>();
        listPerson.setModel(new AbstractListModel<String>() {
            String[] values = new String[] { "参与会议人员", "2", "3", "4", "6", "5", "7", "֣8", "9", "10", "11", "12",
                    "13", "14", "15", "16", "17", "18" };
            public int getSize() {
                return values.length;
            }
            public String getElementAt(int index) {
                return values[index];

            }
        });
        scrollPane.setViewportView(listPerson);
    }

        public static void main(String[] args) {
            Meetinginfo frame = new Meetinginfo();
            frame.setVisible(true);
    }
}

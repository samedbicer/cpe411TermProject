import javax.swing.*;

public class ChatRoom extends JFrame {
    private JPanel rootPanel;
    private JButton btnChoose;
    private JButton btnShare;
    private JButton btnPrevious;
    private JButton btnNext;
    private JTextField txtfiledMsg;
    private JButton btnSend;
    private JPanel chatPanel;
    private JPanel presentationPanel;
    private JPanel messagePanel;

    public ChatRoom(String UserName, String PORT, String IPAddress) {

        add(rootPanel);
        setTitle("Online Multimedia Education");
        setSize(1000, 600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JOptionPane.showMessageDialog(null,UserName+" "+PORT+" "+IPAddress);
    }

}

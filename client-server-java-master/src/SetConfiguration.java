import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SetConfiguration extends JFrame implements ActionListener {

    private JButton STARTSERVERButton;
    private JTextField userNameTextField;
    private JTextField IPAddressTextField;
    private JTextField portTextField;
    private JButton CONNECTTOSERVERButton;
    private JPanel MainPanel;
    private JPanel FormPanel;

    public SetConfiguration(){

        initComponents();


        userNameTextField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                userNameTextField.setText("");
            }
        });
        IPAddressTextField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                IPAddressTextField.setText("");
            }
        });
        portTextField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                portTextField.setText("");
            }
        });
    }

    public void initComponents() {

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(500, 370);
        setTitle("Message Application ~ Server-Client System");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel background = new JLabel(new ImageIcon("C:/client-server-java-master/src/Images/backgroud2.jpg"));
        add(background);
        background.setLayout(new BorderLayout());
        background.add(MainPanel);
        FormPanel.setBackground(new Color(255, 255, 255,100));
        setVisible(true);
        CONNECTTOSERVERButton.addActionListener(this::actionPerformed);
        STARTSERVERButton.addActionListener(this::actionPerformed);



    }

    public static void main(String[] args) {

        SetConfiguration setConfiguration = new SetConfiguration();



    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        if(actionEvent.getSource() == CONNECTTOSERVERButton) {

            JOptionPane.showMessageDialog(null,"Client is connected to server successfully","Client status",JOptionPane.INFORMATION_MESSAGE);

            ChatRoom chatRoom = new ChatRoom( userNameTextField.getText(),portTextField.getText(),IPAddressTextField.getText() );

            this.dispose();


        }
        if(actionEvent.getSource() == STARTSERVERButton) {

            JOptionPane.showMessageDialog(null,"Server is started successfully","Server status",JOptionPane.INFORMATION_MESSAGE);

            ChatRoom chatRoom = new ChatRoom( userNameTextField.getText(),portTextField.getText(),IPAddressTextField.getText() );


        }

    }


    public JTextField getUserNameTextField() {
        return userNameTextField;
    }

    public void setUserNameTextField(JTextField userNameTextField) {
        this.userNameTextField = userNameTextField;
    }

    public JTextField getIPAddressTextField() {
        return IPAddressTextField;
    }

    public void setIPAddressTextField(JTextField IPAddressTextField) {
        this.IPAddressTextField = IPAddressTextField;
    }

    public JTextField getPortTextField() {
        return portTextField;
    }

    public void setPortTextField(JTextField portTextField) {
        this.portTextField = portTextField;
    }
}

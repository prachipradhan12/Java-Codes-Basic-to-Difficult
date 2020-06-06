import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ViewFrame extends JFrame{

Container c;
JTextField txtvid;
JLabel     lblvid;
JTextArea txtArea;
JButton btnBack,btnView;

ViewFrame(){

c= getContentPane();
c.setLayout(new FlowLayout());
txtArea = new JTextArea(5,20);
btnBack = new JButton("Back");

txtArea.setText(db.getStudent());

btnBack.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ae){
MainFrame a= new MainFrame();
dispose();
}
});

c.add(txtArea);
c.add(btnBack);	
setTitle("V .S");
setSize(300,400);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);

}
}
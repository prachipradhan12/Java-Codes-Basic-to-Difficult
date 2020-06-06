import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class AddFrame extends JFrame{

Container c;
JLabel lblRno,lblName;
JTextField txtRno,txtName;
JButton btnSave,btnBack;

AddFrame(){

c= getContentPane();
c.setLayout(new FlowLayout());

lblRno  = new JLabel("Roll No");
txtRno  = new JTextField(20);
lblName = new JLabel("Name");
txtName = new JTextField(20);
btnSave  = new JButton("Save");
btnBack = new JButton("Back");
c.add(lblRno);
c.add(txtRno);
c.add(lblName);
c.add(txtName);
c.add(btnSave);
c.add(btnBack);	


btnBack.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ae){
MainFrame a= new MainFrame();
dispose();
}
});

btnSave.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ae){
DbHandler db = new DbHandler();
int rno=Integer.parseInt(txtRno.getText());
String name =txtName.getText();
db.addStudent(rno,name);	
}
});

setTitle("A .S");
setSize(300,400);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);

}

public static void main(String args[]){

AddFrame m = new AddFrame();
}
}
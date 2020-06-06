import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class MainFrame extends JFrame{

Container c;
JButton btnAdd,btnView;

MainFrame(){

c= getContentPane();
c.setLayout(new FlowLayout());
btnAdd  = new JButton("Add");
btnView = new JButton("View");
c.add(btnAdd);
c.add(btnView);	

btnAdd.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ae){
AddFrame a = new AddFrame();
dispose();
}
});


btnView.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ae){
ViewFrame a= new ViewFrame();
dispose();
}
});


setTitle("S .S");
setSize(300,400);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);

}

public static void main(String args[]){

MainFrame m = new MainFrame();
}
}

// end of  main frame

class DbHandler
{

public void addStudent(int rno, String name)
{
try{
DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","abc123");

String sql = "insert into student values(? ,?)";
PreparedStatement pst = con.prepareStatement(sql);
pst.setInt(1,rno);
pst.setString(2,name);
int r=pst.executeUpdate();
JOptionPane.showMessageDialog(new JDialog(),r +"  records inserted");
con.close();
}
catch(SQLException e)
{
JOptionPane.showMessageDialog(new JDialog(),"Issue "+e);
}
}

public String getStudent(){
StringBuffer sb = new StringBuffer();
try{
DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","abc123");

String sql = "select * from student";
Statement stmt =con.createStatement();
ResultSet rs= stmt.executeQuery(sql);
while(rs.next())
{

sb.append("rno="+rs.getInt(1)+"  name ="+rs.getString(2));
}
con.close();
}
catch(SQLException e)
{
sb.append("Issue "+e);
}
return sb.toString();
}

}
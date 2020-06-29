package lab5;
import java.sql.*;
import java.sql.Connection;
public class Lab5 {
    public static void main(String[] args) {    
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/akash","root","1234");
            Statement st=con.createStatement();
            st.executeUpdate("insert into student values('212121');insert into student values('111111');");
            ResultSet rs=st.executeQuery("select studNo from student");
            while(rs.next()){
                String student=rs.getString(1);
                System.out.println(student);
            }
            con.close();
        }
        catch(ClassNotFoundException ex){
            System.out.println("hi"+ex);
        }
        catch(SQLException ce){
            System.out.println("he;;"+ce);
        }
            
    }    
}

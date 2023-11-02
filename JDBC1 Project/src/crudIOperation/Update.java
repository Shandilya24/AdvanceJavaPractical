package crudIOperation;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update 
{
    public static void main(String a[]) 
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded.....");

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/empsystem", "root", "Sydney1999@");
            System.out.println("Connection Established....");

            String sql = "update empl set dept = 'marketing' where ename = 'Abhishek'";

            Statement statement = connection.createStatement();

            int rowsUpdated = statement.executeUpdate(sql);

            if (rowsUpdated > 0) 
            {
                System.out.println("Record updated...");
            } 
            else 
            {
                System.out.println("Record not found or not updated...");
            }

            connection.close();
        } 
        catch (ClassNotFoundException e)
        {
            System.out.println(e);
        } 
        catch (SQLException e)
        {
            System.out.println(e);
        }
    }
}
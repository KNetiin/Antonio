package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionFactory {

    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/landix";
    private static final String USER = "java";
    private static final String PASS = "toor";
    
    public static Connection getConnection(){
        
        try {
            Class.forName(DRIVER);
            
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conexão",ex);
        }
    }
    
    public static void closeConnection(Connection c){
        if(c != null){
            try {
                c.close();
            } catch (SQLException ex) {
                System.err.println("Erro: CLOSE CONNECTION - " +ex);
            }
        }
    }
    
    public static void closeConnection(Connection c, PreparedStatement s){
        if(s != null){
            try {
                s.close();
            } catch (SQLException ex) {
                System.err.println("Erro: CLOSE CONNECTION - " +ex);
            }
        }
        closeConnection(c);
    }
    
    public static void closeConnection(Connection c, PreparedStatement s, ResultSet rs){
        if(rs != null){
            try {
                rs.close();
            } catch (SQLException ex) {
                System.err.println("Erro: CLOSE CONNECTION - " +ex);
            }
        }
        closeConnection(c, s);
    }
    
}

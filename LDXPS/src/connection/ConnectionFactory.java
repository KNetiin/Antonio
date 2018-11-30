/*     NOME:        ANTONIO CARLOS NETO 
 *     EMPRESA:     LANDIX                              
 *     DESCRICAO:
 *                  CLASSE QUE CONECTA O BANCO DE DADOS COM
 *                  O NETBEANS. 
 */

package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionFactory {

    /********************************************DECLARAÇÃO DE ATRIBUTOS DA CLASSE******************************************************/
    //LOCAL QUE O DRIVER JDBC ESTA
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    
    //URL PARA ACESSAR O BANCO DE DADOS
    private static final String URL = "jdbc:mysql://localhost:3306/landix";
    
    //USUÁRIO DO BANCO DE DADOS LANDIX
    private static final String USER = "java";
    
    //SENHA DO BANCO DE DADOS LANDIX, RELACIONADO COM O USUÁRIO JAVA
    private static final String PASS = "toor";
    /***********************************************************************************************************************************/
    
    
    /********************************************METODO PARA CONECÇÃO COM O DB**********************************************************/
    public static Connection getConnection(){
        
        try {
            Class.forName(DRIVER);
            
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conexão",ex);
        }
    }
    /***********************************************************************************************************************************/
   
    /************************METODOS PARA FINALIZAÇÃO DA CONECÇÃO COM O DB EVITANDO FUTUROS ERROS***************************************/
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
    /**********************************************************************************8************************************************/
    
}

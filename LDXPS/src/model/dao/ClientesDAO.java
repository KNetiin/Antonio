/*     NOME:        ANTONIO CARLOS NETO 
 *     EMPRESA:     LANDIX                              
 *     DESCRICAO:
 *                  CLASSE QUE COMUNICA O BANCO DE DADOS COM
 *                  O NETBEANS. CLASSE CLIENTES E TABELA CLIENTES. 
 */
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.ldxps.Clientes;
import model.ldxps.Vendedores;

public class ClientesDAO {
    
    /********************************************DECLARAÇÃO DE ATRIBUTOS DA CLASSE******************************************************/
    //Objeto que carrega a conecção com o DB
    private Connection c = null;
    /***********************************************************************************************************************************/
    
    /**************************************************MÉTODO CONSTRUTOR DA CLASSE******************************************************/
    public ClientesDAO() {
        this.c = ConnectionFactory.getConnection();
    }
    /***********************************************************************************************************************************/
    
    /********************************MÉTODO QUE INSERE UM REGISTRO NA TABELA CLIENTES***************************************************/
    public boolean insert(Clientes cliente){
        
        String sql = "INSERT INTO CLIENTES (CDCL, DSNOME, IDTIPO, CDVEND, DSLIM) VALUES (?,?,?,?,?)";
        PreparedStatement s = null;
        
        try {
            s = c.prepareStatement(sql);
            s.setString(1, cliente.getCdcl());
            s.setString(2, cliente.getDsnome());
            s.setString(3, cliente.getIdtipo());
            s.setString(4, cliente.getVendedor().getCdvend());
            s.setDouble(5, cliente.getDslim());
            s.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Error: "+ex);
            return false;
        }finally{
            ConnectionFactory.closeConnection(c, s);
        }
    }
    /***********************************************************************************************************************************/
    
    /********************************MÉTODO QUE BUSCA TODOS REGISTROS NA TABELA CLIENTES************************************************/
    public List<Clientes> findAll(){
        
        String sql = "SELECT * FROM VENDEDORES V, CLIENTES C WHERE C.CDVEND = V.CDVEND;";
        
        PreparedStatement s = null;
        ResultSet r = null;
        
        List<Clientes> clientes = new ArrayList<>();
        
        try {
            s = c.prepareStatement(sql);
            r = s.executeQuery();
            
            while(r.next()){
                
                Clientes cliente = new Clientes();
                cliente.setCdcl(r.getString("CDCL"));
                cliente.setDsnome(r.getString("DSNOME"));
                cliente.setIdtipo(r.getString("IDTIPO"));
                cliente.setDslim(r.getInt("DSLIM"));
                
                Vendedores vendedor = new Vendedores();
                vendedor.setCdvend(r.getString("CDVEND"));
                vendedor.setDsnome(r.getString("DSNOME"));
                vendedor.setCdtab(r.getInt("CDTAB"));
                vendedor.setDtnasc(r.getString("DTNASC"));
                
                cliente.setVendedor(vendedor);
                
                clientes.add(cliente);
            }
            
        } catch (SQLException ex) {
            System.err.println("Error: "+ex);
            
        }finally{
            ConnectionFactory.closeConnection(c,s,r);
        }
        
        return clientes;
    }
    /***********************************************************************************************************************************/
    
    /********************************MÉTODO QUE ATUALIZA UM REGISTRO NA TABELA CLIENTES*************************************************/
    public boolean update(Clientes cliente){
        
        String sql = "UPDATE CLIENTES SET CDCL = ?, DSNOME = ?, IDTIPO = ?, CDVEND = ?, DSLIM = ? WHERE CDCL = ?";
        PreparedStatement s = null;
        
        try {
            s = c.prepareStatement(sql);
            s.setString(1, cliente.getCdcl());
            s.setString(2, cliente.getDsnome());
            s.setString(3, cliente.getIdtipo());
            s.setString(4, cliente.getVendedor().getCdvend());
            s.setDouble(5, cliente.getDslim());
            s.setString(6, cliente.getCdcl());
            s.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Error: "+ex);
            return false;
        }finally{
            ConnectionFactory.closeConnection(c, s);
        }
    }
    /***********************************************************************************************************************************/
    
    /********************************MÉTODO QUE DELETA UM REGISTRO NA TABELA CLIENTES***************************************************/
    public boolean delete(String cod){
        
        String sql = "DELETE FROM CLIENTES WHERE CDCL = ?";
        PreparedStatement s = null;
        
        try {
            s = c.prepareStatement(sql);
            s.setString(1, cod);
            s.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Error: "+ex);
            return false;
        }finally{
            ConnectionFactory.closeConnection(c, s);
        }
    }
    /***********************************************************************************************************************************/
    
    /********************************MÉTODO QUE BUSCA TODOS REGISTRO NA TABELA CLIENTES DADO UM CDVEND**********************************/
    public List<Clientes> findClients(String cd){
        
        String sql = "SELECT C.CDCL, C.DSNOME AS NOME, C.IDTIPO, C.CDVEND, C.DSLIM, V.DSNOME, V.CDTAB, V.DTNASC FROM VENDEDORES V, CLIENTES C WHERE C.CDVEND = V.CDVEND and C.CDVEND = (?);";
        
        PreparedStatement s = null;
        ResultSet r = null;
        
        List<Clientes> clientes = new ArrayList<>();
        
        try {
            s = c.prepareStatement(sql);
            s.setString(1, cd);
            r = s.executeQuery();
            while(r.next()){
                
                Clientes cliente = new Clientes();
                cliente.setCdcl(r.getString("CDCL"));
                cliente.setDsnome(r.getString("NOME"));
                cliente.setIdtipo(r.getString("IDTIPO"));
                cliente.setDslim(r.getInt("DSLIM"));
                
                Vendedores vendedor = new Vendedores();
                vendedor.setCdvend(r.getString("CDVEND"));
                vendedor.setDsnome(r.getString("DSNOME"));
                vendedor.setCdtab(r.getInt("CDTAB"));
                vendedor.setDtnasc(r.getString("DTNASC"));
                
                cliente.setVendedor(vendedor);
                
                clientes.add(cliente);
            }
            
        } catch (SQLException ex) {
            System.err.println("Error: "+ex);
            
        }finally{
            ConnectionFactory.closeConnection(c,s,r);
        }
        
        return clientes;
    }
    /***********************************************************************************************************************************/
}

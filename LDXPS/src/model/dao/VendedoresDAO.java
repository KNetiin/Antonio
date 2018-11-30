package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.ldxps.Vendedores;

public class VendedoresDAO {
    private Connection c = null;

    public VendedoresDAO() {
        this.c = ConnectionFactory.getConnection();
    }
    
    public boolean insert(Vendedores vendedor){
        
        String sql = "INSERT INTO VENDEDORES (CDVEND, DSNOME, CDTAB, DTNASC) VALUES (?,?,?,?)";
        PreparedStatement s = null;
        
        try {
            s = c.prepareStatement(sql);
            s.setString(1, vendedor.getCdvend());
            s.setString(2, vendedor.getDsnome());
            s.setInt(3, vendedor.getCdtab());
            s.setString(4, vendedor.getDtnasc());
            s.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Error: "+ex);
            return false;
        }finally{
            ConnectionFactory.closeConnection(c, s);
        }
 
    }
  
    public List<Vendedores> findAll(){
        
        String sql = "SELECT * FROM VENDEDORES";
        
        PreparedStatement s = null;
        ResultSet r = null;
        
        List<Vendedores> vendedores = new ArrayList<>();
        
        try {
            s = c.prepareStatement(sql);
            r = s.executeQuery();
            
            while(r.next()){
                
                Vendedores vendedor = new Vendedores();
                vendedor.setCdvend(r.getString("CDVEND"));
                vendedor.setDsnome(r.getString("DSNOME"));
                vendedor.setCdtab(r.getInt("CDTAB"));
                vendedor.setDtnasc(r.getString("DTNASC"));
                
                vendedores.add(vendedor);
            }
            
        } catch (SQLException ex) {
            System.err.println("Error: "+ex);
            
        }finally{
            ConnectionFactory.closeConnection(c,s,r);
        }
        
        return vendedores;
    }
    
    public boolean update(Vendedores vendedor, String cod){
        
        String sql = "UPDATE VENDEDORES SET CDVEND = ?, DSNOME = ?, CDTAB = ?, DTNASC = ? WHERE CDVEND = ?";
        PreparedStatement s = null;
        
        try {
            s = c.prepareStatement(sql);
            s.setString(1, vendedor.getCdvend());
            s.setString(2, vendedor.getDsnome());
            s.setInt(3, vendedor.getCdtab());
            s.setString(4, vendedor.getDtnasc());
            s.setString(5, cod);
            s.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Error: "+ex);
            return false;
        }finally{
            ConnectionFactory.closeConnection(c, s);
        }
 
    }
    
    public boolean delete(String cod){
        
        String sql = "DELETE FROM VENDEDORES WHERE CDVEND = ?";
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
}

package model.dao;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import model.ldxps.Vendedores;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

public class VendedoresDAOTest {
    
    public VendedoresDAOTest() {
    }

    
    @Test
    @Ignore
    public void inserir() {
        
        Vendedores v = new Vendedores("second2", "Carlos", 1, "01/01/01");
        VendedoresDAO dao = new VendedoresDAO();
        
        if(dao.insert(v)){
            System.out.println("Salvo com sucesso!");
        }else{
            fail("Erro ao salvar vendedores");
        }
    }
    
    @Test
    @Ignore
    public void listar(){
        
        VendedoresDAO dao = new VendedoresDAO();
        
        for(Vendedores v: dao.findAll()){
            
            System.out.println("Código: "+v.getCdvend());
            System.out.println("Nome: "+v.getDsnome());
            System.out.println("Tabela: "+v.getCdtab());
            System.out.println("Data de Nascimento: "+v.getDtnasc());
            System.out.println("--------------------------------------");
        }
    }
    
    @Test
    @Ignore
    public void atualizar(){
        Vendedores v = new Vendedores("second3", "Carlos", 1, "01/01/01");
        VendedoresDAO dao = new VendedoresDAO();
        
        if(dao.update(v,"second2")){
            System.out.println("Salvo com sucesso!");
        }else{
            fail("Erro ao atualizar vendedores");
        }
    }
    
    @Test
    @Ignore
    public void deletar(){
        VendedoresDAO dao = new VendedoresDAO();
        
        if(dao.delete("second3")){
            System.out.println("Deletado com sucesso!");
        }else{
            fail("Erro ao deletar vendedores");
        }
    }
    
    @Test
    //@Ignore
    public void teste_data(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
    }
}

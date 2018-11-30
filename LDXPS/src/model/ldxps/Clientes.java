/*     NOME:        ANTONIO CARLOS NETO 
 *     EMPRESA:     LANDIX                              
 *     DESCRICAO:
 *                  A TABELA CLIENTES DO BANCO DE DADOS INSTANCIADA EM OBJETOS. 
 */
package model.ldxps;

public class Clientes {
    
    /********************************************DECLARAÇÃO DE ATRIBUTOS DA CLASSE******************************************************/
    //Código do cliente
    private String cdcl;
    //Nome do cliente
    private String dsnome;
    //Tipo de pessoa, ’PF’ - Pessoa física; ’PJ’ - Pessoa jurídica.
    private String idtipo;
    //Limite de crédito
    private double dslim;
    //Composição com a classe Vendedor, funciona com a Chave Estrangeira
    private Vendedores vendedor;
    /***********************************************************************************************************************************/
    
    /*********************************************MÉTODO CONSTRUTOR DA CLASSE(SEM PARAMETROS)*************8*****************************/
    public Clientes(){
        
    }
    /***********************************************************************************************************************************/
   
    /*********************************************MÉTODO CONSTRUTOR DA CLASSE(COM PARAMETROS)*************8*****************************/
    public Clientes(String cdcl, String dsnome, String idtipo, double dslim, Vendedores vendedor) {
        this.cdcl = cdcl;
        this.dsnome = dsnome;
        this.idtipo = idtipo;
        this.dslim = dslim;
        this.vendedor = vendedor;
    }
    /***********************************************************************************************************************************/
   
    /*****************************************MÉTODOS SETERS****************************************************************************/
    public void setVendedor(Vendedores vendedor) {
        this.vendedor = vendedor;
    }
    
    public void setCdcl(String cdcl) {
        this.cdcl = cdcl;
    }

    public void setDsnome(String dsnome) {
        this.dsnome = dsnome;
    }

    public void setIdtipo(String idtipo) {
        this.idtipo = idtipo;
    }

    public void setDslim(double dslim) {
        this.dslim = dslim;
    }
    /***********************************************************************************************************************************/

    /*****************************************MÉTODOS GETERS****************************************************************************/
    public Vendedores getVendedor() {
        return vendedor;
    }

    public String getCdcl() {
        return cdcl;
    }

    public String getDsnome() {
        return dsnome;
    }

    public String getIdtipo() {
        return idtipo;
    }

    public double getDslim() {
        return dslim;
    }
    /***********************************************************************************************************************************/
}

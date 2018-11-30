/*     NOME:        ANTONIO CARLOS NETO 
 *     EMPRESA:     LANDIX                              
 *     DESCRICAO:
 *                  A TABELA VENDEDORES DO BANCO DE DADOS INSTANCIADA EM OBJETOS. 
 */
package model.ldxps;

public class Vendedores {
    
    /********************************************DECLARAÇÃO DE ATRIBUTOS DA CLASSE******************************************************/
    //Código do vendedor
    private String cdvend;
    //Nome do vendedor
    private String dsnome;
    //Código da tabela de preços padrão
    private int cdtab; 
    //Data de nascimento
    private String dtnasc; 
    /***********************************************************************************************************************************/
    
    /*********************************************MÉTODO CONSTRUTOR DA CLASSE(SEM PARAMETROS)*************8*****************************/
    public Vendedores(){   
    }
    /***********************************************************************************************************************************/
   
    /*********************************************MÉTODO CONSTRUTOR DA CLASSE(COM PARAMETROS)*************8*****************************/
    public Vendedores(String cdvend, String dsnome, int cdtab, String dtnasc) {
        this.cdvend = cdvend;
        this.dsnome = dsnome;
        this.cdtab = cdtab;
        this.dtnasc = dtnasc;
    }
    /***********************************************************************************************************************************/
   
    /*****************************************MÉTODOS SETERS****************************************************************************/
    public void setCdvend(String cdvend) {
        this.cdvend = cdvend;
    }

    public void setDsnome(String dsnome) {
        this.dsnome = dsnome;
    }


    public void setCdtab(int cdtab) {
        this.cdtab = cdtab;
    }

    public void setDtnasc(String dtnasc) {
        this.dtnasc = dtnasc;
    }
    /***********************************************************************************************************************************/

    /*****************************************MÉTODOS GETERS****************************************************************************/
    public String getCdvend() {
        return cdvend;
    }

    public String getDsnome() {
        return dsnome;
    }

    public int getCdtab() {
        return cdtab;
    }

    public String getDtnasc() {
        return dtnasc;
    }
    /***********************************************************************************************************************************/
}

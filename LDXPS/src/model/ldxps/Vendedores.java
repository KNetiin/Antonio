package model.ldxps;

public class Vendedores {
    private String cdvend; //Código do vendedor
    private String dsnome; //Nome do vendedor
    private int cdtab; //Código da tabela de preços padrão
    private String dtnasc; //Data de nascimento
    
    public Vendedores(){
        
    }
    
    public Vendedores(String cdvend, String dsnome, int cdtab, String dtnasc) {
        this.cdvend = cdvend;
        this.dsnome = dsnome;
        this.cdtab = cdtab;
        this.dtnasc = dtnasc;
    }

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
    
}

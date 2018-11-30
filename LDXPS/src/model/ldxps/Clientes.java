package model.ldxps;

public class Clientes {
    private String cdcl; //Código do cliente
    private String dsnome; //Nome do cliente
    private String idtipo; //Tipo de pessoa, ’PF’ - Pessoa física; ’PJ’ - Pessoa jurídica.
    private float dslim; //Limite de crédito
    private Vendedores vendedor;
   
    public Clientes(){
        
    }
   
    public Clientes(String cdcl, String dsnome, String idtipo, float dslim, Vendedores vendedor) {
        this.cdcl = cdcl;
        this.dsnome = dsnome;
        this.idtipo = idtipo;
        this.dslim = dslim;
        this.vendedor = vendedor;
    }

    public void setVendedor(Vendedores vendedor) {
        this.vendedor = vendedor;
    }

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

    public float getDslim() {
        return dslim;
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

    public void setDslim(float dslim) {
        this.dslim = dslim;
    }
    
}

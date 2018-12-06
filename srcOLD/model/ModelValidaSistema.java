
package model;

import java.sql.Date;

/**
 *
 * @author cicero.ramos
 */
public class ModelValidaSistema {
    
    private int codigo;
    private Date dataVencimento;
    
    
    
    
 public ModelValidaSistema(){}
     
     /**
    * seta o valor de codigo
    * @param pCodigo
    */
    public void setCodigo(int pCodigo){
        this.codigo = pCodigo;
    }
    /**
    * return codigo
    */
    public int getCodigo(){
        return this.codigo;
    }
     
     
    /**
    * seta a data
    * @param pDataVencimento
    */
    public void setDataVencimento(Date pDataVencimento){
        this.dataVencimento = pDataVencimento;
    }
    /**
    * return data vencimento
    */
    public Date getDataVencimento(){
        return this.dataVencimento;
    } 
     
}

package model;

/**
 *
 * @author Cícero
 */
public class ModelAutoInfo {

    private int codigo;
    private String marca_carro;
    private String marca_moto;
    private String motor_carro;
    private String motor_moto;

    @Override
    public String toString() {
        return "ModelAutoInfo{" + "codigo=" + codigo + ", marca_carro=" + marca_carro + ", marca_moto=" + marca_moto + ", motor_carro=" + motor_carro + ", motor_moto=" + motor_moto + '}';
    }
   
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarca_carro() {
        return marca_carro;
    }

    public void setMarca_carro(String marca_carro) {
        this.marca_carro = marca_carro;
    }

    public String getMarca_moto() {
        return marca_moto;
    }

    public void setMarca_moto(String marca_moto) {
        this.marca_moto = marca_moto;
    }

    public String getMotor_carro() {
        return motor_carro;
    }

    public void setMotor_carro(String motor_carro) {
        this.motor_carro = motor_carro;
    }

    public String getMotor_moto() {
        return motor_moto;
    }

    public void setMotor_moto(String motor_moto) {
        this.motor_moto = motor_moto;
    }
    
    
    
}

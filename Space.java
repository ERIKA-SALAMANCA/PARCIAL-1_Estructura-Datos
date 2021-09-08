 
package Lista;
 
import javax.swing.JOptionPane;

public class Space { 
/*
    informacion del conductor,
placa del auto
marca del auto
numero de identificacion del conductor
esta o no esta afiliado al parque
BUSQUEDA
numero de placa
cedula de condutor,
*/     
    
    
    private String marca;
    private int identificacion;
    private boolean afiliacion;
    private String placa;

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public boolean isAfiliacion() {
        return afiliacion;
    }
 
    public Space(String placa, String marca,int identificacion,boolean afiliacion){
        this.placa=placa;
        this.marca=marca;
        this.identificacion=identificacion;
        this.afiliacion=afiliacion;
                
    }
    
    public void setPlaca(String placa) {
        if(placa==null){
            this.placa = placa;
        }else{
            System.out.println("Space ");
        }
    }
 
    public void setMarca(String marca) {
        if(placa==null){
            this.marca = marca;
        }else{
            System.out.println("Space busy");
        }
        
    }
 
    public void setIdentificacion(int identificacion) {
        if(placa==null){
            this.identificacion = identificacion;
        }else{
            System.out.println("Space busy");
        }
        
    }
 
    public void setAfiliacion(boolean afiliacion) {
        if(placa==null){
            this.afiliacion = afiliacion;
        }else{
            System.out.println("Space busy");
        }
        
    }
    
    public void Datos(){ 
        
            JOptionPane.showMessageDialog(null,
                "IDENTIFICACION:  "+identificacion
                +"\nPLACA:     "+placa
                +"\nMODELO:    "+marca
                +"\nAFILIACION:  "+afiliacion 
                );
        
    }
    
    
    
       
}

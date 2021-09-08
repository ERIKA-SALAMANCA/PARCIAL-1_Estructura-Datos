 
package Lista;
 
import javax.swing.JOptionPane;

public class ListaCD { 
    
    
    private NodeCD primero;
    private NodeCD ultimo;
    private static NodeCD current;
    
    private int size=10; 
    
    public ListaCD(){
    int n=0;
    
        while(n!=size){
            if(n==0){
                NodeCD nodo = new NodeCD();
                nodo.setNext(nodo);
                nodo.setPrevious(nodo);
                
                primero=nodo;
                ultimo=primero; 
                nodo.setPuesto(n); 
                System.out.println("puesto "+nodo.getPuesto());
                current=primero;
            }else{
                NodeCD nodo = new NodeCD();
                
                ultimo.setNext(nodo);
                nodo.setPrevious(ultimo);
                ultimo=nodo;
                primero.setPrevious(ultimo);
                ultimo.setNext(primero); 
                nodo.setPuesto(n);
                System.out.println("puesto "+nodo.getPuesto());
                
            }
                    
            n++;
        }
    }
        
    public void guardarAuto(){
        NodeCD save = current; 
        boolean x=true;
        if(current.getValue()==null){
           ListaCD.crearSpace();
        }else{
            int i=0;
            int d=0;
            while(current.getValue()!=null && d!=10){
                d++;
                current=current.getNext();
            }
            current=save; 
            if(d!=10){
                while(current.getValue()!=null && i!=10){
                i++;
                current=current.getPrevious();
                }
                current=save; 
            }else{
                JOptionPane.showMessageDialog(null, "Lo sentimos, no hay espacions disponibles"); 
                x=false;
            }
            if(x){ 
                if(i<=d){ 
                    while(i!=0){
                        current=current.getPrevious();
                        i--; 
                    }
                    ListaCD.crearSpace();
                }else{
                    while(d!=0){
                        current=current.getNext();
                        d--; 
                    }

                    ListaCD.crearSpace();
                }
            }
        }
    }
    
    
     
    public void sacarAuto(int tipo, String dato){
        // PLACA 
        NodeCD save = current;
        int n=0;
        switch(tipo){
            case 1: 
                    while(n!=size){ 
                        try{
                            if(current.getValue().getPlaca().compareTo(dato)==0){
                                System.out.println("Su carro a sido devuelto");
                                current.setValue(null);
                                ListaCD.cobro();
                                break;
                            }else{
                                current=current.getNext(); 
                            } 
                        }catch(NullPointerException error){
                            current=current.getNext();  
                        }
                        n++;
                    } 
                    if(n==10){
                        JOptionPane.showMessageDialog(null, "No se encontro el auto con los datos introducidos");
                        current=save;
                    }
                    break;
        //IDENTIFICACION
            case 2: int Dato=Integer.parseInt(dato); 
                    while(n!=size){
                        try{
                            if(current.getValue().getIdentificacion()==Dato){
                                System.out.println("Su carro a sido devuelto");
                                current.setValue(null);
                                ListaCD.cobro();
                                break;
                            }else{
                                current=current.getNext();
                                 
                            } 
                        }catch(NullPointerException error){
                            current=current.getNext();
                                 
                        }
                        n++;
                    }
                    if(n==10){
                        JOptionPane.showMessageDialog(null, "No se encontro el auto con los datos introducidos");
                        current=save;
                    }
                    break;
             
            default: JOptionPane.showMessageDialog(null, "Tipo de dato incorrecto");
                     break;
        } 
    }
 
    public static void cobro(){
        int tiempo = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas horas estuvo parqueado?"));
        int costo=1000;
        JOptionPane.showMessageDialog(null,"Debe pagar: "+ costo*tiempo);
    }

    public void mostrarTodo(){
        int n=0;
        NodeCD nitido=primero;
        while(n!=size){
            try{
                nitido.getValue().Datos();
                System.out.println(nitido.getPuesto());
                nitido=nitido.getNext();
                
            }catch(NullPointerException error){  
                System.out.println("v"+ nitido.getPuesto());
                nitido=nitido.getNext();
           }
        n++;
        }
        System.out.println("------");

    }

    public NodeCD getPrimero() {
        return primero;
    }

    public NodeCD getUltimo() {
        return ultimo;
    }
     

    public static void crearSpace(){
        String placa = JOptionPane.showInputDialog("Numero de placas");
        String marca = JOptionPane.showInputDialog("Marca del vehiculo");
        int identificacion= Integer.parseInt(JOptionPane.showInputDialog("Numero de identificacion"));
        JOptionPane.showMessageDialog(null, "¿Esta afiliado?");
        int afi= Integer.parseInt(JOptionPane.showInputDialog("1. Si\n2. No"));
        boolean afiliacion=false;
            
        switch(afi){
            case 1: afiliacion=true; 
                    break;
        }

        Space auto = new Space(placa, marca,identificacion,afiliacion);
        current.setValue(auto); 
    }

    

}



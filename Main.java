 
package Main;
 
import Lista.ListaCD;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args){
        
        
        ListaCD lista = new ListaCD();
        
        while(true){
            int A= Integer.parseInt(JOptionPane.showInputDialog("introduzca el numero de la accion a realizar\n1. guardar carro\n2. sacar carro\n3. mostrar autos parqueados\n4. current"));
            switch(A){
                case 1: lista.guardarAuto();
                        break;
                 
                case 2: int M= Integer.parseInt(JOptionPane.showInputDialog("1. Sacar por placa\n2. Sacar por identificacion")); 
                        String dato = JOptionPane.showInputDialog("Introduzca la información"); 
                        lista.sacarAuto(M, dato); 
                        break;
                case 3: lista.mostrarTodo();
                 
                
            
            } 
        }
        
        
    }
}


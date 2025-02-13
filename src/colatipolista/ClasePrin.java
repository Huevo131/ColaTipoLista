/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colatipolista;

import javax.swing.JOptionPane;

/**
 *
 * @author yahir
 */
public class ClasePrin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int opcion = 0, nodo_informacion = 0;
        Cola cola = new Cola();
        
        do {
            
            try {
                
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Menu de Opciones\n\n"
                    + "1. Insetar nodo\n"
                    + "2. Extraer nodo\n"
                    + "3. Mostrar contenido de la Cola\n"
                    + "4. Salir\n\n"));
                switch (opcion) {
                    case 1: 
                        nodo_informacion = Integer.parseInt(JOptionPane.showInputDialog(null, 
                                "Porfavor ingresa el valor a guardar en el nodo"));
                        cola.Insertar(nodo_informacion);
                        break;
                    case 2:
                        if (!cola.ColaVacia()){
                            JOptionPane.showMessageDialog(null, "Se extrajo un nodo con el valor: " + cola.Extraer());
                        } else {
                            JOptionPane.showMessageDialog(null, "La cola esta vacia");
                        }
                        
                        break;
                    case 3:
                        cola.MostrarContenido();
                        
                        break;
                    case 4:
                        opcion = 4;
                        
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion no disponible");
                        break;
                        
                }
            } catch (NumberFormatException e) {
                
            }
            
        } while (opcion != 4);

    }
    
}


package javaapplication1;

import java.util.Scanner;


public class JavaApplication1 {

  
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        inventario allproducts = new inventario();
        ventas misventas = new ventas();
        
        int opcion;
        
        do{
            
        System.out.println("BIENVENIDO A PELUCHITOS.COM"+"\n"+"\n");
        System.out.println("1. Agregar Producto");
        System.out.println("2. Buscar Producto");
        System.out.println("3. Eliminar producto");
        System.out.println("4. Mostrar Inventario");
        System.out.println("5. Realizar Venta");
        System.out.println("6. Mostrar Ganancias totales");
        System.out.println("7. Salir"+"\n");     
        System.out.println("inserte su opcion : ");     
        opcion = lector.nextInt();
        
        switch(opcion){
        
            case 1: allproducts.Agregar_Producto();
                break;
            case 2: allproducts.Buscar_Producto();
                break;
            case 3: allproducts.Eliminar_producto();
                break;
            case 4: allproducts.Mostrar_Inventario();
                break;
            case 5: misventas.Realizar_Venta();
                break;
            case 6: misventas.Mostrar_Ganancias_totales();
                break;
            case 7: System.out.println("que tenga un buen dia"+"\n");
                break;
                
            default : System.out.println("opcion invalida.");
                
        }
        }
        while(opcion!=7);
    }
        
}

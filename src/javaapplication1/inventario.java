
package javaapplication1;

import java.util.ArrayList;
import java.util.Scanner;

public class inventario {
    
    Scanner lector = new Scanner(System.in);
    static protected ArrayList<producto> invent = new ArrayList<>();
    
    public void Agregar_Producto(){
    
        int a,b;
        String nom;
        
        System.out.println("ingrese nombre del producto : ");
        nom = lector.next();
        System.out.println("ingrese precio del producto : ");
        b = lector.nextInt();
        System.out.println("ingrese cantidad del producto : ");
        a = lector.nextInt();
        invent.add(new producto(a,b,nom));
        
        System.out.println("el producto ha sido agregado."+"\n"+"\n");
    }

    public void Buscar_Producto(){
    
        String prod_buscado;
        int k = 0;
        
        System.out.println("ingrese el nombre del producto deseado : ");
        prod_buscado = lector.next();
        
        for(int i = 0; i < invent.size(); i++){
               
                if(prod_buscado.equals(invent.get(i).getNombre())){

                    System.out.println("nombre : "+invent.get(i).getNombre());
                    System.out.println("precio : "+invent.get(i).getPrecio());
                    System.out.println("cantidad : "+invent.get(i).getNum_producto()+"\n"+"\n");
                    k++;
                    break;
                              
            }
        }
        if(k == 0){
        
            System.out.println("el producto buscado no existe"+"\n"+"\n");
        }
                
    }
    
    public void Eliminar_producto(){
    
        String producto_elim;
        int m = 0;
        
        System.out.println("ingrese el nombre del producto a eliminar : ");
        producto_elim = lector.next();
        
        for(int i = 0; i < invent.size(); i++){
                 
                if(producto_elim.equals(invent.get(i).getNombre())){

                    invent.remove(i);
                    System.out.println("el producto ha sido eliminado"+"\n"+"\n");
                    m++;
                    break;
                }           
        }
        
        if(m == 0){
     
            System.out.println("el producto buscado no existe"+"\n"+"\n");
        }
            
    }
    
    public void Mostrar_Inventario(){
        
        System.out.println("***** INVENTARIO *****"+"\n"+"\n"+"\n");
    
        for(int i = 0; i < invent.size(); i++){
               
            System.out.println("nombre : "+invent.get(i).getNombre()+".  precio : "+invent.get(i).getPrecio()+".  cantidad : "+invent.get(i).getNum_producto());
        }
    }
    
    
}

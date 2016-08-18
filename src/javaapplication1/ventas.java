
package javaapplication1;

import java.util.Scanner;

public class ventas extends inventario{
    
    private int ganancias = 0;
    
    public void sumar_ganancia(int k,int z){
    
       ganancias += invent.get(k).getPrecio()*z;
    }
     
    public void  Realizar_Venta(){
        
        Scanner leer = new Scanner(System.in);
        String producto_venta;
        int k = 0,v;
    
        System.out.println("ingrese el nombre del producto a vender : ");
        producto_venta = leer.next();
        
        for(int i = 0; i < invent.size(); i++){
                   
                if(producto_venta.equals(invent.get(i).getNombre())){

                    System.out.println("ingrese las unidades a vender : ");
                    v = leer.nextInt();
                    
                    if(v <= invent.get(i).getNum_producto()){
                    
                        System.out.println("venta realizada."+"\n"+"\n");
                        invent.get(i).setNum_ventas(v);
                        invent.get(i).setNum_producto(invent.get(i).getNum_producto()-v);
                        sumar_ganancia(i,v);
                        
                    }
                    else{
                    
                        System.out.println("cantidad de producto exedida."+"  unidades del Producto en venta : "+invent.get(i).getNum_producto());
                    }
                    k++;
                    break;
                }     
        }
        
        if(k == 0){
        
            System.out.println("el producto buscado no existe"+"\n"+"\n");
        }
    }
    
    public void Mostrar_Ganancias_totales(){
       
        System.out.println("Las ganancias totales son : "+ganancias+"\n"+"\n");
    }  
    
}

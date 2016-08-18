
package javaapplication1;

public class producto {
   
    private int num_producto,precio,num_ventas;
    private String nombre;

    public producto(int num_producto, int precio, String nombre) {
        this.num_producto = num_producto;
        this.precio = precio;
        this.nombre = nombre;
    }

    public int getNum_producto() {
        return num_producto;
    }

    public void setNum_producto(int num_producto) {
        this.num_producto = num_producto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNum_ventas() {
        return num_ventas;
    }

    public void setNum_ventas(int num_ventas) {
        this.num_ventas = num_ventas;
    }
    
    
    
}

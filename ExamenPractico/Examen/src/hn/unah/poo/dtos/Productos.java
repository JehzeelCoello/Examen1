package hn.unah.poo.dtos;

public abstract class Productos {
    
    public static String nombre;
    public static int  precio;
    //cantidad disponible
    public static int stok;

    public Productos(String nombre,int precio, int stok){
        this.nombre=nombre;
        this.precio=precio;
        this.stok=stok;
    } 


    public static String getNombre() {
        return nombre;
    }
    public static void setNombre(String nombre) {
        Productos.nombre = nombre;
    }
    public static int getPrecio() {
        return precio;
    }
    public static void setPrecio(int precio) {
        Productos.precio = precio;
    }
    public static int getStok() {
        return stok;
    }
    public static void setStok(int stok) {
        Productos.stok = stok;
    }




}

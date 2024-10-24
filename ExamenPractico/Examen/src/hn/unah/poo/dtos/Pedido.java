package hn.unah.poo.dtos;
import java.util.*;
import hn.unah.poo.interfaces.IMetodoPago;

public class Pedido implements IMetodoPago {
    
    Object producto[] = new Object[11];

   int limiteexp=11;

    public void agregarProducto(Object producto,int cantidad){
       
        

    }
    public void calcularTotal(){

    }

    public void procesarPedido() {
       

    }

PagoPayPal pagoPaypal1 = new PagoPayPal();
PagoTarjetaCredito pagoTarjetaCredito1 = new PagoTarjetaCredito();

    @Override
    public void procesarPago(double monto) {
        int i;
        Scanner leer = new Scanner(System.in);
        System.out.println("desea pagar con paypal? precione 1 si si otro para pago con targeta de credito.");
        i=leer.nextInt();
        if(i==1){
            pagoPaypal1.procesarPago(monto);
        }else{
            pagoTarjetaCredito1.procesarPago(monto);
        }
        
        
    }

    
}
   

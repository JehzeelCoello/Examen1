package hn.unah.poo.dtos;

import hn.unah.poo.interfaces.IMetodoPago;




public class PagoPayPal implements IMetodoPago {

    private String nombredecuenta;
   

    //procesa pagos con PayPal y simula la conexión a una cuenta de PayPal.

   


    @Override
    public void procesarPago(double monto) {
       boolean pagado = false;
       if(pagado = false){
        System.out.println("realizando pago por PayPal.");
        pagado=true;
        System.out.println("pago realizado Exitosamente.");
       }else{
        System.out.println("el producto ya esta pagado");
       }
    }
    
}

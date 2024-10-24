package hn.unah.poo.dtos;
import hn.unah.poo.interfaces.IMetodoPago;


public class PagoTarjetaCredito implements IMetodoPago {
    
    
    //procesa pagos con tarjeta de crédito y simula la verificación de fondos.

    @Override
    public void procesarPago(double monto) { 
    }

    public void procesarPago(double monto,int saldo) { 
        boolean pagado = false;
        if(saldo<monto){
            System.out.println("procesando pago. ");
            pagado=true;
            System.out.println("pagado exitosamente.");
        }else{
            System.out.println("saldo menor a monto");
        }
    }
    
}

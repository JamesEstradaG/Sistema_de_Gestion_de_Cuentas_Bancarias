package cuenta;

//Esta ya es la primera aplicación de la herencia que se va a utilizar, más los criterios especiales, como el del saldo negativo
/*Consideraciones:
  La tarjeta de crédito tiene saldo negativo y tambien se aplicara un interes.
*/

public class TarjetaCredito extends Cuenta {
    public TarjetaCredito (double apertura){
        super (apertura * -1);
    }
    
    public void sumaInteres (double cantidad) {
        double deudaActual = getMontoActual ();
    
    
    double aumentoDeuda = deudaActual * (cantidad / 100);
    
    setMontoActual (deudaActual + aumentoDeuda);
    System.out.println("El interes del 15% ha sido aplicado. Tu nuevo saldo es de: $" + getMontoActual());
    
    }
}

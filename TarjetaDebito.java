package cuenta;

//Esta es la segunda clase en cuanto a tipo de cuentas, y con el especial del retiro


public class TarjetaDebito extends Cuenta {
    public TarjetaDebito (double apertura){
        super(apertura);
    }
    
    public void retirar (double cantidad) {
        double saldoActual = getMontoActual ();
       
    
    
        if (saldoActual >= cantidad) {
            setMontoActual (saldoActual - cantidad);
            System.out.println("Se ha realizado un retiro de $" + cantidad + "Tu nuevo saldo es de: $" + getMontoActual());
      } else {
            System.out.println("Saldo insuficiente");
      }
    } 
}

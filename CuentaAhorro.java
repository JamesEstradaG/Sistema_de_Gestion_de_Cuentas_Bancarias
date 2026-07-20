package cuenta;

//Esta es la tercera clase en cuanto a tipo de cuentas, y con el especial de inversión


public class CuentaAhorro extends Cuenta {
    public CuentaAhorro (double apertura){
        super (apertura);
    }

    public void invertir (double cantidad){
        double saldoActual = getMontoActual();
        
        double ganancia = saldoActual * (cantidad /100);
        
        setMontoActual (saldoActual + ganancia);
        System.out.println("Se recibio ganancia de la inversión. Tu nuevo saldo es de: $" + getMontoActual());
    }
    
}

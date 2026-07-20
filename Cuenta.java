package cuenta;

    /*
       El banco MexBank quiere mejorar la eficiencia del código de su sistema. Se tienen 3 tipos de
       cuentas: Tarjetas de Crédito, Tarjetas de Débito y Cuenta de Ahorro. El objetivo es crear una Clase
       Cuenta base, de la cual, las demás Clases hereden sus propiedades y métodos.
     */

//Aquí se crea la case con una propiedades y metodos que todas las tarjetas tienen

public class Cuenta {
    private double montoActual;
    
    public Cuenta (double apertura) {
        this.montoActual = apertura;
    }
    
    public void depositar (double cantidad){
        this.montoActual = this.montoActual + cantidad;
        System.out.println("Se realizó el deposito, tu saldo es de: $" + this.montoActual);
    }
    
    public double getMontoActual () {
        return this.montoActual;
    }
    
    public void setMontoActual (double montoActual) {
        this.montoActual = montoActual;
        
    }
    
}

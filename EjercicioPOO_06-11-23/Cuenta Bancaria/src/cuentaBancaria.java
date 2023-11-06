import java.util.Scanner;

public class cuentaBancaria {

    //variables globales
    public static Scanner lector = new Scanner(System.in);
    public static double montoIngresado;
    public static double montoRobado;

    //variables requisito del ejercicio
    private String nomCliente;
    private String email;
    private int numTelefono;
    private String numCuenta;
    private double saldo;
    

    public cuentaBancaria(String nomCliente, String email, int numTelefono, String numCuenta, double saldo) {
        this.nomCliente = nomCliente;
        this.email = email;
        this.numTelefono = numTelefono;
        this.numCuenta = numCuenta;
        this.saldo = saldo;
    }

    // Metodos get
    public String getNomCliente() {
        return nomCliente;
    }
    public String getEmail() {
        return email;
    }
    public int getNumTelefono() {
        return numTelefono;
    }
    public String getNumCuenta() {
            return numCuenta;
        }
    public double getSaldo() {
            return saldo;
        }

        //Metodos setters
    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setNumTelefono(int numTelefono) {
        this.numTelefono = numTelefono;
    }
    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //Mis metodos
    public void manejoDeMetodos() 
    { 
        System.out.println("Bienvenido/t Que opcion desea ejecutar? 1.Incrementar su saldo"+
        "2.Retirar fondos");
        int opc;
        opc = lector.nextInt();
        switch(opc){
            case '1':{
                incrementSaldo();
                break;
            }
            case '2':{
                sacarSaldo();
                break;
            }
        }

    }

    public void incrementSaldo(){

        System.out.println("Bienvenido sea cliente/tCuanto es el monto que desea ingresar a su cuenta? ");

        this.saldo = 0;
        do{
            montoIngresado = lector.nextDouble();
        }while(montoIngresado <= 0);
        this.saldo += montoIngresado;
        System.out.println("El monto ingresado es de: " + montoIngresado);
        System.out.println("Su monto actual en la cuenta es de: " + saldo);
    }

    public void sacarSaldo(){

        System.out.println("Bienvenido sea cliente/tCuanto es el monto que desea sacar de su cuenta? ");
        this.saldo += montoIngresado;

        do{
        montoRobado = lector.nextDouble();
        }while(saldo <= 100);
        this.saldo -= montoRobado;
        System.out.println("El monto sacado fue de: " + montoRobado);
        System.out.println("Su monto actual es de: " + saldo);
        

    }

    

}

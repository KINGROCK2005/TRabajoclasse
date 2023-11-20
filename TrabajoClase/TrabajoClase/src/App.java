public class App {
    public static void main(String[] args) throws Exception {
        
        CuentaBancaria cuenta = new CuentaBancaria("123456789", "1000.0", 11223345, 12344, 123-456-7890);

        System.out.println("Información de la cuenta:");
        System.out.println("Número de cuenta: " + cuenta.getNumCuenta());
        System.out.println("Saldo actual: $" + cuenta.getSaldo());
        System.out.println("Nombre del cliente: " + cuenta.getNomCliente());
        System.out.println("Correo electrónico: " + cuenta.getEmail());
        System.out.println("Número de teléfono: " + cuenta.getNumTelefono());

        cuenta.incrementSaldo(500.0);
        cuenta.sacarSaldo(200.0);
        cuenta.sacarSaldo(1000.0);

        // Ejemplo de uso de la clase ClienteVIP
        ClaseVIP cliente = new ClaseVIP();
        System.out.println("\nInformación del Cliente VIP:");
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Límite de crédito: $" + cliente.getLimiteCredito());
        System.out.println("Correo electrónico: " + cliente.getCorreoElectronico());
    
    

    }
}

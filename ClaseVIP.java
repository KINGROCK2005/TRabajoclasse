public class ClaseVIP {
    
    private String nombre;
    private double limiteCredito;
    private String correoElectronico;

    public ClaseVIP(String nombre, double limiteCredito, String correoElectronico) {
        this.nombre = nombre;
        this.limiteCredito = limiteCredito;
        this.correoElectronico = correoElectronico;
    }

    // Métodos getters
    public String getNombre() {
        return nombre;
    }
    public double getLimiteCredito() {
        return limiteCredito;
    }
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    //Metodos setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public ClaseVIP(){

    }
}

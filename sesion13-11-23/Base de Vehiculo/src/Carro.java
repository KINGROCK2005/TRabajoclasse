public class Carro extends Vehiculo{

    private String MarcaRegistro;
    private String Modelo;
    private String Carroceria;
    private String motor; 


    public Carro(String Matricula, String color, int velocidad, String MarcaRegistro, String Modelo,String Carroceria,String motor ){
        super(Matricula, color, velocidad);
        this.MarcaRegistro = MarcaRegistro;
        this.Modelo = Modelo;
        this.Carroceria = Carroceria;
        this.motor= motor;

    }
    
}

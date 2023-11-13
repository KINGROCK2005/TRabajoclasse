public class Maserati extends Carro{

    private int manubrio;
    private int palanca;
    private String moverse;

    public Maserati(String Matricula, String color, int velocidad, String MarcaRegistro,String Carroceria,String motor , String Modelo, int manubrio, int palanca, String moverse){
        super(Matricula, color, velocidad, MarcaRegistro, Modelo, Carroceria, motor);
        this.manubrio = manubrio;
        this.moverse= moverse;
        this.moverse=moverse;

    }

    public void manubrio(){
            System.out.println("A los cuantos grados desea ");


    }

    
}

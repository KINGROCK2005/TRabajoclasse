public class Vehiculo{

    private String matricula;
    private String color;
    private int velocidad;

    Vehiculo(String Matricula, String color, int velocidad ){
        this.Matricula = Matricula;
        this.color = color;
        this.velocidad = velocidad;
    }

    //Metodos getter
    public String getMatricula() {
        return Matricula;
    }
    public String getColor() {
            return color;
        }
    public int getVelocidad() {
            return velocidad;
        }
    

    
    //Metodos setters
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    

}
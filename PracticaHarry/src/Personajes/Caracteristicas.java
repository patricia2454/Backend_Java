package Personajes;

public class Caracteristicas {
    public void Caracteristicas(){

    }

    //Características
    public String Nombre, Apellido, Casa, Genero, Boggart, Patronus;

    public String getApellido() {
        return Apellido;
    }
    public String getNombre() {
        return Nombre;
    }
    public String getCasa() {
        return Casa;
    }
    public String getGenero() {
        return Genero;
    }
    public String getBoggart() {
        return Boggart;
    }
    public String getPatronus() {
        return Patronus;
    }
    public boolean setNombre(String Nombre){
        if(!Nombre.isEmpty()){
            this.Nombre = Nombre;
            return true;
        } else
            return false;
    }
    public boolean setCasa(String Casa){
        if(!Casa.isEmpty()){
            this.Casa = Casa;
            return true;
        } else
            return false;
    }
    public boolean setApellido(String Apellido){
        if(!Apellido.isEmpty()){
            this.Apellido = Apellido;
            return true;
        } else
            return false;

    }
    public boolean setGenero(String Genero){
        if(!Genero.isEmpty()){
            this.Genero = Genero;
            return true;
        } else
            return false;

    }
    public boolean setBoggart(String Boggart){
        if(!Boggart.isEmpty()){
            this.Boggart = Boggart;
            return true;
        } else
            return false;

    }
    public boolean setPatronus(String Patronus){
        if(!Patronus.isEmpty()){
            this.Patronus = Patronus;
            return true;
        } else
            return false;

    }
}

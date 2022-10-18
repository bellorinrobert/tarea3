public class Main {
    public static void main(String[] args) {
        System.out.println("Practica de persona");
        Persona Griffin = new Persona();

        Griffin.setEdad(42);
        Griffin.setNombre("Peter");
        Griffin.setTelefono("555-55-55");

        System.out.println("Persona: " +  Griffin.getNombre() +
                " tiene una edad " + Griffin.getEdad() +
                " su número es " + Griffin.getTelefono());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public void setEdad(int edad){

        this.edad = edad;

    }

    public int getEdad(){

        return this.edad;

    }

    public void  setNombre(String nombre){

        this.nombre = nombre;

    }

    public String getNombre(){

        return this.nombre;

    }

    public void setTelefono(String telefono){

        this.telefono = telefono;

    }

    public String getTelefono(){

        return this.telefono;

    }

}
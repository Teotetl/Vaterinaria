// Clase Animal
public class Animal {
    // Atributos
    protected String nombre;
    protected int edad;
    protected String especie;

    // Constructor
    public Animal(String nombre, int edad, String especie) {
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
    }

    // Métodos
    public void comer() {
        System.out.println("El animal está comiendo.");
    }

    public void moverse() {
        System.out.println("El animal está moviéndose.");
    }
}

// Clase Perro
class Perro extends Animal {
    // Atributos
    private String raza;

    // Constructor
    public Perro(String nombre, int edad, String especie, String raza) {
        super(nombre, edad, especie);
        this.raza = raza;
    }

    // Métodos
    public void ladrar() {
        System.out.println("El perro está ladrando.");
    }

    public void moverCola() {
        System.out.println("El perro está moviendo la cola.");
    }
}

// Clase Gato
class Gato extends Animal {
    // Atributos
    private boolean peloLargo;

    // Constructor
    public Gato(String nombre, int edad, String especie, boolean peloLargo) {
        super(nombre, edad, especie);
        this.peloLargo = peloLargo;
    }

    // Métodos
    public void maullar() {
        System.out.println("El gato está maullando.");
    }

    public void arañar() {
        System.out.println("El gato está arañando.");
    }
}

package pokemon.view;

public class Pokemon implements Cloneable
{
    private String nombre;
    private String tipo;
    private int nivel;

    /* Constructores */

    public Pokemon() {};
    public Pokemon(String nombre, String tipo, int nivel) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivel = nivel;
    }

    /* Getters */

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getNivel() {
        return nivel;
    }

    /* Setters */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    /* Metodos */

    @Override
    public String toString() {
        return "Nombre: " + nombre + "Tipo: " + tipo + "Nivel " + nivel;
    }

    public void subirNivel() {
        if (nivel + 1 > 100)
        {
            System.out.println("Nivel maximo alcanzado");
            return;
        }
        nivel++;
        System.out.println("Nivel aumentado");
    }

    @Override
    public Object clone() {
        return (Object) new Pokemon(this.getNombre(), this.getTipo(), this.getNivel());
    }

}

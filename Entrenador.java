package pokemon.view;

import java.util.*;

public class Entrenador {
    private String nombre;
    private String id;
    private String[] pokemonesActivos;
    private ArrayList<Pokemon> pokemonesCapturados;

    /* Constructores */

    public Entrenador(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        pokemonesActivos = new String[10];
        pokemonesCapturados = new ArrayList<>();
    }

    /* Getters */

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public String[] getPokemonesActivos() {
        return pokemonesActivos;
    }

    public ArrayList<Pokemon> getPokemonesCapturados() {
        return pokemonesCapturados;
    }

    /* Setters */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPokemonesActivos(String[] pokemonesActivos) {
        this.pokemonesActivos = pokemonesActivos;
    }

    public void setPokemonesCapturados(ArrayList<Pokemon> pokemonesCapturados) {
        this.pokemonesCapturados = pokemonesCapturados;
    }

    /* Metodos */

    public void mostrarPokemonesActivos() {
        for (Pokemon pokemon : pokemonesActivos){
            System.out.println(pokemon.toString());
        }
    }

    public void mostrarPokemonesCapturados() {
        for (Pokemon pokemon : pokemonesCapturados){
            System.out.println(pokemon.toString());
        }
    }

    public void agregarPokemonCapturado(Pokemon pokemon) {
        Pokemon aux = (Pokemon) pokemon.clone();

        aux.setNivel((int)(Math.random()*(100-0+1)+0));
        pokemonesCapturados.add(aux);
    }

    public void agregarPokemonActivo(int indice, Pokemon pokemon) {
        for (Pokemon aux : pokemonesCapturados) {
            if (((Object) aux.hashCode()) == ((Object) pokemon.hashCode())) {
                pokemonesActivos[indice] = aux;
                System.out.println("Modificaciones realizadas con éxito");
                return;
            }
        }
    }
}


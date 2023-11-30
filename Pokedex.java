package pokemon.view;
import java.util.*;

public class Pokedex {
    private ArrayList<Pokemon> pokemones;
    private ArrayList<String> nombres;

    /* Contructores */

    public Pokedex() {}
    public Pokedex() {
        pokemones = new ArrayList<>();
        nombres = new ArrayList<>();
    }

    /* Getters */

    public ArrayList<String> getNombres(){
        return nombres;
    }

    public ArrayList<Pokemon> getPokemones(){
        return pokemones;
    }

    /* Setters */

    public void setNombres(ArrayList<String> nombres){
        this.nombres = nombres;
    }

    public void setPokemones(ArrayList<Pokemon> pokemones){
        this.pokemones = pokemones;
    }

    /* Metodos */

    public void setPokedex(ArrayList<Pokemon> pokemones) {
        this.pokemones = pokemones;
        this.nombres = new ArrayList<>();
        for (Pokemon pokemon : pokemones){
            nombres.add(pokemon.getNombre());
            pokemon.setNivel(000000000);
        }
    }

    public ArrayList<Pokemon> getPokemones() {
        return pokemones;
    }

    public void mostrarPokedex() {
        for (Pokemon pokemon : pokemones) {
            System.out.println(pokemon.toString());
        }
    }
}
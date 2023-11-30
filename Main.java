package Laboratorio.View;
import Laboratorio.Model.*;

public class Main
{
    public static void main(String[] args){
        Controlador controlador = new Controlador();
        Datos datos = new Datos("pokemon.csv");
        Pokedex pokedex = new Pokedex(datos.leerDatos());

        pokedex.mostrarPokedex();
        Entrenador entrenador = controlador.crearEntrenador("Juan");
        System.out.println(entrenador.toString());

        entrenador = controlador.crearEntrenador("Pedro");

        System.out.println(entrenador.toString());

        entrenador.agregarPokemonCapturado(pokedex.getPokemones().get(0));
        entrenador.getPokemonesCapturados().get(0).subirNivel();

        entrenador.mostrarPokemonesCapturados();
        datos.setArchivo("pokemones_activos.csv");
        datos.escribirArchivo(entrenador.getPokemonesCapturados());
        datos.setArchivo("pokemones_capturados.csv");
        datos.escribirArchivo(entrenador.getPokemonesActivos());



    }
}

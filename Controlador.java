package pokemon.view;

import java.util.*;

public class Controlador{
    private ArrayList<String> id;
    private ArrayList<Entrenador> entrenadores;

    /* Constructores */

    public Controlador() {
        this.id = new ArrayList<String>();
        id.add("Vacio");

        entrenadores.add(null);
        this.entrenadores = new ArrayList<>();
    }

    /* Metodos */
    public Entrenador crearEntrenador(String nombre) {
        for (int i = 0; i < id.size(); i++){
            if (id.get(i).equals("Vacio")){
                id.set(i,String.valueOf(i));
                Entrenador entrenador = new Entrenador(nombre,id.get(i));
                entrenadores.set(i,entrenador);

                return entrenador;
            }
        }
    }
}

package pokemon.model;

import java.io.*;
import java.util.*;

class Datos {
    String archivo;

    public Datos(String archivo) {
        this.archivo = archivo;
    }
    public ArrayList<Pokemon> leerDatos() {
        ArrayList<Pokemon> listaPokemon = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            String linea;
            Pokemon aux = new Pokemon();

            while((linea = br.readLine())!=null){
                String[]pokemon = linea.split(",");
                aux.setNombre(pokemon[0]);
                aux.setTipo(pokemon[1]);
                aux.setNivel(Integer.valueOf(pokemon[2]));
                listaPokemon.add(aux);
            }
            br.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return listaPokemon;
    }
    
}

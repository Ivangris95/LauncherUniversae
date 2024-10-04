
package launcheruniversae;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;



public class universaeApp {
    private JsonArray grados;
    
    public universaeApp() {
        leerJson();
    }
    
    //Este código carga un archivo JSON llamado "info.json" desde los recursos del proyecto y analiza su contenido utilizando la biblioteca Gson.
    private void leerJson() {
        try {
            InputStream archivo = getClass().getResourceAsStream("info.json");

            if (archivo == null) {
                System.out.println("No se encontro el archivo json");
            }

            BufferedReader reader = new BufferedReader(new InputStreamReader(archivo));
            Gson gson = new Gson();
           ;
            

            JsonObject jsonObject = gson.fromJson(reader, JsonObject.class);

            grados = jsonObject.getAsJsonArray("grados");

            if (grados == null) {
                System.out.println("El archivo no encuentra grados");
            } else {
                System.out.println(grados);
            }

            reader.close();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
    
    //Esta función obtiene el título de una simulación específica a partir de un arreglo de objetos JSON.
    public String getTituloSimulacion(int indexGrado, int indexSimulador) {
        return grados.get(indexGrado).getAsJsonObject().getAsJsonArray("simuladores").get(indexSimulador).getAsJsonObject().get("titulo").getAsString();
       
    }
    
    //Esta función obtiene la descripción de una simulación específica a partir de un arreglo de objetos JSON.
    public String getDescripcionSimulacion(int indexGrado, int indexSimulador) {
        return grados.get(indexGrado).getAsJsonObject().getAsJsonArray("simuladores").get(indexSimulador).getAsJsonObject().get("descripcion").getAsString();
    }
    
    //Esta función obtiene el nombre de un grado específico a partir de un arreglo de objetos JSON.
    public String getNombreGrado(int indexGrado) {
        return grados.get(indexGrado).getAsJsonObject().get("nombre").getAsString();
    }

    //Esta función obtiene las ruta de las imágenes de una simulación específica a partir de un arreglo de objetos JSON.
    public String getImgSimulador(int indexGrado, int indexSimulador) {
        return grados.get(indexGrado).getAsJsonObject().getAsJsonArray("simuladores").get(indexSimulador).getAsJsonObject().get("imgSimulacion").getAsString();
    }  
   
    //Esta función obtiene la ruta de una imágen de un grado específico.
    public String getImgGrado(int indexGrado, int indexSimulador) {
        return grados.get(indexGrado).getAsJsonObject().getAsJsonArray("simuladores").get(indexSimulador).getAsJsonObject().get("imgGrado").getAsString();
    }  
}

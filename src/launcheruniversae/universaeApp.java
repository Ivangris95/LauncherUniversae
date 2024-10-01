
package launcheruniversae;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.awt.List;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;



public class universaeApp {
    private JsonArray grados;
    
    private int gradosIndex = 0;
   
    
    public universaeApp() {
        leerJson();
    }
    
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
    
    public String getTituloGrado() {
        return grados.get(gradosIndex).getAsJsonObject().get("contenido").getAsJsonObject().get("titulo").getAsString();
       
    }
    
    public String getDescripcionGrado() {
        return grados.get(gradosIndex).getAsJsonObject().get("contenido").getAsJsonObject().get("descripcion").getAsString();
    }
    
    public String getNombreGrado() {
        return grados.get(gradosIndex).getAsJsonObject().get("contenido").getAsJsonObject().get("grado").getAsString();
    }
    
    public String getAsignaturaGrado() {
        return grados.get(gradosIndex).getAsJsonObject().get("contenido").getAsJsonObject().get("asignatura").getAsString();
    }
    
    public String getUnidadGrado() {
        return grados.get(gradosIndex).getAsJsonObject().get("contenido").getAsJsonObject().get("unidad").getAsString();
    }
    
    public ArrayList<String> getImgGrado() {
        ArrayList<String> urls = new ArrayList<>();
        
        for (int i=0; i< 5; i++) {
            String url = grados.get(gradosIndex).getAsJsonObject().get("contenido").getAsJsonObject().getAsJsonArray("img").get(i).getAsJsonObject().get("urlImg").getAsString();
            urls.add(url);
        }
        
        return urls;
    }
    
   
}

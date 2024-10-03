
package launcheruniversae;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;




public class universaeApp {
    private JsonArray grados;
    
    private int gradosIndex = 0;
    private int simuladoresIndex = 0;
   
    
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
    
    public String getTituloSimulacion() {
        return grados.get(gradosIndex).getAsJsonObject().getAsJsonArray("simuladores").get(simuladoresIndex).getAsJsonObject().get("titulo").getAsString();
       
    }
    
    public String getDescripcionSimulacion() {
        return grados.get(gradosIndex).getAsJsonObject().getAsJsonArray("simuladores").get(simuladoresIndex).getAsJsonObject().get("descripcion").getAsString();
    }
    
    public String getNombreGrado() {
        return grados.get(gradosIndex).getAsJsonObject().get("nombre").getAsString();
    }

    
    public String getImgSimulador() {
        return grados.get(gradosIndex).getAsJsonObject().getAsJsonArray("simuladores").get(simuladoresIndex).getAsJsonObject().get("img").getAsString();
    }
    
   
   
}

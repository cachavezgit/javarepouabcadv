package mx.uabc.cursojava.db;

import com.mongodb.MongoTimeoutException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import static com.mongodb.client.model.Filters.eq;

public class MongoDBExample {
    public static void main(String[] args) {
        String url = "mongodb://localhost:27017";

        try {
            MongoClient mongoClient= MongoClients.create(url);
            MongoDatabase db = mongoClient.getDatabase("almacen");
            MongoCollection productos = db.getCollection("products");

            Document producto = (Document) productos.find(eq("name", "Gato")).first();
            System.out.println(producto.toJson());
        }
        catch(MongoTimeoutException ex) {
            ex.printStackTrace();
        }
        catch(NullPointerException ex) {
            ex.printStackTrace();
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }

    }
}

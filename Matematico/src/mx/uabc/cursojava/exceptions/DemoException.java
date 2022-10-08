package mx.uabc.cursojava.exceptions;

import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

class MiExcepcion extends Throwable {
    MiExcepcion() {

    }

    MiExcepcion(String texto) {
        super(texto);
    }
}

public class DemoException {
    public static void main (String args[]) throws Exception, MiExcepcion {
        Logger logger = Logger.getAnonymousLogger();
        int valor = 3;
        try {
            if (valor <= 3)
                throw new MiExcepcion("Ocurrio un error en tiempo de ejecucion");
            List<String> lines = Files.readAllLines(Paths.get("readme.txt"));
        }
        catch(FileNotFoundException ex) {
            logger.log(Level.SEVERE, "Exception happened", ex);
        }
    }
}

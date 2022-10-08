package mx.uabc.cursojava.streams;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProcesaArchivoStreams {
    public static void main (String[] args) throws Exception{
        Set<String> palabras=Files.lines(
                Path.of("C:\\Users\\cachavez\\cursojava\\Matematico\\entrada.txt"))
                .flatMap(linea -> Stream.of(linea.split(" ")))
                .collect(Collectors.toSet())
                .stream().sorted().collect(Collectors.toSet());

        String pathString = System.getProperty("user.home") + "/javaTemp/palabras.txt";
        Files.write(Path.of(pathString),palabras, Charset.defaultCharset(), StandardOpenOption.CREATE);

    }
}

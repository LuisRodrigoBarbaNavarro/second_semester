package admin; 

/* Programa hecho en Java que permite transformar un documento de texto común a binario */
  
// Importación de las clases E/S
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
  
// Clase
class Project {

    // Método principal
    public static void main(String[] args) {
  
        // Bloque de código Try para gestionar excepciones
        try {
  
            /* Se crea un objeto FileReader y un archivo para leer
            y se pasa como en los parámetros del directorio local de la
            computadora, si no se encuentra ningún archivo, mandará una
            IOException */

            FileReader fileReader = new FileReader("input.txt");
     
  
            /* Se crea un objeto de tipo FileWriter, donde se copiará
            la información pero en lenguaje binario */
    
            FileWriter fileWriter = new FileWriter("output.txt");

            // Variable donde el contenido será almacenado temporalmente
            String outputString = "";
  
            int index;

            /* Mientras la función read() siga encontrando caracteres,
            no parará */

            while ((index = fileReader.read()) != -1) {
  
                // Se almacena cada caracter en la variable
                outputString += "0" + Integer.toBinaryString((char) index) + " ";
            }
  
            // Se imprime lo que se almacenará en el archivo de salida
            System.out.println(outputString);
  
            // Se escribe la traducción en el archivo de salida
            fileWriter.write(outputString);
  
            /* Es importante terminar con los procesos de los objetos
            para evitar errores futuros */

            fileReader.close();
            fileWriter.close();
  
            /* Se muestra mensaje de finalización */
            
            System.out.println(
                "Lectura y escritura de archivos completadas");
        }
  
        /* Bloque catch que tratará la excepción en caso de que se
        presente un error */

        catch (IOException e) {
  
            /* Si no hay ningún archivo en la ruta especificada o se
            produjo algún otro error durante el tiempo de ejecución, se
            imprimirá la excepción */
  
            // Mensaje de error
            e.printStackTrace();
        }
    }
}


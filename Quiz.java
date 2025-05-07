import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        //Escribe un programa que sea un pequeño juego trivial de acertar preguntas
        //Cada pregunta tendrá 4 opciones que el usuario podrá escoger
        //Por cada respuesta correcta, añade 5 puntos al puntaje
        //Al finalizar el juego imprime cual fue tu puntaje /20
        //Si el puntaje es 15 o más, imprime: Tú si que sabes mucho
        //Si el puntaje es menor de 15 pero mayor o igual a 5, imprime: No lo has hecho mal
        //De lo contrario imprime: Buena suerte la próxima vez
        //Las opciones a, b, c y d de cada pregunta, deberán dejar en terminal un espacio de sangría, averigua como hacerlo en java

        Scanner trivia = new Scanner(System.in);
        System.out.println("¡Bienvenide al desafio de trivia!");
        System.out.println("Empecemos con las preguntas...");

        String systemFirstAnswer = "b";
        String systemSecondAnswer = "c";
        String systemThirdOptionB = "b";
        String systemThirdOptionD = "d";
        String systemFourthAnswer = "a";
        int score = 0;

        //Preguntas:
        System.out.println("1. ¿Quién fue la hacker que escribió en 1994 Hacking the Wetware?");
        System.out.println("\t a. Ada Lovelace");
        System.out.println("\t b. Jude Milhon");
        System.out.println("\t c. Martha Ackelsberg");
        System.out.println("\t d. Jane Jacobs");


        System.out.print("Escribe al lado de esta línea tu respuesta: ");
        String inputFirstAnswer = trivia.nextLine();
        System.out.println();

        if (inputFirstAnswer.equalsIgnoreCase(systemFirstAnswer)) {
            score += 5;
        }

        System.out.println("2. ¿Quién es Fuencisla Clemares?");
        System.out.println("\t a. La directora general de IBM Europa, Oriente Medio y África");
        System.out.println("\t b. La vicepresidenta de Microsoft Western Europe");
        System.out.println("\t c. La directora general de Google en España y Portugal");
        System.out.println("\t d. Fundadora y CEO de Marsi Bionics");

        System.out.print("Escribe al lado de esta línea tu respuesta (solo la letra): ");
        String inputSecondAnswer = trivia.nextLine();
        System.out.println();

        if (inputSecondAnswer.equalsIgnoreCase(systemSecondAnswer)) {
            score += 5;
        }

        System.out.println("3. ¿Quién fue Hedwig Eva Maria Kiesler, conocida como Hedy Lamarr?");
        System.out.println("\t a. Primera programadora de software");
        System.out.println("\t b. Una actriz de cine");
        System.out.println("\t c. Inventora del procesador de datos");
        System.out.println("\t d. Inventora del sistema de comunicaciones de salto de frecuencia, base del wifi, bluetooth y GPS");

        System.out.print("Escribe al lado de esta línea tu respuesta: ");
        String inputThirdAnswer = trivia.nextLine();
        System.out.println();

        if (inputThirdAnswer.equalsIgnoreCase(systemThirdOptionB) || inputThirdAnswer.equalsIgnoreCase(systemThirdOptionD)) {
            score += 5;
        }

        System.out.println("4. ¿Cómo se llamaban las principales 'mujeres ocultas' de la NASA, encargadas de los cálculos para que la misión del Apolo 11 concluyera con éxito?");
        System.out.println("\t a. Katherine Johnson, Dorothy Vaughan y Mary Jackson");
        System.out.println("\t b. Jessica Miller, Emily Johnson, Sarah Davis");
        System.out.println("\t c. bell hooks, Toni Morrison y Alice Walker");
        System.out.println("\t d. Emmeline Pankhurst, Millicent Fawcett y Harriet Harman");

        System.out.print("Escribe al lado de esta línea tu respuesta: ");
        String inputFourthAnswer = trivia.nextLine();
        System.out.println();

        if (inputFourthAnswer.equalsIgnoreCase(systemFourthAnswer)) {
            score += 5;
        }

        System.out.println("Has contestado todas las preguntas\ntu puntaje es " + score + "/20");

        if (score >= 15) {
            System.out.println("Tú si que sabes mucho");
        } else if (score >= 5) {
            System.out.println("No lo has hecho mal");
        } else {
            System.out.println("Buenas suerte la próxima vez");
        }

        trivia.close();

        //Respuestas: 1. b / 2. c / 3. b y d / 4. a

    }
    
}
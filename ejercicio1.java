import java.util.*;

public class ejercicio1 {

    public static void main(String[] args) {

        System.out.println("Selecciona una opción:");
        System.out.println("");
        System.out.println("1. Leer 5 números y almacenar en un array");
        System.out.println("");
        System.out.println("2. Leer 5 números y mostrarlos en orden inverso");
        System.out.println("");
        System.out.println(
                "3. Leer 5 números,realizar la media de los números positivos, la media de los negativos y contar el número de ceros que se han introducido por teclado.");
        System.out.println("");
        System.out.println(
                "4. Reciba como parámetro un texto y devuelva la cantidad de caracteres que incorpora el texto.");
        System.out.println("");
        System.out.println("5. Reciba como parámetro un texto y devuelva el texto invertido.");
        System.out.println("");
        System.out.println("6. Reciba como parámetro un texto y lo devuelva sin espacios en blanco.");
        System.out.println("");
        System.out.println("7. Reciba como parámetro dos cadenas y las devuelva concatenadas.");
        System.out.println("");
        System.out.println("8. Sustituir las vocales de la frase por la vocal que se introduzca.");
        System.out.println("");
        System.out.println("9. Muestre el código ASCII de cada uno de los caracteres de la cadena");
        System.out.println("");
        System.out.println("0. Salir");

        Scanner scan = new Scanner(System.in);
        System.out.print("Opción = ");
        int opcion = scan.nextInt();

        switch (opcion) {
            case 1:
                mismoOrdenIntroducido();
                break;
            case 2:
                ordenInverso();
                break;

            case 3:
                mediaPos_Neg_y_ceros();
                break;
            case 4:
                Scanner scanner_cantidad = new Scanner(System.in);
                System.out.println("introduzca una frase cualquiera");
                String introducir_frase = scanner_cantidad.nextLine();
                System.out.println(cantidadCaracteres(introducir_frase));

                break;
            case 5:
                Scanner scan_frase = new Scanner(System.in);
                System.out.println("Pon una frase");
                String pedir_frase = scan_frase.nextLine();
                textoInvertido(pedir_frase);
                break;
            case 6:
                Scanner scanner_6 = new Scanner(System.in);
                System.out.println("Ingresa una frase: ");
                String frase_con_espacios = scanner_6.nextLine();
                sinEspacios(frase_con_espacios);
                break;

            case 7:
                Scanner sc = new Scanner(System.in);
                System.out.println("Introduce una frase");
                String frase1 = sc.nextLine();
                Scanner sc2 = new Scanner(System.in);
                String frase2 = sc2.nextLine();
                System.out.println(concatenados(frase1, frase2));
                break;
            case 8:
                System.out.print("Vocal = ");
                String vocal = scan.next();
                System.out.print("Frase = ");
                String frase_acabada = scan.next();
                sustituirVocal(frase_acabada, vocal);
                break;

            case 9:
                Scanner scanner_ascii = new Scanner(System.in);
                System.out.println("introduczca una frase");
                String cadena = scanner_ascii.nextLine();
                mostrarCodigoASCII(cadena);

            case 0:
                System.out.println("Hasta luego");
                break;

        }
    }

    public static void mismoOrdenIntroducido() {
        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[5];
        System.out.println("Introduce 5 números:");
        for (int i = 0; i < 5; i++) {
            numeros[i] = scan.nextInt();
        }
        System.out.println("Números introducidos:");
        for (int i = 0; i < 5; i++) {
            System.out.println(numeros[i]);
        }

    }

    public static void ordenInverso() {
        Scanner scan = new Scanner(System.in);
        int[] numeros2 = new int[5];
        System.out.println("Introduce 5 números:");
        for (int i = 0; i < 5; i++) {

            numeros2[i] = scan.nextInt();
        }
        System.out.println("Números introducidos con orden inverso:");
        for (int i = 4; i >= 0; i--) { /* PREGUNTAR! */
            System.out.println(numeros2[i]);
        }
    }

    public static void mediaPos_Neg_y_ceros() {
        Scanner scan = new Scanner(System.in);
        int contador_positivos = 0;
        int contador_negativos = 0;
        float suma_positivos = 0;
        float suma_negativos = 0;
        int contador_cero = 0;

        System.out.println("Introduce 5 numeros");

        for (int i = 0; i < 5; i++) {
            int num = scan.nextInt();
            if (num > 0) {
                suma_positivos = suma_positivos + num;
                contador_positivos++;
            } else if (num < 0) {
                suma_negativos = suma_negativos + num;
                contador_negativos++;

            } else {
                contador_cero++;

            }
        }
        float media_positivos = suma_positivos / contador_positivos;
        float media_negativos = suma_negativos / contador_negativos;
        System.out.println("La media aritmetica de positivos es: " + media_positivos);
        System.out.println("La media aritmetica de negativos es: " + media_negativos);
        System.out.println("Se han introducido " + contador_cero + " ceros");

    }

    public static int cantidadCaracteres(String frase) {
        String introducir_frase = frase;
        return introducir_frase.length();

    }

    public static String textoInvertido(String frase) {
        String cadena = frase;
        String cadena_invertida = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadena_invertida += cadena.charAt(i);
        }
        System.out.println(cadena_invertida);
        return cadena_invertida;
    }

    public static String sinEspacios(String Frase) {
        String frase = Frase;
        String frase_sin_espacios = frase.replace(" ", "");
        System.out.println(frase_sin_espacios);
        return frase_sin_espacios;

    }

    public static String concatenados(String a, String b) {

        return (a + b);

    }

    public static void sustituirVocal(String frase_acabada, String vocal) {
        frase_acabada = frase_acabada.replaceAll("[aeiouAEIOU]", vocal);
        System.out.println(frase_acabada);
    }

    public static void mostrarCodigoASCII(String cadena) {
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            int codigo = (int) c; // Convertir el caracter en su valor ASCII (Descubrí mirando por algunos foros
                                  // que pasando de char a C se consigue el codigo ASCII)
            System.out.println("El código ASCII de '" + c + "' es: " + codigo);
        }
    }

}

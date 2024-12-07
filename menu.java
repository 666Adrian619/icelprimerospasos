import java.util.Scanner; // Importar la clase Scanner para leer entrada del usuario

public class CalculadoraYConvertidor { // Definir la clase principal CalculadoraYConvertidor
    
    public static void main(String[] args) { // Definir el método principal main
        Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner para leer la entrada del usuario
        
        while (true) { // Iniciar un bucle infinito
            // Mostrar menú principal
            System.out.println("Selecciona una opción: ");
            System.out.println("1. Calculadora");
            System.out.println("2. Convertidor de Unidades");
            System.out.println("3. Salir");
            System.out.print("Opción:  ");
            int opcion = scanner.nextInt(); // Leer la opción seleccionada por el usuario
            
            if (opcion == 1) { // Si la opción es 1
                // Llamar a la función de la calculadora
                calculadora(scanner);
            } else if (opcion == 2) { // Si la opción es 2
                // Llamar a la función de conversión de unidades
                convertidorDeUnidades(scanner);
            } else if (opcion == 3) { // Si la opción es 3
                // Salir del programa
                System.out.println("Saliendo...");
                break;
            } else {
                System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        }
        
        scanner.close(); // Cerrar el objeto Scanner
    }
    
    // Función de la calculadora
    public static void calculadora(Scanner scanner) {
        System.out.println("Selecciona una operación: ");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. División con residuo");
        System.out.print("Opción:  ");
        int operacion = scanner.nextInt(); // Leer la operación seleccionada por el usuario
        
        System.out.print("Introduce el primer número:  ");
        double num1 = scanner.nextDouble(); // Leer el primer número
        
        System.out.print("Introduce el segundo número:  ");
        double num2 = scanner.nextDouble(); // Leer el segundo número
        
        switch (operacion) { // Iniciar un switch para la operación seleccionada
            case 1: 
                System.out.println("Resultado:  " + (num1 + num2)); // Imprimir el resultado de la suma
                break;
            case 2: 
                System.out.println("Resultado:  " + (num1 - num2)); // Imprimir el resultado de la resta
                break;
            case 3: 
                System.out.println("Resultado:  " + (num1 * num2)); // Imprimir el resultado de la multiplicación
                break;
            case 4: 
                if (num2 != 0) { // Si el segundo número no es cero
                    System.out.println("Resultado:  " + (num1 / num2)); // Imprimir el resultado de la división
                } else {
                    System.out.println("Error:  No se puede dividir entre cero."); // Imprimir un error si el segundo número es cero
                }
                break;
            case 5: 
                if (num2 != 0) { // Si el segundo número no es cero
                    System.out.println("Cociente:  " + (num1 / num2)); // Imprimir el cociente de la división
                    System.out.println("Residuo:  " + (num1 % num2)); // Imprimir el residuo de la división
                } else {
                    System.out.println("Error:  No se puede dividir entre cero."); // Imprimir un error si el segundo número es cero
                }
                break;
            default: 
                System.out.println("Opción no válida."); // Imprimir un error si la opción no es válida
        }
    }

    // Función del convertidor de unidades
    public static void convertidorDeUnidades(Scanner scanner) {
        System.out.println("Selecciona la categoría de conversión: ");
        System.out.println("1. Longitud");
        System.out.println("2. Masa");
        System.out.println("3. Velocidad");
        System.out.print("Opción:  ");
        int categoria = scanner.nextInt(); // Leer la categoría seleccionada por el usuario
        
        if (categoria == 1) {
            longitud(scanner);
        } else if (categoria == 2) {
            masa(scanner);
        } else if (categoria == 3) {
            velocidad(scanner);
        } else {
            System.out.println("Opción no válida.");
        }
    }

    // Conversión de Longitud
    public static void longitud(Scanner scanner) {
        System.out.println("Selecciona la conversión de Longitud: ");
        System.out.println("1. Metros a centímetros");
        System.out.println("2. Metros a pulgadas");
        System.out.print("Opción:  ");
        int opcion = scanner.nextInt(); // Leer la opción de conversión de longitud seleccionada por el usuario
        
        System.out.print("Introduce el valor en metros:  ");
        double metros = scanner.nextDouble(); // Leer el valor en metros
        
        if (opcion == 1) {
            System.out.println(metros + " metros son " + (metros * 100) + " centímetros."); // Imprimir el resultado de la conversión de metros a centímetros
        } else if (opcion == 2) {
            System.out.println(metros + " metros son " + (metros * 39.3701) + " pulgadas."); // Imprimir el resultado de la conversión de metros a pulgadas
        } else {
            System.out.println("Opción no válida."); // Imprimir un error si la opción no es válida
        }
    }

    // Conversión de Masa
    public static void masa(Scanner scanner) {
        System.out.println("Selecciona la conversión de Masa: ");
        System.out.println("1. Kilogramos a libras");
        System.out.println("2. Kilogramos a gramos");
        System.out.print("Opción:  ");
        int opcion = scanner.nextInt(); // Leer la opción de conversión de masa seleccionada por el usuario
        
        System.out.print("Introduce el valor en kilogramos:  ");
        double kg = scanner.nextDouble(); // Leer el valor en kilogramos
        
        if (opcion == 1) {
            System.out.println(kg + " kilogramos son " + (kg * 2.20462) + " libras."); // Imprimir el resultado de la conversión de kilogramos a libras
        } else if (opcion == 2) {
            System.out.println(kg + " kilogramos son " + (kg * 1000) + " gramos."); // Imprimir el resultado de la conversión de kilogramos a gramos
        } else {
            System.out.println("Opción no válida."); // Imprimir un error si la opción no es válida
        }
    }

    // Conversión de Velocidad
    public static void velocidad(Scanner scanner) {
        System.out.println("Selecciona la conversión de Velocidad: ");
        System.out.println("1. Metros/segundo a kilómetros/hora");
        System.out.print("Opción:  ");
        int opcion = scanner.nextInt(); // Leer la opción de conversión de velocidad seleccionada por el usuario
        
        System.out.print("Introduce el valor en metros/segundo:  ");
        double metrosPorSegundo = scanner.nextDouble(); // Leer el valor en metros/segundo
        
        if (opcion == 1) {
            System.out.println(metrosPorSegundo + " metros/segundo son " + (metrosPorSegundo * 3.6) + " kilómetros/hora."); // Imprimir el resultado de la conversión de metros/segundo a kilómetros/hora
        } else {
            System.out.println("Opción no válida."); // Imprimir un error si la opción no es válida
        }
    }
}

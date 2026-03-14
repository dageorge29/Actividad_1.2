import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        //Instanciación
        Scanner sc = new Scanner(System.in);

        Stack stack = new Stack();
        Stack stack2 = new Stack();

        System.out.println("====== STACKS ====== ");

        //Inicializador de opciones
        int opcion = 0;
        boolean validez = true;
        String opc2;

        //Input de texto

        String textoAEnviar = "";
        do {
            //Menú
            System.out.println("\n===============================");
            System.out.println("BIENVENIDO A MI STACK\n===============================\n");

            System.out.println("\n===============================");
            System.out.println("Ingresa 1 para escribir texto en el Stack\nIngresa 2 para Deshacer texto" +
                    "\nIngresa 3 para rehacer texto\nIngresa 4 mostrar el texto actual\nIngresa 5 para salir de esta aplicación");
            System.out.println("\n===============================");

            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();



            //Opciones de acciones

            switch (opcion) {

                //Escribir texto: Pide
                case 1 -> {
                    System.out.print("\nSeleccionaste escribir texto en el Stack\nIngresa un texto: ");
                    textoAEnviar = sc.nextLine();
                    stack.push(textoAEnviar); //Ingresa el elemento al stack principal
                    stack2.clear(); //Limpia el stack2 de residuos
                }
                //undo texto
                case 2 -> {
                    if (!stack.isEmpty()) {
                        String deshecho = stack.pop();//elimina el ultimo (peek) elemento del stack principal
                        stack2.push(deshecho); //ingreas el elemento eliminado en el stack2 temporal (papelera)
                        System.out.println("Acción deshecha. Eliminaste a " + textoAEnviar);
                    } else {
                        System.out.println("No tienes nada para deshacer");
                    }
                }

                //redo texto
                case 3 -> {
                    if (!stack2.isEmpty()) {
                        String recuperado = stack2.pop();
                        stack.push(recuperado); //saca el último elemento del stack2 temporal y lo regresa al stack principal
                        System.out.println("Acción rehecha\nHabías ingresado: " + recuperado);
                    } else {
                        System.out.println("No tienes nada para deshacer");
                    }
                }

                //mostrar el texto actual
                case 4 -> {
                    System.out.println("Todos los elementos existentes son: " + stack);
                }

                //leave
                case 5 -> {
                    validez = false;
                    System.out.println("Seleccionaste salir del programa");

                }

                //Error de opcion
                default -> {
                    System.out.println("Opción no válida");
                }
            }
        } while (validez == true);
        System.out.println("\nAdiós. Gracias por usar este sistema :D");
        System.out.println("\n===============================");
    }
}

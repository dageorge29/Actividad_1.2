import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        /*
        Incluir las operaciones fundamentales:

        push(), pop(), peek(), isEmpty().

        Implementar el menú en consola con opciones:

        Escribir texto

        Deshacer

        Rehacer

        Mostrar texto actual

        Salir
         */
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
        String input;
        do {
            //Info
            System.out.println("\n===============================");
            System.out.println("BIENVENIDO A MI STACK\n===============================\n");

            System.out.println("\n===============================");
            System.out.println("Ingresa 1 para escribir texto en el Stack\nIngresa 2 para Deshacer texto" +
                    "\nIngresa 3 para rehacer texto\nIngresa 4 mostrar el texto actual\nIngresa 5 para salir de esta aplicación");
            System.out.println("\n===============================");

            System.out.print("Opción: ");
            opcion = sc.nextInt();



            //Opciones de acciones
            switch (opcion) {

                //Escribir texto
                case 1 -> {
                    System.out.print("\nSeleccionaste escribir texto en el Stack\nIngresa un texto: ");
                    input = sc.nextLine();
                    stack.push(sc.nextLine());
                }

                //Deshacer texto
                case 2 -> {

                }

                //Rehacer texto
                case 3 -> {

                }

                case 4 -> {
                    for (int i = 0; i < stack.size(); i++) {
                        System.out.println(i);
                    }
                }

                case 5 -> {

                    validez = false;
                    System.out.println("Seleccionaste salir del programa");
                    System.out.println("\nAdiós. Gracias por usar este sistema :D");
                    System.out.println("\n===============================");
                }
            }
        } while (validez == true);
    }
}

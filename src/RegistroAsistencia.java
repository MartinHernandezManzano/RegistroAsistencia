/*
* Programa que alamacena nombre, apellidos y mail
* Funcionalidades:
* -Registrar asistentes
* -Buscar asistente por mail
* -Mostrar numero de asistentes
* -Mostrar listado completo de asistentes (emails)
* */
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RegistroAsistencia {
    public static void main(String[] args) {
        //declaramos los elementos necesario
        Scanner sc = new Scanner(System.in);
        Set<Asistente> asistentes = new HashSet<Asistente>();

        boolean salir = false;

        //empezamos con los bucles de flujo del programa
        while (!salir) {
            System.out.println("---Introduce una opción---");
            System.out.println("1. Registrar un asistente nuevo");
            System.out.println("2. Buscar asistente por mail");
            System.out.println("3. Mostrar numero de asistentes");
            System.out.println("4. Mostrar listado de asistentes");
            System.out.println("5. Salir");
            int opcion = sc.nextInt();
            sc.nextLine();
        switch (opcion) {
            case 1:
                //codigo para añadir asistentes
                System.out.println("Introduce los datos del asistente");
                System.out.println("Introduce el nombre del asistente");
                String nombre = sc.nextLine();
                System.out.println("Introduce el apellido del asistente");
                String apellido = sc.nextLine();
                System.out.println("Introduce el mail de asistente");
                String mail = sc.nextLine();
                Asistente a = new Asistente(nombre, apellido, mail);
                asistentes.add(a);
                break;
            case 2:
                //buscar asistente por mail
                System.out.println("Introduce el mail del asistente");
                mail = sc.nextLine();
                for(Asistente a1 : asistentes) {
                    if(a1.getMail().equals(mail)) {
                        System.out.println("El asistente se ha encontrado");
                    }else {
                        System.out.println("El asistente no se ha encontrado");
                    }
                }
                break;
            case 3:
                //mostrar numero de asistentes
                System.out.println(asistentes.size());
                break;
            case 4:
                //mostrar el mail de los asistentes
                for (Asistente a1 : asistentes) {
                    System.out.println(a1.getMail());
                }
                break;
            case 5:
                salir = true;
                System.out.println("chao");
                break;
        }
    }sc.close();
    }
}


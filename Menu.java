/*una banco requiere un sistema que le permita registrar, actualizar,vender  y  eliminar créditos de los usuarios 
por los cuales requiere que el departamento de ti el apoye con este tema
para vender créditos se deben tener en cuenta lo siguiente:
1)	que el usuario ya este registrado en caso que No. que no muestre la opción de registrar, sino que muestre la opción del ingreso de registros es decir un enlace directo
2)	al vender o solicitar crédito se debe validar el tipo de crédito si no son iguales debe hacerse otro crédito diferente*/ 
import java.util.Scanner;
import java.util.Stack;

public class Menu {
    public void menu() {
        Utils u = new Utils();
        boolean bandera = true;
        Stack<Usuario> userStack = new Stack<>();
        Scanner sc = new Scanner(System.in);

        while (bandera) {
            System.out.println("¿Ya está registrado? (S/N)");
            String val = sc.next();

            if (val.equalsIgnoreCase("S")) {
                System.out.println("Validemos su registro...");
                if (u.Verificar(userStack)) {
                    System.out.println("Usuario verificado. ¿Qué desea hacer?");
                    System.out.println("1. Vender crédito");
                    System.out.println("2. actualizar");
                    System.out.println("3. eliminar");
                    int opcion = sc.nextInt();

                    switch (opcion) {
                        case 1:
                            System.out.println("vender credito seleccionado");
                            u.vender(userStack);
                            // Lógica para solicitar crédito
                            break;
                        case 2:
                            System.out.println("Actualizar credito");
                            // Lógica para vender crédito
                            u.Modificar(userStack);
                            break;
                        case 3:
                            System.out.println("eliminar");
                            u.Eliminar(userStack);
                            break;
                        default:
                            System.out.println("Opción no válida.");
                    }
                } else {
                    System.out.println("Usuario no encontrado. Por favor, regístrese.");
                }
            } else if (val.equalsIgnoreCase("N")) {
                System.out.println("Redirigiendo al registro de usuario...");
                // Lógica para registrar un nuevo usuario

                userStack = u.RegistrarUsuario(userStack);
                System.out.println("Usuario registrado exitosamente.");
            } else {
                System.out.println("Entrada no válida. Por favor, intente de nuevo.");
            }
        }

        sc.close();
    }
}

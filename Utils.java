import java.util.Scanner;
import java.util.Stack;
public class Utils {
        Scanner sc = new Scanner(System.in);
    
        // Method to verify if a user exists in the stack
        public boolean Verificar(Stack<Usuario> pila) {
            boolean banderaaux = false;
            System.out.println("Ingrese el nombre:");
            String nombreAux = sc.next();
            System.out.println("Ingrese el apellido:");
            String apellidoAux = sc.next();
    
            for (Usuario o : pila) {
                if (o.getNombre().equalsIgnoreCase(nombreAux) && o.getApellido().equalsIgnoreCase(apellidoAux)) {
                    banderaaux = true;
                    break;
                }
            }
    
            return banderaaux;
        }
    
        // Method to register a new user
        public Stack<Usuario> RegistrarUsuario(Stack<Usuario> pila) {
            boolean opt = true;
            while(opt) {
            Usuario o = new Usuario();
            System.out.println("Ingrese el nombre del usuario:");
            String nombre = sc.next();
            o.setNombre(nombre);
            System.out.println("Ingrese el apellido del usuario:");
            String apellido = sc.next();
            o.setApellido(apellido);
            System.out.println("Ingrese el monto:");
            int monto = sc.nextInt();
            o.setCantidadCredito(monto);
            System.out.println("Ingrese el tipo de crédito del usuario:");
            String tipoCredito = sc.next();
            o.setTipoCredito(tipoCredito);
            pila.push(o);

            System.out.println("desea continuar? (S/N)");
            String dec = sc.next();
            if(dec.equalsIgnoreCase("S")){
                opt = true;
            }
            
            if(dec.equalsIgnoreCase("N")){
                opt = false;
            }
            }
            return pila;
        }

    public Stack<Usuario> Eliminar (Stack<Usuario> pila){

        String dato = "";

        System.out.println("ingrese el nombre del usuario que desee eliminar el credito");
        dato = sc.next();

        for (Usuario o : pila)
        {
            if (o.getNombre().equalsIgnoreCase(dato))
            {
                o.setTipoCredito("null");
                o.setCantidadCredito(0);
                System.out.println("registro eliminado");
            }

            else 
            {
                System.out.println("Registro no eliminado");
            }
        }

        return pila;
    }

    public Stack<Usuario> vender (Stack<Usuario> pila){
        Usuario o = new Usuario();
        String dato = "";
        System.out.println("ingrese el nombre del usuario que desee vender el credito");
        dato = sc.next();
  
        for (Usuario p : pila)
        {
            if(o.getCantidadCredito() > 0 || o.getTipoCredito().equalsIgnoreCase("hipotecario") && o.getTipoCredito().equalsIgnoreCase("Consumo") && o.getTipoCredito().equalsIgnoreCase("comercial")){
            if (o.getNombre().equalsIgnoreCase(dato))
            {
                o.setTipoCredito("null");
                o.setCantidadCredito(0);
                System.out.println("Vendido");
            }

            else 
            {
                System.out.println("Rechazado");
            }
        }
    }

        return pila;
    }

    public Stack<Usuario> Modificar (Stack<Usuario> pila){
        Usuario o = new Usuario();
        String nombre;
        System.out.println("Ingrese el nombre del usuario del credito a modificar");
        nombre = sc.next();

        if (o.getNombre().equalsIgnoreCase(nombre)) {
            boolean encontrado = true;

            System.out.println("Usuario encontrado. ¿Qué desea modificar?");
            System.out.println("1. Nombre");
            System.out.println("2. Apellido");
            System.out.println("3. Monto de crédito");
            System.out.println("4. Tipo de crédito");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nuevo nombre:");
                    String nuevoNombre = sc.next();
                    o.setNombre(nuevoNombre);
                    System.out.println("Nombre actualizado.");
                    break;
                case 2:
                    System.out.println("Ingrese el nuevo apellido:");
                    String nuevoApellido = sc.next();
                    o.setApellido(nuevoApellido);
                    System.out.println("Apellido actualizado.");
                    break;
                case 3:
                    System.out.println("Ingrese el nuevo monto de crédito:");
                    int nuevoMonto = sc.nextInt();
                    o.setCantidadCredito(nuevoMonto);
                    System.out.println("Monto de crédito actualizado.");
                    break;
                case 4:
                    System.out.println("Ingrese el nuevo tipo de crédito:");
                    String nuevoTipoCredito = sc.next();
                    o.setTipoCredito(nuevoTipoCredito);
                    System.out.println("Tipo de crédito actualizado.");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }

        }
        return pila;
    }

}
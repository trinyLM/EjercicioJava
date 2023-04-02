import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Agenda {
    private List<Contacto> contactos;
    Scanner scanner;

    public Agenda() {
    
    this.contactos = new ArrayList<>();//inicializa como una lista vacio
    this.scanner= new Scanner(System.in);
    }

    public void agregarContacto(){
        System.out.println("agrege un Empleado");
        System.out.println("agrege el nombre:");
        String nombre=scanner.nextLine();
        System.out.println("agrege el email:");
        String email=scanner.nextLine();
        System.out.println("agrege el numero de telefono:");
        Long numeroTelefono=scanner.nextLong();
        contactos.add(new Contacto(nombre, email, numeroTelefono));
        System.out.println("Contacto añadido");

    }
    public void eliminarContacto(int index){
        contactos.remove(index);
        System.out.println("contacti eliminado");
    }

    
    

    
}

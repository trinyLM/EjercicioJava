public class Contacto {
    private String nombre;
    private String email;
    private Long numeroTelefono;
    

    //contsructor inicializa las propiedades solo cuando se crea un objeto de este tipo
    public Contacto(String nombre, String email, Long numeroTelefono) {
        this.nombre = nombre;
        this.email = email;
        this.numeroTelefono = numeroTelefono;
    }
//


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public Long getNumeroTelefono() {
        return numeroTelefono;
    }


    public void setNumeroTelefono(Long numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }





    

}
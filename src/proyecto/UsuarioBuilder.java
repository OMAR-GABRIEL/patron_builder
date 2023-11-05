
package proyecto;


public class UsuarioBuilder {
    private String nombre;
    private String apellido;
    private String cedula;
    private int edad;
    private String fecha;
    private String departamento;
    private String ciudad;
    private String barrio;
    private String eps;
    private String contrato;
    private String telefono;
    private String email;
    private String nombre_enfermedad;
     private String descripcion;
    public UsuarioBuilder setNombre_enfermedad(String nombre_enfermedad) {
        this.nombre_enfermedad = nombre_enfermedad;
        return this;
    }

    public UsuarioBuilder setDescripcion(String descripcion) {
        this.descripcion = descripcion;
        return this;
    }
   
 

    public UsuarioBuilder setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public UsuarioBuilder setApellido(String apellido) {
        this.apellido = apellido;
    return this;
    }

    public UsuarioBuilder setCedula(String cedula) {
        this.cedula = cedula;
        return this;
    }

    public UsuarioBuilder setEdad(int edad) {
        this.edad = edad;
        return this;
    }

    public UsuarioBuilder setFecha(String fecha) {
        this.fecha = fecha;
           return this;
    }

    public UsuarioBuilder setDepartamento(String departamento) {
        this.departamento = departamento;
           return this;
    }

    public UsuarioBuilder setCiudad(String ciudad) {
        this.ciudad = ciudad;
           return this;
    }

    public UsuarioBuilder setBarrio(String barrio) {
        this.barrio = barrio;
           return this;
    }

    public UsuarioBuilder setEps(String eps) {
        this.eps = eps;
           return this;
    }

    public UsuarioBuilder setContrato(String contrato) {
        this.contrato = contrato;
           return this;
    }

    public UsuarioBuilder setTelefono(String telefono) {
        this.telefono = telefono;
       return this;
    }

    public UsuarioBuilder setEmail(String email) {
        this.email = email;
           return this;
    }
    
    public Usuario build(){
        
        return new Usuario(nombre,apellido,cedula,edad,fecha,departamento,
                ciudad,barrio,eps,contrato,telefono,email,nombre_enfermedad,descripcion);
    
    }
}



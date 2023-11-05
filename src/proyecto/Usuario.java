
package proyecto;


public class Usuario {
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

public Usuario(){}
public Usuario(String nombre,String apellido,String cedula,int edad,String fecha,String departamento,String ciudad,
        String barrio,String eps,String contrato,String telefono,String email, String nombre_enfermedad,String descripcion){
    this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.edad = edad;
        this.fecha = fecha;
        this.departamento = departamento;
        this.ciudad = ciudad;
        this.barrio = barrio;
        this.eps = eps;
        this.contrato = contrato;
        this.telefono = telefono;
        this.email = email;
        this.nombre_enfermedad=nombre_enfermedad;
        this.descripcion=descripcion;


}

    public String getNombre_enfermedad() {
        return nombre_enfermedad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public int getEdad() {
        return edad;
    }

    public String getFecha() {
        return fecha;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getBarrio() {
        return barrio;
    }

    public String getEps() {
        return eps;
    }

    public String getContrato() {
        return contrato;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
        
    }
    public String tosString(){
    return "usuario:"+nombre +",apellido"+apellido+",cedula"+cedula + ",edad"+edad+",fecha"+ fecha+"departamento"+departamento
            +"ciudad"+ciudad+",barrio"+barrio+"Eps"+eps+"contrato"+contrato+"telefono"+telefono+"Email"+email+"nombre_enfermeda"+nombre_enfermedad+"descripcion"+descripcion;
    }
    
}


package Jardineria.ModelClass;

public class cliente {

    public enum DocumentoIdentidad{
        DNI,
        NIE;

    }

    private int codigo_cliente;
    private String nombre_cliente;
    
    private String domicilio;
    private int telefono;
    private double limite_credit;
    private String codigo_empleado_rep_ventas;

    private DocumentoIdentidad tipoDocumento;
    private String DNI;
    private String email;
    private String password;

    public cliente(int codigo_cliente, String nombre_cliente, String email, String password,
            String domicilio, int telefono, double limite_credit, String codigo_empleado_rep_ventas) {
        this.codigo_cliente = codigo_cliente;
        this.nombre_cliente = nombre_cliente;
        
        this.email = email;
        this.password = password;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.limite_credit = limite_credit;
        this.codigo_empleado_rep_ventas = codigo_empleado_rep_ventas;
    }


    //Constructor de la practica3
    public cliente(int codigo_cliente, String nombre_cliente, DocumentoIdentidad tipoDocumento, String dNI,
            String email, String password) { 
        this.codigo_cliente = codigo_cliente;
        this.nombre_cliente = nombre_cliente;
        this.tipoDocumento = tipoDocumento;
        DNI = dNI;
        this.email = email;
        this.password = password;
    }

    public int getCodigo_cliente() {
        return codigo_cliente;
    }

    public void setCodigo_cliente(int codigo_cliente) {
        this.codigo_cliente = codigo_cliente;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public double getLimite_credit() {
        return limite_credit;
    }

    public void setLimite_credit(double limite_credit) {
        this.limite_credit = limite_credit;
    }

    public String getCodigo_empleado_rep_ventas() {
        return codigo_empleado_rep_ventas;
    }

    public void setCodigo_empleado_rep_ventas(String codigo_empleado_rep_ventas) {
        this.codigo_empleado_rep_ventas = codigo_empleado_rep_ventas;
    }

    public DocumentoIdentidad getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(DocumentoIdentidad tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String dNI) {
        DNI = dNI;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "cliente [DNI=" + DNI 
            
        + ", codigo_cliente=" + codigo_cliente 
        + ", codigo_empleado_rep_ventas=" + codigo_empleado_rep_ventas 
        + ", domicilio=" + domicilio 
        + ", email=" + email 
        + ", limite_credit=" + limite_credit 
        + ", nombre_cliente=" + nombre_cliente 
        + ", password=" + password 
        + ", telefono=" + telefono 
        + ", tipoDocumento=" + tipoDocumento + "]";
    }

    

    

    



    
    

    

    

}

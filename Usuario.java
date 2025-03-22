public class Usuario {
    private String nombre;
    private String apellido;
    private String tipoCredito;
    private double CantidadCredito;

//-----------------------------------------------------------

    public Usuario() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipoCredito() {
        return tipoCredito;
    }

    public void setTipoCredito(String tipoCredito) {
        this.tipoCredito = tipoCredito;
    }

    public double getCantidadCredito() {
        return CantidadCredito;
    }

    public void setCantidadCredito(double CantidadCredito) {
        this.CantidadCredito = CantidadCredito;
    }

}

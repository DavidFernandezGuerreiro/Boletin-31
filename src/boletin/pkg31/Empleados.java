
package boletin.pkg31;

/**
 *
 * @author dfernandezguerreiro
 */
public abstract class Empleados {
    
    public String nome;
    public String apelidos;
    public String dni;
    public String direccion;
    public int anosAntiguedade;
    public int telefono;
    public int salario;

    public Empleados() {
    }

    public Empleados(String nome, String apelidos, String dni, String direccion, int anosAntiguedade, int telefono, int salario) {
        this.nome=nome;
        this.apelidos=apelidos;
        this.dni=dni;
        this.direccion=direccion;
        this.anosAntiguedade=anosAntiguedade;
        this.telefono=telefono;
        this.salario=salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome=nome;
    }

    public String getApelidos() {
        return apelidos;
    }

    public void setApelidos(String apelidos) {
        this.apelidos=apelidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni=dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion=direccion;
    }

    public int getAnosAntiguedade() {
        return anosAntiguedade;
    }

    public void setAnosAntiguedade(int anosAntiguedade) {
        this.anosAntiguedade=anosAntiguedade;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono=telefono;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario=salario;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", apelidos: " + apelidos + ", dni: " + dni + ", direccion: " + direccion + ", anosAntiguedade: " + anosAntiguedade + ", telefono: " + telefono + ", salario: " + salario;
    }
    
    
    public void amosar(){
        System.out.println(super.toString());
    }
    
    public void cambiarSupervisor(){
        
    }
    
    public abstract void incrementarSalario();
    
    
}

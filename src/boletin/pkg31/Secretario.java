
package boletin.pkg31;

/**
 *
 * @author dfernandezguerreiro
 */
public class Secretario extends Empleados{

    private String despacho;
    private int numFax;

    public Secretario() {
    }

    public Secretario(String despacho, int numFax, String nome, String apelidos, String dni, String direccion, int anosAntiguedade, int telefono, int salario) {
        super(nome, apelidos, dni, direccion, anosAntiguedade, telefono, salario);
        this.despacho=despacho;
        this.numFax=numFax;
    }

    public String getDespacho() {
        return despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho=despacho;
    }

    public int getNumFax() {
        return numFax;
    }

    public void setNumFax(int numFax) {
        this.numFax=numFax;
    }

    @Override
    public String toString() {
        return super.toString()+", Despacho: " + despacho + ", numFax: " + numFax;
    }
    
    @Override
    public void amosar(){
        System.out.println(super.toString()+", posto na empresa: Secretario");
    }
    
    
    /* INCREMENTA UN 5% */
    @Override
    public void incrementarSalario() {
        int salarioI;
        salarioI=(super.salario*5/100)+super.salario;
        System.out.println(salarioI);
    }
    
}

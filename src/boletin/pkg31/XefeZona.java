
package boletin.pkg31;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author dfernandezguerreiro
 */
public class XefeZona extends Empleados{
    
    private String despacho;
    Secretario obxS=new Secretario("Despacho s1",2,"PepeSecre","Lopez","111A","Urzaiz",2,621141213,1000); //String despacho, int numFax, String nome, String apelidos, String dni, String direccion, int anosAntiguedade, int telefono, int salario
    ArrayList<String>listaVendedores=new ArrayList();
    Coche obxC=new Coche("222","Volkswagen","Passat");

    public XefeZona() {
    }

    public XefeZona(String despacho, String nome, String apelidos, String dni, String direccion, int anosAntiguedade, int telefono, int salario) {
        super(nome, apelidos, dni, direccion, anosAntiguedade, telefono, salario);
        this.despacho=despacho;
    }

    public String getDespacho() {
        return despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho=despacho;
    }

    public Secretario getObxS() {
        return obxS;
    }

    public void setObxS(Secretario obxS) {
        this.obxS=obxS;
    }

    public ArrayList<String> getListaVendedores() {
        return listaVendedores;
    }

    public void setListaVendedores(ArrayList<String> listaVendedores) {
        this.listaVendedores=listaVendedores;
    }

    public Coche getObxC() {
        return obxC;
    }

    public void setObxC(Coche obxC) {
        this.obxC=obxC;
    }

    @Override
    public String toString() {
        return super.toString()+" Despacho: " + despacho + ", obxS: " + obxS + ", listaVendedores: " + listaVendedores + ", Coche: " + obxC;
    }

    @Override
    public void amosar(){
        System.out.println(super.toString()+", posto na empresa: Xefe de zona");
    }

    @Override
    public void incrementarSalario() {
        int salarioI;
        salarioI=(super.salario*5/100)+super.salario;
        System.out.println(salarioI);
    }
    
    public void cambiarSecretario(){
        obxS.setDespacho(despacho);
        obxS.setNumFax(telefono);
        obxS.setNome(nome);
        obxS.setApelidos(apelidos);
        obxS.setDni(dni);
        obxS.setDireccion(direccion);
        obxS.setAnosAntiguedade(anosAntiguedade);
        obxS.setTelefono(telefono);
        obxS.setSalario(salario);
        obxS.getDespacho();
        obxS.getNumFax();
        obxS.getNome();
        obxS.getApelidos();
        obxS.getDni();
        obxS.getDireccion();
        obxS.getAnosAntiguedade();
        obxS.getTelefono();
        obxS.getSalario();
    }
    
    public void cambiarCoche(){
        obxC.setMatricula(JOptionPane.showInputDialog("Matricula do novo coche: "));
        obxC.setMarca(JOptionPane.showInputDialog("Marca do novo coche"));
        obxC.setModelo(JOptionPane.showInputDialog("Modelo do novo coche"));
        obxC.getMatricula();
        obxC.getMarca();
        obxC.getModelo();
    }
    
    public void darAltaVendedores(){
        listaVendedores.add(JOptionPane.showInputDialog("Introduce vendedor: "));
        listaVendedores.add(JOptionPane.showInputDialog("Introduce vendedor: "));
    }
    
    public void darBaixaVendedores(){
        for(String l:listaVendedores){
            System.out.println("Lista de vendedores: "+l);  
        }
        
        for(String l:listaVendedores){
            listaVendedores.remove(JOptionPane.showInputDialog("Escribe el vendedor que quieres eliminar: "));
            //Quita el elemento en la posición especificada en esta lista.
            //Cambia cualquier elemento posterior a la izquierda (resta uno de sus índices).
        }
        
        for(String l:listaVendedores){
            System.out.println("Lista de vendedores: "+l);
        }
                
        
    }
    
}

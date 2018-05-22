
package boletin.pkg31;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author dfernandezguerreiro
 */
public class Vendedor extends Empleados{
    
    Coche obxC=new Coche("111","Opel","Astra");
    private int telefonoM;
    private String AreaVenta;
    private String porcentaxeVentas;
    ArrayList<String>listaClientes=new ArrayList();

    public Vendedor() {
    }

    public Vendedor(int telefonoM, String AreaVenta, String porcentaxeVentas, String nome, String apelidos, String dni, String direccion, int anosAntiguedade, int telefono, int salario) {
        super(nome, apelidos, dni, direccion, anosAntiguedade, telefono, salario);
        this.telefonoM=telefonoM;
        this.AreaVenta=AreaVenta;
        this.porcentaxeVentas=porcentaxeVentas;
    }

    public Coche getObxC() {
        return obxC;
    }

    public void setObxC(Coche obxC) {
        this.obxC=obxC;
    }

    public int getTelefonoM() {
        return telefonoM;
    }

    public void setTelefonoM(int telefonoM) {
        this.telefonoM=telefonoM;
    }

    public String getAreaVenta() {
        return AreaVenta;
    }

    public void setAreaVenta(String AreaVenta) {
        this.AreaVenta=AreaVenta;
    }

    public String getPorcentaxeVentas() {
        return porcentaxeVentas;
    }

    public void setPorcentaxeVentas(String porcentaxeVentas) {
        this.porcentaxeVentas=porcentaxeVentas;
    }

    public ArrayList<String> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<String> listaClientes) {
        this.listaClientes=listaClientes;
    }

    @Override
    public String toString() {
        return super.toString()+", Coche: " + obxC + ", telefonoM: " + telefonoM + ", AreaVenta: " + AreaVenta + ", porcentaxeVentas: " + porcentaxeVentas + ", listaClientes: " + listaClientes;
    }
    
    @Override
    public void amosar(){
        System.out.println(super.toString()+", posto na empresa: Vendedor");
    }
       
    @Override
    public void incrementarSalario() {
        int salarioI;
        salarioI=(super.salario*10/100)+super.salario;
        System.out.println(salarioI);
    }
    
    public void darAltaCliente(){
        listaClientes.add(JOptionPane.showInputDialog("Añadir un cliente: "));
        for(String c:listaClientes){
            System.out.println(c);
        }
    }
    
    public void cambiarCoche(){
        obxC.setMatricula(JOptionPane.showInputDialog("Matricula do novo coche: "));
        obxC.setMarca(JOptionPane.showInputDialog("Marca do novo coche"));
        obxC.setModelo(JOptionPane.showInputDialog("Modelo do novo coche"));
        obxC.getMatricula();
        obxC.getMarca();
        obxC.getModelo();
    }
    
    
    
}

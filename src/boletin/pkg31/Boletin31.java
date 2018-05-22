
package boletin.pkg31;

/**
 *
 * @author dfernandezguerreiro
 */
public class Boletin31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Empleados sec=new Secretario("despacho1",2,"ManuSecre","Gonzalez","555D","Vigo",3,665545458,1200);
//String despacho, int numFax, String nome, String apelidos, String dni, String direccion, int anosAntiguedade, int telefono, int salario
        
        Empleados ven=new Vendedor(667848484,"Area Sur","30%","RobertoVentas","Martinez","6454E","Lugo",1,635515458,1500);
//int telefonoM, String AreaVenta, String porcentaxeVentas, String nome, String apelidos, String dni, String direccion, int anosAntiguedade, int telefono, int salario
        
        Empleados xef=new XefeZona("despacho3","Rodrigo","Suarez","9898F","Madrid",6,645488784,1800);
//String despacho, String nome, String apelidos, String dni, String direccion, int anosAntiguedade, int telefono, int salario


        
//        sec.incrementarSalario();
//        ven.incrementarSalario();
//        xef.incrementarSalario();
        
//        sec.amosar();
//        ven.amosar();
//        xef.amosar();

//        Vendedor ven2=new Vendedor(667777777,"Area Norte","30%","XoelVentas","Fernandez","3333E","C/Hola",5,63533333,1300);
//        ven2.darAltaCliente();
//        System.out.println(ven2.toString());
//        ven2.cambiarCoche();
//        System.out.println(ven2.toString());
//
//        
        XefeZona xef2=new XefeZona("despacho6","Maria","Lopez","6684D","C/Gran Via",20,65454545,1900);
        xef2.darAltaVendedores();
        xef2.darBaixaVendedores();
    }
    
}

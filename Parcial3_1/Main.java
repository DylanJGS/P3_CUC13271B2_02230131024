
package Parcial3_1;

public class Main {
    public static void main(String[] args) {
        SistemaDeMercado sistema = new SistemaDeMercado();

        
        double[] historicoAccion = {100, 105, 102, 108, 110};
        double[] historicoBono = {95, 96, 97, 98, 99};
        double[] historicoFondoMutuo = {50, 51, 52, 53, 54};

        Activo accion1 = new Accion("Acción XYZ", 110, historicoAccion, 0.02);
        Activo bono1 = new Bono("Bono ABC", 99, historicoBono, 0.01);
        Activo fondoMutuo1 = new FondoMutuo("Fondo Mutuo DEF", 54, historicoFondoMutuo, 0.03);

        sistema.agregarActivo(accion1);
        sistema.agregarActivo(bono1);
        sistema.agregarActivo(fondoMutuo1);

       
        Usuario usuario1 = new Usuario("Juan Perez", 10000);
        Usuario usuario2 = new Usuario("Maria Lopez", 15000);

        sistema.agregarUsuario(usuario1);
        sistema.agregarUsuario(usuario2);

        
        usuario1.comprarActivo(accion1, 10, 110);
        usuario2.comprarActivo(bono1, 20, 99);
        usuario1.venderActivo(accion1, 5, 112);

        
        sistema.actualizarPrecios();

       
        sistema.generarInformeRendimiento();
        sistema.generarAlertas();
    }
}
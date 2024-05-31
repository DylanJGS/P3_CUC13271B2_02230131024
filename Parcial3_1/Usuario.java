
package Parcial3_1;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private double balance;
    private List<Transaccion> transacciones;

    public Usuario(String nombre, double balance) {
        this.nombre = nombre;
        this.balance = balance;
        this.transacciones = new ArrayList<>();
    }

    
    public String getNombre() 
    { return nombre; }
    public void setNombre(String nombre) 
    { this.nombre = nombre; }

    public double getBalance() 
    { return balance; }
    public void setBalance(double balance) 
    { this.balance = balance; }

    public List<Transaccion> getTransacciones() 
    { return transacciones; }

    public void comprarActivo(Activo activo, int cantidad, double precioCompra) {
        double totalCompra = cantidad * precioCompra;
        if (balance >= totalCompra) {
            balance -= totalCompra;
            transacciones.add(new Transaccion(activo, cantidad, precioCompra, "Compra"));
            System.out.println("Compra realizada: " + cantidad + " de " + activo.getNombre() + " a $" + precioCompra);
        } else {
            System.out.println("Fondos insuficientes para realizar la compra.");
        }
    }

    public void venderActivo(Activo activo, int cantidad, double precioVenta) {
       
        int cantidadDisponible = 0;
        for (Transaccion t : transacciones) {
            if (t.getActivo().equals(activo) && t.getTipo().equals("Compra")) {
                cantidadDisponible += t.getCantidad();
            }
            if (t.getActivo().equals(activo) && t.getTipo().equals("Venta")) {
                cantidadDisponible -= t.getCantidad();
            }
        }

        if (cantidadDisponible >= cantidad) {
            balance += cantidad * precioVenta;
            transacciones.add(new Transaccion(activo, cantidad, precioVenta, "Venta"));
            System.out.println("Venta realizada: " + cantidad + " de " + activo.getNombre() + " a $" + precioVenta);
        } else {
            System.out.println("Cantidad insuficiente de activos para realizar la venta.");
        }
    }
}

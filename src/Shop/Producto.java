/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shop;

/**
 *
 * @author diogenes
 */
public class Producto {

    private String nombre;
    protected int precioUnit;
    protected int precio;
    private String code;
    protected int cantidad;
    protected boolean descuento;

    public Producto() {
        descuento = false;
    }

    public Producto(String nombre, int precioUnit, String code) {
        this.nombre = nombre;
        this.precioUnit = precioUnit;
        this.code = code;
        cantidad = 0;
        descuento = false;
    }

    public Producto(String nombre, int precioUnit, int precio, String code, int cantidad, boolean descuento) {
        this.nombre = nombre;
        this.precioUnit = precioUnit;
        this.code = code;
        this.cantidad = cantidad;
        this.precio = precio;
        this.descuento = descuento;
        validarDescuento();
        calcularTotal();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecioUnit() {
        return precioUnit;
    }

    public void setPrecioUnit(int precioUnit) {
        this.precioUnit = precioUnit;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public boolean isDescuento() {
        return descuento;
    }

    public void setDescuento(boolean descuento) {
        this.descuento = descuento;
    }

    public void sumarProducto() {
        cantidad += 1;
    }

    public void restarProducto() {
        cantidad -= 1;
    }

    public void validarDescuento() {
        if (cantidad >= 2) {
            descuento = true;
        }
    }

    public void aplicarDescuento() {
        if (descuento) {
            precio = precioUnit - (precioUnit / 4);
        }
    }
    
    public void calcularTotal(){
        precio = precio*cantidad;
    }

    @Override
    public String toString() {
        return " Producto de nombre=" + nombre + "su precio Unitario es=" + precioUnit + ",su codigo de barra es=" + code + ",la cantidad de productos selecionados es=" + cantidad + ", se aplica el descuento=" + descuento + '}';
    }

}
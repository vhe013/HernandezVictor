package factura;

/**
 * Clase para crear y mostrar una linea de la factura que se refiere a un tipo de producto comprado.
 * @version 1.0
 * @author victor
 */
public class LineaFactura {
	/**
	 * identificador (codigo) del producto.
	 */
	public String id_producto; 
	/**
	 * Nombre del producto.
	 */
	public String nombre_producto; 
	/**
	 * Precio por una unidad del producto.
	 */
	public float precio; 
	/**
	 * Cantidad de unidades compradas.
	 */
	public float cantidad; 
	/**
	 * Descuento de la unidad.
	 */
	public float descuento; 

	/**
	 * Constructor de la LineaFactura.
	 * @param idProducto Identificador del producto comprado.
	 * @param nombreProducto Nombre del producto comprado.
	 * @param precio Precio del producto comprado.
	 * @param cantidad Cantidad de productos del mismo tipo comprados.
	 * @param descuento Descuento aplicado a cada unidad de producto.
	 */
	public LineaFactura(String idProducto, String nombreProducto, float precio, float cantidad, float descuento) {
		super();
		id_producto = idProducto;
		nombre_producto = nombreProducto;
		this.precio = precio;
		this.cantidad = cantidad;
		this.descuento = descuento;
	}

	/**
	 * Método que representa una linea de la factura en forma de cadena de un tipo de producto comprado. 
	 * @see java.lang.Object#toString()
	 * @return Cadena que representa la linea de la factura.
	 */
	
	public String toString() {
		return "\n\tLineaFactura [" + "id_producto=" + id_producto + ", nombre_producto=" + nombre_producto
				+ ", precio=" + precio + ", cantidad=" + cantidad + ", descuento=" + descuento + "]";
	}

	/**
	 * Devulve el precio total de una linea que resulta de multiplicar precio unidad X cantidad de productos 
	 * @return Precio total de una linea.
	 */
	public float getTotal() {
		float total = this.precio * this.cantidad;
		return total;
	}

}

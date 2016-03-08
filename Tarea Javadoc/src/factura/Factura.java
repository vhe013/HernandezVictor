package factura;


import java.util.Arrays;

/**
 * Clase para crear una factura con los datos del cliente y lo que ha comprado
 * @author victor
 * @version 1.0
 */
public class Factura {

	/**
	 * Identiicador (codigo) del cliente
	 */
	public String id_cliente;
	/**
	 * Nombre del cliente
	 */
	public String nombre_cliente;
	/**
	 * lista de productos comprados
	 */
	public LineaFactura lineas[];

	/**
	 *Constructor de la Factura
	 * @param idCliente Identificador del cliente de la factura.
	 * @param nombreCliente Nombre del cliente de la factura.
	 * @param lineas Lista de productos comprados que tiene la factura.
	 */
	public Factura(String idCliente, String nombreCliente, LineaFactura[] lineas) {
		super();
		id_cliente = idCliente;
		nombre_cliente = nombreCliente;
		this.lineas = lineas;
	}

	/**
	 * Metodo para calcular el precio total de la factura
	 * 
	 * @return precio que es el resultado calculado a partir del precio de cada linea.
	 */
	public float getTotal() {
		float precio = 0;
		for (int i = 0; i < this.lineas.length; i++) {
			precio += this.lineas[i].getTotal();
		}
		return precio;
	}
	/**
	 * Método que devuelve la representación de la factura en forma de cadena.
	 * @see java.lang.Object#toString()
	 * @return Cadena que representa la factura.
	 */
		

	public String toString() {
		return "Factura [" + "id_cliente=" + id_cliente + ", nombre_cliente=" + nombre_cliente + ", getTotal()="
				+ getTotal() + ", lineas=" + Arrays.toString(lineas) + "]";
	}

	/**
	 * Método principal para comprobar el funcionamiento de la clase.
	 * @param args
	 */

		public static void main(String[] args) {
	/**
	 * Crear una factura y las lineas
	 */
			
		LineaFactura[] lineas = new LineaFactura[] { new LineaFactura("P100", "Leche", 0.85f, 6, 0),
				new LineaFactura("P200", "Pan", 0.60f, 1, 0), new LineaFactura("P150", "Tomate", 0.85f, 2, 0),
				new LineaFactura("P600", "Cafe", 1.2f, 1, 0) };
		Factura factura1 = new Factura("C100", "Antonio Garcia", lineas);

	 /**
	  *  Escribimos la factura
	  */
		System.out.println(factura1);

	}

}


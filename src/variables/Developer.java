package variables;

/**
 * EverisDesafioJava
 * 
 * @author driverog
 *
 */
public class Developer {

	// Establecimiento de Variables de la clase

	public String nombre;

	public static String Empresa;

	public static byte numTotal = 0;

	public int ID;

	public int diaVacaciones;

	/**
	 * Constructor del objeto
	 * 
	 * @param nombre
	 */
	public Developer(String nombre) {
		this.numTotal++;
		this.nombre = nombre;
		ID = this.numTotal;
		this.diaVacaciones = 21;
		this.Empresa = "Everis";
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the empresa
	 */
	public static String getEmpresa() {
		return Empresa;
	}

	/**
	 * @param empresa
	 *            the empresa to set
	 */
	public static void setEmpresa(String empresa) {
		Empresa = empresa;
	}

	/**
	 * @return the numTotal
	 */
	public static int getNumTotal() {
		return numTotal;
	}

	/**
	 * @param numTotal
	 *            the numTotal to set
	 */
	public static void setNumTotal(int numTotal) {
		Developer.numTotal = numTotal;
	}

	/**
	 * @return the iD
	 */
	public int getID() {
		return ID;
	}

	/**
	 * @param iD
	 *            the iD to set
	 */
	public void setID(int iD) {
		ID = iD;
	}

	/**
	 * @return the diaVacaciones
	 */
	public int getDiaVacaciones() {
		return diaVacaciones;
	}

	/**
	 * @param diaVacaciones
	 *            the diaVacaciones to set
	 */
	public void setDiaVacaciones(int diaVacaciones) {
		this.diaVacaciones = diaVacaciones;
	}

}

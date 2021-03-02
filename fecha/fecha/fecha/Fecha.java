/**
*
*/
package fecha;

/**
 * @author Miguel Capel
 *
 */
public class Fecha {

	public int dias;
	public int mes;
	public int a�o;

	public Fecha(int d, int m, int a) {
		this.dias = d;
		this.mes = m;
		this.a�o = a;
	}

	public boolean valida() {

		if (dias < 1 || dias > 31)
			return false;
		if (mes < 1 || mes > 12)
			return false;

// Determinamos la cantidad de d�as del mes:
		int diasMes = 0;
		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			diasMes = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			diasMes = 30;
			break;
		case 2: // Verificamos si el a�o es bisiesto
			if ((a�o % 400 == 0) || ((a�o % 4 == 0) && (a�o % 100 != 0)))
				diasMes = 29;
			else
				diasMes = 28;
			break;

		}

		if (dias > diasMes)
			return false;
		else
			return true;

	}

}

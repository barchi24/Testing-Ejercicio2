package ISO2.Ejercicio2;

public class PB {

	public static double precioBillete(Persona p, Bus b, int ia) {
		if (numerosNegativos(ia, p.getEdad(), b.getPlazas(), b.getPasajerosI(), b.getPasajerosN()))
			return -1;

		double precioBillete = 10;
		boolean cabe = false;

		int aforoDisponible = b.getPlazas();

		if (p.isEnferma() || p.isContactosRecientes() || p.isSintomas() || !p.isPasaporteCovid())
			return -2;
		else
			switch (nivelIA(ia)) {
			case 0:
				if (aforoDisponible > (b.getPasajerosI() + b.getPasajerosN())) {
					if (p.getEdad() < 23)
						precioBillete *= 0.4;
					else if (p.getEdad() > 65)
						precioBillete *= 0.2;
				} else
					return -3;
				break;
			case 1:
				aforoDisponible *= 0.8;

				if (aforoDisponible > (b.getPasajerosI() + b.getPasajerosN())) {
					if (p.getEdad() < 23)
						precioBillete *= 0.7;
					else if (p.getEdad() > 65)
						precioBillete *= 0.5;
				} else
					return -3;
				break;
			case 2:
				aforoDisponible *= 0.6;

				if (p.isProfesionalImprescindible()) {
					if (aforoDisponible > (b.getPasajerosI() + b.getPasajerosN()))
						cabe = true;
				} else {
					aforoDisponible *= 0.4;

					if (aforoDisponible > b.getPasajerosN())
						cabe = true;
				}

				if (cabe) {
					if (p.getEdad() > 65)
						precioBillete *= 1.2;
				} else
					return -3;
				break;
			case 3:
				aforoDisponible *= 0.4;

				if (p.isProfesionalImprescindible()) {
					if (aforoDisponible > (b.getPasajerosI() + b.getPasajerosN()))
						cabe = true;
				} else {
					aforoDisponible *= 0.2;

					if (aforoDisponible > b.getPasajerosN())
						cabe = true;
				}

				if (cabe) {
					if (p.getEdad() < 23)
						precioBillete *= 1.2;
					else if (p.getEdad() > 65)
						precioBillete *= 1.5;
				} else
					return -3;
				break;
			case 4:
				aforoDisponible *= 0.3;

				if (p.isProfesionalImprescindible()) {
					if (aforoDisponible > (b.getPasajerosI() + b.getPasajerosN()))
						cabe = true;
				} else {
					aforoDisponible *= 0.1;

					if (aforoDisponible > b.getPasajerosN())
						cabe = true;
				}

				if (cabe) {
					if (p.getEdad() < 23)
						precioBillete *= 1.5;
					else if (p.getEdad() > 65)
						return -2;
				} else
					return -3;
				break;
			}

		return precioBillete;
	}

	public static boolean numerosNegativos(int ia, int edad, int plazas, int pasajerosI, int pasajerosN) {
		return ia < 0 || edad < 0 || plazas < 0 || pasajerosI < 0 || pasajerosN < 0;
	}

	public static int nivelIA(int ia) {
		int nivel;

		if (ia < 100)
			nivel = 0;
		else if (ia >= 100 && ia <= 200)
			nivel = 1;
		else if (ia >= 201 && ia <= 300)
			nivel = 2;
		else if (ia >= 301 && ia <= 500)
			nivel = 3;
		else
			nivel = 4;

		return nivel;
	}
}
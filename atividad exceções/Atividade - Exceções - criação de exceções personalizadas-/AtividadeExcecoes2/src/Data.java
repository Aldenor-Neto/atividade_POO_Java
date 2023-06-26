
public class Data {

	private int dia, mes, ano;

	Data(int dia, int mes, int ano) {

		try {
			if (mes >= 1 & mes <= 12) {
				this.mes = mes;
			} else {
				throw new DataException(dia, mes, ano);
			}

			if (mes == 2) {
				if (dia >= 1 & dia <= 28) {
					this.dia = dia;
				} else {
					throw new DataException(dia, mes, ano);
				}
			} else if ((mes == 1) | (mes == 3) | (mes == 5) | (mes == 7) | (mes == 8) | (mes == 10) | (mes == 12)) {
				if (dia >= 1 & dia <= 31) {
					this.dia = dia;
				} else {
					throw new DataException(dia, mes, ano);
				}
			} else if ((mes == 4) | (mes == 6) | (mes == 9) | (mes == 11)) {
				if (dia >= 1 & dia <= 30) {
					this.dia = dia;
				} else {
					throw new DataException(dia, mes, ano);
				}
			}

			if (ano >= 1) {
				this.ano = ano;
			} else {
				throw new DataException(dia, mes, ano);
			}

			System.out.println("Data : " + this.dia + "/" + this.mes + "/" + this.ano);
		} catch (DataException E) {
			System.out.println(E.toString());
		}

	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

}

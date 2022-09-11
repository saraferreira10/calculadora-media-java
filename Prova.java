
public class Prova {

	double notaParte1;
	double notaParte2;
	
	public Prova(double notaParte1, double notaParte2) {
		this.notaParte1 = notaParte1;
		this.notaParte2 = notaParte2;
	}
	
	double calcularNotaTotal() {
		if (notaParte1 > 10 || notaParte1 < 0 || notaParte2 > 10 || notaParte2 < 0) {
			System.out.println("Inválido!");
			return 0;
		}
		else {
			return notaParte1 + notaParte2;
		}
		
	}
	
}

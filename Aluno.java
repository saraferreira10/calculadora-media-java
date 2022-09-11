
public class Aluno {
	
	Prova p1;
	Prova p2;
	
	public Aluno(Prova p1, Prova p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	double calcularMedia() {
		return (p1.calcularNotaTotal() + p2.calcularNotaTotal()) / 2;
	}
	
}

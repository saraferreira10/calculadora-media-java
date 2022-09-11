
public class Aplicacao {

	public static void main(String[] args) {
				
		Aluno a1 = new Aluno(new Prova(4.0, 2.5), new Prova(1.0, 7.0));
		Aluno a2 = new Aluno(new Prova(6.5, 3.5), new Prova(0.0, 3.0));
		Aluno a3 = new Aluno(new Prova(5.0, 4.0), new Prova(6.0, 1.5));
		
		Turma t = new Turma();
		t.a1 = a1;
		t.a2 = a2;
		t.a3 = a3;
				
		System.out.println("Aluno 1: " + a1.calcularMedia());
		System.out.println("Aluno 2: " + a2.calcularMedia());
		System.out.println("Aluno 3: " + a3.calcularMedia());

		System.out.println("Média da Turma: " + String.format("%.2f", t.calcularMedia()));
		
	}
	
}

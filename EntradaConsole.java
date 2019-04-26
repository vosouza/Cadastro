import java.util.Scanner;

public class EntradaConsole implements IEntrada{
	Scanner sc = new Scanner(System.in);
	
	public void lerDados(Aluno aluno){
		boolean b=true;
		do {
			try {
				System.out.println("Digite o nome: ");
				aluno.setNome(sc.nextLine());

				System.out.println("Digite a idade: ");
				aluno.setIdade(sc.nextInt());

				System.out.println("Digite o RG: ");
				aluno.setRg(sc.nextLine());

				System.out.println("Digite o RA: ");
				aluno.setRa(sc.nextLine());

				System.out.println("Digite o semestre: ");
				aluno.setSemestre(sc.nextInt());
				
				b = false;
			}catch(NumberFormatException  e) {
				System.out.println("Voce digitou algo errado, tente novamente!");
				b = true;
				sc.nextLine();
				
			}
		}while(b);
	}
        
        public void lerDadosDisc(Disciplina disc){
        	boolean b=true;
    		do {
	    		try {
		            System.out.println("Digite o nome da disciplina: ");
		            disc.setDisciplina(sc.nextLine());
		
		            System.out.println("Digite o nome do professor: ");
		            disc.setProf(sc.nextLine());
		
		            System.out.println("Digite a nota: ");
		            disc.setNota(sc.nextDouble());
		            b = false;
	       		}catch(NumberFormatException  e) {
	       			System.out.println("Voce digitou algo errado, tente novamente!");
	       			b = true;
	       			sc.nextLine();
	       			
	       		}
       		}while(b);
        }
}
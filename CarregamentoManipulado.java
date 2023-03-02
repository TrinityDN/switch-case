
public class CarregamentoManipulado {
	
	public static void main(String [] args) {
		
		int mediaDoAluno = 8;
		int classificacao = 0;
		
		if(mediaDoAluno >=5) {
			
			classificacao = 2;
		}
		
		if(mediaDoAluno < 5 & mediaDoAluno >= 3) {
			
			classificacao = 1;
			
		}
		
		if(mediaDoAluno <3) {
			
			classificacao = 0;
		}
		
		switch(classificacao) {
		
		case 0:
			
			System.out.println("Reprovado");
			
			return;
			
		case 1:
			
			System.out.println("Aprovado pelo conselho");
			
			return;
			
		case 2:
			
			System.out.println("Aprovado");
			
			
			return;
			
		}
	}
}
		
		
		
		
					

	
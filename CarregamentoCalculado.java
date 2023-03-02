
public class CarregamentoCalculado {
	
	public static void main(String [] args) {
		
		int notaDeMatematica = 10;
		int notaDePortugues = 6;
		int notaDeHistoria = 5;
		int notaDeGeografia = 10;
		
		int mediaAluno = (notaDeMatematica  + notaDePortugues  + notaDeHistoria + notaDeGeografia) /4;
		
		int classificacao = 0;
		
		if(mediaAluno >= 5) {
			
			//aprovado 
			
			classificacao = 2;	
		}
		
		if(mediaAluno <5 & mediaAluno >=3) {
			
			//Aprovado pelo conselho
			
			classificacao = 1;
			
		}
		
		if(mediaAluno <3) {
			
			//reprovado
			
			classificacao = 0;
		}
			
			
		switch(classificacao) {
		
		case 0:
			
			System.out.println("Reprovado");
			
			return;
			
		case 1:
			
			System.out.println("Aprovado pelo Conselho");
			
			return;
			
		case 2:
			
			System.out.println("Aprovado");
			
			return;
		}
	}
}

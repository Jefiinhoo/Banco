import java.util.Scanner;

public class Sistema {

	public static void main(String[] args) {
		
		Usuário uso1 = new Usuário();		
		Scanner leitor = new Scanner (System.in);
			System.out.println("Digite seu nome");
				uso1.nome = leitor.next();
			System.out.println("Digite o cpf");
				uso1.cpf = leitor.nextInt();
			System.out.println("Digite a Agencia");
				uso1.agencia = leitor.nextInt();
			System.out.println("Digite a Conta");
				uso1.conta = leitor.nextInt();
				//metodo
				uso1.saldo();
			//Acessando informações
				System.out.println("Conta: " + uso1.conta);				
				System.out.println("CPF: " + uso1.cpf);
				System.out.println(uso1.nome);
				System.out.println("Seu Saldo é: " + uso1.sl);
			
				
	}

}
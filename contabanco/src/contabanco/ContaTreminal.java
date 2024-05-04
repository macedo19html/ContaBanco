package contabanco;

import java.util.Scanner;

public class ContaTreminal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		String agencia;
		String nomeCliente;
		double saldo;
		
		System.out.println("-----Conta Banco------");
		System.out.println();
		System.out.println("Por fava, digite o numero da conta: (12345");
		numero = sc.nextInt();
		
		System.out.println("Digite o numero da Agencia: (123-9");
		agencia = sc.next();
		
		System.out.println("Informe o seu nome: ");
		nomeCliente = sc.next();
		sc.nextLine();
		
		System.out.println("Informe o seu saldo: ");
		saldo = sc.nextDouble();
		
		System.out.println();
		System.out.printf("Obrigado %s, voce criou uma conta con a gente " + "sua agencia é %s," + "sua conta %s e seu saldo %.2f ja esta disponivel" + "para saque.", nomeCliente, agencia, numero, saldo);
		
		sc.close();
	}

}

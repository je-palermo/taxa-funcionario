package teste;

import java.util.Locale;
import java.util.Scanner;

import modulos.Empregado;

public class TesteEmpregado {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);
		
		Empregado empregado = new Empregado();
		
		System.out.print("Nome do Funcionario : ");
		empregado.nome = scan.nextLine();
		
		System.out.print("Digite o salário Bruto do funcionario " + empregado.nome + ": ");
		empregado.salarioBruto = scan.nextDouble();
		
		System.out.print("Taxa de desconto : ");
		empregado.taxa = scan.nextDouble();
		
		System.out.println(empregado);
		
		System.out.print("Qual a porcentagem de aumento? ");
		double porcentagem = scan.nextDouble();
		empregado.incrementarSalario(porcentagem);
		
		System.out.println(empregado);
		
		
		scan.close();

	}

}

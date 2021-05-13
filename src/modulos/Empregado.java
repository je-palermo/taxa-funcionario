package modulos;

public class Empregado {
	
	public String nome;
	public double salarioBruto;
	public double taxa;
	
	@Override
	public String toString() {
		return "Empregado: " + nome + ", $ " + String.format("%.2f", salarioLiquido());	
	}

	public double salarioLiquido() {
		return this.salarioBruto - this.taxa;
	}
	
	public void incrementarSalario(double porcentagem) {
		this.salarioBruto += this.salarioBruto * porcentagem / 100;
	}

}

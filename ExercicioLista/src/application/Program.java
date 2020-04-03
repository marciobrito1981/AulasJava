package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Empregado;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered?" );
		Integer n = sc.nextInt();
		
		List<Empregado> lemp = new ArrayList<>();
		
		for(int i = 1; i <= n; i++) {

			System.out.println();
			System.out.println("Empregado #" + i + ":");
			
			System.out.print("Id: ");
			int id = sc.nextInt();
			
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("Salario: ");
			double salario = sc.nextDouble();
			
			lemp.add(new Empregado(id, nome, salario));
			
		}
		
		System.out.print("Entre com o ID do empregado que tera salario aumentado: ");
		int id = sc.nextInt();
		
		Empregado emp = lemp.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if(emp != null) {
			System.out.print("Entre com a porcentagem: ");
			double porcentagem = sc.nextDouble();
			emp.acrescerSalario(porcentagem);
			
		}else {
			System.out.println("Empregado não existe");
		}
		
			
		System.out.println();
		System.out.println("Lista de Empregados Cadastrados:");
		
		for(Empregado x  : lemp ) {
			System.out.println(x);
			
		}
		
	}

}

package controllers;

import java.util.UUID;

import javax.swing.JOptionPane;

import entities.Funcionario;
import repositories.FuncionarioRepository;

public class FuncionarioController {
	public void cadastrarFuncionario() {
		var funcionario = new Funcionario();
		try {
			funcionario.setId(UUID.randomUUID());
			funcionario.setName(JOptionPane.showInputDialog("Digite seu nome: "));
			funcionario.setCpf(JOptionPane.showInputDialog("Digite seu cpf: "));
			funcionario.setMatricula(JOptionPane.showInputDialog("Digite sua matricula: "));
			String salario = (JOptionPane.showInputDialog("Digite o seu salario"));
			funcionario.setSalario(Double.parseDouble(salario));
			
			var funcionarioRepository = new FuncionarioRepository();
			funcionarioRepository.exportarDados(funcionario);
			
		}
		catch(Exception e) {
			System.out.println("Falha ao cadastrar funcionario!");
			System.out.println("Erro: "+ e.getMessage());
		}
	}
}

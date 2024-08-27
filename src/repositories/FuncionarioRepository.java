package repositories;

import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

import entities.Funcionario;

public class FuncionarioRepository {
	public void exportarDados(Funcionario funcionario) {
		try {
			var fileWriter = new FileWriter("C:\\dados\\funcionarios.txt", true);
			var printWriter = new PrintWriter(fileWriter);
			
			printWriter.write("\nDADOS DO FUNCIONARIO DE  ID: "+funcionario.getId());
			printWriter.write("\nNome:\t"+funcionario.getName());
			printWriter.write("\nCpf:\t"+funcionario.getCpf());
			printWriter.write("\nMatricula:\t"+funcionario.getMatricula());
			printWriter.write("\nSalario:\t"+funcionario.getSalario());
			printWriter.write("\n");
			
			printWriter.close();
			JOptionPane.showMessageDialog(null,"Dados gravados com sucesso!");
		} 
		catch (Exception e) {
			System.out.println("Falha ao gravar arquivo!");
			System.out.println("erro: "+ e.getMessage());
		}
	}
}

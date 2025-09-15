package view;

import br.gui.pilhastring.Pilha;
import javax.swing.JOptionPane;
import controller.HistoricoController;

public class Pricipal {

	public static void main(String[] args) {
		Pilha historico = new Pilha();
		HistoricoController controller = new HistoricoController();

		int opcao = 0;
		do {
			String menu = "MENU HISTÓRICO\n" + 
					"1 - Inserir novo endereço\n" + 
					"2 - Remover último endereço\n" + 
					"3 - Consultar último endereço\n" + "9 - Sair";
			try {
				opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
			} catch (Exception e) {
				opcao = 9;
			}

			try {
				switch (opcao) {
				case 1:
					String endereco = JOptionPane.showInputDialog("Digite o endereço:");
					controller.inserirEndereco(historico, endereco);
					JOptionPane.showMessageDialog(null, "Endereço inserido no histórico!");
					break;

				case 2:
					String removido = controller.removerEndereco(historico);
					JOptionPane.showMessageDialog(null, "Endereço removido: " + removido);
					break;

				case 3:
					String ultimo = controller.consultarUltimo(historico);
					JOptionPane.showMessageDialog(null, "Último endereço: " + ultimo);
					break;

				case 9:
					JOptionPane.showMessageDialog(null, "Encerrando programa");
					break;

				default:
					JOptionPane.showMessageDialog(null, "Opção inválida!");
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		} while (opcao != 9);
	}

}

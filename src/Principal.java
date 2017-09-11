import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		int op;
		String e;
		ListaLigada lg = new ListaLigada();
		do{
			op = Integer.parseInt(JOptionPane.showInputDialog("MENU\n1 - Adiciona Inicio\n2 - Remove Inicio\n3 - Adiciona Final\n4 - Remove Final\n7 - Mostrar conteudo da lista\n9 - Fechar"));
			switch (op) {
			case 1:
				e = JOptionPane.showInputDialog("Insira o texto");
				lg.adiciona(e);
				break;
			case 2:
				e = JOptionPane.showInputDialog("Insira o texto a ser removido");
				System.out.println(lg.remove(e));
				break;
			case 7:
				System.out.println(lg.toString());
				break;
			case 9:
				JOptionPane.showMessageDialog(null, "Fechando Sistema","Saindo",JOptionPane.CANCEL_OPTION);;
			default:
				break;
			}
		}while(op != 9);

	}

}

import javax.swing.JOptionPane;

public class ListaLigada {
	private No inicio;
	
	public ListaLigada(){
		inicio = null;
	}

	public void adiciona(String e) {
		No novo = new No(e);
		if(inicio == null || inicio.dado.compareTo(e)>0){
			novo.prox = inicio;
			inicio = novo;
		}
		else{
			No aux = inicio;
			No auxAnt = null;
			while(aux.dado.compareTo(e)<0 && aux.prox != null){
				auxAnt = aux;
				aux = aux.prox;
			}
			
			
			if(aux.prox == null){
				if(aux.dado.compareTo(e)>0){
					auxAnt.prox = novo;
					novo.prox = aux;	
				}
				else{
					aux.prox = novo;
				}
			}
			else{
				auxAnt.prox = novo;
				novo.prox = aux;
			}
		}
	}
	
	public int remove(String t){
		int r = -1;
		if(inicio == null){
			JOptionPane.showMessageDialog(null, "Lista Vazia!!","Erro",JOptionPane.ERROR_MESSAGE);
		}
		else{
			if(inicio.dado.equals(t)){
				r = 0;
				inicio = inicio.prox;
			}
			else{
				No aux1,aux2 = null;
				int i = 0;
				aux1 = inicio;
				while(!(aux1.dado.equals(t)) && aux1.prox != null){
					aux2 = aux1;
					aux1 = aux1.prox;
					i++;
				}		
				if (aux1.prox == null && !(aux1.dado.equals(t))) {
					JOptionPane.showMessageDialog(null, "Texto não encontrado!","Erro!",JOptionPane.ERROR_MESSAGE);
				
				}
				else{
					aux2.prox = aux1.prox;
					r = i;
				}
			}
		}
		return r;
	}
	
	
	
	
	@Override
	public String toString() {
		String r = "";
		No aux = inicio;
		while(aux != null){
			r = r +", "+aux.dado;
			aux = aux.prox;
		}
		return r;
	}
	
	

}

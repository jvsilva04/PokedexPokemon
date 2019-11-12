package pokedex;



import javax.swing.JOptionPane;

public class pokedex {

	public static void main(String[] args) {
		int x;
		Pokemon[] pokemons= new Pokemon[151];

		do {
			x= Integer.parseInt(JOptionPane.showInputDialog("------------ POKEDEX -----------\n"+"1- Cadastrar Pokemon \n"+"2- Consultar Pokemon \n"+"3- Atualizar Pokemon \n"+"0- Sair \n"));
			switch (x) {
			case 1:
				cadastraPokemon.cadastraPokemon(pokemons);
				break;
			case 2:
				consultarPokemon.consultarPokemon(pokemons);
				break;
			case 3:
				AtualizarPokemon.retornaPokemonCadastrado(pokemons);
				break;
			case 0:
				break;
			default:
				JOptionPane.showMessageDialog(null, "Valor inserido não foi efetivo, seu pokemon perdeu o ataque!!! \n");
			}
		}while(x!=0);

	}

}

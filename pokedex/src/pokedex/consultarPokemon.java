package pokedex;
import javax.swing.*;

public class consultarPokemon {
    public static Pokemon[] consultarPokemon(Pokemon[] pokemons){
        int pokemonArray,resposta;



        pokemonArray = Integer.parseInt(JOptionPane.showInputDialog(null,"diga o codigo do pokemon"));

        Pokemon Pokemon = pokemons[pokemonArray-1];

        if(Pokemon==null){
        	do {
        		JOptionPane.showMessageDialog(null,"pokemon inexistente, deseja cadastrar?");
        		resposta = Integer.parseInt(JOptionPane.showInputDialog("1-sim, 2-nao"));
        		switch(resposta) {
        		case 1:
        			CadastrarPokemon.cadastraPokemon(pokemons);
        			break;
        		case 2:
        			break;
        		default:
        			JOptionPane.showMessageDialog(null, "Opção invalida!!!");
        			break;
        		}
        	}while(resposta!=2);
        } else {
        	JOptionPane.showMessageDialog(null, "Nome: "+Pokemon.getNome()+"\n"+"Codigo: "+(Pokemon.getCodigo()+1)+"\n"+"Peso: "+Pokemon.getPeso()+"\n"+"Idade: "+Pokemon.getIdade());
        }



        return pokemons;
    }
}
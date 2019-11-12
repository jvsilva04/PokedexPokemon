package pokedex;

import javax.swing.JOptionPane;

public class AtualizarPokemon {

	    public static Pokemon[] retornaPokemonCadastrado(Pokemon[] pokemons) {
	    	int codigo;
	    	String nome;
	    	double peso;
	    	int idade;
	        int resposta;
	        
	        codigo = Integer.parseInt(JOptionPane.showInputDialog("Informe o codigo do pokemon: \n"));
	        codigo = codigo-1;
	        if(pokemons[codigo] == null) {
	        	do {
	        		resposta = Integer.parseInt(JOptionPane.showInputDialog("Pokemon não cadastrado. \n"+"Deseja Cadastrar? \n"+"1- Sim ou 2- Não \n"));
	        		switch(resposta) {
	        		case 1:
	        			CadastrarPokemon.cadastraPokemon(pokemons);
	        			resposta=2;
	        			break;
	        		case 2:
	        			break;
	        		default:
	        			JOptionPane.showMessageDialog(null, "Opção invalida.");
	        			break;
	        		}
	        	} while(resposta !=2 );
	        	
	        }else {
	        	do {
	        	
	        		resposta=Integer.parseInt(JOptionPane.showInputDialog("Selecione uma opção: \n"+"1- Atualizar nome. \n"+"2- Atualizar Peso. \n"+
	        			"3- Atualizar idade. \n"+"0- Sair. \n"));
	        		switch(resposta) {
	        		case 1:
	        			nome = JOptionPane.showInputDialog("Insira o novo nome: \n");
	        			pokemons[codigo].setNome(nome);
	        			resposta=0;
	        			break;
	        		case 2:
	        			peso = Double.parseDouble(JOptionPane.showInputDialog("Insira o novo peso: \n"));
	        			pokemons[codigo].setPeso(peso);
	        			resposta=0;
	        			break;
	        		case 3:
	        			idade = Integer.parseInt(JOptionPane.showInputDialog("Insira a nova idade: \n"));
	        			pokemons[codigo].setIdade(idade);
	        			resposta=0;
	        			break;
	        		case 0:
	        			break;
	        		default:
	        			JOptionPane.showMessageDialog(null,"Opção Invalida");
	        			break;
	        		}
	        	} while (resposta !=0 );


	        
	        }
	        return pokemons;
	    }


}

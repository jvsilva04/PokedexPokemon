package pokedex;

import javax.swing.JOptionPane;

public class cadastraPokemon {
		public static Pokemon[] cadastraPokemon(Pokemon[] pokemons) {
	        Integer codigo;
	        String nome;
	        Double peso;
	        Integer idade;
	        
	        codigo = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o código do pokemon:"));
	        if (codigo >= 1 || codigo <= 151){
	            codigo = codigo -1;



	        nome = JOptionPane.showInputDialog(null,"Digite o nome do pokemon:");
	        peso = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o peso do pokemon:"));
	        idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a idade do pokemon:"));

	        pokemons[codigo] = new Pokemon(codigo, nome, peso, idade);
	        return pokemons;
	    }else {
	    	JOptionPane.showMessageDialog(null, "Codigo do Pokemon não identificado, favor inserir um numero entre 1 e 151. \n");
	    	return cadastraPokemon.cadastraPokemon(pokemons);
	    }
	}
}



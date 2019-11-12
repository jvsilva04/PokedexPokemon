package pokedex;

public class Pokemon {
	 private String nome;
	 	private int codigo;
	    private double peso;
	    private Integer idade;
	    
	    public Pokemon(int cod, String nome, double peso, int idade) {
	    	this.codigo = cod;
	    	this.nome = nome;
	    	this.peso = peso;
	    	this.idade = idade;
	    }
	    
	    public void setCodigo(int codigo) {
	    	this.codigo = codigo;
	    }
	    public int getCodigo() {
	    	return codigo;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public double getPeso() {
	        return peso;
	    }

	    public void setPeso(double peso) {
	        this.peso = peso;
	    }

	    public Integer getIdade() {
	        return idade;
	    }

	    public void setIdade(Integer idade) {
	        this.idade = idade;
	    }
}

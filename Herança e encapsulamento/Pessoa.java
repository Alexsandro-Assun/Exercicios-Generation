package POO;

public class Pessoa {
	
	private String nome;
	private String telefone;
	private String enderešo;
	
	public  Pessoa(String nome) {
		this.nome = nome;

	}
	
	public  Pessoa() {
		
	}
	
	public  Pessoa(String nome,String tel,String end){
		this.nome = nome;
		this.telefone = tel;
		this.enderešo = end;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEnderešo() {
		return enderešo;
	}
	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}
	
	
}

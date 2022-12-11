package strategy.comparator;

public class Animal {
	private Long id;
	private String nome;
	
	@Override
	public String toString() {
		return "Animal [id=" + id + ", nome=" + nome + "]";
	}

	public Animal(Long id, String nome) {
		this.setId(id);
		this.setNome(nome);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}

public class Cliente {
	private String nome;
	private float montanteVendas;

	public void setNome(String nome){
		this.nome=nome;
	}

	public String getNome(){
		return this.nome;
	}

	public void setMontanteVendas(float montanteVendas){
		this.montanteVendas=montanteVendas;
	}

	public float getMontanteVendas(){
		return this.montanteVendas;
	}

	public String toString(){
	String r;
	r = "\nNome: "+this.nome+"\nMontanteVendas: "+this.montanteVendas;
	return r;
	}
}

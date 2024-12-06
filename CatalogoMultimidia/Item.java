public class Item{
    private String titulo;
    private float duracao;
    private String comentario;
    
    public String getTitulo() {
		return titulo;
	}
	public boolean setTitulo(String titulo) {
		this.titulo = titulo;
		return true;
	}
	public float getDuracao() {
		return duracao;
	}
	public boolean setDuracao(float duracao) {
		this.duracao = duracao;
		return true;
	}
	public String getComentario() {
		return comentario;
	}
	public boolean setComentario(String comentario) {
		this.comentario = comentario;
		return true;
	}
}
import java.util.ArrayList;

public class Catalogo{
    private String colecionador;
    private ArrayList<Item> itens;
    
    public Catalogo(String colecionador){
        this.colecionador = colecionador;
        this.itens = new ArrayList<Item>();
        }

    public String toString(){
        String texto = "Colecionador: "+this.colecionador+"\n";
        texto += "Albuns: \n";
        for(Item alb: itens){
            texto += "Titulo: "+alb.getTitulo()+", "+
          //  "Artista: "+alb.getArtista()+", "+
          //  "Faixas: "+alb.getFaixas()+", "+
            "Duracao: "+alb.getDuracao()+", "+
            "Comentario: "+alb.getComentario()+"\n";
        }
        return texto;
    }
}

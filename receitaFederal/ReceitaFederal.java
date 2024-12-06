import java.util.ArrayList;

public class ReceitaFederal {
    private ArrayList<Pessoa> pessoas;
    public ReceitaFederal(){
    this.pessoas = new ArrayList<Pessoa>();
    }
    public void addPessoa(Pessoa umaPessoa){
    this.pessoas.add(umaPessoa);
    }
    public void imprimirContribuintesDadosBasicos(){
    for(Pessoa umaPessoa : this.pessoas){
    System.out.println(umaPessoa.toString());
    }
    }
    public void imprimirContribuintesDadosCompletos(){
    for(Pessoa umaPessoa : this.pessoas){
    System.out.println(umaPessoa.toString()+", Imposto:"+umaPessoa.calcularImposto());
    }
    }
}
    
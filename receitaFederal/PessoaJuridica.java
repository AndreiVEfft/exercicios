public class PessoaJuridica extends Pessoa{
    private String cnpj;
    private double faturamento;
    private int categoria;
public PessoaJuridica(String nome, String endereco, String cnpj, double faturamento, int categoria){
super (nome, endereco);
    this.cnpj = cnpj;
    this.faturamento = faturamento;
    this.categoria = categoria;
}
public String tostring(){
    return super.toString()+", CNPJ: "+ cnpj + ", Faturamento: "+ faturamento+", Categoria:" + categoria;
}
public double calcularImposto(){
double imposto = 0;
switch(this. categoria){
    case 1:{
        imposto = this.faturamento * 0.02f;
        break;
    }
    case 2: {
        imposto = this.faturamento * 0.05f;
        break;
    }
    case 3: {
        imposto = this.faturamento * 0.15f;
        break;
    }

    }
    return imposto;
}
}
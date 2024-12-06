
/**
 * Escreva uma descrição da classe Pessoa aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Pessoa
{
    private String nome;
    private int idade;
    private String sexo;
    

    public String getNome(){
        return this.nome;
    }
    public boolean setNome(String nome){
        if (nome != null){
            this.nome = nome;
            return true;
        }
        else
        {
            return false;
        }
    }
    public int getIdade(){
        return this.idade;
    }
    public boolean setIdade(int idade){
        if (idade > 0){
            this.idade = idade;
            return true;
        }
        else{
            return false;
        }
    }
    public String getSexo(){
        return this.sexo;
    }
    public boolean setSexo(String sexo){
        String msc = "masculino";
        String fmn = "feminino";
        if(sexo.equalsIgnoreCase(msc) || sexo.equalsIgnoreCase(fmn)){
            this.sexo = sexo;
            return true;
        }
        else{
            return false;
        }
    }
    public void fazerAniversario(){
        this.idade++;
    }
}

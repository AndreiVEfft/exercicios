public class Aluno extends Pessoa{
    private int matricula;
    private String curso;
    
    public int getMatricula(){
        return this.matricula;
    }
    public boolean setMatricula(int matricula){
        this.matricula = matricula;
        return true;
    }
    
}
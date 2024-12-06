public class PessoaFisica extends Pessoa{
     private int rg;
     private String cpf;
     private double salarioMensal;
     private int dependentes;
    
     public PessoaFisica(String nome,String endereco,int rg,String cpf,double
    salarioMensal,int dependentes){
     super(nome,endereco);
     this.rg=rg;
     this.cpf=cpf;
     this.salarioMensal=salarioMensal;
     this.dependentes=dependentes;
     }
    
     public String toString(){
     return super.toString()+",RG:"+rg+",CPF:"+cpf+",SalarioMensal:" +salarioMensal+",Dependentes:"+dependentes;
     }
    
     public double calcularImposto(){
     //percentual sobreo salario mensal conforme tabela
     double imposto=0;
     if(this.salarioMensal<= 500){
     imposto=0;
     }else{
     if(this.salarioMensal<=1000){
     imposto=this.salarioMensal*0.05f;
     }else{
     imposto=this.salarioMensal*0.07f;
     }
     }
    
     // descontarr R$50,00 por dependente
     imposto=imposto-(50* this.dependentes);
     if (imposto<0){//se ficou imposto negativo,entao imposto volta para zero
     imposto=0;
     }
    
     return imposto;
     }
     }
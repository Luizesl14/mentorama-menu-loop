package exercicioModulo07;

public class ContaPoupanca extends Conta {

    private int diaAniversario;
    private double taxaDeJuros;

    //costrutor
    // recebendo como erança  atributos Classe Conta 
    public ContaPoupanca(int agencia, int numero, String banco, double saldo, int diaAniversario, double taxaDeJuros){
       super(agencia, numero, banco, saldo);
       this.diaAniversario = diaAniversario;
       this.taxaDeJuros =  taxaDeJuros;
    }


    // Getter and Setter dia Aniversario

      public int getDiaAniversario() {
        return this.diaAniversario;
    }

    public void setDiaAniversario(int dia) {
        this.diaAniversario = dia;

    }

    // Getter and Setter dia Taxa de Juros.

       public double getTaxaDeJuros() {
        return this.taxaDeJuros;
    }

    public void setTaxaDeJuros(int taxa) {
        this.taxaDeJuros = taxa;

    }

    // obrigado a implementat methodo getSaldo()
    //methodo abstrato
   @Override
   public double getSaldo() {
       return  this.saldo += this.taxaDeJuros * this.saldo;
   }

       // toString
    
       @Override
       public String toString() {
   
           return "Conta{" +
           "Saldo Conta Poupança= " + saldo +
           "}";
       }


    
}

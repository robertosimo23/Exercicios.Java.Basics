
public class BancoTerminal {
    
    public static void main (String[]args){
        double saldo = 25;
        double valorSolicitado = 18;
        
    
        if (saldo>= valorSolicitado) {
            saldo-=valorSolicitado;
            System.out.println("Transação Realizada com Sucesso");
        }else{
            System.out.println("Saldo Insuficiente");
        }

        System.out.println("Saldo:" + saldo);


        saldo=15;
        valorSolicitado=22;

        if (saldo>=valorSolicitado) {
            saldo-=valorSolicitado;
        System.out.println("Transação Realizada com Sucesso");
        }else{
        System.out.println("Saldo Insuficiente");
        }
        System.out.println("Saldo:" + saldo);
            
        }
    }


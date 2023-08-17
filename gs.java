package global;
import java.util.Scanner;

public class gs {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        //VARIÁVEIS
        int nFamilia = 0;
        String nome[] = new String[5], maiorFat = "", menorL = "";
        double invMensal[] = new double[5], fatMensal[] = new double[5], lucro[] = new double[5], 
        		maiorFaturamento = 0, menorLucro = Double.MAX_VALUE, invTotal = 0, fatTotal = 0, lucroTotal = 0, percentualLucro = 0;

        //NÚMERO DE REPETIÇÃO
        System.out.println("Quantas famílias agricultoras que receberam o investimento para lavoura?");
        nFamilia = e.nextInt();

        for (int i = 0; i < nFamilia; i++) {
            System.out.println("Qual o nome da família?");
            nome[i] = e.next();
            System.out.println("Qual o investimento mensal recebido em R$?");
            invMensal[i] = e.nextDouble();
            System.out.println("Qual o faturamento mensal das vendas dos alimentos cultivados?");
            fatMensal[i] = e.nextDouble();
            lucro[i] = fatMensal[i] - invMensal[i];
            System.out.println("Lucro sobre as vendas mensais dos alimentos: " + lucro[i]);

            lucroTotal += lucro[i];
            invTotal += invMensal[i];
            fatTotal += fatMensal[i];

            if (fatMensal[i] > maiorFaturamento) {
                maiorFat = nome[i];
                maiorFaturamento = fatMensal[i];
            }

            if (lucro[i] < menorLucro) {
                menorL = nome[i];
                menorLucro = lucro[i];
            }
        }
        for (int i = 0; i < nFamilia; i++) {
            System.out.println("------------------");
            System.out.println("Familia " + nome[i]);
            System.out.println("Investimento mensal recebido: R$" + invMensal[i]);
            System.out.println("Faturamento mensal: R$" + fatMensal[i]);
            System.out.println("Lucro sobre as vendas mensais: " + lucro[i]);
        }
        System.out.println("------------------");
        System.out.println("Família com o maior faturamento: " + maiorFat);
        System.out.println("Valor do faturamento: " + maiorFaturamento);

        System.out.println("Família com o menor lucro: " + menorL);
        System.out.println("Valor do lucro: " + menorLucro);

        System.out.println("Soma dos investimentos das famílias: " + invTotal);
        percentualLucro = (lucroTotal / fatTotal) * 100;
        System.out.println("Percentual de lucro sobre as vendas de todas as famílias: " + percentualLucro + "%");
    }//MAIN
}

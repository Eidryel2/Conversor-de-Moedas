import java.util.Scanner;

public class Menu   {
    public static <main> void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int opcao = 0;
        Main main = new Main();





        String menu = """  
                    ******************* Bem Vindo ao conversor de moedas *******************
                    Selecione uma opçaõ : 
                                        
                    1 - [USD] para [BRL] 
                    2 - [BRL] para [USD] 
                    3 - [EUR] para [BRL] 
                    4 - [BRL] para [EUR]
                    5 - [USD] para [EUR]
                    6 - [BRL] para [GBP]
                    7 - SAIR
                    """ ;

        while (opcao != 7) {
            try {
                System.out.println(menu);
                opcao = (int) scanner.nextDouble();
                double valor;

                if(opcao == 1) {
                    System.out.println("Digite o valor");
                    valor = scanner.nextDouble();
                    Conversor conversao = main.conversor("USD", "BRL", valor);
                    System.out.println("O valor de: " + valor + " USD convertido para real é: " + conversao + " BRL");
                } else if (opcao == 2) {
                    System.out.println("Digite o valor");
                    valor = scanner.nextDouble();
                    Conversor conversao = main.conversor("BRL", "USD", valor);
                    System.out.println("O valor de: " + valor + " BRL convertido para dolar é: " + conversao + " USD");
                } else if (opcao == 3) {
                    System.out.println("Digite o valor");
                    valor = scanner.nextDouble();
                    Conversor conversao = main.conversor("EUR", "BRL", valor);
                    System.out.println("O valor de: " + valor + " EUR convertido para  real é: " + conversao + " ARS");
                } else if (opcao == 4) {
                    System.out.println("Digite o valor");
                    valor = scanner.nextDouble();
                    Conversor conversao = main.conversor("BRL", "EUR", valor);
                    System.out.println("O valor de: " + valor + " BRL convertido para   euro é: " + conversao + " USD");
                } else if (opcao == 5) {
                    System.out.println("Digite o valor");
                    valor = scanner.nextDouble();
                    Conversor conversao = main.conversor("USD", "EUR", valor);
                    System.out.println("O valor de: " + valor + " USD convertido para Peso euro é: " + conversao + " ARS");
                } else if (opcao == 6) {
                    System.out.println("Digite o valor");
                    valor = scanner.nextDouble();
                    Conversor conversao = main.conversor("BRL", "GBP", valor);
                    System.out.println("O valor de: " + valor + " BRL convertido para libra é: " + conversao + " BRL");
                } else if (opcao != 7) {
                    System.out.println("Opção invalida");
                } else System.out.println("Finalizando a Aplicação");

            } catch (Exception e) {
                System.out.println("Não converter, verefique  se você digitou o valor certo, por faovr.");
                System.out.println("Aplicação Finalizada");
                break;






            }


        }
    }
}
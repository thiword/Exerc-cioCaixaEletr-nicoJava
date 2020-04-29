package Marcio;
import java.util.Scanner;
public class AC1 {

    public static void main(String[] arg){
        Scanner ler = new Scanner(System.in);

        // Variaveis
        int f = 1; // Finalização do processo
        int vm = 1; // Volta ao Menu
        int saldo = 0;
        int deposito;
        int saque;

        String senha;
        String operacao;

        do{
            // Mensagem de boas vindas
            System.out.println("Ola! Seja bem ao seu banco!");

            //entrada do cpf
            System.out.println("Digite seu CPF: ");
            String cpf = ler.next();

            //Verificando cpf
            if(!cpf.equals("111.222.333-44")){

                // Se for diferente de 111.222.333-44
                System.out.println("Acesso não permitido");
                break;

            }else{ //Se for igual a 111.222.333-44

                // Entrada da senha e verificação
                for(int ts = 0;ts < 3;ts++){

                    //Entrada da senha
                    System.out.println("Digite sua senha: ");
                    senha = ler.next();

                    // Verificação
                    if(!senha.equals("01020304")){ // se for diferente
                        //Retorna
                    }else{
                        ts = 5; //finaliza for

                        // Se tudo estiver correto vamos para o menu
                    }

                    if(ts == 2 && !senha.equals("01020304")){ // Se a senha for errada 3 vzs e a senha continuar errada
                        System.out.println("conta bloqueada");
                        ts = 5; // Finaliza
                        System.exit(0);
                    }
                }
            }

            do{
                for(int nm = 0; nm < 5; nm++){  // nm = numero do menu
                    // este for é para o caso de a pessoa digitar um numero deifente
                    // Menu
                    System.out.println("Escolha uma opção");
                    System.out.println("=====================");
                    System.out.println("1 - Saldo");
                    System.out.println("2 - Depósito");
                    System.out.println("3 - Saque");
                    System.out.println("0 - Sair ");
                    System.out.println("=====================");

                    //Escolha do menu
                    int menu = ler.nextInt();

                    if (menu != 0 && menu != 1 && menu != 2 && menu != 3) {
                        nm = nm - 1;
                        System.out.println("Este número não esta no menu");
                    }else{
                        switch(menu){
                            case 1:
                                nm =  6;// finalizando for
                                System.out.println("saldo: R$" + saldo+ ",00");
                                break;


                            case 2:
                                nm =  6;// finalizando for
                                System.out.println("valor do deposito: ");
                                deposito = ler.nextInt();

                                saldo = saldo + deposito;

                                System.out.println("Seu saldo agr é de: R$" + saldo+ ",00");
                                break;

                            case 3:
                                nm =  6;// finalizando for

                                if(saldo <= 0){
                                    System.out.println("Seu saldo está negativo, não pode retirar.");
                                    break;
                                }else{
                                    System.out.println("Valor do saque: ");
                                    saque = ler.nextInt();

                                    saldo = saldo - saque;
                                    System.out.println("salgo agr é de: R$" + saldo+ ",00");
                                    break;
                                }
                            default:
                                System.out.println("obg pela visita s2");
                                System.exit(0); // Finaliza  tudo
                        }
                    }
                }

                System.out.println("Realizar nova operação?");
                operacao = ler.next();

                if(operacao.equals("Sim")){
                    //volta operação
                }else if(operacao.equals("Não")){  //Tela inicial
                    vm = 0;
                }else{
                    vm = 0;//Tela inicial
                }

            }while(vm != 0);

        }while(f != 0);
    }
}
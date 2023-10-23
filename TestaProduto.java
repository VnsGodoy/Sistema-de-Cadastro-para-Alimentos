import java.util.Scanner;

public class TestaProduto {

    static Scanner input = new Scanner(System.in);
    static public boolean continua = true;
    public static void main(String[] args) {

        int choose;
        while (continua){

            System.out.printf("*******************************************\n");
            System.out.println("-> Escolha o que deseja: \n\t [1] Criar Produto \n\t [2] Criar Produto Perecivel \n\t [3] Sair \n ");
             System.out.printf("*******************************************\n");
            choose = input.nextInt();

            switch(choose) {

                case 1:
                    choose_1();
                        break;

                case 2:
                    choose_2();
                        break;

                default: System.exit(0);
            }
        }
    }

    public static void choose_1(){

        System.out.println("-> Digite a descrição do produto: ");
            input.nextLine();
                
        String desc = input.nextLine();

        System.out.println("-> Digite o valor do produto: ");
            double valor = input.nextDouble();

        Produto produto = new Produto(desc, valor);

        System.out.println(produto.toString());

        continua = true;
    }

    public static void choose_2(){

        System.out.println("-> Digite a descrição do produto: ");
            input.nextLine();

        String desc = input.nextLine();

        System.out.println("-> Digite o valor do produto: ");
        double valor = input.nextDouble();

        System.out.println("-> Digite a validade do produto: ");

        int[] validity = new int[3];

        for(int i = 0; i < 3; i++){

            validity[i] = input.nextInt();

            System.out.print("/");
        }

        Perecivel perecivel = new Perecivel(desc, valor, validity);

        System.out.println(perecivel.toString());

        if(perecivel.Expired()){

            System.out.println("-> O produto está vencido");
        } 
        
        else {

            System.out.println("-> O produto não está vencido");
        }
        
        System.out.println("-> Digite o valor do desconto a ser aplicado: ");

            double percentage = input.nextDouble();
                perecivel.Discount(percentage);

        System.out.println(perecivel.toString());

            continua = true;

        }
        
}
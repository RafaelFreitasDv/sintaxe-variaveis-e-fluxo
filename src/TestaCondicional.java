public class TestaCondicional {

    public static void main(String[] args) {
        System.out.println("testando condicionais");

        int idade = 2;
        int quantidadePessoas = 1;

        if (idade >= 18) {
            System.out.println("Você tem mais que 18 anos");
            System.out.println("Seja bem vindo");
        } else {
        	if (quantidadePessoas >= 2) {
        		System.out.println("Você não tem 18, mas está acompanhado, então pode entrar");
        		       	
        	} else {
            System.out.println("Infelizmente voce nao pode entrar");
        }
    
        }

    }
    
}

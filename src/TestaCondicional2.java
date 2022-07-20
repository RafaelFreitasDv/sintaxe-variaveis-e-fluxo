
public class TestaCondicional2 {

    public static void main(String[] args) {
        System.out.println("testando condicionais");

        int idade = 18;
        int quantidadePessoas = 1;
        //boolean "ou" = maior de 18 ou acompanhado por um
        if (idade >= 18 || quantidadePessoas >= 2) {
            System.out.println("1 - Você tem mais que 18 anos");
            System.out.println("Seja bem vindo");
        } else {
            System.out.println("1 - Infelizmente voce nao pode entrar");
        }
        //boolean "e" = idade maior de  18 e 2 pessoas
        idade = 16;
        quantidadePessoas = 2;
        
        
        if (idade >= 18 && quantidadePessoas >= 2) {
            System.out.println("2- Você tem mais que 18 anos");
            System.out.println("Seja bem vindo");
        } else {
            System.out.println("2- Infelizmente voce nao pode entrar");
        }
        // boolean variavel
        idade = 18;
        quantidadePessoas = 1;
        
        boolean acompanhado = quantidadePessoas >=2;
        
        if (idade >= 18 && acompanhado) {
            System.out.println("3 - Você tem mais que 18 anos");
            System.out.println("Seja bem vindo");
        } else {
            System.out.println("3- Infelizmente voce nao pode entrar");
        }
        }

    }
    

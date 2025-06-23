import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        System.out.println("*******************************************");
        System.out.println("**************** TERMINAL *****************");
        System.out.println("*******************************************");
        
        var scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o número da conta.");
        Integer conta = scanner.nextInt();
        
        System.out.println("Por favor, digite sua agência.");
        String agencia = scanner.next();
        
        System.out.println("Por favor, digite seu nome.");
        String nome = scanner.next();
        
        System.out.println("Por favor, digite saldo da conta.");
        Double saldo = scanner.nextDouble();

        String mensagem = "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque.";
        System.out.printf(mensagem, nome, agencia, conta, saldo);

        System.out.println("");
        System.out.println("");

        scanner.close();
    }
}

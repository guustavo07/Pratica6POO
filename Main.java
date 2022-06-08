import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException{
        Select select =  new Select();
        Scanner ler = new Scanner(System.in);
        int options = 0, id;
        while (options != 4) {
            System.out.println("1 - Buscar Livros\n2 - Buscar Clientes \n3 - Buscar Pedidos \n4 - Sair");
            options = ler.nextInt();
            switch (options) {
                case 1:
                    System.out.println("============= LIVROS =============");
                    try {
                        select.buscaLivros();
                    } catch (ClassNotFoundException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 2:
                    System.out.println("============= CLIENTES =============");
                    try {
                        select.buscaClientes();
                    } catch (ClassNotFoundException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 3:
                    System.out.println("============= PEDIDOS POR CLIENTES =============");
                    System.out.println("Escreva o id do cliente: ");
                    id = ler.nextInt();
                    try {
                        select.buscarPedidos(id);
                    } catch (ClassNotFoundException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 4:
                    System.out.println("SISTEMA ENCERRADO!");
                    break;
                default:
                    System.out.println("Opção Invalida!");
                    break;

            }
        }

    }
}

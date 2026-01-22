import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Jogo> jogos = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n=== GAME LIBRARY ===");
            System.out.println("1 - Adicionar jogo");
            System.out.println("2 - Listar jogos");
            System.out.println("3 - Marcar como zerado");
            System.out.println("4 - Avaliar jogo");
            System.out.println("5 - Remover jogo");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do jogo: ");
                    String nome = scanner.nextLine();

                    System.out.print("Plataforma: ");
                    String plataforma = scanner.nextLine();

                    jogos.add(new Jogo(nome, plataforma));
                    System.out.println("Jogo adicionado!");
                    break;

                case 2:
                    if (jogos.isEmpty()) {
                        System.out.println("Nenhum jogo cadastrado.");
                    } else {
                        for (int i = 0; i < jogos.size(); i++) {
                            System.out.println(i + " - " + jogos.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Número do jogo: ");
                    int zerar = scanner.nextInt();
                    jogos.get(zerar).zerar();
                    System.out.println("Jogo marcado como zerado!");
                    break;

                case 4:
                    System.out.print("Número do jogo: ");
                    int avaliar = scanner.nextInt();

                    System.out.print("Nota (0 a 10): ");
                    int nota = scanner.nextInt();

                    jogos.get(avaliar).avaliar(nota);
                    System.out.println("Jogo avaliado!");
                    break;

                case 5:
                    System.out.print("Número do jogo: ");
                    int remover = scanner.nextInt();
                    jogos.remove(remover);
                    System.out.println("Jogo removido!");
                    break;

                case 0:
                    System.out.println("Saindo da Game Library...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }
}

import java.util.ArrayList;
import java.util.Scanner;

class Pessoa {
    String nome;
    int idade;
}

class Musica {
    String titulo;
    int duracao;
    String compositor;

    void tocarMusica() {
        System.out.println("Tocando música: " + titulo);
    }
}

class Album {
    String genero;
    int ano;
    String nome;
    String artista;
    ArrayList<Musica> musicas = new ArrayList<>();

    void mostraTodosOsDados() {
        System.out.println("Gênero: " + genero);
        System.out.println("Ano: " + ano);
        System.out.println("Nome: " + nome);
        System.out.println("Artista: " + artista);
        System.out.println("Músicas:");
        for (Musica musica : musicas) {
            System.out.println("- " + musica.titulo);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pessoa pessoa = new Pessoa();
        System.out.println("Digite o nome da pessoa:");
        pessoa.nome = scanner.nextLine();
        System.out.println("Digite a idade da pessoa:");
        pessoa.idade = scanner.nextInt();
        scanner.nextLine();

        Musica musica = new Musica();
        System.out.println("Digite o título da música:");
        musica.titulo = scanner.nextLine();
        System.out.println("Digite a duração da música em segundos:");
        musica.duracao = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o compositor da música:");
        musica.compositor = scanner.nextLine();

        Album album = new Album();
        System.out.println("Digite o gênero do álbum:");
        album.genero = scanner.nextLine();
        System.out.println("Digite o ano do álbum:");
        album.ano = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o nome do álbum:");
        album.nome = scanner.nextLine();
        System.out.println("Digite o nome do artista:");
        album.artista = scanner.nextLine();

        album.musicas.add(musica);

        System.out.println("\nDados do álbum:");
        album.mostraTodosOsDados();

        scanner.close();
    }
}
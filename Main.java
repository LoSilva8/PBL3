import java.util.ArrayList;

class Usuario {
    private String nome;
    private ArrayList<Playlist> playlists;

    public Usuario() {
        this.playlists = new ArrayList<>();
    }

    public Usuario(String nome) {
        this.nome = nome;
        this.playlists = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Playlist> getPlaylists() {
        return playlists;
    }

    public void adicionarPlaylist(Playlist playlist) {
        playlists.add(playlist);
    }
}

class Playlist {
    private String nome;
    private ArrayList<Musica> musicas;

    public Playlist() {
        this.musicas = new ArrayList<>();
    }

    public Playlist(String nome) {
        this.nome = nome;
        this.musicas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Musica> getMusicas() {
        return musicas;
    }

    public void adicionarMusica(Musica musica) {
        musicas.add(musica);
    }
}

class Genero {
    private String nome;

    public Genero() {
    }

    public Genero(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

class Artista {
    private String nome;

    public Artista() {
    }

    public Artista(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

class PlanoAssinatura {
    private String tipo;

    public PlanoAssinatura() {
    }

    public PlanoAssinatura(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

class Musica {
    private String titulo;
    private Artista artista;
    private Genero genero;

    public Musica() {
    }

    public Musica(String titulo, Artista artista, Genero genero) {
        this.titulo = titulo;
        this.artista = artista;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
}

public class Main {
    public static void main(String[] args) {

        Usuario usuario1 = new Usuario("Juninho");
        Playlist playlist1 = new Playlist("Rotacao do Juninho");
        Musica musica1 = new Musica("Solo Dolo, PT III", new Artista("Kid Cudi"), new Genero("Rap"));
        Musica musica2 = new Musica("way back", new Artista("Travis Scott"), new Genero("Rap"));
        Musica musica3 = new Musica("Doing It Wrong", new Artista("Drake"), new Genero("R&B"));
        PlanoAssinatura plano1 = new PlanoAssinatura("Premium");


        usuario1.adicionarPlaylist(playlist1);
        playlist1.adicionarMusica(musica1);
        playlist1.adicionarMusica(musica2);
        playlist1.adicionarMusica(musica3);


        System.out.println("Nome do usuario: " + usuario1.getNome());
        System.out.println("Playlists de " + usuario1.getNome() + ":");
        for (Playlist playlist : usuario1.getPlaylists()) {
            System.out.println("- " + playlist.getNome());
            System.out.println("   Musicas:");
            for (Musica musica : playlist.getMusicas()) {
                System.out.println("   - " + musica.getTitulo() + " (" + musica.getArtista().getNome() + ", " + musica.getGenero().getNome() + ")");

            }
        }
        System.out.println("Plano de assinatura: " + plano1.getTipo());
    }
}

package co.edu.uniquindio.Model.Entidades;

import java.util.Objects;

public class Cancion {
    private String id;
    private String titulo;
    private String artista;
    private String genero;
    private int año;
    private int duracion;
    //Constructor general
    public Cancion(){

    }

    //Constructor con parametros
    public Cancion(String id, String titulo, String artista, String genero, int año, int duracion){
        this.id = id;
        this.titulo = titulo;
        this.artista = artista;
        this.genero = genero;
        this.año = año;
        this.duracion = duracion;
    }

    //obtener duracion formateada
    public  String obtenerDuracionFormateada(){
        int minutos = duracion / 60;
        int segundos = duracion % 60;
        return String.format("%d:%02d", minutos, segundos );
    }

    //HASHCODE basado en id
    @Override
    public int hashCode(){
        return Objects.hash(id);

    }

    //EQUALS BASADO EN ID
    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Cancion cancion = (Cancion) obj;
        return Objects.equals(id, cancion.id);

    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return "Cancion{" +
                "id='" + id + '\'' +
                ", titulo='" + titulo + '\'' +
                ", artista='" + artista + '\'' +
                ", genero='" + genero + '\'' +
                ", año=" + año +
                ", duracion=" + duracion +
                '}';
    }
}

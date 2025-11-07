package co.edu.uniquindio.Service;

import java.util.Objects;


public class CancionService {
     private String id;
    private String titulo;
    private String artista;
    private String genero;
    private int año;
    private int duracion; // en segundos

    /**
     * Constructor de la clase Cancion.
     * 
     * @param id Identificador único de la canción
     * @param titulo Título de la canción
     * @param artista Artista de la canción
     * @param genero Género musical de la canción
     * @param año Año de lanzamiento
     * @param duracion Duración en segundos
     */
    public CancionService(String id, String titulo, String artista, String genero, int año, int duracion) {
        this.id = id;
        this.titulo = titulo;
        this.artista = artista;
        this.genero = genero;
        this.año = año;
        this.duracion = duracion;
    }

    // Getters y Setters
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

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    /**
     * RF-018: Implementa equals basado en el ID de la canción.
     * 
     * @param obj Objeto a comparar
     * @return true si las canciones tienen el mismo ID
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        CancionService cancion = (CancionService) obj;
        return Objects.equals(id, cancion.id);
    }

    /**
     * RF-018: Implementa hashCode basado en el ID de la canción.
     * 
     * @return código hash basado en el ID
     */
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return String.format("%s - %s (%d) [%s]", artista, titulo, año, genero);
    }
}

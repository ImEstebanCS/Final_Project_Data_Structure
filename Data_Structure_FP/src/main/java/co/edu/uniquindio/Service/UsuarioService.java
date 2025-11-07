package co.edu.uniquindio.Service;

import java.util.LinkedList;
import java.util.Objects;

import co.edu.uniquindio.Model.Entidades.Cancion;
import co.edu.uniquindio.Model.Entidades.Usuario;

public class UsuarioService {
    private String username;
    private String password;
    private String nombre;
    private LinkedList<Cancion> cancionesFavoritas;

    /**
     * Constructor de la clase Usuario.
     * 
     * @param username Nombre de usuario único
     * @param password Contraseña del usuario
     * @param nombre Nombre completo del usuario
     */
    public UsuarioService(String username, String password, String nombre) {
        this.username = username;
        this.password = password;
        this.nombre = nombre;
        this.cancionesFavoritas = new LinkedList<>();
    }

    // Getters y Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Cancion> getCancionesFavoritas() {
        return cancionesFavoritas;
    }

    public void setCancionesFavoritas(LinkedList<Cancion> cancionesFavoritas) {
        this.cancionesFavoritas = cancionesFavoritas;
    }

    /**
     * Agrega una canción a la lista de favoritos.
     * 
     * @param cancion Canción a agregar
     */
    public void agregarFavorita(Cancion cancion) {
        if (!cancionesFavoritas.contains(cancion)) {
            cancionesFavoritas.add(cancion);
        }
    }

    /**
     * Elimina una canción de la lista de favoritos.
     * 
     * @param cancion Canción a eliminar
     */
    public void eliminarFavorita(Cancion cancion) {
        cancionesFavoritas.remove(cancion);
    }

    /**
     * RF-015: Implementa equals basado en el username.
     * 
     * @param obj Objeto a comparar
     * @return true si los usuarios tienen el mismo username
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        UsuarioService usuario = (UsuarioService) obj;
        return Objects.equals(username, usuario.username);
    }

    /**
     * RF-015: Implementa hashCode basado en el username.
     * 
     * @return código hash basado en el username
     */
    @Override
    public int hashCode() {
        return Objects.hash(username);
    }

    @Override
    public String toString() {
        return String.format("Usuario{username='%s', nombre='%s', favoritas=%d}", 
                username, nombre, cancionesFavoritas.size());
    }
}

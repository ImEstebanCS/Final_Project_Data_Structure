package co.edu.uniquindio.Model.Entidades;

import java.util.LinkedList;
import  java.util.Objects;

public class Usuario {
    private String nickname;
    private String contraseña;
    private String nombre;
    private LinkedList<Cancion> listaFavoritos;
    //Constructor
    public Usuario(){
        this.listaFavoritos = new LinkedList<>();
    }

    //Constructor parametros
    public Usuario(String nickname, String contraseña, String nombre){
        this.nickname = nickname;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.listaFavoritos = new LinkedList<>();
    }
    //Metodo para agregar una cancion ala lista de favoritos
    public boolean agregarFavorita(Cancion cancion){
        if(!listaFavoritos.contains(cancion)){
            listaFavoritos.add(cancion);
            return true;
        }
       return false;

    }
    //Metodo para eliminar una cancion de favoritos
    public boolean EliminarFavorito(Cancion cancion){
        return  listaFavoritos.remove(cancion);
    }


    //Metodo que verifica si una cancion esta en favoritos
    public boolean esFavorita(Cancion cancion){
        return  listaFavoritos.contains(cancion);
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Cancion> getListaFavoritos() {
        return listaFavoritos;
    }

    public void setListaFavoritos(LinkedList<Cancion> listaFavoritos) {
        this.listaFavoritos = listaFavoritos;
    }
    //Hascode para nickname
    public int hashCode(){
        return Objects.hash(nickname);
    }
    //Equals para nickname
    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Usuario usuario = (Usuario) obj;
        return Objects.equals(nickname, usuario.nickname);

    }
    @Override
    public String toString() {
        return "Usuario{" +
                "nickname='" + nickname + '\'' +
                ", contraseña='" + contraseña + '\'' +
                ", nombre='" + nombre + '\'' +
                ", listaFavoritos=" + listaFavoritos.size() +
                '}';
    }
}

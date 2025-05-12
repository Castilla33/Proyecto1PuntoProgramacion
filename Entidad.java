
import java.io.Serializable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Clase Entidad. Clase abastracta de la cual no se crean objetos pero, tanto la clase Jugador como Enemigo heredan atributos que les son comunes.
 * @version 1.0
 * @author Mario
 */
abstract class Entidad implements Serializable {
    
    private static final long serialVersionUID = 3;

    private int puntosSalud;
    private int puntosAtaque;
    private String nombre;

    public Entidad(int puntosSalud, int puntosAtaque, String nombre) {
        this.puntosSalud = puntosSalud;
        this.puntosAtaque = puntosAtaque;
        this.nombre = nombre;
    }

    public int getPuntosSalud() {
        return puntosSalud;
    }

    public int getPuntosAtaque() {
        return puntosAtaque;
    }

    public String getNombre() {
        return nombre;
    }

    public void setPuntosSalud(int puntosSalud) {
        this.puntosSalud = puntosSalud;
    }

    public void setPuntosAtaque(int puntosAtaque) {
        this.puntosAtaque = puntosAtaque;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
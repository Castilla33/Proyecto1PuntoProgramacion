/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Clase Enemigo. De esta clase se crean objetos con parámetros aleatorios para cada combate.
 * @version 1.0
 * @author Mario
 */
public class Enemigo extends Entidad {

    private int dinero;
    private int experiencia;

    /**
     *
     * @param puntosSalud Los puntos de salud se reciben por parámetro e indicarán la vida del enemigo
     * @param puntosAtaque Los puntos de ataque se reciben por parámetro e indicarán el daño del enemigo
     * @param nombre El nombre se recibe por parámetro e indicará un nombre aleatorio para el enemigo
     */
    public Enemigo(int puntosSalud, int puntosAtaque, String nombre) {
        super(puntosSalud, puntosAtaque, nombre);
        this.dinero = 0;
        this.experiencia = 0;
    }

    /**
     *
     * @return Este método devuelve el dinero del enemigo
     */
    public int getDinero() {
        return dinero;
    }

    /**
     *
     * @return Este método devuelve la experiencia del enemigo
     */
    public int getExperiencia() {
        return experiencia;
    }

    /**
     *
     * @param dinero Este método modifica el dinero del enemigo
     */
    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    /**
     *
     * @param experiencia Este método modifica la experiencia del enemigo
     */
    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    /**
     *
     * @return Este método devuelve un número aleatorio el cual sumará o restará dinero del jugador al acabar el combate
     */
    public int dropDinero() {
        dinero = (int) (Math.random() * (6 - 1) + 1) + 1;
        return dinero;
    }

    /**
     *
     * @return Este método devuelve un número aleatorio el cual sumará experiencia del jugador al acabar el combate
     */
    public int dropExp() {
        experiencia = (int) (Math.random() * (6 - 1) + 1) + 1;
        return experiencia;
    }

}

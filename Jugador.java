
import java.io.Serializable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Clase Jugador. De esta clase se crea el objeto por el cual se gestiona el jugador a lo largo de la partida
 * @version 1.0
 * @author Mario
 */
public class Jugador extends Entidad implements Serializable{
    private static final long serialVersionUID = 1;

    private int vidaMaxima;
    private int defensa;
    private int defensaMaxima;
    private int experiencia;
    private int nivel;

    /**
     * Constructor por defecto con atributos propios y heredados inicilizados
     */
    public Jugador() {
        super(20, 5, "");
        this.vidaMaxima = 20;
        this.defensa = 0;
        this.defensaMaxima = 3;
        this.experiencia = 0;
        this.nivel = 0;
    }

    /**
     * 
     * @return Este método devuelve la vida máxima
     */
    public int getVidaMaxima() {
        return vidaMaxima;
    }

    /**
     * 
     * @return Este método devuelve la cantidad de defensa
     */
    public int getDefensa() {
        return defensa;
    }

    /**
     * 
     * @return Este método devuelve la defensa máxima
     */
    public int getDefensaMaxima() {
        return defensaMaxima;
    }

    /**
     * 
     * @return Este método devuelve la experiencia
     */
    public int getExperiencia() {
        return experiencia;
    }

    /**
     * 
     * @return Este método devuelve el nivel del jugador
     */
    public int getNivel() {
        return nivel;
    }

    /**
     * 
     * @param vidaMaxima Este método modifica la vida máxima
     */
    public void setVidaMaxima(int vidaMaxima) {
        this.vidaMaxima = vidaMaxima;
    }

    /**
     * 
     * @param defensa Este método modifica la defensa
     */
    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    /**
     * 
     * @param defensaMaxima Este método modifica la defensa máxima
     */
    public void setDefensaMaxima(int defensaMaxima) {
        this.defensaMaxima = defensaMaxima;
    }

    /**
     *
     * @param experiencia Este método modifica la experiencia
     */
    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    /**
     *
     * @param nivel Este método modifica el nivel
     */
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

}

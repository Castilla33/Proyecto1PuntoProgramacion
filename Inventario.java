
import java.io.Serializable;
import java.util.HashMap;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Clase Inventario. De esta clase se crean objetos para gestionar todos los objetos y compras que se realizan en la partida
 * @version 
 * @author Mario
 */
public class Inventario implements Serializable{
    private static final long serialVersionUID = 2;
    
    private int dinero;
    private int objetosMaximos;

    /**
     * HashMap de los objetos, en este se introduce el nombre del objeto y la cantidad, protegida para poder manipularla desde el JForm
     */
    protected HashMap<String, Integer> objetos;

    /**
     * HashMap de los tipos de losobjetos, en este se introduce el tipo del objeto y un valor asociado, protegida para poder manipularla desde el JForm
     */
    protected HashMap<String, Integer> tipoObjetos;

    /**
     * Constructor por defecto del inventario, con salud y objetos por defecto y ambos hashmaps incializandose
     */
    public Inventario() {
        dinero = 20;
        objetosMaximos = 3;
        objetos = new HashMap<>();
        tipoObjetos = new HashMap<>();
    }

    /**
     * 
     * @return Este método devuelve la cantidad del dinero
     */
    public int getDinero() {
        return dinero;
    }

    /**
     *
     * @return Este método devuelve la cantidad de objetos máximos
     */
    public int getObjetosMaximos() {
        return objetosMaximos;
    }

    /**
     *
     * @return Este método devuelve el hashmap de los objetos
     */
    public HashMap<String, Integer> getObjetos() {
        return objetos;
    }

    /**
     *
     * @return Este método devuelve el hashmap de los tipos de objetos
     */
    public HashMap<String, Integer> getTipoObjetos() {
        return tipoObjetos;
    }

    /**
     *
     * @param dinero Este método modifica el atributo de dinero del objeto
     */
    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    /**
     *
     * @param objetosMaximos Este método modifica el atributo de objetos máximos del objeto
     */
    public void setObjetosMaximos(int objetosMaximos) {
        this.objetosMaximos = objetosMaximos;
    }

    /**
     *
     * @param objetos Este método modifica el atributo de objetos del objeto creado de la clase
     */
    public void setObjetos(HashMap<String, Integer> objetos) {
        this.objetos = objetos;
    }

    /**
     *
     * @param tipoObjetos Este método modifica el atributo de tipo de objetos del objeto creado de la clase
     */
    public void setTipoObjetos(HashMap<String, Integer> tipoObjetos) {
        this.tipoObjetos = tipoObjetos;
    }

    /**
     *
     * @param nombreObjeto Este método añade un objeto al hashmap, y de ya existir la clave, suma 1
     */
    public void agregarObjeto(String nombreObjeto) {
        boolean existe = objetos.containsKey(nombreObjeto);

        if (existe) {
            objetos.put(nombreObjeto, (objetos.get(nombreObjeto) + 1));
        } else {
            objetos.put(nombreObjeto, 1);
        }
    }
    
    /**
     *
     * @param nombreTipo Este método añade un tipo de objeto y valor al hashmap de tiops de objetos
     */
    public void agregarTipo(String nombreTipo) {
        tipoObjetos.put(nombreTipo, 1);   
    }
    
    /**
     *
     * @return Este método devuelve la suma de los valores que contiene el HashMap de objetos.
     */
    public int objetosTotales() {
        int total = 0;
        for(int value : objetos.values()){
            total += value;
        }
        return total;
    }

}


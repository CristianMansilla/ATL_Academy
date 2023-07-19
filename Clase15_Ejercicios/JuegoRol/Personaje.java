package Clase15_Ejercicios.JuegoRol;

import java.util.ArrayList;
import java.util.List;

public class Personaje {
    protected String nombre;
    protected int experiencia;
    protected int nivel;
    protected int hp;
    protected int mana;
    protected int x;
    protected int y;
    protected String mapa;
    protected List<Item> items;

    public Personaje() {
        hp = 100;
        mana = 100;
        items = new ArrayList<>();
    }

    public int getHp() {
        return hp;
    }

    public List<Item> getItems() {
        return items;
    }

    public void atacar(){

    }

    public void recibirDanio(int puntosDanio){
        hp -= puntosDanio;
        if(hp<0){
            hp = 0;
        }
    }

    public void curarse(){

    }

    public void agregarExperiencia(int puntosExperiencia){
        experiencia += puntosExperiencia;
    }

    public boolean estaVivo(){
        return hp<=0?true:false;
    }

    public int getDefensaTotal(){
        int defensaTotal = 0;
        for(Item item:items){
            defensaTotal += item.getDefensa();
        }
        return defensaTotal;
    }

    public int getAtaqueTotal(){
        int ataqueTotal = 0;
        for(Item item:items){
            if (item instanceof Arma){
                ataqueTotal += item.getAtaque();
            }

        }
        return ataqueTotal;
    }

    public int getMaximoHP(){
        return nivel*10;
    }
}

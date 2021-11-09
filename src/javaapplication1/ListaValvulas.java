package javaapplication1;

import java.util.ArrayList;
import java.util.HashMap;
import javaapplication1.Valvula;

public class ListaValvulas {
    
    private HashMap<Integer,Valvula> listaV = new HashMap <Integer,Valvula>();
    private ArrayList <Valvula> listaValvulas = new  ArrayList<>();
    
    public void agregarValvula (int ID, String referencia, int precio, int cantidad){
        Valvula valvula = new Valvula(ID, referencia, precio, cantidad);
        this.listaV.put(ID, valvula);
    }
    public ArrayList<Valvula> getLista(){
        this.listaValvulas.clear();
        for(Valvula elem: this.listaV.values()){
            this.listaValvulas.add(elem);
        }
        return this.listaValvulas;
    }
    public Valvula buscarPorId(int ID){
        return this.listaV.get(ID);
    }
}

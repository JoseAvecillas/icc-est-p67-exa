package controllers;

import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

import models.Pedido;

public class PedidoController {
    

    public Stack<Pedido> filtrarPorZona(List<Pedido> pedidos, int umbral){
        umbral = 150;
        Stack<Pedido> filtro = new Stack<>();
        for (Pedido pedido : pedidos) {
            if (pedido.getZona() > umbral) {
                filtro.add(pedido);
            }
        }
        return filtro;
    }

    public TreeSet<Pedido> ordenarPorZona(Stack<Pedido> filtro){
        TreeSet<Pedido> ordenar = new TreeSet<>();
        
        return ordenar;
    }

    public TreeMap<Integer, Queue<Pedido>> agruparPorUrgencia(List<Pedido> pedidos){
        TreeMap<Integer, Queue<Pedido>> aU = new TreeMap<>();

        return aU;
    }

    public Stack<Pedido> explotarGrupo(Map<Integer, Queue<Pedido>> mapa){
        Stack<Pedido> mP= new Stack<>();
    
        return mP;
    }
}

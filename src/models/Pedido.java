package models;

import java.util.List;


public class Pedido {
    
    private String cliente;
    private String codigoPostal;
    private List<Integer> prioridades;
    private int zona;


    public Pedido(String cliente, String codigoPostal, List<Integer> prioridades ) {
        this.cliente = cliente;
        this.codigoPostal = codigoPostal;
        this.prioridades = prioridades;
        this.zona = getZona();
    }

    public int getZona(){
        String[] partes = codigoPostal.split("-");
        return Integer.parseInt(partes[1]);
    }

    public int getUrgencia(){
        return 0;
    }

    

    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    public String getCodigoPostal() {
        return codigoPostal;
    }
    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
    public List<Integer> getPrioridades() {
        return prioridades;
    }
    public void setPrioridades(List<Integer> prioridades) {
        this.prioridades = prioridades;
    }
    @Override
    public String toString() {
        return "Pedido [cliente=" + cliente + ", codigoPostal=" + codigoPostal + ", prioridades=" + prioridades + "]";
    }

    public void setZona(int zona) {
        this.zona = zona;
    }

    

    

}

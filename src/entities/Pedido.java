package entities;

import enums.StatusPedido;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private Cliente cliente;
    private List<ItemPedido> itens = new ArrayList<>();
    private StatusPedido status;
    private LocalDate dataPedido;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.status = StatusPedido.PENDENTE;
        this.dataPedido = LocalDate.now();
    }

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }

    public void removerItem(ItemPedido item) {
        itens.remove(item);
    }

    public double total() {
        double soma = 0.0;

        for (ItemPedido item : itens) {
            soma += item.subTotal();
        }

        return soma;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public LocalDate getDataPedido() {
        return dataPedido;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "cliente=" + cliente +
                ", itens=" + itens +
                ", status=" + status +
                ", dataPedido=" + dataPedido +
                ", total=" + total() +
                '}';
    }
}
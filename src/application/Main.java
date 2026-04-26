package application;

import entities.Cliente;
import entities.ItemPedido;
import entities.Pedido;
import entities.Produto;
import enums.StatusPedido;

public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Maria Aparecida", "19 99999-9999");

        Produto veu = new Produto("Véu personalizado", 120.00, 55.00);
        Produto capaHinario = new Produto("Capa de hinário", 80.00, 35.00);

        ItemPedido item1 = new ItemPedido(veu, 1, "Véu branco com renda dourada");
        ItemPedido item2 = new ItemPedido(capaHinario, 2, "Capas pretas com iniciais bordadas");

        Pedido pedido = new Pedido(cliente);

        pedido.adicionarItem(item1);
        pedido.adicionarItem(item2);

        pedido.setStatus(StatusPedido.EM_PRODUCAO);

        System.out.println("===== RESUMO DO PEDIDO =====");
        System.out.println("Cliente: " + pedido.getCliente().getNome());
        System.out.println("Telefone: " + pedido.getCliente().getTelefone());
        System.out.println("Data do pedido: " + pedido.getDataPedido());
        System.out.println("Status: " + pedido.getStatus());

        System.out.println("\nItens do pedido:");
        for (ItemPedido item : pedido.getItens()) {
            System.out.println("- Produto: " + item.getProduto().getNome());
            System.out.println("  Quantidade: " + item.getQuantidade());
            System.out.println("  Personalização: " + item.getPersonalizacao());
            System.out.println("  Subtotal: R$ " + String.format("%.2f", item.subTotal()));
        }

        System.out.println("\nTotal do pedido: R$ " + String.format("%.2f", pedido.total()));

        System.out.println("\n===== OBJETO PEDIDO COMPLETO =====");
        System.out.println(pedido);
    }
}
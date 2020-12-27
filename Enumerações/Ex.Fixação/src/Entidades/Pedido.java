package Entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Entidade_enums.ordem_status;

public class Pedido {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private Date momento;
	private ordem_status status;

	private Cliente cliente;

	private List<item_pedido> item_ped = new ArrayList<>();

	public Pedido(Date momento, ordem_status status, Cliente cliente) {
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public ordem_status getStatus() {
		return status;
	}

	public void setStatus(ordem_status status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<item_pedido> getItem_ped() {
		return item_ped;
	}

	public void addItem(item_pedido item) {
		item_ped.add(item);
	}

	public void removeItem(item_pedido item) {
		item_ped.remove(item);
	}

	public Double total() {
		double soma = 0.0;
		for (item_pedido item : item_ped) {
			soma += item.subtotal();
		}
		return soma;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Momento do Pedido: ");
		sb.append(sdf.format(momento) + "\n");
		sb.append("Status do Pedido: ");
		sb.append(status + "\n");
		sb.append("Cliente: ");
		sb.append(cliente + "\n");
		sb.append("Itens do Pedido:\n");
		for (item_pedido item : item_ped) {
			sb.append(item + "\n");
		}
		sb.append("Valor total: ");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}

}

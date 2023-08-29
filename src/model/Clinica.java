package model;

import java.util.ArrayList;
import java.util.List;

public class Clinica {
	
	private List<Veterinario>listaVeterinarios = new ArrayList<Veterinario>();
	private List<AtencionVeterinario>listaAtenciones = new ArrayList<AtencionVeterinario>();
	private List<Cliente>listaClientes= new ArrayList<Cliente>();
	
	
	public Clinica() {
		super();
	}


	public Clinica(List<Veterinario> listaVeterinarios, List<AtencionVeterinario> listaAtenciones,
			List<Cliente> listaClientes) {
		super();
		this.listaVeterinarios = listaVeterinarios;
		this.listaAtenciones = listaAtenciones;
		this.listaClientes = listaClientes;
	}


	public Clinica(String string) {
		// TODO Auto-generated constructor stub
	}


	public List<Veterinario> getListaVeterinarios() {
		return listaVeterinarios;
	}


	public void setListaVeterinarios(List<Veterinario> listaVeterinarios) {
		this.listaVeterinarios = listaVeterinarios;
	}


	public List<AtencionVeterinario> getListaAtenciones() {
		return listaAtenciones;
	}


	public void setListaAtenciones(List<AtencionVeterinario> listaAtenciones) {
		this.listaAtenciones = listaAtenciones;
	}


	public List<Cliente> getListaClientes() {
		return listaClientes;
	}


	public void setListaClientes(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}
	
	
	


}

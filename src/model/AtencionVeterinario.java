package model;

import java.time.LocalDate;

public class AtencionVeterinario {

	
	private Estado estado;
	private LocalDate fecha;
	private Mascota mascota;
	private Veterinario veterinario;
	
	
	
	public AtencionVeterinario() {
		super();
	}


	

	public AtencionVeterinario(Estado estado, LocalDate fecha, Mascota mascota, Veterinario veterinario) {
		super();
		this.estado = estado;
		this.fecha = fecha;
		this.mascota = mascota;
		this.veterinario = veterinario;
	}




	public Estado getEstado() {
		return estado;
	}


	public void setEstado(Estado estado) {
		this.estado = estado;
	}


	


	public LocalDate getFecha() {
		return fecha;
	}




	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}




	public Mascota getMascota() {
		return mascota;
	}


	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}


	public Veterinario getVeterinario() {
		return veterinario;
	}


	public void setVeterinario(Veterinario veterinario) {
		this.veterinario = veterinario;
	}
	
	
	
	
}

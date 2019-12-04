package br.ucsal.lamis.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Reserva {
	
	private Integer id;
	
	private String objetivo;
	
	private String descricao ;
	
	private LocalDate data;
	
	private LocalTime horaInicio;
	
	private LocalTime horaFinal;
	
	private Lami lami;
	
	private Usuario usuario;
	
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public LocalTime getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(LocalTime horaInicio) {
		this.horaInicio = horaInicio;
	}

	public LocalTime getHoraFinal() {
		return horaFinal;
	}

	public void setHoraFinal(LocalTime horaFinal) {
		this.horaFinal = horaFinal;
	}

	public Lami getLami() {
		return lami;
	}

	public void setLami(Lami lami) {
		this.lami = lami;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	

}

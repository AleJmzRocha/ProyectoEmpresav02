package entidades;

import java.util.Date;

public class Departamento {
	Integer idDepartamento;
	String nombreDepartamento, ubicacion;
	Date horario;

	public Departamento(Integer idDepartamento, String nombreDepartamento, String ubicacion, Date horario) {
		this.idDepartamento = idDepartamento;
		this.nombreDepartamento = nombreDepartamento;
		this.ubicacion = ubicacion;
		this.horario = horario;
	}

	public Integer getIdDepartamento() {
		return idDepartamento;
	}

	public void setIdDepartamento(Integer idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

	public String getNombreDepartamento() {
		return nombreDepartamento;
	}

	public void setNombreDepartamento(String nombreDepartamento) {
		this.nombreDepartamento = nombreDepartamento;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public Date getHorario() {
		return horario;
	}

	public void setHorario(Date horario) {
		this.horario = horario;
	}
}

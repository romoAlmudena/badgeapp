package com.example.badgeapp.domain;

/**
 * Llegados a este punto, debemos modificar la clase Product para que se persista correctamente. 
 * Para ello modificamos el fichero 'Product.java' y añadimos las anotaciones de JPA que realizan el mapeo 
 * entre los campos del objeto y aquellos de la base de datos. 
 * Asimismo, hemos añadido el campo id para mapear la clave primaria de la tabla products.*/

import java.io.Serializable;
//----------------------------------------

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "badgekit.badgeCategory")
// ----------------------------------------
public class Category implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String label;
	private String description;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	// ----------------------------------------------
}
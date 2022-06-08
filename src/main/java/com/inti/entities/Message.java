package com.inti.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Message {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idRDV;
	private String libelle;
	@ManyToOne
	private Utilisateur user;

	public Message() {
	}

	public Message(String libelle, Utilisateur user) {
		super();
		this.libelle = libelle;
		this.user = user;
	}

	public Long getIdRDV() {
		return idRDV;
	}

	public void setIdRDV(Long idRDV) {
		this.idRDV = idRDV;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Utilisateur getUtilisateur() {
		return user;
	}

	public void setUtilisateur(Utilisateur user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Message [idRDV=" + idRDV + ", libelle=" + libelle + ", user=" + user + "]";
	}

}

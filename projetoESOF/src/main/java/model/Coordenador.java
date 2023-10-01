package model;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "coordenador")
public class Coordenador implements Serializable{	
	private static final long serialVersionUID = 1L;
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Cod_Coordenador")
	private String codigo;
	/**
	 * coment�rio prof. Bruno
	 * Os nomes dos atributos precisam respeitar as regras da O.O
	 * como n�o podem ficar iguais ao do banco de dados pode utilizar
	 * a nota��o @Column como feito por voc� no atributo c�digo, deve fazer para os demais.
	 * nas duas classes
	 */	
	private String Nome_Coordenador;
	private String Email_Coordenador;
	private String Fone_Coordenador;
	
	public Coordenador(String codCoordenador, String nomeCoordenador, String emailCoordenador, String foneCoordenador) {
		super();
		codigo = codCoordenador;
		Nome_Coordenador = nomeCoordenador;
		Email_Coordenador = emailCoordenador;
		Fone_Coordenador = foneCoordenador;
	}
	
	public Coordenador(){}
	
	public String getCodCoordenador() {
		return codigo;
	}
	public void setCodCoordenador(String codCoordenador) {
		codigo = codCoordenador;
	}
	public String getNomeCoordenador() {
		return Nome_Coordenador;
	}
	public void setNomeCoordenador(String nomeCoordenador) {
		Nome_Coordenador = nomeCoordenador;
	}
	public String getEmailCoordenador() {
		return Email_Coordenador;
	}
	public void setEmailCoordenador(String emailCoordenador) {
		Email_Coordenador = emailCoordenador;
	}
	public String getFoneCoordenador() {
		return Fone_Coordenador;
	}
	public void setFoneCoordenador(String foneCoordenador) {
		Fone_Coordenador = foneCoordenador;
	}
	
}

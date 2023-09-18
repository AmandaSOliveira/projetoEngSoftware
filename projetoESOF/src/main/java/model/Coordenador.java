package model;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Coordenador implements Serializable{	
	private static final long serialVersionUID = 1L;
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String Cod_Coordenador;
	private String Nome_Coordenador;
	private String Email_Coordenador;
	private String Fone_Coordenador;
	
	public Coordenador(String codCoordenador, String nomeCoordenador, String emailCoordenador, String foneCoordenador) {
		super();
		Cod_Coordenador = codCoordenador;
		Nome_Coordenador = nomeCoordenador;
		Email_Coordenador = emailCoordenador;
		Fone_Coordenador = foneCoordenador;
	}
	
	public Coordenador(){}
	
	public String getCodCoordenador() {
		return Cod_Coordenador;
	}
	public void setCodCoordenador(String codCoordenador) {
		Cod_Coordenador = codCoordenador;
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

package model;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
/**
 * Nome da classe não está correto... precisa ser ProfessorOrientador.
 * utilize o @Table(name="Prof_Orientador") para resolver.
 * 
 * @author bruno
 *
 */
public class Prof_Orientador implements Serializable{	
	private static final long serialVersionUID = 1L;
	@Id
	private String Cod_Prof;
	private String Nome_Prof;
	private String Email_Prof;
	private String Fone_Prof;
	private String Lattes;
	private String Cpf;
	
	
	public Prof_Orientador(String codProfessor, String nomeProfessor, String emailProfessor, String foneProfessor,
			String lattes, String cpf) {
		super();
		Cod_Prof = codProfessor;
		Nome_Prof = nomeProfessor;
		Email_Prof = emailProfessor;
		Fone_Prof = foneProfessor;
		Lattes = lattes;
		Cpf = cpf;
	}
	
	public Prof_Orientador() {}

	public String getCodProfessor() {
		return Cod_Prof;
	}

	protected void setCodProfessor(String codProfessor) {
		Cod_Prof = codProfessor;
	}

	public String getNomeProfessor() {
		return Nome_Prof;
	}

	protected void setNomeProfessor(String nomeProfessor) {
		Nome_Prof = nomeProfessor;
	}

	public String getEmailProfessor() {
		return Email_Prof;
	}

	protected void setEmailProfessor(String emailProfessor) {
		Email_Prof = emailProfessor;
	}

	public String getFoneProfessor() {
		return Fone_Prof;
	}

	protected void setFoneProfessor(String foneProfessor) {
		Fone_Prof = foneProfessor;
	}

	public String getLattes() {
		return Lattes;
	}

	protected void setLattes(String lattes) {
		Lattes = lattes;
	}

	public String getCpf() {
		return Cpf;
	}

	protected void setCpf(String cpf) {
		Cpf = cpf;
	}
	
}

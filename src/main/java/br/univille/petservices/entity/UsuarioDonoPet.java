package br.univille.petservices.entity;

/*import javax.annotation.Generated;*/
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
//@Entity name=
public class UsuarioDonoPet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    // o Column so vale para os que estão embaixo
    @Column (length = 500)
    private String nome;
    private String telefone;
    private String email;
    private String cpf;
    private String senha;
    private String sexo;


    public long getId() {
        return id;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


}

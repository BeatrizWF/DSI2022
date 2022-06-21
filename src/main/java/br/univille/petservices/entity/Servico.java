package br.univille.petservices.entity;

import java.util.Date;

import javax.persistence.CascadeType;
/*import javax.annotation.Generated;
import javax.persistence.Column;*/
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Servico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
      //timetempdataehora
    @Temporal(value = TemporalType.DATE)

    private Date dataservico;


    public Date getDataservico() {
        return dataservico;
    }

    public void setDataservico(Date dataservico) {
        this.dataservico = dataservico;
    }

    //cascade = CascadeType.ALL apaga tudo
    @ManyToOne(cascade = {CascadeType.MERGE,CascadeType.REFRESH})
    private UsuarioDonoPet usuariodonopet;

    
    public UsuarioDonoPet getUsuarioDonoPet(){
        return usuariodonopet;
    }
    public UsuarioDonoPet setUsuarioDonoPet(UsuarioDonoPet usuariodonopet){
        return this.usuariodonopet = usuariodonopet;
    }


}

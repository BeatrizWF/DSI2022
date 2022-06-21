package br.univille.petservices.entity;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
/*import javax.annotation.Generated;
import javax.persistence.Column;*/
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
//importa util list


@Entity
public class Agenda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
      //timetempdataehora
    @Temporal(value = TemporalType.DATE)
    private Date dataagenda;
    private String horaagenda;
    private String status;


    @OneToMany(cascade = CascadeType.ALL)
    private List<Servico> Servico = new    ArrayList<>();
    public Date getDataagenda() {
        return dataagenda;
    }

    public void setDataagenda(Date dataagenda) {
        this.dataagenda = dataagenda;
    }

    public String gethoraagenda(){
        return horaagenda;
    }

    /*public void sethoraagenda(){
        this.horaagenda =horaagenda;
    }*/

    public String getstatus(){
        return status;
    }

    /*public String setstatus(){
        return this.status = status;
    }*/

    //cascade = CascadeType.ALL apaga tudo
    @OneToOne(cascade = {CascadeType.MERGE,CascadeType.REFRESH})
    private UsuarioDonoPet usuariodonopet;
    public UsuarioDonoPet getUsuarioDonoPet(){
        return usuariodonopet;
    }
    public UsuarioDonoPet setUsuarioDonoPet(UsuarioDonoPet usuariodonopet){
        return this.usuariodonopet = usuariodonopet;
    }

    @ManyToOne(cascade = {CascadeType.ALL})
    private Servico servico;
    public Servico getServico(){
        return servico;
    }
    public Servico setServico(Servico servico){
        return this.servico = servico;
    }


}

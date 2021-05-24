package it.viaggifacili.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Entity
@Table(name = "clienti", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCliente;

    private String nome, cognome, codF, nTelefono, indirizzo, CAP, provincia, citta, password, email;

    public Cliente(String nome, String cognome, String password, String email) {
        super();
        this.nome = nome;
        this.cognome = cognome;
        this.password = password;
        this.email = email;
    }

}

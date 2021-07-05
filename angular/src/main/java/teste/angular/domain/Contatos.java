package teste.angular.domain;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import teste.angular.domain.enums.Operadoras;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
public class Contatos implements Serializable {
    private static final long serialversionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String numero;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "operadoras_id")
    private Operadoras operadoras;
    private LocalDateTime localDateTime = LocalDateTime.now();


    public Contatos() {
    }

    public Contatos(Integer id, String nome, String numero) {
        this.id = id;
        this.nome = nome;
        this.numero = numero;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Operadoras getOperadoras() {
        return operadoras;
    }

    public void setOperadoras(Operadoras operadoras) {
        this.operadoras = operadoras;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contatos contatos = (Contatos) o;
        return Objects.equals(id, contatos.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

package teste.angular.domain.enums;


import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
public class Contatos implements Serializable {
    private static final long serialversionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String numero;
    @Enumerated(value = EnumType.STRING)
    private Operadoras operadoras;
    private LocalDateTime localDateTime = LocalDateTime.now();


    public Contatos() {
    }

    public Contatos( String nome, String numero, Integer operadoras) {
        this.nome = nome;
        this.numero = numero;
        this.operadoras = Operadoras.toEnum(operadoras);
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

    public void setOperadora(Integer operadora) {
        this.operadoras = Operadoras.toEnum(operadora);
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }
}

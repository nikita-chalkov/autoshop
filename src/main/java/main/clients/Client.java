package main.clients;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "clients", schema = "auto")
public class Client {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "fio", length = 128, nullable = false)
    private String fio;

    @Column(name = "phone", length = 128, nullable = false)
    private String phone;

}

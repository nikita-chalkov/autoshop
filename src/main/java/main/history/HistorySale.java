package main.history;

import lombok.Getter;
import lombok.Setter;
import main.auto.Automobile;
import main.clients.Client;

import javax.persistence.*;
import java.sql.Date;

@Getter
@Setter
@Entity
@Table(name = "history_sales", schema = "auto")
public class HistorySale {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "date", nullable = false)
    private Date date;

    @ManyToOne
    @JoinColumn(name = "automobile_id")
    private Automobile automobile;

    @Column(name = "auto_count", nullable = false)
    private Long count;

    @Column(name = "price", nullable = false)
    private Long price;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

}

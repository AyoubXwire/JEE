package cigma.models;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "factures")
public class Facture {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "date")
    private Date date;

    @Column(name = "amount")
    private double amount;

    public Facture(Date date, double amount) {
        this.date = date;
        this.amount = amount;
    }

}
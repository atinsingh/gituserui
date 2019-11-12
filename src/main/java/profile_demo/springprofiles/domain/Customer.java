package profile_demo.springprofiles.domain;

import lombok.Data;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "customer")
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private Instant createDate;

    private Instant modificationDate;
}

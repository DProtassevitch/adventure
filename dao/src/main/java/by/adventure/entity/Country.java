package by.adventure.entity;

import by.adventure.entity.common.BaseEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "country")
@ToString
@NoArgsConstructor
public class Country extends BaseEntity {
/*    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private long id;*/

    @Column(name = "country_name")
    @Getter
    @Setter
    private String country_name;

    @Getter
    @Setter
    @OneToMany(mappedBy = "country")
    private Set<Region> region = new HashSet<Region>();

    @OneToOne
    @JoinColumn(name = "user_id")
    @Getter
    @Setter
    private User user;

}
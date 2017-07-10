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
@Table(name = "region")
@ToString
@NoArgsConstructor
public class Region extends BaseEntity {
/*    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private long id;*/


    @Getter
    @Setter
    @Column(name = "region_name")
    private String region_name;

    @Getter
    @Setter
    @OneToMany(mappedBy = "region")
    private Set<Route> route = new HashSet<Route>();

    @ManyToOne
    @JoinColumn(name = "country_id")
    @Getter
    @Setter
    private Country country;

}

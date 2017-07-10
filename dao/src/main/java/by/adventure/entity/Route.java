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
@Table(name = "route")
@ToString
@NoArgsConstructor
public class Route extends BaseEntity {
/*    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private long id;*/

    @Column(name = "route_name")
    @Getter
    @Setter
    private String route_name;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @Getter
    @Setter
    private User user;

    @ManyToOne
    @JoinColumn(name = "route_kind_id")
    @Getter
    @Setter
    private RouteKind routeKind;

    @ManyToOne
    @JoinColumn(name = "region_id")
    @Getter
    @Setter
    private Region region;

    @Getter
    @Setter
    @ManyToMany
    @JoinTable(name = "routes_equipments",
    joinColumns = @JoinColumn(name = "equipment_id"),
    inverseJoinColumns = @JoinColumn(name = "route_id")
    )
    private Set<Equipment> equipment = new HashSet<>();
}

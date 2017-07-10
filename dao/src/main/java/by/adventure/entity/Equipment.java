package by.adventure.entity;

import by.adventure.entity.common.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "equipment")
public class Equipment extends BaseEntity {
/*    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private long id;*/

    @Column(name = "equipment_name")
    @Getter
    @Setter
    private String equipment_name;

    @ManyToOne
    @JoinColumn(name = "equipment_kind_id")
    @Getter
    @Setter
    private EquipmentKind equipmentKind;

    @ManyToOne
    @JoinColumn(name = "route_kind_id")
    @Getter
    @Setter
    private RouteKind routeKind;

    @Getter
    @Setter
    @ManyToMany(mappedBy = "equipment")
    private Set<Route> route = new HashSet<>();
}

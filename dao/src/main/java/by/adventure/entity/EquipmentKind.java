package by.adventure.entity;

import by.adventure.entity.common.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "equipment_kind")
public class EquipmentKind extends BaseEntity {
/*    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private long id;*/

    @Column(name = "equipment_kind_name")
    @Getter
    @Setter
    private String equipment_kind_name;

    @Getter
    @Setter
    @OneToMany(mappedBy = "equipmentKind")
    private Set<Equipment> equipment = new HashSet<Equipment>();
}

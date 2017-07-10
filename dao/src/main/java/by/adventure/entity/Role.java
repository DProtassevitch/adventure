package by.adventure.entity;

import by.adventure.entity.common.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "roles")
public class Role extends BaseEntity {

    @Column(name = "name")
    @Getter
    @Setter
    private String name;
}

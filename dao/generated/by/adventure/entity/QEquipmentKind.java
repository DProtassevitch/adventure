package by.adventure.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QEquipmentKind is a Querydsl query type for EquipmentKind
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEquipmentKind extends EntityPathBase<EquipmentKind> {

    private static final long serialVersionUID = 1665054700L;

    public static final QEquipmentKind equipmentKind = new QEquipmentKind("equipmentKind");

    public final by.adventure.entity.common.QBaseEntity _super = new by.adventure.entity.common.QBaseEntity(this);

    public final SetPath<Equipment, QEquipment> equipment = this.<Equipment, QEquipment>createSet("equipment", Equipment.class, QEquipment.class, PathInits.DIRECT2);

    public final StringPath equipment_kind_name = createString("equipment_kind_name");

    //inherited
    public final NumberPath<Long> id = _super.id;

    public QEquipmentKind(String variable) {
        super(EquipmentKind.class, forVariable(variable));
    }

    public QEquipmentKind(Path<? extends EquipmentKind> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEquipmentKind(PathMetadata metadata) {
        super(EquipmentKind.class, metadata);
    }

}


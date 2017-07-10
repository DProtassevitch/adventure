package by.adventure.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QEquipment is a Querydsl query type for Equipment
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEquipment extends EntityPathBase<Equipment> {

    private static final long serialVersionUID = -157817800L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QEquipment equipment = new QEquipment("equipment");

    public final by.adventure.entity.common.QBaseEntity _super = new by.adventure.entity.common.QBaseEntity(this);

    public final StringPath equipment_name = createString("equipment_name");

    public final QEquipmentKind equipmentKind;

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final SetPath<Route, QRoute> route = this.<Route, QRoute>createSet("route", Route.class, QRoute.class, PathInits.DIRECT2);

    public final QRouteKind routeKind;

    public QEquipment(String variable) {
        this(Equipment.class, forVariable(variable), INITS);
    }

    public QEquipment(Path<? extends Equipment> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QEquipment(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QEquipment(PathMetadata metadata, PathInits inits) {
        this(Equipment.class, metadata, inits);
    }

    public QEquipment(Class<? extends Equipment> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.equipmentKind = inits.isInitialized("equipmentKind") ? new QEquipmentKind(forProperty("equipmentKind")) : null;
        this.routeKind = inits.isInitialized("routeKind") ? new QRouteKind(forProperty("routeKind")) : null;
    }

}


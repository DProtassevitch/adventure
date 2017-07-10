package by.adventure.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRouteKind is a Querydsl query type for RouteKind
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QRouteKind extends EntityPathBase<RouteKind> {

    private static final long serialVersionUID = -1066789849L;

    public static final QRouteKind routeKind = new QRouteKind("routeKind");

    public final by.adventure.entity.common.QBaseEntity _super = new by.adventure.entity.common.QBaseEntity(this);

    public final SetPath<Equipment, QEquipment> equipment = this.<Equipment, QEquipment>createSet("equipment", Equipment.class, QEquipment.class, PathInits.DIRECT2);

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final SetPath<Route, QRoute> route = this.<Route, QRoute>createSet("route", Route.class, QRoute.class, PathInits.DIRECT2);

    public final StringPath route_kind_name = createString("route_kind_name");

    public QRouteKind(String variable) {
        super(RouteKind.class, forVariable(variable));
    }

    public QRouteKind(Path<? extends RouteKind> path) {
        super(path.getType(), path.getMetadata());
    }

    public QRouteKind(PathMetadata metadata) {
        super(RouteKind.class, metadata);
    }

}


package by.adventure.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRegion is a Querydsl query type for Region
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QRegion extends EntityPathBase<Region> {

    private static final long serialVersionUID = -1958299510L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRegion region = new QRegion("region");

    public final by.adventure.entity.common.QBaseEntity _super = new by.adventure.entity.common.QBaseEntity(this);

    public final QCountry country;

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath region_name = createString("region_name");

    public final SetPath<Route, QRoute> route = this.<Route, QRoute>createSet("route", Route.class, QRoute.class, PathInits.DIRECT2);

    public QRegion(String variable) {
        this(Region.class, forVariable(variable), INITS);
    }

    public QRegion(Path<? extends Region> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRegion(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRegion(PathMetadata metadata, PathInits inits) {
        this(Region.class, metadata, inits);
    }

    public QRegion(Class<? extends Region> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.country = inits.isInitialized("country") ? new QCountry(forProperty("country"), inits.get("country")) : null;
    }

}


package by.adventure.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QHeroAbility is a Querydsl query type for HeroAbility
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QHeroAbility extends EntityPathBase<HeroAbility> {

    private static final long serialVersionUID = -451712006L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QHeroAbility heroAbility = new QHeroAbility("heroAbility");

    public final by.adventure.entity.common.QBaseEntity _super = new by.adventure.entity.common.QBaseEntity(this);

    public final QHero hero;

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final EnumPath<by.adventure.entity.other.KeyAbility> keyAbility = createEnum("keyAbility", by.adventure.entity.other.KeyAbility.class);

    public final StringPath name = createString("name");

    public final StringPath passToImg = createString("passToImg");

    public final StringPath passToVideo = createString("passToVideo");

    public QHeroAbility(String variable) {
        this(HeroAbility.class, forVariable(variable), INITS);
    }

    public QHeroAbility(Path<? extends HeroAbility> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QHeroAbility(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QHeroAbility(PathMetadata metadata, PathInits inits) {
        this(HeroAbility.class, metadata, inits);
    }

    public QHeroAbility(Class<? extends HeroAbility> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.hero = inits.isInitialized("hero") ? new QHero(forProperty("hero")) : null;
    }

}


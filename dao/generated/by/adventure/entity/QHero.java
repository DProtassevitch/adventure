package by.adventure.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QHero is a Querydsl query type for Hero
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QHero extends EntityPathBase<Hero> {

    private static final long serialVersionUID = -1682780400L;

    public static final QHero hero = new QHero("hero");

    public final by.adventure.entity.common.QBaseEntity _super = new by.adventure.entity.common.QBaseEntity(this);

    public final ListPath<HeroAbility, QHeroAbility> abilities = this.<HeroAbility, QHeroAbility>createList("abilities", HeroAbility.class, QHeroAbility.class, PathInits.DIRECT2);

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath name = createString("name");

    public final StringPath passToPicture = createString("passToPicture");

    public final EnumPath<by.adventure.entity.other.HeroRole> role = createEnum("role", by.adventure.entity.other.HeroRole.class);

    public QHero(String variable) {
        super(Hero.class, forVariable(variable));
    }

    public QHero(Path<? extends Hero> path) {
        super(path.getType(), path.getMetadata());
    }

    public QHero(PathMetadata metadata) {
        super(Hero.class, metadata);
    }

}


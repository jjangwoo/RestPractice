package org.rest.domain.model.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QUserId is a Querydsl query type for UserId
 */
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QUserId extends BeanPath<UserId> {

    private static final long serialVersionUID = -1460572652L;

    public static final QUserId userId1 = new QUserId("userId1");

    public final StringPath userId = createString("userId");

    public QUserId(String variable) {
        super(UserId.class, forVariable(variable));
    }

    public QUserId(Path<? extends UserId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUserId(PathMetadata metadata) {
        super(UserId.class, metadata);
    }

}


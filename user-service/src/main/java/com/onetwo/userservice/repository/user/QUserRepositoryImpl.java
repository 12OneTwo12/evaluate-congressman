package com.onetwo.userservice.repository.user;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

@Repository
public class QUserRepositoryImpl extends QuerydslRepositorySupport implements QUserRepository {

	public QUserRepositoryImpl(Class<?> domainClass) {
		super(domainClass);
	}

}

package org.thibaut.thelibrary.repository.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.thibaut.thelibrary.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository< UserEntity, Long > {

	UserEntity findByUserName( String username );

}

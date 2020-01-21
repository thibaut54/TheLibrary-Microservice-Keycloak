package org.thibaut.thelibrary.repository.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.thibaut.thelibrary.entity.RoleEntity;

import java.util.List;

@Repository
public interface RoleRepository extends JpaRepository< RoleEntity, Long > {

//	@Query("SELECT role FROM RoleEntity role JOIN role.users user WHERE user.id =: id")
//	List< RoleEntity > findRolesByUserId( @Param( "id" ) Long id);

//	@Query("SELECT r FROM RoleEntity r JOIN r.users u WHERE u.userName =:username")
//	List< RoleEntity > findRoleByUserName( @Param( "username" ) String username );
//
//	@Query("SELECT r FROM RoleEntity r JOIN r.users u WHERE u.coordinates.email =:email")
//	List< RoleEntity > findRoleByEmail( @Param( "email" ) String email );

	//	@Query("SELECT r.role FROM RoleEntity r WHERE r.role =:role")
	List< RoleEntity > findRolesByRoleContains( String role );

	RoleEntity findByRoleLike( String role );

	@Query("SELECT user.roleList FROM UserEntity user WHERE user.userName = :userName ")
	List<RoleEntity> getRolesByUsername( @Param( "userName" ) String userName);

}

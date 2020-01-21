package org.thibaut.thelibrary.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.thibaut.thelibrary.dto.RoleDTO;
import org.thibaut.thelibrary.dto.RoleDTO.RoleDTOBuilder;
import org.thibaut.thelibrary.dto.UserDTO;
import org.thibaut.thelibrary.dto.UserDTO.UserDTOBuilder;
import org.thibaut.thelibrary.entity.RoleEntity;
import org.thibaut.thelibrary.entity.RoleEntity.RoleEntityBuilder;
import org.thibaut.thelibrary.entity.UserEntity;
import org.thibaut.thelibrary.entity.UserEntity.UserEntityBuilder;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-01-15T11:25:10+0100",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.3 (Oracle Corporation)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDTO userToDTO(UserEntity userEntity) {
        if ( userEntity == null ) {
            return null;
        }

        UserDTOBuilder userDTO = UserDTO.builder();

        userDTO.id( userEntity.getId() );
        userDTO.password( userEntity.getPassword() );
        userDTO.firstName( userEntity.getFirstName() );
        userDTO.lastName( userEntity.getLastName() );
        userDTO.userName( userEntity.getUserName() );
        userDTO.registrationDate( userEntity.getRegistrationDate() );
        userDTO.roleList( roleEntityListToRoleDTOList( userEntity.getRoleList() ) );

        return userDTO.build();
    }

    @Override
    public List<UserDTO> userToDTOList(List<UserEntity> userEntityList) {
        if ( userEntityList == null ) {
            return null;
        }

        List<UserDTO> list = new ArrayList<UserDTO>( userEntityList.size() );
        for ( UserEntity userEntity : userEntityList ) {
            list.add( userToDTO( userEntity ) );
        }

        return list;
    }

    @Override
    public UserEntity userToEntity(UserDTO userDTO) {
        if ( userDTO == null ) {
            return null;
        }

        UserEntityBuilder userEntity = UserEntity.builder();

        userEntity.id( userDTO.getId() );
        userEntity.password( userDTO.getPassword() );
        userEntity.firstName( userDTO.getFirstName() );
        userEntity.lastName( userDTO.getLastName() );
        userEntity.userName( userDTO.getUserName() );
        userEntity.registrationDate( userDTO.getRegistrationDate() );
        userEntity.roleList( roleDTOListToRoleEntityList( userDTO.getRoleList() ) );

        return userEntity.build();
    }

    @Override
    public List<UserEntity> userToEntityList(List<UserDTO> userDTOList) {
        if ( userDTOList == null ) {
            return null;
        }

        List<UserEntity> list = new ArrayList<UserEntity>( userDTOList.size() );
        for ( UserDTO userDTO : userDTOList ) {
            list.add( userToEntity( userDTO ) );
        }

        return list;
    }

    protected RoleDTO roleEntityToRoleDTO(RoleEntity roleEntity) {
        if ( roleEntity == null ) {
            return null;
        }

        RoleDTOBuilder roleDTO = RoleDTO.builder();

        roleDTO.id( roleEntity.getId() );
        roleDTO.role( roleEntity.getRole() );

        return roleDTO.build();
    }

    protected List<RoleDTO> roleEntityListToRoleDTOList(List<RoleEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<RoleDTO> list1 = new ArrayList<RoleDTO>( list.size() );
        for ( RoleEntity roleEntity : list ) {
            list1.add( roleEntityToRoleDTO( roleEntity ) );
        }

        return list1;
    }

    protected RoleEntity roleDTOToRoleEntity(RoleDTO roleDTO) {
        if ( roleDTO == null ) {
            return null;
        }

        RoleEntityBuilder roleEntity = RoleEntity.builder();

        roleEntity.id( roleDTO.getId() );
        roleEntity.role( roleDTO.getRole() );

        return roleEntity.build();
    }

    protected List<RoleEntity> roleDTOListToRoleEntityList(List<RoleDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<RoleEntity> list1 = new ArrayList<RoleEntity>( list.size() );
        for ( RoleDTO roleDTO : list ) {
            list1.add( roleDTOToRoleEntity( roleDTO ) );
        }

        return list1;
    }
}

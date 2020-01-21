package org.thibaut.thelibrary.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.thibaut.thelibrary.dto.RoleDTO;
import org.thibaut.thelibrary.dto.RoleDTO.RoleDTOBuilder;
import org.thibaut.thelibrary.entity.RoleEntity;
import org.thibaut.thelibrary.entity.RoleEntity.RoleEntityBuilder;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-01-15T11:25:11+0100",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.3 (Oracle Corporation)"
)
public class RoleMapperImpl implements RoleMapper {

    @Override
    public RoleDTO roleToDTO(RoleEntity roleEntity) {
        if ( roleEntity == null ) {
            return null;
        }

        RoleDTOBuilder roleDTO = RoleDTO.builder();

        roleDTO.id( roleEntity.getId() );
        roleDTO.role( roleEntity.getRole() );

        return roleDTO.build();
    }

    @Override
    public List<RoleDTO> roleToDTOList(List<RoleEntity> roleEntityList) {
        if ( roleEntityList == null ) {
            return null;
        }

        List<RoleDTO> list = new ArrayList<RoleDTO>( roleEntityList.size() );
        for ( RoleEntity roleEntity : roleEntityList ) {
            list.add( roleToDTO( roleEntity ) );
        }

        return list;
    }

    @Override
    public RoleEntity roleToEntity(RoleDTO roleDTO) {
        if ( roleDTO == null ) {
            return null;
        }

        RoleEntityBuilder roleEntity = RoleEntity.builder();

        roleEntity.id( roleDTO.getId() );
        roleEntity.role( roleDTO.getRole() );

        return roleEntity.build();
    }

    @Override
    public List<RoleEntity> roleToEntityList(List<RoleDTO> roleDTOList) {
        if ( roleDTOList == null ) {
            return null;
        }

        List<RoleEntity> list = new ArrayList<RoleEntity>( roleDTOList.size() );
        for ( RoleDTO roleDTO : roleDTOList ) {
            list.add( roleToEntity( roleDTO ) );
        }

        return list;
    }
}

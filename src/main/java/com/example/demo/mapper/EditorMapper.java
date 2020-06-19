package com.example.demo.mapper;


import com.example.demo.dto.EditorDTO;
import com.example.demo.model.EditorEntity;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring", uses = BookMapper.class)
public interface EditorMapper {

    @Named( "NoEditor" )
    @Mapping(target = "bookList", qualifiedByName = "NoEditor")
    EditorDTO toDTO(EditorEntity editorEntity );

    @Named( "NoBook" )
    @Mapping(target = "bookList", ignore = true)
    EditorDTO toDTONoBook( EditorEntity editorEntity );


    @Named( "NoEditor" )
    @IterableMapping(qualifiedByName="NoEditor")
    List< EditorDTO > toDTOList( List< EditorEntity > editorEntityList );

    @Named( "NoBook" )
    @IterableMapping(qualifiedByName="NoBook")
    List< EditorDTO > toDTOListNoBook( List< EditorEntity > editorEntityList );

    @Named( "NoBook" )
    @Mapping(target = "bookList", qualifiedByName = "NoBook")
    EditorEntity toEntity( EditorDTO editorDTO );

    @Named( "NoBook" )
    @IterableMapping(qualifiedByName="NoBook")
    List< EditorEntity > toEntityList( List< EditorDTO > editorDTOList );
}

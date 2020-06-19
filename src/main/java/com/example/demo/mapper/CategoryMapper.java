package com.example.demo.mapper;


import com.example.demo.dto.CategoryDTO;
import com.example.demo.model.CategoryEntity;
import org.mapstruct.*;
import java.util.List;

@Mapper(componentModel = "spring",uses = BookMapper.class)
public interface CategoryMapper {


    @Named( "NoCategory" )
    @Mapping(target = "bookList", qualifiedByName = "NoCategory")
    CategoryDTO toDTO(CategoryEntity categoryEntity );

    @Named( "NoBook" )
    @Mapping(target = "bookList", ignore = true)
    CategoryDTO toDTONoBook( CategoryEntity categoryEntity );


    @Named( "NoCategory" )
    @IterableMapping(qualifiedByName="NoCategory")
    List<CategoryDTO> toDTOList( List< CategoryEntity > categoryEntityList );

    @Named( "NoBook" )
    @IterableMapping(qualifiedByName="NoBook")
    List<CategoryDTO> toDTOListNoBook( List< CategoryEntity > categoryEntityList );


    @Named( "NoCategory" )
    @Mapping(target = "bookList", qualifiedByName = "NoCategory")
    CategoryEntity toEntity( CategoryDTO categoryDTO );

    @Named( "NoBook" )
    @Mapping(target = "bookList", ignore = true)
    CategoryEntity toEntityNoBook( CategoryDTO categoryDTO );


    @Named( "NoCategory" )
    @IterableMapping(qualifiedByName="NoCategory")
    List<CategoryEntity> toEntityList( List< CategoryDTO > categoryDTOList );

    @Named( "NoBook" )
    @IterableMapping(qualifiedByName="NoBook")
    List<CategoryEntity> toEntityListNoBook( List< CategoryDTO > categoryDTOList );

}

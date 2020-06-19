package com.example.demo.mapper;

import com.example.demo.dto.BookDTO;
import com.example.demo.model.BookEntity;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring", uses = {CategoryMapper.class, EditorMapper.class})
public interface BookMapper {

    @Named( "NoBook" )
    @Mappings( {
            @Mapping(target = "categoryList", qualifiedByName = "NoBook"),
            @Mapping( target = "editor.bookList", ignore = true)
    } )
    BookDTO toDTO(BookEntity bookEntity );

    @Named( "NoEditor" )
    @Mappings( {
            @Mapping(target = "editor", ignore = true),
            @Mapping(target = "categoryList", qualifiedByName = "NoBook")
    } )
    BookDTO toDTONoEditor( BookEntity bookEntity );

    @Named( "NoCategory" )
    @Mappings( {
            @Mapping(target = "categoryList", ignore = true),
            @Mapping(target = "editor", qualifiedByName = "NoBook")
    } )
    BookDTO toDTONoCategory( BookEntity bookEntity );


    @Named( "NoBook" )
    @IterableMapping(qualifiedByName="NoBook")
    List<BookDTO> toDTOList(List<BookEntity> bookEntityList );

    @Named( "NoEditor" )
    @IterableMapping(qualifiedByName="NoEditor")
    List<BookDTO> toDTOListNoEditor( List<BookEntity> bookEntityList );

    @Named( "NoCategory" )
    @IterableMapping(qualifiedByName="NoCategory")
    List<BookDTO> toDTOListNoCategory( List<BookEntity> bookEntityList );


    @Named( "NoBook" )
    @Mappings( {
            @Mapping(target = "categoryList", qualifiedByName = "NoBook"),
            @Mapping( target = "editor.bookList", ignore = true)
    } )
    BookEntity toEntity( BookDTO bookDTO );

    @Named( "NoCategory" )
    @Mapping(target = "categoryList", ignore = true)
    BookEntity toEntityNoCategory( BookDTO bookDTO );


    @Named( "NoBook" )
    @IterableMapping(qualifiedByName="NoBook")
    List<BookEntity> toEntityList( List<BookDTO> bookDTOList );

    @Named( "NoCategory" )
    @IterableMapping(qualifiedByName="NoCategory")
    List<BookEntity> toEntityListNoCategory( List<BookDTO> bookDTOList );
}

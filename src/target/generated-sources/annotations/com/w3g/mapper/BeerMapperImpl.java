package com.w3g.mapper;

import com.w3g.dto.BeerDTO;
import com.w3g.dto.BeerDTO.BeerDTOBuilder;
import com.w3g.entity.Beer;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-03-17T10:10:39-0300",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 17.0.2 (Azul Systems, Inc.)"
)
public class BeerMapperImpl implements BeerMapper {

    @Override
    public Beer toModel(BeerDTO beerDTO) {
        if ( beerDTO == null ) {
            return null;
        }

        Beer beer = new Beer();

        beer.setName( beerDTO.getName() );
        beer.setBrand( beerDTO.getBrand() );
        if ( beerDTO.getMax() != null ) {
            beer.setMax( beerDTO.getMax() );
        }
        if ( beerDTO.getQuantity() != null ) {
            beer.setQuantity( beerDTO.getQuantity() );
        }
        beer.setType( beerDTO.getType() );

        return beer;
    }

    @Override
    public BeerDTO toDTO(Beer beer) {
        if ( beer == null ) {
            return null;
        }

        BeerDTOBuilder beerDTO = BeerDTO.builder();

        beerDTO.name( beer.getName() );
        beerDTO.brand( beer.getBrand() );
        beerDTO.max( beer.getMax() );
        beerDTO.quantity( beer.getQuantity() );
        beerDTO.type( beer.getType() );

        return beerDTO.build();
    }
}

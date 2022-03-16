package com.w3g.controller;

import com.w3g.dto.BeerDTO;
import com.w3g.exception.BeerAlreadyRegisteredException;

public interface BeerDocs {
    BeerDTO createBeer(BeerDTO beerDTO) throws BeerAlreadyRegisteredException;
}

package com.w3g.controller;

import com.w3g.dto.BeerDTO;
import com.w3g.exception.BeerAlreadyRegisteredException;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/v1/beers")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class BeerController implements BeerDocs {
    @Override
    public BeerDTO createBeer(BeerDTO beerDTO) throws BeerAlreadyRegisteredException {
        return null;
    }
}

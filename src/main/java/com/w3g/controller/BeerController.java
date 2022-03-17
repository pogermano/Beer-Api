package com.w3g.controller;

import com.w3g.dto.BeerDTO;
import com.w3g.exception.BeerAlreadyRegisteredException;
import com.w3g.service.BeerService;
import lombok.AllArgsConstructor;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("/api/v1/beers")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class BeerController implements BeerDocs {

    private final BeerService beerService;

    @PostMapping
    public BeerDTO createBeer(@RequestBody @Valid BeerDTO beerDTO) throws BeerAlreadyRegisteredException {
//        BeerDTO beerDTO1 = BeerDTO
//                .builder()
//                .name("Pilsen")
//                .brand("Skoll")
//                .build();

        return beerService.createBeer(beerDTO);
    }
}

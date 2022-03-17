package com.w3g.service;

import com.w3g.dto.BeerDTO;
import com.w3g.entity.Beer;
import com.w3g.exception.BeerAlreadyRegisteredException;
import com.w3g.mapper.BeerMapper;
import com.w3g.repository.BeerRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class BeerService {

    private final BeerRepository beerRepository;
    private final BeerMapper beerMapper = BeerMapper.INSTANCE;

    public BeerDTO createBeer(BeerDTO beerDTO) throws BeerAlreadyRegisteredException {
        verifyIfItsAlreadyRegistered(beerDTO.getName());

        Beer beerToSave = beerMapper.toModel(beerDTO);
        Beer beerSaved = beerRepository.save(beerToSave);
        return beerMapper.toDTO(beerSaved);
    }


    private Optional<Beer> verifyIfItsAlreadyRegistered(String name) throws BeerAlreadyRegisteredException {
        Optional<Beer> optSavedBeer = beerRepository.findByName(name);
        if(optSavedBeer.isPresent()){
            throw new BeerAlreadyRegisteredException(name);
        }
        return optSavedBeer;
    }
}

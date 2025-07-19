package com.pumpkin.demo.services;
import com.pumpkin.demo.models.*;
import com.pumpkin.demo.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
import java.util.List;
@Service
public class PumpkinService {

    private final PumpkinRepository pumpkinRepository;

    @Autowired
    public PumpkinService(PumpkinRepository pumpkinRepository) {
        this.pumpkinRepository = pumpkinRepository;
    }

// Create pumpkin
    public Pumpkin createPumpkin(Pumpkin pumpkin){
        return pumpkinRepository.save(pumpkin);

    }

    //find pumpkin
    public Optional<Pumpkin> findPumpkin(Integer id){
        return pumpkinRepository.findById(id);
    }

    //find all pumpkin
    public List<Pumpkin> findAllPumpkin(){
        return pumpkinRepository.findAll();

    }

  //Delete pumpkin
    public void deletePumpkinByID(Integer id){
        pumpkinRepository.deleteById(id);
    }


}

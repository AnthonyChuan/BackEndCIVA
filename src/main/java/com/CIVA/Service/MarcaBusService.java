package com.CIVA.Service;

import com.CIVA.Repositories.MarcaBusRepository;
import com.CIVA.model.marcaBus.MarcaBus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MarcaBusService {

    @Autowired
    private MarcaBusRepository marcaBusRepository;

    public MarcaBus saveMarca(MarcaBus marcaBus){
        return marcaBusRepository.save(marcaBus);
    }

    public ArrayList<MarcaBus> getMarcas(){
        return (ArrayList<MarcaBus>) marcaBusRepository.findAll();
    }

}

package com.CIVA.Controller;

import com.CIVA.Service.MarcaBusService;
import com.CIVA.model.marcaBus.MarcaBus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/marcas")
public class MarcaBusController {
    @Autowired
    private MarcaBusService marcaBusService;

    @GetMapping
    public ArrayList<MarcaBus> getMarcas(){
        return this.marcaBusService.getMarcas();
    }

    @PostMapping
    public MarcaBus saveMarca(@RequestBody MarcaBus marcaBus){
        return this.marcaBusService.saveMarca(marcaBus);
    }

}

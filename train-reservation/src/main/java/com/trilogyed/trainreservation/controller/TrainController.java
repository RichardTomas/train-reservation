package com.trilogyed.trainreservation.controller;

import com.trilogyed.trainreservation.model.Customer;
import com.trilogyed.trainreservation.model.Train;
import com.trilogyed.trainreservation.respository.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/train")
public class TrainController {
    @Autowired
    TrainRepository trainRepository;
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Train> getAllTrains() {
        return trainRepository.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Train getTrainById(@PathVariable int id) {
        Optional<Train> returnVal = trainRepository.findById(id);
        if (returnVal.isPresent()) {
            return returnVal.get();
        } else {
            return null;
        }
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Train addTrain(@RequestBody Train train) {
        return trainRepository.save(train);
    }

    @PutMapping()
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateTrain(@RequestBody Train train) {
        trainRepository.save(train);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteTrain(@PathVariable int id) {
        trainRepository.deleteById(id);
    }

}

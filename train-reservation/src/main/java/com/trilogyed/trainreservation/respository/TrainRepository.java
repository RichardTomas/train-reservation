package com.trilogyed.trainreservation.respository;

import com.trilogyed.trainreservation.model.Train;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainRepository extends JpaRepository<Train, Integer> {
}

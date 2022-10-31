package com.trilogyed.trainreservation.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "train")
public class Train implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "train_id")
    private int trainId;
    @Column(name = "name")
    private String trainName;
    private String manufacturer;
    private String year;
    @Column(name = "total_seats")
    private int totalSeats;
    @Column(name = "seat_layout")
    private String seatLayout;
    @Column(name = "power_type")
    private String powerType;

    public Train() {
    }

    public Train(int trainId, String trainName, String manufacturer, String year, int totalSeats, String seatLayout, String powerType) {
        this.trainId = trainId;
        this.trainName = trainName;
        this.manufacturer = manufacturer;
        this.year = year;
        this.totalSeats = totalSeats;
        this.seatLayout = seatLayout;
        this.powerType = powerType;
    }

    public int getTrainId() {
        return trainId;
    }

    public void setTrainId(int trainId) {
        this.trainId = trainId;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public String getSeatLayout() {
        return seatLayout;
    }

    public void setSeatLayout(String seatLayout) {
        this.seatLayout = seatLayout;
    }

    public String getPowerType() {
        return powerType;
    }

    public void setPowerType(String powerType) {
        this.powerType = powerType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Train train = (Train) o;
        return trainId == train.trainId && totalSeats == train.totalSeats && Objects.equals(trainName, train.trainName) && Objects.equals(manufacturer, train.manufacturer) && Objects.equals(year, train.year) && Objects.equals(seatLayout, train.seatLayout) && Objects.equals(powerType, train.powerType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trainId, trainName, manufacturer, year, totalSeats, seatLayout, powerType);
    }

    @Override
    public String toString() {
        return "Train{" +
                "trainId=" + trainId +
                ", trainName='" + trainName + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", year='" + year + '\'' +
                ", totalSeats=" + totalSeats +
                ", seatLayout='" + seatLayout + '\'' +
                ", powerType='" + powerType + '\'' +
                '}';
    }
}

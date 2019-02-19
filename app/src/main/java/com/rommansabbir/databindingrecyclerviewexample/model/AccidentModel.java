package com.rommansabbir.databindingrecyclerviewexample.model;

public class AccidentModel {
    String fullName;
    String location;
    String accidentTime;

    public AccidentModel() {
    }

    public AccidentModel(String fullName, String location, String accidentTime) {
        this.fullName = fullName;
        this.location = location;
        this.accidentTime = accidentTime;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAccidentTime() {
        return accidentTime;
    }

    public void setAccidentTime(String accidentTime) {
        this.accidentTime = accidentTime;
    }
}

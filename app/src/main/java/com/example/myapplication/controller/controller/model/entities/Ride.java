package com.example.myapplication.controller.controller.model.entities;

import java.util.Date;

/**
 * a ride class allows a new user of the app to request a ride via database
 * needs the location of the user
 */
public class Ride {

    // ************ fields **************
    private String name;
    private String destination;
    private String location;
    private float lengthOfRide;
    private String phone;
    private String email;
    private ClientRequestStatus status;

    private Date startTime;
    private Date finishTime;
    private String driverName;

    /**
     * constructor
     *
     * @param destination
     * @param loca
     * @param phone
     * @param email
     */
    public Ride(String name, String destination, String loca, float distance, String phone, String email) {
        this.name = name;
        this.destination = destination;
        this.location = loca;
        this.lengthOfRide = distance;
        this.phone = phone;
        this.email = email;

        // default values will only be used by reading from the data base
        status = ClientRequestStatus.WAITING;
        startTime = null;
        finishTime = null;
        driverName = null;
    }

    // *********** getters & setters ************

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * gets destination
     *
     * @return String
     */
    public String getDestination() {
        return destination;
    }

    /**
     * sets the destination
     *
     * @param destination
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * gets a location of the phone
     *
     * @return String
     */
    public String getLocation() {
        return location;
    }

    /**
     * sets the location
     *
     * @param location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    public float getLengthOfRide() {
        return lengthOfRide;
    }

    public void setLengthOfRide(float lengthOfRide) {
        this.lengthOfRide = lengthOfRide;
    }

    /**
     * gets the phone number
     *
     * @return Long
     */
    public String getPhone() {
        return phone;
    }

    /**
     * sets the phone number
     *
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * gets the email
     *
     * @return String
     */
    public String getEmail() {
        return email;
    }

    /**
     * sets the email
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    public ClientRequestStatus getStatus() {
        return status;
    }

    public void setStatus(ClientRequestStatus status) {
        this.status = status;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }
}

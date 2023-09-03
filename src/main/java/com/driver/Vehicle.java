package com.driver;

public class Vehicle {

    private String name;
    private int currentSpeed;
    private int currentDirection;

    public int getCurrentDirection() {
        return currentDirection;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }

    public Vehicle(String name) {
        this.name=name;
        this.currentSpeed=0;
        this.currentDirection=0;
    }

    public void steer(int direction){
        //direction is in degrees, add it to the current direction
        System.out.println("steer method called - The direction is changed to: " + currentDirection + " degrees");
    }

//    public void move(int speed, int direction){
//        //set the values of currentSpeed and currentDirection
//        System.out.println("move method called - The speed is changed to: " + currentSpeed + ", and the direction is changed to: " + currentDirection + " degrees");
//    }

    public void move(int speed, int direction) {
        setCurrentSpeed(speed);
        setCurrentDirection(direction);
        System.out.println("move method called - The speed is changed to: " + getCurrentSpeed() + ", and the direction is changed to: " + getCurrentDirection() + " degrees");
    }


    public void stop(){

        System.out.println("stop method called - The vehicle is stopped");
    }

}

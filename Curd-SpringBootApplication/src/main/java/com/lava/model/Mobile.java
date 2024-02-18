package com.lava.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;


@Entity
public class Mobile {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private int id;
    @NotNull(message = "Mobile name should not be null")
    @NotEmpty(message = "mobile name should not be empty")
    private String mobileName;
    @NotEmpty(message = "ram should not be empty")
    private String ram;
    @NotEmpty(message = "processor should not be empty")
    private String processor;
    @NotEmpty(message = "  frontCam should not be empty")
    private String frontCam;
    @NotEmpty(message = " backCam  should not be empty")
    private String backCam;
    @NotEmpty(message = " display should not be empty")
    private String display;
    @NotEmpty(message = "battery should not be empty")
    private String battery;
    @NotEmpty(message = " color should not be empty")

    private String color;
    public Mobile() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Mobile(int id, String mobileName, String ram, String processor, String frontCam, String backCam,
                  String display, String battery, String color) {
        super();
        this.id = id;
        this.mobileName = mobileName;
        this.ram = ram;
        this.processor = processor;
        this.frontCam = frontCam;
        this.backCam = backCam;
        this.display = display;
        this.battery = battery;
        this.color = color;
    }



    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getMobileName() {
        return mobileName;
    }
    public void setMobileName(String mobileName) {
        this.mobileName = mobileName;
    }
    public String getRam() {
        return ram;
    }
    public void setRam(String ram) {
        this.ram = ram;
    }
    public String getProcessor() {
        return processor;
    }
    public void setProcessor(String processor) {
        this.processor = processor;
    }
    public String getFrontCam() {
        return frontCam;
    }
    public void setFrontCam(String frontCam) {
        this.frontCam = frontCam;
    }
    public String getBackCam() {
        return backCam;
    }
    public void setBackCam(String backCam) {
        this.backCam = backCam;
    }
    public String getDisplay() {
        return display;
    }
    public void setDisplay(String display) {
        this.display = display;
    }
    public String getBattery() {
        return battery;
    }
    public void setBattery(String battery) {
        this.battery = battery;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return "Mobile [id=" + id + ", mobileName=" + mobileName + ", ram=" + ram + ", processor=" + processor
                + ", frontCam=" + frontCam + ", backCam=" + backCam + ", display=" + display + ", battery=" + battery
                + ", color=" + color + "]";
    }


}


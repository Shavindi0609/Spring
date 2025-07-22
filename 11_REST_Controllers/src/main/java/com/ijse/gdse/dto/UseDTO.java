package com.ijse.gdse.dto;


public class UseDTO {
    private String uId;
    private String uName;
    private String uAddress;
    private CityDTO uCity;

    public UseDTO(String uId, String uName, String uAddress) {
        this.uId = uId;
        this.uName = uName;
        this.uAddress = uAddress;
    }

    public UseDTO() {

    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuAddress() {
        return uAddress;
    }

    public void setuAddress(String uAddress) {
        this.uAddress = uAddress;
    }

    public UseDTO(String uId, String uName, String uAddress, CityDTO uCity) {
        this.uId = uId;
        this.uName = uName;
        this.uAddress = uAddress;
        this.uCity = uCity;
    }

    public CityDTO getuCity() {
        return uCity;
    }

    public void setuCity(CityDTO uCity) {
        this.uCity = uCity;
    }

    @Override
    public String toString() {
        return "UseDTO{" +
                "uId='" + uId + '\'' +
                ", uName='" + uName + '\'' +
                ", uAddress='" + uAddress + '\'' +
                ", uCity=" + uCity +
                '}';
    }

}

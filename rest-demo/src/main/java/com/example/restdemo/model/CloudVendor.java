package com.example.restdemo.model;

public class CloudVendor {
    private String vendor_iD;
    private String vendor_name;
    private String vendor_address;
    private String vendor_phone_number;

    public CloudVendor() {
    }

    public CloudVendor(String vendor_iD, String vendor_name, String vendor_address, String vendor_phone_number) {
        this.vendor_iD = vendor_iD;
        this.vendor_name = vendor_name;
        this.vendor_address = vendor_address;
        this.vendor_phone_number = vendor_phone_number;
    }

    public String getVendor_iD() {
        return vendor_iD;
    }

    public void setVendor_iD(String vendor_iD) {
        this.vendor_iD = vendor_iD;
    }

    public String getVendor_name() {
        return vendor_name;
    }

    public void setVendor_name(String vendor_name) {
        this.vendor_name = vendor_name;
    }

    public String getVendor_address() {
        return vendor_address;
    }

    public void setVendor_address(String vendor_address) {
        this.vendor_address = vendor_address;
    }

    public String getVendor_phone_number() {
        return vendor_phone_number;
    }

    public void setVendor_phone_number(String vendor_phone_number) {
        this.vendor_phone_number = vendor_phone_number;
    }
}

package com.arun.restdemo;

public class CloudVendor
{


    private String vendorid;
    private String vendornm;
    private String vendoraddress;
    private String vendorPhoneNumber;


    public CloudVendor() {
    }

    public CloudVendor(String vendorid, String vendornm, String vendoraddress, String vendorPhoneNumber) {
        this.vendorid = vendorid;
        this.vendornm = vendornm;
        this.vendoraddress = vendoraddress;
        this.vendorPhoneNumber = vendorPhoneNumber;
    }

    public String getVendorid() {
        return vendorid;
    }

    public void setVendorid(String vendorid) {
        this.vendorid = vendorid;
    }

    public String getVendornm() {
        return vendornm;
    }

    public void setVendornm(String vendornm) {
        this.vendornm = vendornm;
    }

    public String getVendoraddress() {
        return vendoraddress;
    }

    public void setVendoraddress(String vendoraddress) {
        this.vendoraddress = vendoraddress;
    }

    public String getVendorPhoneNumber() {
        return vendorPhoneNumber;
    }

    public void setVendorPhoneNumber(String vendorPhoneNumber) {
        this.vendorPhoneNumber = vendorPhoneNumber;
    }
}

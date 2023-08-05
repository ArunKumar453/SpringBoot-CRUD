package com.arun.restdemo.controller;


import com.arun.restdemo.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudApiservice

{



    CloudVendor cloudVendor;


    @GetMapping("{vendorid}")
    public CloudVendor getCloudVendorDetails(String vendorid)

    {
        return  cloudVendor;
//                ("C1","Vendor1","Vendor address -1",
//            "123456789");

    }

//
    @PostMapping
    public String createcloudVendordetails(@RequestBody  CloudVendor cloudVendor)
    {


        this.cloudVendor=cloudVendor;
        return "Success123";


    }


    @PutMapping
    public String updatecloudVendordetails(@RequestBody  CloudVendor cloudVendor)
    {


        this.cloudVendor=cloudVendor;
        return "Updated Successfully";


    }




    @DeleteMapping("{vendorid}")
    public String deletecloudVendordetails(String vendorid)
    {


        this.cloudVendor=null;
        return "Deleted Successfully";


    }




}

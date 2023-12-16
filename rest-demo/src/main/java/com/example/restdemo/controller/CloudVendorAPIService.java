package com.example.restdemo.controller;

import com.example.restdemo.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {
        CloudVendor cloudVendor;
        @GetMapping("{vendorID}")
        public CloudVendor getCloudVendorDetails(String vendor_ID){
//            return new CloudVendor("C1","vendor 1", "Adress1","8124434");
            return cloudVendor;
        }
        @PostMapping
        public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
            this.cloudVendor = cloudVendor;
            return "Cloud Vendor is created successfully";
        }
        @PutMapping
        public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
            this.cloudVendor = cloudVendor;
            return "Cloud Vendor is updated successfully";
        }

        @DeleteMapping("{vendor_ID}")
        public String deleteCloudVendorDetails(String vendor_ID){
            this.cloudVendor = null;
            return "Cloud Vendor is deleted successfully";
        }



}

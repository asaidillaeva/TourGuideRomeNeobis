package com.example.tourguiderome

class Place {
     var Name: String
     var Description: String
     var District: String
     var Location: String
     var ImageSrc: Int
     var PhoneNumber: String? = null

    constructor(Name: String, Description: String, District: String, Location: String, ImageSrc: Int){
        this.Name =Name
        this.Description = Description
        this.District = District
        this.Location = Location
        this.ImageSrc = ImageSrc

    }
    constructor(Name: String, Description: String, District: String, Location: String, ImageSrc: Int, PhoneNumber: String){
        this.Name =Name
        this.Description = Description
        this.District = District
        this.Location = Location
        this.ImageSrc = ImageSrc
        this.PhoneNumber = PhoneNumber

    }

}
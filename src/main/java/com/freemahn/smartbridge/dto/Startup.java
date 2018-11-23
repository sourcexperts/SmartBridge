package com.freemahn.smartbridge.dto;

import java.util.ArrayList;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
class Startup
{



    private String type;
    private String id;
    private String name;
    private String shortDescription;
    private String description;
    private String founded;
    private String website;
    private String city;
    private String country;
    private boolean published;
    private Logo logo;
    private ArrayList<String> industries;

    public Startup()
    {
        industries = new ArrayList<>();
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public class Logo
    {
        private String id;
        private String imageServiceUrl;
        private String fileName;
    }

}

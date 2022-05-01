package com.microservices.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Builder
@Setter
@Getter
public class Image {
    private Integer id;  
    private String title;  
    private String url;
    
    public Image(Integer id, String title, String url) {
        this.id = id;
        this.title = title;
        this.url = url;
    }    
}

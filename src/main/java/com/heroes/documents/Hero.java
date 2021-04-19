package com.heroes.documents;

import com.heroes.enums.Studio;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@NoArgsConstructor
@AllArgsConstructor
public class Hero {
    @Id
    private String id;

    private String name;

    private Studio studio;

    private int movies;
}

package com.heroes.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Studio {
    DC("DC"),
    MARVEL("Marvel");

    private final String name;
}

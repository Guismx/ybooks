package com.project.ybooks.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum UserEnum {
    @JsonProperty("COMMONUSER")
    COMMONUSER,

    @JsonProperty("EMPLOYEE")
    EMPLOYEE,

    @JsonProperty("ADMIN")
    ADMIN
}

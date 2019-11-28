package com.coordinator.service.bug;

import lombok.*;

import java.time.ZonedDateTime;

@Builder
@Getter
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor(access = AccessLevel.PACKAGE)
class Bug {

    private Long id;
    private String title;
    private Status status;
    private Long severity;
    private String description;
    private String createdBy;
    private ZonedDateTime createdDate;
    private String updatedBy;
    private ZonedDateTime updateDate;

    public enum Status {
        ACTIVE
    }

}

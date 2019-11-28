package com.coordinator.service.bug;

import java.util.List;
import java.util.stream.Collectors;

class BugMapper {

    private BugMapper() {

    }

    static List<Bug> map(List<com.coordinator.bug.Bug> bugList) {
        return bugList.stream()
                .map(bug -> Bug.builder()
                        .createdBy(bug.getCreatedBy())
                        .createdDate(bug.getCreatedDate())
                        .description(bug.getDescription())
                        .id(bug.getId())
                        .severity(bug.getSeverity())
                        .status(Bug.Status.valueOf(bug.getStatus().name()))
                        .title(bug.getTitle())
                        .updateDate(bug.getUpdateDate())
                        .updatedBy(bug.getUpdatedBy())
                        .build())
                .collect(Collectors.toList());
    }
}

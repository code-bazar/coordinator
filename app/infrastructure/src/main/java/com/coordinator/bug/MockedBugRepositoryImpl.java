package com.coordinator.bug;

import org.springframework.stereotype.Repository;

import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.List;

@Repository
public class MockedBugRepositoryImpl implements BugRepository {

    @Override
    public List<Bug> getBugList() {
        return getMockedBugList();
    }

    private List<Bug> getMockedBugList() {
        Bug bug1 = new Bug(1L, "title1", Bug.Status.ACTIVE, 1L, "description1", "Jacek1", ZonedDateTime.now().minusDays(1), null, null);
        Bug bug2 = new Bug(1L, "title2", Bug.Status.ACTIVE, 2L, "description2", "Jacek2", ZonedDateTime.now().minusDays(2), null, null);
        Bug bug3 = new Bug(1L, "title3", Bug.Status.ACTIVE, 3L, "description3", "Jacek3", ZonedDateTime.now().minusDays(3), null, null);
        Bug bug4 = new Bug(1L, "title4", Bug.Status.ACTIVE, 4L, "description4", "Jacek4", ZonedDateTime.now().minusDays(4), null, null);
        return Arrays.asList(bug1, bug2, bug3, bug4);
    }
}

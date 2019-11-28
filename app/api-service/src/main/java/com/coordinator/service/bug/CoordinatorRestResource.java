package com.coordinator.service.bug;

import com.coordinator.bug.BugService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class CoordinatorRestResource {

    private BugService bugService;

    @RequestMapping(path ="/bugs", produces = "application/json", method = RequestMethod.GET)
    @ResponseBody
    public List<Bug> getResponse() {
        return BugMapper.map(bugService.getBugList());
    }
}

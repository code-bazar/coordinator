package com.coordinator.bug;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
class BugServiceImpl implements BugService {

    private BugRepository bugRepository;

    @Override
    public List<Bug> getBugList() {
        return bugRepository.getBugList();
    }
}

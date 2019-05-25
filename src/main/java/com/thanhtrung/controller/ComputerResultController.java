package com.thanhtrung.controller;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import com.thanhtrung.doman.Vote;
import com.thanhtrung.dto.OptionCount;
import com.thanhtrung.dto.VoteResult;
import com.thanhtrung.repository.VoteRepository;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ComputerResultController {

    @Inject
    private VoteRepository voteRepository;

    @GetMapping(value = "/computerResult")
    public ResponseEntity<?> computerResult(@RequestParam Long pollId) {
        VoteResult voteResult = new VoteResult();
        Iterable<Vote> allVotes = voteRepository.findByPoll(pollId);

        int totalVotes = 0;
        Map<Long, OptionCount> temMap = new HashMap<Long, OptionCount>();
        for (Vote v : allVotes) {
            totalVotes++;
            OptionCount optionCount = temMap.get(v.getOption().getId());
            if (optionCount == null) {
                optionCount = new OptionCount();
                optionCount.setOptionId(v.getOption().getId());
                temMap.put(v.getOption().getId(), optionCount);
            }
            optionCount.setCount(optionCount.getCount() + 1);
        }
        voteResult.setResults(temMap.values());
        voteResult.setTotalVotes(totalVotes);
        return new ResponseEntity<>(voteResult, HttpStatus.OK);
    }
}
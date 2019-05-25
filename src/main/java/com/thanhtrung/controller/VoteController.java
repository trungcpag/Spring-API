package com.thanhtrung.controller;

import javax.inject.Inject;

import com.thanhtrung.doman.Vote;
import com.thanhtrung.repository.VoteRepository;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class VoteController {

    @Inject
    private VoteRepository voteRepository;

    @PostMapping(value = "/polls/{pollId}/votes")
    public ResponseEntity<?> createVote(@PathVariable Long pollId, @RequestBody Vote vote) {
        System.out.println(vote);
        vote = voteRepository.save(vote);
        System.out.println(vote);
        HttpHeaders responHeaders = new HttpHeaders();
        responHeaders.setLocation(
                ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(vote.getId()).toUri());
        return new ResponseEntity<>(null, responHeaders, HttpStatus.CREATED);
    }

    @GetMapping(value = "/polls/{pollId}/votes")
    public Iterable<Vote> getAllVotes(@PathVariable Long pollId) {
        return voteRepository.findByPoll(pollId);
    }
}
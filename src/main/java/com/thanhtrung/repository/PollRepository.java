package com.thanhtrung.repository;

import com.thanhtrung.doman.Poll;

import org.springframework.data.repository.CrudRepository;

public interface PollRepository extends CrudRepository<Poll, Long> {

}
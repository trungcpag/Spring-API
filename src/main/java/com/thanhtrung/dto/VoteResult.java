package com.thanhtrung.dto;

import java.util.Collection;

public class VoteResult {

    private int totalVotes;
    private Collection<OptionCount> results;

    public VoteResult() {
    }

    public VoteResult(int totalVotes, Collection<OptionCount> results) {
        this.totalVotes = totalVotes;
        this.results = results;
    }

    public int getTotalVotes() {
        return this.totalVotes;
    }

    public void setTotalVotes(int totalVotes) {
        this.totalVotes = totalVotes;
    }

    public Collection<OptionCount> getResults() {
        return this.results;
    }

    public void setResults(Collection<OptionCount> results) {
        this.results = results;
    }

    public VoteResult totalVotes(int totalVotes) {
        this.totalVotes = totalVotes;
        return this;
    }

    public VoteResult results(Collection<OptionCount> results) {
        this.results = results;
        return this;
    }

    @Override
    public String toString() {
        return "{" + " totalVotes='" + getTotalVotes() + "'" + ", results='" + getResults() + "'" + "}";
    }

}
package com.thanhtrung.dto;

public class OptionCount {
    private Long optionId;
    private int count;

    public OptionCount() {
    }

    public OptionCount(Long optionId, int count) {
        this.optionId = optionId;
        this.count = count;
    }

    public Long getOptionId() {
        return this.optionId;
    }

    public void setOptionId(Long optionId) {
        this.optionId = optionId;
    }

    public int getCount() {
        return this.count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public OptionCount optionId(Long optionId) {
        this.optionId = optionId;
        return this;
    }

    public OptionCount count(int count) {
        this.count = count;
        return this;
    }

    @Override
    public String toString() {
        return "{" + " optionId='" + getOptionId() + "'" + ", count='" + getCount() + "'" + "}";
    }

}
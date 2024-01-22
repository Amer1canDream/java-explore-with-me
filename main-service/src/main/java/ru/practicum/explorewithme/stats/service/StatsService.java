package ru.practicum.explorewithme.stats.service;


public interface StatsService {
    Long getViews(String uri);

    void setHits(String uri, String ip);
}
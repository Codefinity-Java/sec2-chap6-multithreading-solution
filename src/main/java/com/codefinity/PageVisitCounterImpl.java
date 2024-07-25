package com.codefinity;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class PageVisitCounterImpl implements PageVisitCounter{
    private final ConcurrentMap<String, Integer> visitCounts = new ConcurrentHashMap<>();

    // Method to increment the visit count
    public void incrementVisit(String pageUrl) {
        visitCounts.merge(pageUrl, 1, Integer::sum);
    }

    // Method to get the current visit count
    public int getVisitCount(String pageUrl) {
        return visitCounts.getOrDefault(pageUrl, 0);
    }

}

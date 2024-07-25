package com.codefinity;

public interface PageVisitCounter {

   void incrementVisit(String pageUrl);

   int getVisitCount(String pageUrl);

}

package CompareDates;

import java.util.*;

public class Event {
    String eventName;
    Date startDate;
    Date endDate;

    public Event(String eventName, Date startDate, Date endDate) {
        this.eventName = eventName;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}

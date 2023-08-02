package stream.streamLamda;

import java.util.List;

class Event {
    String eventName;
    String organiserName;
    Double eventCost;

    Event() {
    }

    Event(String eventName, String organiserName, Double eventCost) {
        this.eventName = eventName;
        this.organiserName = organiserName;
        this.eventCost = eventCost;
    }

    void display(List<Event> eventList) {
        eventList.stream().forEach(
                item -> System.out.println(item.eventName + "|" + item.organiserName + "|" + item.eventCost + "\n"));
    }
}
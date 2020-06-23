package io.pivotal.pal.tracker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryTimeEntryRepository implements TimeEntryRepository{

    private Map<Long,TimeEntry> db = new HashMap<>();

    private Long counter = 0L;

    public TimeEntry create(TimeEntry timeEntry) {
        timeEntry.setId(++counter);
        db.put(timeEntry.getId(),timeEntry);
        return db.get(timeEntry.getId());
    }

    public TimeEntry find(Long id) {

        return  db.get(id);
    }

    public TimeEntry update(Long id, TimeEntry timeEntry)
    {
        if(db.containsKey(id)){
            timeEntry.setId(id);
            db.put(timeEntry.getId(),timeEntry);

        }
        return db.get(timeEntry.getId());
    }

    public List<TimeEntry> list() {

        return new ArrayList<TimeEntry>(db.values());
    }

    public void delete(Long id) {
        db.remove(id);
    }
}

package net.engineeringdigest.journalApp.controller;

import net.engineeringdigest.journalApp.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {
    private Map<Long, JournalEntry> journalEntries=new HashMap<>();

    @GetMapping
    public List<JournalEntry> getAll(){
        return new ArrayList<>(journalEntries.values());
    }

    @PostMapping
    public String createEntry(@RequestBody JournalEntry myEntry){
        journalEntries.put(myEntry.getId(), myEntry);
        return "Success";
    }

    @GetMapping("id/{myid}")
    public JournalEntry getJournalEntrieById(@PathVariable Long myid){
      return  journalEntries.get(myid);
    }
    @DeleteMapping("id/{myid}")
    public JournalEntry deletrecord (@PathVariable Long myid){
        return  journalEntries.remove(myid);
    }
    @PutMapping("id/{id}")
    public JournalEntry updateFRecord (@PathVariable Long id,@RequestBody JournalEntry myEntry){
        return  journalEntries.put(id,myEntry);
    }
}

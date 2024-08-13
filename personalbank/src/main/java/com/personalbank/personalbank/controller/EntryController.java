package com.personalbank.personalbank.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.personalbank.personalbank.model.Entry;
import com.personalbank.personalbank.service.EntryService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/entries")
@RequiredArgsConstructor
public class EntryController {

	private EntryService entryService;
	
	
	@GetMapping("/{userId}")
	public List<com.personalbank.personalbank.model.Entry> getEntries(@PathVariable Integer userId){
		return entryService.getEntriesByUserId(userId);
	}
	@PostMapping
	public Entry addEntry(@RequestBody Entry entry) {
		return entryService.addEntry(entry);
	}
	@PutMapping("/{id}")
	public Optional<Entry> updateEntry(@PathVariable Integer id, @RequestBody Entry entry){
		return  entryService.updateEntry(id, entry);
		
	}
	@DeleteMapping("/{id}")
	public void deleteEntry(@PathVariable Integer id) {
		entryService.deleteEntry(id);
	}
	
}

package com.personalbank.personalbank.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.personalbank.personalbank.Repository.EntryRepository;
import com.personalbank.personalbank.model.Entry;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EntryService {

	private    EntryRepository entryRepository;
	
	public List<Entry> getEntriesByUserId(Integer userId){
		return entryRepository.findByUserId(userId);
		
	}
	
	public Entry addEntry(com.personalbank.personalbank.model.Entry  entry) {
		return entryRepository.save(entry);
	}
	
	public Optional<Entry> updateEntry(Integer id, Entry updatedEntry){
		return entryRepository.findById(id).map(entry->{
			entry.setAmount(updatedEntry.getAmount());
			entry.setDescription(updatedEntry.getDescription());
			entry.setType(updatedEntry.getType());
			return entryRepository.save(entry);
		});
	}
	public void deleteEntry(Integer id) {
		entryRepository.deleteById(id);
	}
	
}

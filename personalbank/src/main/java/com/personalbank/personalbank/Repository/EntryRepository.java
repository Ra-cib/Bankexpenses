package com.personalbank.personalbank.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.personalbank.personalbank.model.Entry;

public interface EntryRepository  extends JpaRepository<Entry,Integer>{

	List<Entry> findByUserId(Integer userId);

}

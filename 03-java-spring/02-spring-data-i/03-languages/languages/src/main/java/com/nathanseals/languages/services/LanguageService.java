package com.nathanseals.languages.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.nathanseals.languages.models.Language;
import com.nathanseals.languages.repositories.LanguageRepository;

@Service
public class LanguageService {
	private final LanguageRepository languageRepository;
	
	public LanguageService (LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}
	public List <Language> allLanguages() {
		return languageRepository.findAll();
	}
	public Language createLanguage(Language l) {
		return languageRepository.save(l);
	}
	public Language findLanguage(Long id) {
		Optional<Language> optionalLanguage = languageRepository.findById(id);
		if(optionalLanguage.isPresent()) {
			return optionalLanguage.get();
		} else {
			return null;
		}
	}
	public Language updateLanguage(Long id, String name, String creator, float version) {
		Language update = findLanguage(id);
		update.setName(name);
		update.setCreator(creator);
		update.setVersion(version);
		return languageRepository.save(update);
	}
	public Language updateLanguage(Language language) {
		Language update = language;
		String name = update.getName();
		String creator = update.getCreator();
		float version = update.getVersion();
		update.setName(name);
		update.setCreator(creator);
		update.setVersion(version);
		return languageRepository.save(update);
	}
	public void deleteLanguage(Long id) {
		languageRepository.deleteById(id);
	}
}

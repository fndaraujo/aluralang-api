package br.com.alura.aluralang.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class LangController {
	@Autowired
	private LanguageRepository repository;

	@GetMapping(value = "/langs")
	public List<Language> getLangs() {
		List<Language> languages = repository.findAll();
		return languages;
	}

	@PostMapping(value = "/langs")
	public void pushLanguage(@RequestBody Language language) {
		repository.save(language);
	}
}

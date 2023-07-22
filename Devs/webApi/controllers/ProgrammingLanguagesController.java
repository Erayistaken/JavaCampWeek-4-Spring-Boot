package kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@RestController
@RequestMapping("/api/programminglanguages")
public class ProgrammingLanguagesController {

	private ProgrammingLanguageService languageService;

	public ProgrammingLanguagesController(ProgrammingLanguageService languageService) {
		super();
		this.languageService = languageService;
	}

	public List<ProgrammingLanguage> getAll() {
		return languageService.getAll();
	}

	@PostMapping("/add")
	public void add(@RequestBody ProgrammingLanguage language) {
		languageService.add(language);
	}

	@PostMapping("/update")
	public void update(@RequestBody ProgrammingLanguage language) {
		languageService.update(language);
	}

	@PostMapping("/delete")
	public void delete(@RequestBody ProgrammingLanguage language) {
		languageService.delete(language);
	}

	@GetMapping("/programminglanguages")
	public ProgrammingLanguage getById(@PathVariable int id) {
		return languageService.getById(id);
	}
}

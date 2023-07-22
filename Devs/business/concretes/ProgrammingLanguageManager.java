package kodlama.io.Devs.business.concretes;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {
	private ProgrammingLanguageRepository languageRepository;

	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository languageRepository) {
		super();
		this.languageRepository = languageRepository;
	}

	@Override
	public List<ProgrammingLanguage> getAll() {

		return languageRepository.getAll();
	}

	@Override
	public void add(ProgrammingLanguage language) {

		if (language.getName() != "" && language.getName() == "Java") {
			languageRepository.add(language);
		}

	}

	@Override
	public void update(ProgrammingLanguage language) {
		languageRepository.update(language);

	}

	@Override
	public void delete(ProgrammingLanguage language) {
		languageRepository.delete(language);
		
	}

	@Override
	public ProgrammingLanguage getById(int id) {

		return languageRepository.getById(id);
	}

}

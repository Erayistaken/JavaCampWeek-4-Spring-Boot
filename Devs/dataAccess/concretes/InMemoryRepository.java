package kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public class InMemoryRepository implements ProgrammingLanguageRepository {

	List<ProgrammingLanguage> languages;

	public InMemoryRepository() {
		languages = new ArrayList<ProgrammingLanguage>();
		languages.add(new ProgrammingLanguage(1, "Java"));
		languages.add(new ProgrammingLanguage(2, "Python"));
		languages.add(new ProgrammingLanguage(3, "C#"));
		languages.add(new ProgrammingLanguage(4, "React"));

	}

	@Override
	public List<ProgrammingLanguage> getAll() {

		return languages;
	}

	@Override
	public void add(ProgrammingLanguage language) {

		languages.add(language);

	}

	@Override
	public void delete(ProgrammingLanguage language) {

		languages.remove(language);

	}

	@Override
	public void update(ProgrammingLanguage language) {

		languages.set(-1, language);

	}

	@Override
	public ProgrammingLanguage getById(int id) {

		return languages.get(id - 1);
	}

}

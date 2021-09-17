package com.nathanseals.dojooverflow.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nathanseals.dojooverflow.models.Question;
import com.nathanseals.dojooverflow.models.Tag;
import com.nathanseals.dojooverflow.repositories.QuestionRepository;

@Service
public class QuestionService {
	@Autowired
	private QuestionRepository qRepo;
	@Autowired
	private TagService tServ;
	
	public List<Question> allQuestion() {
		return qRepo.findAll();
	}
	public Question oneQuestionById(Long Id) {
		return qRepo.findById(Id).orElse(null);
	}
	public Question createQuestion(Question q) {
		List<Tag> tagForQuestion = new ArrayList<Tag>();
		String[] tagsToProcess = q.getTags().split(",");
		for (String S : tagsToProcess) {
			if(tServ.existsByName(S)) {
				Tag addTag = tServ.findByName(S);
				tagForQuestion.add(addTag);
			} else {
				Tag newTag = new Tag();
				newTag.setSubject(S.toLowerCase());
				tServ.createTag(newTag);
				tagForQuestion.add(newTag);
			}
		}
		q.setTagList(tagForQuestion);
		return qRepo.save(q);
	}
}


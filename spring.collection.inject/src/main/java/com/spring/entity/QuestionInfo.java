package com.spring.entity;

import java.util.List;
import java.util.Map;

public class QuestionInfo {

	private int questionId;
	
	private String question;
	
	private Map<String,String> answers;

	public QuestionInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public QuestionInfo(int questionId, String question, Map<String, String> answers) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answers = answers;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Map<String, String> getAnswers() {
		return answers;
	}

	public void setAnswers(Map<String, String> answers) {
		this.answers = answers;
	}

	@Override
	public String toString() {
		return "QuestionInfo [questionId=" + questionId + ", question=" + question + ", answers=" + answers + "]";
	}
	
	
	
}

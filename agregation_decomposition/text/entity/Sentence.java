
package by.epam_tc.class_programminng.agregation_decomposition.text.entity;

import java.io.Serializable;

public class Sentence implements Serializable {

	private static final long serialVersionUID = 1719212092315852869L;
	private String sentence;

	public Sentence(String sentence) {
		super();
		setSentence(sentence);
	}

	public Sentence(Word... words) {
		setSentence(words);
	}

	public Sentence() {
		setSentence("");
	}

	public String getSentence() {
		return sentence;
	}

	public void setSentence(Word[] words) {
		StringBuilder sentenceBuilder = new StringBuilder();
		for (var word : words) {
			sentenceBuilder.append(word.toString());
			sentenceBuilder.append(" ");
		}
		this.sentence = sentenceBuilder.toString();
	}

	public void setSentence(String sentence) {
		this.sentence = sentence;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sentence == null) ? 0 : sentence.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sentence other = (Sentence) obj;
		if (sentence == null) {
			if (other.sentence != null)
				return false;
		} else if (!sentence.equals(other.sentence))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return sentence;
	}
}

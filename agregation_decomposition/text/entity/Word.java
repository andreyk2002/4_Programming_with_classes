package by.epam_tc.class_programminng.agregation_decomposition.text.entity;

import java.io.Serializable;

public class Word implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 79773555165542780L;
	private String word;

	public Word(String word) {
		super();
		setWord(word);
	}
	
	public Word() {
		this("0");
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		StringBuilder strB = new StringBuilder();
		int i = 0;
		while (i < word.length()) {
			strB.append(word.charAt(i));
			if (word.charAt(i) == ' ') {
				break;
			}
			i++;
		}
		this.word = strB.toString();
	}

	@Override
	public String toString() {
		return word;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((word == null) ? 0 : word.hashCode());
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
		Word other = (Word) obj;
		if (word == null) {
			if (other.word != null)
				return false;
		} else if (!word.equals(other.word))
			return false;
		return true;
	}
	
	
}

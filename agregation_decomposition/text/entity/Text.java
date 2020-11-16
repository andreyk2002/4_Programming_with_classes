package by.epam_tc.class_programminng.agregation_decomposition.text.entity;

import java.io.Serializable;
import java.util.ArrayList;

public class Text implements Serializable{

	private static final long serialVersionUID = -3307210066397693270L;
	private ArrayList<Word> heading;
	private ArrayList<Sentence> text;

	public Text(ArrayList<Word> heading, ArrayList<Sentence> text) {
		super();
		this.heading = heading;
		this.text = text;
	}
	
	public Text() {
		this(new ArrayList<Word>(), new ArrayList<Sentence>());
	}
	
	public ArrayList<Word> getHeading() {
		return heading;
	}

	public void setHeading(ArrayList<Word> heading) {
		this.heading = heading;
	}
	
	public ArrayList<Sentence> getText() {
		return text;
	}

	public void setText(ArrayList<Sentence> text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return getHeading() + "\n\r" + getText();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((heading == null) ? 0 : heading.hashCode());
		result = prime * result + ((text == null) ? 0 : text.hashCode());
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
		Text other = (Text) obj;
		if (heading == null) {
			if (other.heading != null)
				return false;
		} else if (!heading.equals(other.heading))
			return false;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		return true;
	}
	
	
}

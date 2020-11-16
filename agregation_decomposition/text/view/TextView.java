package by.epam_tc.class_programminng.agregation_decomposition.text.view;

import by.epam_tc.class_programminng.agregation_decomposition.text.entity.Sentence;
import by.epam_tc.class_programminng.agregation_decomposition.text.entity.Text;
import by.epam_tc.class_programminng.agregation_decomposition.text.entity.Word;

public class TextView {
	private static TextView instance = null;

	private TextView() {

	}

	public static TextView getInstance() {
		if (instance == null) {
			instance = new TextView();
		}
		return instance;
	}

	public void printText(Text text) {
		for (Sentence sentence : text.getText()) {
			System.out.print(sentence.toString());
		}
	}

	public void printHeading(Text text) {
		for (Word word : text.getHeading()) {
			System.out.print(word.toString());
			System.out.print(" ");
		}
		System.out.println();
	}
}

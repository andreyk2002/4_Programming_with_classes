package by.epam_tc.class_programminng.agregation_decomposition.text.logic;

import by.epam_tc.class_programminng.agregation_decomposition.text.entity.*;

public class TextLogic {

	private static TextLogic instance = null;

	private TextLogic() {

	}

	public static TextLogic getInstance() {
		if (instance == null) {
			instance = new TextLogic();
		}
		return instance;
	}

	public void addText(Text text, Sentence st) {
		text.getText().add(st);
	}

	public void addText(Text text, Sentence[] sentences) {
		for (int i = 0; i < sentences.length; i++) {
			text.getText().add(sentences[i]);
		}
	}

	public void addHeading(Text text, Word w) {
		text.getHeading().add(w);
	}

	public String getText(Text text) {
		StringBuilder stringBuilder = new StringBuilder();
		for (var txt : text.getText()) {
			stringBuilder.append(txt.toString());

		}
		return stringBuilder.toString();
	}

	public String getHeading(Text text) {
		StringBuilder stringBuilder = new StringBuilder();
		for (var heading : text.getHeading()) {
			stringBuilder.append(heading);
			stringBuilder.append(" ");
		}
		return stringBuilder.toString();
	}

}

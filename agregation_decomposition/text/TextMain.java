package by.epam_tc.class_programminng.agregation_decomposition.text;

import java.util.ArrayList;

import by.epam_tc.class_programminng.agregation_decomposition.text.entity.Sentence;
import by.epam_tc.class_programminng.agregation_decomposition.text.entity.Text;
import by.epam_tc.class_programminng.agregation_decomposition.text.entity.Word;
import by.epam_tc.class_programminng.agregation_decomposition.text.logic.TextLogic;
import by.epam_tc.class_programminng.agregation_decomposition.text.view.TextView;

public class TextMain {
	public static void main(String[] argc) {
		TextLogic logic = TextLogic.getInstance();
		TextView view = TextView.getInstance();
		
		ArrayList<Word> heading = new ArrayList<Word>();
		heading.add(new Word("C++"));
		
		ArrayList<Sentence> text = new ArrayList<Sentence>();
		
		String st1 = "C++ is a high-level, general-purpose programming language created by"
				+ " Bjarne Stroustrup as an extension of the C programming language, or \"C with Classes\".\n";
		Sentence sentence = new Sentence(st1);
		text.add(sentence);
		Text cpp = new Text(heading, text);

		String st2 = "The language has expanded significantly over time, and modern C++ has object-oriented, generic, "
				+ "and functional features in addition to facilities for low-level memory manipulation.\n";
		String st3 = "C++ was designed with a bias toward system programming and embedded, resource-constrained software and large systems,"
				+ " with performance, efficiency, and flexibility of use as its design highlights.\n";
		logic.addText(cpp,new Sentence(st2));
		logic.addText(cpp,new Sentence(st3));
		
		view.printHeading(cpp);
		view.printText(cpp);
	}
}

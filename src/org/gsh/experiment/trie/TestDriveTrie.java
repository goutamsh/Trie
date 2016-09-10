package org.gsh.experiment.trie;

import java.util.Arrays;
import java.util.List;

public class TestDriveTrie {


	public static void main(String[] args) {
		Trie trie = new Trie();
		List<String> list = Arrays.asList("apple", "ant", "anteena", "orange", "org", "home", "homework");

		for (String string : list) {
			trie.addWord(string);
		}
		
		List<String> listToSearch = Arrays.asList("apple", "app", "ante", "orange", "org", "home", "homework");

		for (String string : listToSearch) {
			System.out.println(string + " exist :: "+trie.checkIfExist(string));
		}
	}
}

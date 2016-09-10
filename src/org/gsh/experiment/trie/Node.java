package org.gsh.experiment.trie;

public class Node {

	private Node[] node;
	private boolean isEndOfWord = false;
	
	public Node() {
		node = new Node[200];
	}
	public Node[] getNode() {
		return node;
	}
	public void setNode(Node[] node) {
		this.node = node;
	}
	public boolean isEndOfWord() {
		return isEndOfWord;
	}
	public void setEndOfWord(boolean isEndOfWord) {
		this.isEndOfWord = isEndOfWord;
	}
	

}

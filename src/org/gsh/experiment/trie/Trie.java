package org.gsh.experiment.trie;

public class Trie {

	private Node root = new Node();
	
	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}
	
/*	public boolean isEmpty(){
		return root == null;
	}*/
	
	public void addWord(String word){
		Node currentNode = root;
		//Node previousNode = root;
		for(int i = 0; i < word.length(); i++){
			char ch = word.charAt(i);
			if(i == word.length() - 1){
				if(currentNode.isEndOfWord()){
					System.out.println("This word is already added");
				}
				currentNode.setEndOfWord(true);
			}else{
				if(currentNode.getNode()[ch] == null){
					currentNode.getNode()[ch] = new Node();
				}
				currentNode = currentNode.getNode()[ch] ;
			}
		}
	}
	
	public boolean checkIfExist(String word){
		boolean result = false;
		Node currentNode = root;
		for(int i = 0; i < word.length(); i++){
			char ch = word.charAt(i);
			if(currentNode.getNode()[ch] == null){
				if(!currentNode.isEndOfWord()){
					break;
				}else{
					if(i == word.length() - 1){
						result = true;
					}
				}
			}else{
				if(i == word.length() - 1 && currentNode.isEndOfWord()){
					result = true;
				}
				currentNode = currentNode.getNode()[ch];
			}
		}	
		return result;
	}
	
}

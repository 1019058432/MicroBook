package com.entity;

public class Show {
  private String chapter;
  private String textFile;
public String getChapter() {
	return chapter;
}
public void setChapter(String chapter) {
	this.chapter = chapter;
}
public String getTextFile() {
	return textFile;
}
public void setTextFile(String textFile) {
	this.textFile = textFile;
}
@Override
public String toString() {
	return "Show [chapter=" + chapter + ", textFile=" + textFile + "]";
}

}

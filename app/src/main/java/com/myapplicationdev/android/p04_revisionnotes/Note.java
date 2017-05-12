package com.myapplicationdev.android.p04_revisionnotes;

public class Note {

	public int id;
    public String noteContent;
    public int stars;


public Note(int id, String noteContent, int stars){
    this.id = id;
    this.noteContent = noteContent;
    this.stars = stars;
}

public int getId(){
    return id;
}
public String getNoteContent(){
    return noteContent;
}
public int getStars(){
    return stars;
}
}

package com.example.cloudnote;

public class NoteDTO {

    private String title;
    private String content;

    public  String getTitle(){

        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getContent(){
        return  content;
    }

    public void SetContent(String content){
        this.content = content;
    }
}

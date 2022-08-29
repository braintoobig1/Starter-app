package com.example.weather;

import android.media.Image;

public class noteClass {
    String noteText;
    String noteTitle;
    String noteCreationDate;
    String imageNote; //refer to address in gallery

    public noteClass(String noteText, String noteTitle, String noteCreationDate) {
        this.noteText = noteText;
        this.noteTitle = noteTitle;
        this.noteCreationDate = noteCreationDate;
    }

    public noteClass(String noteText, String noteTitle, String noteCreationDate, String imageNote) {
        this.noteText = noteText;
        this.noteTitle = noteTitle;
        this.noteCreationDate = noteCreationDate;
        this.imageNote = imageNote;
    }

    public String getImageNote() {
        return imageNote;
    }

    public void setImageNote(String imageNote) {
        this.imageNote = imageNote;
    }

    public String getNoteText() {
        return noteText;
    }

    public void setNoteText(String noteText) {
        this.noteText = noteText;
    }

    public String getNoteTitle() {
        return noteTitle;
    }

    public void setNoteTitle(String noteTitle) {
        this.noteTitle = noteTitle;
    }

    public String getNoteCreationDate() {
        return noteCreationDate;
    }

    public void setNoteCreationDate(String noteCreationDate) {
        this.noteCreationDate = noteCreationDate;
    }
}

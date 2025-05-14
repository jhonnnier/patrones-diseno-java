package com.company.behavioral.memento;

public class ArticleMemento {
    private String autor;
    private String text;

    public ArticleMemento(String autor, String text) {
        this.autor = autor;
        this.text = text;
    }
    
    public ArticleMemento createMemento() {
        ArticleMemento memento = new ArticleMemento(autor, text);
        return memento;
    }
    
    public void restoreMemento(ArticleMemento memento) {
        this.autor = memento.getAutor();
        this.text = memento.getText();
    }

    public String getAutor() {
        return autor;
    }

    public String getText() {
        return text;
    }
}

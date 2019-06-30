package com.sda.tallinn6.evgenii;


public enum GameChoices {
    SCISSOR(0),
    ROCK(1),
    PAPER(2);

    private Integer choiceCode;

    GameChoices(Integer choiceCode) {
        this.choiceCode = choiceCode;
    }

    public Integer getChoiceCode() {
        return choiceCode;
    }


}
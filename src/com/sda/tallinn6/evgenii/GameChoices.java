package com.sda.tallinn6.evgenii;


public enum GameChoices {
    SCISSOR(0),
    ROCK(1),
    PAPER(2);
    private Integer choiceCode;
    private String name;
    GameChoices(Integer choiceCode) {
        this.choiceCode = choiceCode;
    }
    public Integer getChoiceCode() {
        return choiceCode;
    }
    public static String fromId(Integer id) {
        for (GameChoices es : GameChoices.values()) {
            if (es.choiceCode.equals(id)) {
                return es.toString();
            }
        }
        throw new IllegalArgumentException();
    }
}

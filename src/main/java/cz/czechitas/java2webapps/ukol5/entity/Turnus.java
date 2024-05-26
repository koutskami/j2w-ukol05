package cz.czechitas.java2webapps.ukol5.entity;

public enum Turnus {
    turnus_1 ("5.–11. července"),
    turnus_2("12.–18. července"),
    turnus_3("19.–25. července");

    private final String title;

    Turnus(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

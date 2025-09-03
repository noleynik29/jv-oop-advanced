package core.basesyntax.model;

import core.basesyntax.Drawable;

public abstract class Figure implements Drawable {
    public String color;

    public Figure(String color) {
        this.color = color;
    }
}

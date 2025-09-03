package core.basesyntax.model;

import core.basesyntax.Drawable;
import core.basesyntax.FigureArea;

public abstract class Figure implements Drawable, FigureArea {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }
}

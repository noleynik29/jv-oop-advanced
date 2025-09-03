package core.basesyntax;

import core.basesyntax.model.*;
import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int type = random.nextInt(5); // 0..4
        String color = colorSupplier.getRandomColor();

        return switch (type) {
            case 0 -> new Square(color, random.nextInt(10) + 1);
            case 1 -> new Rectangle(color, random.nextInt(10) + 1, random.nextInt(10) + 1);
            case 2 -> new RightTriangle(color, random.nextInt(10) + 1, random.nextInt(10) + 1);
            case 3 -> new Circle(color, random.nextInt(10) + 1);
            default -> new IsoscelesTrapezoid(color,
                    random.nextInt(10) + 1, random.nextInt(10) + 1, random.nextInt(10) + 1);
        };
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}

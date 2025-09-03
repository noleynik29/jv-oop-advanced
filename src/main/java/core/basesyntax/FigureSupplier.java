package core.basesyntax;

import core.basesyntax.model.Circle;
import core.basesyntax.model.Figure;
import core.basesyntax.model.IsoscelesTrapezoid;
import core.basesyntax.model.Rectangle;
import core.basesyntax.model.RightTriangle;
import core.basesyntax.model.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_TYPES_COUNT = 5;
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int type = random.nextInt(FIGURE_TYPES_COUNT);
        String color = colorSupplier.getRandomColor();

        return switch (type) {
            case 0 -> {
                int side = random.nextInt(10) + 1;
                yield new Square(color, side);
            }
            case 1 -> {
                int width = random.nextInt(10) + 1;
                int height = random.nextInt(10) + 1;
                yield new Rectangle(color, width, height);
            }
            case 2 -> {
                int firstLeg = random.nextInt(10) + 1;
                int secondLeg = random.nextInt(10) + 1;
                yield new RightTriangle(color, firstLeg, secondLeg);
            }
            case 3 -> {
                int radius = random.nextInt(10) + 1;
                yield new Circle(color, radius);
            }
            default -> {
                int base1 = random.nextInt(10) + 1;
                int base2 = random.nextInt(10) + 1;
                int height = random.nextInt(10) + 1;
                yield new IsoscelesTrapezoid(color, base1, base2, height);
            }
        };
    }

    public Figure getDefaultFigure() {
        return new Circle("white", DEFAULT_CIRCLE_RADIUS);
    }
}

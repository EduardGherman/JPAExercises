import javax.persistence.AttributeConverter;
import java.awt.*;

public class ColorFromIntConvertor implements AttributeConverter<Color, Integer> {


    @Override
    public Integer convertToDatabaseColumn(Color color) {
        return color.getRGB();
    }

    @Override
    public Color convertToEntityAttribute(Integer integer) {
        return new Color(integer);
    }
}

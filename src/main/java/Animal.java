import java.util.logging.Logger;
import javax.persistence.*;
import java.awt.*;


@Entity
@Table(name = "ANIMAL")
@EntityListeners(EntityListener.class)
public class Animal {

    @Id
    int id;

    @Column(name="ANIMAL_NAME", length=50, nullable=false, unique=false)
    String name;

    @Convert(converter = ColorFromIntConvertor.class)
    @Column(name="ANIMAL_COLOR", length=50, nullable=false, unique=false)
    Color rgbColor;

    private String prePersist;

    private String preUpdate;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getRgbColor() {
        return rgbColor;
    }

    public String getPrePersist() {
        return prePersist;
    }

    public void setPrePersist(String prePersist) {
        this.prePersist = prePersist;
    }

    public String getPreUpdate() {
        return preUpdate;
    }

    public void setPreUpdate(String preUpdate) {
        this.preUpdate = preUpdate;
    }

    public void setRgbColor(Color rgbColor) {this.rgbColor = rgbColor; }



}

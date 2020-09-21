import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.util.logging.Logger;

public class EntityListener {
    private static Logger LOGGER =  Logger.getLogger(Animal.class.getName());

    @PrePersist
    public void nameDoesNotMatterPrePersist(Animal entity) {

        entity.setPrePersist("prePersist");
        LOGGER.info("prePersist");
    }

    @PreUpdate
    public void nameDoesNotMatterPreUpdate(Animal entity) {

        entity.setPreUpdate("preUpdate");
        LOGGER.info("preUpdate");
    }



}

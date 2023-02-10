package de.nloewes.roshambr.converter;

import de.nloewes.roshambr.model.GameChoiceResource;
import de.nloewes.roshambr.model.GameChoice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Converter utility class to provide conversion methods from service-layer objects and DAOs related to {@link GameChoice} to DTOs and vice versa
 *
 * @author nloewes
 */
public class GameChoiceConverter {

    private static final Logger LOG = LoggerFactory.getLogger(GameChoiceConverter.class);

    /**
     * Converts a given {@link GameChoiceResource} to a corresponding {@link GameChoice}
     * @param target the GameChoiceResource to convert
     * @return the converted GameChoice
     */
    public static GameChoice toSource(GameChoiceResource target) {
        try {
            return GameChoice.fromString(target.getPlayerChoice());
        } catch (IllegalArgumentException ex) {
            //TODO
            return null;
        }
    }
}
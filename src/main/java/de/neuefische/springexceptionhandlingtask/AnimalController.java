package de.neuefische.springexceptionhandlingtask;

import de.neuefische.springexceptionhandlingtask.exceptions.AnimalNotFoundException;
import de.neuefische.springexceptionhandlingtask.exceptions.NoAnimalsAvailableException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api/animals")
public class AnimalController {

    @GetMapping("{species}")
    String getAnimalSpecies(@PathVariable String species) {
        if (!species.equals("dog")) {
            throw new AnimalNotFoundException("Only 'dog' is allowed");
        }
        return species;
    }

    @GetMapping
    String getAllAnimals() {
        throw new NoAnimalsAvailableException("No Animals found");
    }
}

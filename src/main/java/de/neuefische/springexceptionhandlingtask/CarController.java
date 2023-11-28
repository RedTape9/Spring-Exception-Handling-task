package de.neuefische.springexceptionhandlingtask;

import de.neuefische.springexceptionhandlingtask.exceptions.CarBrandNotAllowedException;
import de.neuefische.springexceptionhandlingtask.exceptions.NoCarsAvailableException;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api/cars")
public class CarController {

    @GetMapping("{brand}")
    String getCarBrand(@PathVariable String brand) {
        if (!brand.equals("porsche")) {
            throw new CarBrandNotAllowedException("Only 'porsche' allowed");
        }
        return brand;
    }

    @GetMapping
    String getAllCars() {
        throw new NoCarsAvailableException("No Cars found");
    }
}

package de.neuefische.springexceptionhandlingtask;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class AnimalControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getAnimalSpecies_Dog_ReturnsOk() throws Exception {
        mockMvc.perform(get("/api/animals/dog")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string("dog"));
    }

    @Test
    public void getAnimalSpecies_NotDog_ReturnsBadRequest() throws Exception {
        mockMvc.perform(get("/api/animals/dog")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }
}
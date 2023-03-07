package com.techreturners.apilab1;

//package definition omitted for brevity
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.
        AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.
        MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.
        MockMvcResultMatchers;
@AutoConfigureMockMvc
@SpringBootTest
public class HomeControllerTests {
    @Autowired
    private MockMvc mockMvcController;
    @Test
    public void testGetHome() throws Exception {
        String expectedContent = "Welcome to the Drinks API!";
        this.mockMvcController.perform(
                        MockMvcRequestBuilders.get("/"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string
                        (expectedContent));
    }

    @Test
    public void testCoffeeHome() throws Exception {
        String expectedContent = "latte.";
        this.mockMvcController.perform(
                        MockMvcRequestBuilders.get("/coffee"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string
                        (expectedContent));
    }
    @Test
    public void testCoffeeWithCappuccino() throws Exception {
        String expectedContent = "cappuccino.";
        this.mockMvcController.perform(
                        MockMvcRequestBuilders.get("/coffee?name=cappuccino"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string
                        (expectedContent));
    }
}
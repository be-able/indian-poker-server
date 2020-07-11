package com.beable.poker.game.controller;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("test")
public class GameStatusControllerTest {
    @Autowired
    protected MockMvc mockMvc;

//    @Test
//    public void testGetGameStatus() throws Exception {
//        this.mockMvc.perform(MockMvcRequestBuilders.get("/v1/game-status/1"))
//                .andDo(print())
//                .andExpect(status().is(HttpStatus.OK.value()))
//                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
//                .andExpect(jsonPath("$.id").exists())
//                .andExpect(jsonPath("$.createdDate").exists())
//                .andExpect(jsonPath("$.updatedDate").exists());
//    }
}

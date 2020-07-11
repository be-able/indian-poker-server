package com.beable.poker.game.controller;

import com.beable.poker.game.repository.RoundRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@ActiveProfiles("test")
@AutoConfigureMockMvc
public class BetControllerTest {
    @Autowired
    protected MockMvc mockMvc;
    @MockBean
    private RoundRepository roundRepository;

    @Autowired
    private ObjectMapper objectMapper;

    protected String mapToJson(Object obj) throws JsonProcessingException {
        return objectMapper.writeValueAsString(obj);
    }

//    @Test
//    public void testGetGameStatus() throws Exception {
//        Round round = Round.builder()
//                .roundNumber(1)
//                .betList(new ArrayList<>())
//                .createdDate(LocalDateTime.now())
//                .updatedDate(LocalDateTime.now())
//                .build();
//        when(roundRepository.findByGameIdAndRoundNumber(1L, 1)).thenReturn(Optional.of(round));
//
//        this.mockMvc.perform(MockMvcRequestBuilders.post("/v1/game/1/round/1/bet")
//                .contentType(MediaType.APPLICATION_JSON)
//                .content(mapToJson(Bet.builder().id(1L).chipNumber(1)
//                        .createdDate(LocalDateTime.now()).updatedDate(LocalDateTime.now()).build())))
//                .andDo(print())
//                .andExpect(status().is(HttpStatus.OK.value()))
//                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
//                .andExpect(jsonPath("$.id").exists());
//   }
}

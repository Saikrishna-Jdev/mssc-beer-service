package com.sai.webservice.web.test.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder.*;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.UUID;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyBoolean;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;



import static org.junit.jupiter.api.Assertions.*;

class BeerControllerTest {

    @Autowired
    MockMvc mockMvc;
    MockMvcRequestBuilders builders;
   /* @Test
    void getBeerById() {
        mockMvc.perform(get("/api/v1/beer"+ UUID.randomUUID().toString().MockHttpServletRequestBuilder.accept(MediaType
                .APPLICATION_JSON))
                .andExpect(status().isOk());

    }*/

    @Test
    void saveNewBeer() {
    }

    @Test
    void updateInfoById() {
    }
}
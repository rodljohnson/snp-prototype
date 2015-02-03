package com.deloitte.mongo.controllers;

import com.deloitte.mongo.data.EncounterRepository;
import com.deloitte.mongo.domain.Encounter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by jlgrock on 1/11/15.
 */
@RestController
@RequestMapping("/encounter")
public class EncounterController {
    private static final Logger LOGGER = LoggerFactory.getLogger(EncounterController.class);

    @Autowired
    private EncounterRepository repository;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public @ResponseBody
    Encounter getEncounter(@PathVariable final Long id) {
        LOGGER.debug("getting encounter");
        return repository.findOne(id);
    }
}

package com.config.configuration.project.config.schema;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class SchemaController {

    @Autowired
    SchemaService schemaService;

    @RequestMapping(path = "/migrateSchema", method = RequestMethod.GET)
    public boolean migrateSchema() {
        schemaService.migrateSchema();
        return true;
    }
}

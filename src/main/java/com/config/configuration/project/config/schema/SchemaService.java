package com.config.configuration.project.config.schema;

import lombok.AccessLevel;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE)
@Setter(onMethod_ = @Autowired, value = AccessLevel.PRIVATE)
public class SchemaService {

    Flyway flyway;

    public boolean migrateSchema() {
        flyway.migrate();
        flyway.validate();
        return true;
    }

}

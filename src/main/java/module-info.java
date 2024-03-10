module com.a22rubenvp.formula1db {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires eu.hansolo.tilesfx;
    requires jakarta.persistence;
    requires org.hibernate.orm.core;
    requires com.h2database;

    opens com.a22rubenvp.formula1db to javafx.fxml, jakarta.persistence;
    opens com.a22rubenvp.formula1db.model.entities to org.hibernate.orm.core;
    exports com.a22rubenvp.formula1db;
    exports com.a22rubenvp.formula1db.model.entities;
    exports com.a22rubenvp.formula1db.model.dto to org.hibernate.orm.core;
}
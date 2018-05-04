module demo {
    requires spring.web;
    requires spring.beans;
    requires spring.boot.autoconfigure;
    requires spring.cloud.context;
    requires spring.boot;
    requires java.sql;

    opens com.example to spring.core;
    opens com.example.controller to spring.core;

    exports com.example;
}
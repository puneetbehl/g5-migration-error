databaseChangeLog = {

    changeSet(author: "jasonwhetton (generated)", id: "1628840988511-1") {
        createTable(tableName: "test_other_thing") {
            column(autoIncrement: "true", name: "id", type: "BIGINT") {
                constraints(nullable: "false", primaryKey: "true", primaryKeyName: "test_other_thingPK")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "jasonwhetton (generated)", id: "1628840988511-2") {
        createTable(tableName: "test_thing") {
            column(autoIncrement: "true", name: "id", type: "BIGINT") {
                constraints(nullable: "false", primaryKey: "true", primaryKeyName: "test_thingPK")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "some_property", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }
        }
    }
}

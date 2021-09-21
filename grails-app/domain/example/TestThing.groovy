package example

class TestThing {
    static hasMany = [TestOtherThing]

    String someProperty

    static constraints = {
        someProperty nullable: false
    }
}

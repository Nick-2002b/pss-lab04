plugins { 
    java
    checkstyle
    application
}

application {
    mainClass.set("it.unibo.encapsulation.TestAllClasses")
}

repositories{
    mavenCentral()
}

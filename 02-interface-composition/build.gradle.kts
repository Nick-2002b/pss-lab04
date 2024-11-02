plugins { 
    java
    checkstyle
    application
}

application {
    mainClass.set("it.unibo.TestAllClasses")
}

repositories{
    mavenCentral()
}

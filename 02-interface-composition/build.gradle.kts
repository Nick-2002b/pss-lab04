plugins { 
    java
    checkstyle
    application
}

application {
    mainClass.set("it.unibo.Test")
}

repositories{
    mavenCentral()
}

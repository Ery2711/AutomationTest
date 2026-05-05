plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    implementation("org.seleniumhq.selenium:selenium-java:4.43.0")
    implementation("io.cucumber:cucumber-java:7.34.3")
    testImplementation("io.cucumber:cucumber-junit-platform-engine:7.34.3")
    testImplementation("org.junit.platform:junit-platform-suite")
    implementation("io.cucumber:cucumber-picocontainer:7.34.3")
}

tasks.test {
    useJUnitPlatform()
}
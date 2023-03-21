rootProject.name = "gradle-project"

pluginManagement{
    repositories.gradlePluginPortal()
    includeBuild("gradle/plugins")
}

dependencyResolutionManagement{
    repositories.mavenCentral()
    repositories.google()
}

include("business-logic")
include("app")
include("data-model")

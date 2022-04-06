package xyz.ronella.gradle.plugin

import org.gradle.api.provider.Property

interface TemplateGradlePluginExtension {

    Property<Boolean> getVerbose()

}

package xyz.ronella.gradle.plugin.task

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction
import xyz.ronella.gradle.plugin.TemplateGradlePluginExtension

class TemplateGradleTask extends DefaultTask {

    @TaskAction
    def executeCommand() {
        TemplateGradlePluginExtension pluginExt = project.extensions.template_gradle_plugin;
        pluginExt.writeln("Hello World")
        pluginExt.verbose = false
    }
}

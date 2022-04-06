package xyz.ronella.gradle.plugin.task

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction
import xyz.ronella.gradle.plugin.TemplateGradlePluginExtension

abstract class TemplateGradleTask extends DefaultTask {

    final TemplateGradlePluginExtension EXTENSION

    TemplateGradleTask() {
        EXTENSION = project.extensions.template_gradle_plugin
    }

    protected void writeln(String text) {
        if (EXTENSION.verbose.get()) {
            println(text)
        }
    }

    @TaskAction
    def executeCommand() {
        writeln("Hello World")
        EXTENSION.verbose = false
    }
}

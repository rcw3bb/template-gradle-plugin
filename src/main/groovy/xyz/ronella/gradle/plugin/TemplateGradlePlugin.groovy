package xyz.ronella.gradle.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project
import xyz.ronella.gradle.plugin.task.TemplateGradleTask

class TemplateGradlePlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.extensions.create('template_gradle_plugin', TemplateGradlePluginExtension)
        project.task('gradleTask', type: TemplateGradleTask)
    }
}
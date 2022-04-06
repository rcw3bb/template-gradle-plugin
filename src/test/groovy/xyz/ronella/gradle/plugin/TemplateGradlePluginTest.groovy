package xyz.ronella.gradle.plugin

import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import static org.junit.jupiter.api.Assertions.*

class TemplateGradlePluginTest {
    private Project project

    @BeforeEach
    void initProject() {
        project = ProjectBuilder.builder().build()
        project.pluginManager.apply 'xyz.ronella.gradle.plugin'
        project.extensions.template_gradle_plugin.verbose = true
    }

    @Test
    void testProject() {
        project.tasks.gradleTask.executeCommand()
        assertFalse(project.extensions.template_gradle_plugin.verbose.get())
    }

}
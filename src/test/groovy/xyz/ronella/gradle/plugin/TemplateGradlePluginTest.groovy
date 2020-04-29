package xyz.ronella.gradle.plugin

import static org.junit.jupiter.api.Assertions.*

import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class TemplateGradlePluginTest {
    private Project project;

    @BeforeEach
    public void initProject() {
        project = ProjectBuilder.builder().build()
        project.pluginManager.apply 'xyz.ronella.gradle.plugin'
        project.extensions.template_gradle_plugin.verbose = true
    }

    @Test
    public void testProject() {
        project.tasks.gradleTask.executeCommand()
        assertFalse(project.extensions.template_gradle_plugin.verbose)
    }
}
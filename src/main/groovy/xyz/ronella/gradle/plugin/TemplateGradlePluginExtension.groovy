package xyz.ronella.gradle.plugin

class TemplateGradlePluginExtension {

    public boolean verbose = false

    public void writeln(String text) {
        if (verbose) {
            println(text)
        }
    }

}

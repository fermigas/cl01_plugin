package com.github.fermigas.cl01plugin.services

import com.github.fermigas.cl01plugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

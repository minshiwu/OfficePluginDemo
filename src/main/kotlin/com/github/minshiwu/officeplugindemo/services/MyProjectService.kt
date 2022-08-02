package com.github.minshiwu.officeplugindemo.services

import com.intellij.openapi.project.Project
import com.github.minshiwu.officeplugindemo.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

package com.github.gabrielizalo.frontendjavascriptsnippets.services

import com.intellij.openapi.project.Project
import com.github.gabrielizalo.frontendjavascriptsnippets.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

package com.github.crazypino.pinoideaplugin.services

import com.intellij.openapi.project.Project
import com.github.crazypino.pinoideaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

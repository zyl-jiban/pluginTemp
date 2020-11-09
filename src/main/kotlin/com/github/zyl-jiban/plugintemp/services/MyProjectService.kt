package com.github.zyl-jiban.plugintemp.services

import com.intellij.openapi.project.Project
import com.github.zyl-jiban.plugintemp.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

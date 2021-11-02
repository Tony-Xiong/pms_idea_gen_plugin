package com.github.tonyxiong.pmsideagenplugin.services

import com.intellij.openapi.project.Project
import com.github.tonyxiong.pmsideagenplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

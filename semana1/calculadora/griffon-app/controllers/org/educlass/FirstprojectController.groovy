package org.educlass

import griffon.core.artifact.GriffonController
import griffon.metadata.ArtifactProviderFor

@ArtifactProviderFor(GriffonController)
class FirstprojectController {
    FirstprojectModel model

    void click() {
        model.clickCount++
    }
}
package org.educlass

import griffon.core.artifact.GriffonModel
import griffon.transform.Observable
import griffon.metadata.ArtifactProviderFor

@ArtifactProviderFor(GriffonModel)
class FirstprojectModel {
    @Observable int clickCount = 0
}
/*
 * Copyright (c) 2022 Byte Sculptor Software
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package dev.bytesculptor.releasenotesmanager

import dev.bytesculptor.releasenotesmanager.listener.ReleaseNotesBuildListener
import org.gradle.api.Plugin
import org.gradle.api.Project

class ReleaseNotesManagerPlugin : Plugin<Project> {

    override fun apply(project: Project) {
        project.gradle.addBuildListener(ReleaseNotesBuildListener())
    }
}

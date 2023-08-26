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

package dev.bytesculptor.releasenotesmanager.listener

import org.gradle.BuildListener
import org.gradle.BuildResult
import org.gradle.api.initialization.Settings
import org.gradle.api.invocation.Gradle

internal class ReleaseNotesBuildListener : BuildListener {

    override fun settingsEvaluated(gradle: Settings) {}

    override fun projectsLoaded(gradle: Gradle) {
        println("********* projectsLoaded ********* ")
    }

    override fun projectsEvaluated(gradle: Gradle) {
        println("********* projectsEvaluated ********* ")
    }

    override fun buildFinished(gradle: BuildResult) {
        println("********* buildFinished ********* ")
    }
}

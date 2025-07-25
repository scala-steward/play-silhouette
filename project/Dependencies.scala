/**
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
 */
import sbt._

object Dependencies {

  object Library {

    val updates: Seq[ModuleID] = Seq(
      "commons-io" % "commons-io" % "2.20.0"
    )

    object Play {
      val version: String = play.core.PlayVersion.current
      val ws = "org.playframework" %% "play-ws" % version
      val cache = "org.playframework" %% "play-cache" % version
      val test = "org.playframework" %% "play-test" % version
      val specs2 = "org.playframework" %% "play-specs2" % version
      val openid = "org.playframework" %% "play-openid" % version
    }

    object Specs2 {
      private val version = "4.21.0"
      val core = "org.specs2" %% "specs2-core" % version
      val matcherExtra = "org.specs2" %% "specs2-matcher-extra" % version
    }

    val argon2 = "de.mkammerer" % "argon2-jvm" % "2.12"
    val commonsCodec = "commons-codec" % "commons-codec" % "1.19.0"
    val jbcrypt = "de.svenkubiak" % "jBCrypt" % "0.4.3"
    val jwt = "com.auth0" % "java-jwt" % "4.5.0"
    val scalaGuice = "net.codingwell" %% "scala-guice" % "7.0.0"
    val pekkoTestkit = "org.apache.pekko" %% "pekko-testkit" % play.core.PlayVersion.pekkoVersion
    val mockito = "org.mockito" % "mockito-core" % "5.18.0"
    val casClient = "org.apereo.cas.client" % "cas-client-core" % "4.0.4"
    val casClientSupportSAML = "org.apereo.cas.client" % "cas-client-support-saml" % "4.0.4"
    val apacheCommonLang = "org.apache.commons" % "commons-lang3" % "3.18.0"
    val googleAuth = "com.warrenstrange" % "googleauth" % "1.5.0"
    val izumiReflect = "dev.zio" %% "izumi-reflect" % "3.0.5" // Scala 3 replacement for scala 2 reflect universe
    // Override jackson version used in java-jwt library to align with Play's version due to conflict
    val jacksonVersion = "2.14.3"
    val jacksonOverrides: Seq[ModuleID] = Seq(
      "com.fasterxml.jackson.core" % "jackson-core" % jacksonVersion,
      "com.fasterxml.jackson.core" % "jackson-databind" % jacksonVersion
    )
  }
}

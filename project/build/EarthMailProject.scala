/*
 * Copyright 2010, Mahmood Ali.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 *
 *   * Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *   * Redistributions in binary form must reproduce the above
 *     copyright notice, this list of conditions and the following disclaimer
 *     in the documentation and/or other materials provided with the
 *     distribution.
 *   * Neither the name of Mahmood Ali. nor the names of its
 *     contributors may be used to endorse or promote products derived from
 *     this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 * OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
import sbt._

class BlasterProject(info: ProjectInfo) extends DefaultWebProject(info) with
AkkaProject {
  val rest = akkaModule("http")


//  val jetty6 = "org.mortbay.jetty" % "jetty" % "6.1.14" % "test"  // jetty is only need for testing
  val jettyVersion = "7.0.2.v20100331"
  val jetty_webapp = "org.eclipse.jetty" % "jetty-webapp" % jettyVersion % "test"
  val jetty_server  = "org.eclipse.jetty"  % "jetty-server" % jettyVersion % "test"

  // Push notification
  val notnoop_repo = "Notnoop Repo" at "http://notnoop.github.com/m2-repo"
  val java_apns = "com.notnoop.apns" % "apns" % "0.1.5"

  // Persistence
  val squeryl = "org.squeryl" %% "squeryl" % "0.9.4-RC2"
  val h2 = "com.h2database" % "h2" % "1.2.143" % "test"
  val mysql = "mysql" % "mysql-connector-java" % "5.1.13"

  // Utilities
  val configgy = "net.lag" % "configgy" % "2.8.0-1.5.5"
  val scalatest = "org.scalatest" % "scalatest" % "1.2"
  val lift_json = "net.liftweb" %% "lift-json" % "2.1"
}



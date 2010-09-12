package org.specs2.specification

trait FeaturesResults {
  def done = Success("DONE")
  def todo = Pending("TODO")
  def pending = Pending("PENDING")
  def error = Error("error")
  def success = Success("success")
  def failure = Failure("failure")
}
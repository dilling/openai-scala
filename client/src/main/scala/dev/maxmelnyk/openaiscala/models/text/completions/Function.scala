package dev.maxmelnyk.openaiscala.models.text.completions.chat

import enumeratum.Circe
import io.circe.Json

case class Function(
  name: String,
  description: String,
  parameters: Json
)

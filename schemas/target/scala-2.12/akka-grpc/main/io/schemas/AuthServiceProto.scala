// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package io.schemas

object AuthServiceProto extends _root_.scalapb.GeneratedFileObject {
  lazy val dependencies: Seq[_root_.scalapb.GeneratedFileObject] = Seq(
    com.google.protobuf.timestamp.TimestampProto
  )
  lazy val messagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] =
    Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]](
      io.schemas.AuthRequest,
      io.schemas.AuthResponse
    )
  private lazy val ProtoBytes: _root_.scala.Array[Byte] =
      scalapb.Encoding.fromBase64(scala.collection.immutable.Seq(
  """ChFBdXRoU2VydmljZS5wcm90bxofZ29vZ2xlL3Byb3RvYnVmL3RpbWVzdGFtcC5wcm90byKfAgoLQXV0aFJlcXVlc3QSIwoGd
  XNlcklkGAEgASgJQgviPwgSBnVzZXJJZFIGdXNlcklkEiAKBWVtYWlsGAIgASgJQgriPwcSBWVtYWlsUgVlbWFpbBIgCgVwaG9uZ
  RgDIAEoCUIK4j8HEgVwaG9uZVIFcGhvbmUSIwoGY29va2llGAQgASgJQgviPwgSBmNvb2tpZVIGY29va2llEjgKDWF1dGhvcml6Y
  XRpb24YBSABKAlCEuI/DxINYXV0aG9yaXphdGlvblINYXV0aG9yaXphdGlvbhJICgl0aW1lc3RhbXAYBiABKAsyGi5nb29nbGUuc
  HJvdG9idWYuVGltZXN0YW1wQg7iPwsSCXRpbWVzdGFtcFIJdGltZXN0YW1wIkkKDEF1dGhSZXNwb25zZRIdCgRjb2RlGAEgASgFQ
  gniPwYSBGNvZGVSBGNvZGUSGgoDbXNnGAIgASgJQgjiPwUSA21zZ1IDbXNnMjIKC0F1dGhTZXJ2aWNlEiMKBEF1dGgSDC5BdXRoU
  mVxdWVzdBoNLkF1dGhSZXNwb25zZUIgCgppby5zY2hlbWFzQhBBdXRoU2VydmljZVByb3RvUAFQAGIGcHJvdG8z"""
      ).mkString)
  lazy val scalaDescriptor: _root_.scalapb.descriptors.FileDescriptor = {
    val scalaProto = com.google.protobuf.descriptor.FileDescriptorProto.parseFrom(ProtoBytes)
    _root_.scalapb.descriptors.FileDescriptor.buildFrom(scalaProto, dependencies.map(_.scalaDescriptor))
  }
  lazy val javaDescriptor: com.google.protobuf.Descriptors.FileDescriptor = {
    val javaProto = com.google.protobuf.DescriptorProtos.FileDescriptorProto.parseFrom(ProtoBytes)
    com.google.protobuf.Descriptors.FileDescriptor.buildFrom(javaProto, _root_.scala.Array(
      com.google.protobuf.timestamp.TimestampProto.javaDescriptor
    ))
  }
  @deprecated("Use javaDescriptor instead. In a future version this will refer to scalaDescriptor.", "ScalaPB 0.5.47")
  def descriptor: com.google.protobuf.Descriptors.FileDescriptor = javaDescriptor
}
/*
 * Copyright 2023 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/spanner/v1/type.proto

package com.google.spanner.v1;

public final class TypeProto {
  private TypeProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_spanner_v1_Type_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_v1_Type_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_spanner_v1_StructType_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_v1_StructType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_spanner_v1_StructType_Field_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_v1_StructType_Field_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
        "\n\034google/spanner/v1/type.proto\022\021google.s"
            + "panner.v1\032\037google/api/field_behavior.pro"
            + "to\"\370\001\n\004Type\022/\n\004code\030\001 \001(\0162\033.google.spann"
            + "er.v1.TypeCodeB\004\342A\001\002\0223\n\022array_element_ty"
            + "pe\030\002 \001(\0132\027.google.spanner.v1.Type\0222\n\013str"
            + "uct_type\030\003 \001(\0132\035.google.spanner.v1.Struc"
            + "tType\022>\n\017type_annotation\030\004 \001(\0162%.google."
            + "spanner.v1.TypeAnnotationCode\022\026\n\016proto_t"
            + "ype_fqn\030\005 \001(\t\"\177\n\nStructType\0223\n\006fields\030\001 "
            + "\003(\0132#.google.spanner.v1.StructType.Field"
            + "\032<\n\005Field\022\014\n\004name\030\001 \001(\t\022%\n\004type\030\002 \001(\0132\027."
            + "google.spanner.v1.Type*\272\001\n\010TypeCode\022\031\n\025T"
            + "YPE_CODE_UNSPECIFIED\020\000\022\010\n\004BOOL\020\001\022\t\n\005INT6"
            + "4\020\002\022\013\n\007FLOAT64\020\003\022\r\n\tTIMESTAMP\020\004\022\010\n\004DATE\020"
            + "\005\022\n\n\006STRING\020\006\022\t\n\005BYTES\020\007\022\t\n\005ARRAY\020\010\022\n\n\006S"
            + "TRUCT\020\t\022\013\n\007NUMERIC\020\n\022\010\n\004JSON\020\013\022\t\n\005PROTO\020"
            + "\r\022\010\n\004ENUM\020\016*X\n\022TypeAnnotationCode\022$\n TYP"
            + "E_ANNOTATION_CODE_UNSPECIFIED\020\000\022\016\n\nPG_NU"
            + "MERIC\020\002\022\014\n\010PG_JSONB\020\003B\254\001\n\025com.google.spa"
            + "nner.v1B\tTypeProtoP\001Z5cloud.google.com/g"
            + "o/spanner/apiv1/spannerpb;spannerpb\252\002\027Go"
            + "ogle.Cloud.Spanner.V1\312\002\027Google\\Cloud\\Spa"
            + "nner\\V1\352\002\032Google::Cloud::Spanner::V1b\006pr"
            + "oto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
                com.google.api.FieldBehaviorProto.getDescriptor(),
            });
    internal_static_google_spanner_v1_Type_descriptor = getDescriptor().getMessageTypes().get(0);
    internal_static_google_spanner_v1_Type_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_spanner_v1_Type_descriptor,
            new java.lang.String[] {
                "Code", "ArrayElementType", "StructType", "TypeAnnotation", "ProtoTypeFqn",
            });
    internal_static_google_spanner_v1_StructType_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_spanner_v1_StructType_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_spanner_v1_StructType_descriptor,
            new java.lang.String[] {
                "Fields",
            });
    internal_static_google_spanner_v1_StructType_Field_descriptor =
        internal_static_google_spanner_v1_StructType_descriptor.getNestedTypes().get(0);
    internal_static_google_spanner_v1_StructType_Field_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_spanner_v1_StructType_Field_descriptor,
            new java.lang.String[] {
                "Name", "Type",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

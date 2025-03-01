/*
 * Copyright 2023 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.spanner.admin.instance.v1;

import static com.google.cloud.spanner.admin.instance.v1.InstanceAdminClient.ListInstanceConfigOperationsPagedResponse;
import static com.google.cloud.spanner.admin.instance.v1.InstanceAdminClient.ListInstanceConfigsPagedResponse;
import static com.google.cloud.spanner.admin.instance.v1.InstanceAdminClient.ListInstancesPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.OperationCallSettings;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.cloud.spanner.admin.instance.v1.stub.InstanceAdminStubSettings;
import com.google.iam.v1.GetIamPolicyRequest;
import com.google.iam.v1.Policy;
import com.google.iam.v1.SetIamPolicyRequest;
import com.google.iam.v1.TestIamPermissionsRequest;
import com.google.iam.v1.TestIamPermissionsResponse;
import com.google.longrunning.Operation;
import com.google.protobuf.Empty;
import com.google.spanner.admin.instance.v1.CreateInstanceConfigMetadata;
import com.google.spanner.admin.instance.v1.CreateInstanceConfigRequest;
import com.google.spanner.admin.instance.v1.CreateInstanceMetadata;
import com.google.spanner.admin.instance.v1.CreateInstanceRequest;
import com.google.spanner.admin.instance.v1.DeleteInstanceConfigRequest;
import com.google.spanner.admin.instance.v1.DeleteInstanceRequest;
import com.google.spanner.admin.instance.v1.GetInstanceConfigRequest;
import com.google.spanner.admin.instance.v1.GetInstanceRequest;
import com.google.spanner.admin.instance.v1.Instance;
import com.google.spanner.admin.instance.v1.InstanceConfig;
import com.google.spanner.admin.instance.v1.ListInstanceConfigOperationsRequest;
import com.google.spanner.admin.instance.v1.ListInstanceConfigOperationsResponse;
import com.google.spanner.admin.instance.v1.ListInstanceConfigsRequest;
import com.google.spanner.admin.instance.v1.ListInstanceConfigsResponse;
import com.google.spanner.admin.instance.v1.ListInstancesRequest;
import com.google.spanner.admin.instance.v1.ListInstancesResponse;
import com.google.spanner.admin.instance.v1.UpdateInstanceConfigMetadata;
import com.google.spanner.admin.instance.v1.UpdateInstanceConfigRequest;
import com.google.spanner.admin.instance.v1.UpdateInstanceMetadata;
import com.google.spanner.admin.instance.v1.UpdateInstanceRequest;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link InstanceAdminClient}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (spanner.googleapis.com) and default port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the total timeout of getInstanceConfig to 30 seconds:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * InstanceAdminSettings.Builder instanceAdminSettingsBuilder = InstanceAdminSettings.newBuilder();
 * instanceAdminSettingsBuilder
 *     .getInstanceConfigSettings()
 *     .setRetrySettings(
 *         instanceAdminSettingsBuilder
 *             .getInstanceConfigSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * InstanceAdminSettings instanceAdminSettings = instanceAdminSettingsBuilder.build();
 * }</pre>
 */
@Generated("by gapic-generator-java")
public class InstanceAdminSettings extends ClientSettings<InstanceAdminSettings> {

  /** Returns the object with the settings used for calls to listInstanceConfigs. */
  public PagedCallSettings<
          ListInstanceConfigsRequest, ListInstanceConfigsResponse, ListInstanceConfigsPagedResponse>
      listInstanceConfigsSettings() {
    return ((InstanceAdminStubSettings) getStubSettings()).listInstanceConfigsSettings();
  }

  /** Returns the object with the settings used for calls to getInstanceConfig. */
  public UnaryCallSettings<GetInstanceConfigRequest, InstanceConfig> getInstanceConfigSettings() {
    return ((InstanceAdminStubSettings) getStubSettings()).getInstanceConfigSettings();
  }

  /** Returns the object with the settings used for calls to createInstanceConfig. */
  public UnaryCallSettings<CreateInstanceConfigRequest, Operation> createInstanceConfigSettings() {
    return ((InstanceAdminStubSettings) getStubSettings()).createInstanceConfigSettings();
  }

  /** Returns the object with the settings used for calls to createInstanceConfig. */
  public OperationCallSettings<
          CreateInstanceConfigRequest, InstanceConfig, CreateInstanceConfigMetadata>
      createInstanceConfigOperationSettings() {
    return ((InstanceAdminStubSettings) getStubSettings()).createInstanceConfigOperationSettings();
  }

  /** Returns the object with the settings used for calls to updateInstanceConfig. */
  public UnaryCallSettings<UpdateInstanceConfigRequest, Operation> updateInstanceConfigSettings() {
    return ((InstanceAdminStubSettings) getStubSettings()).updateInstanceConfigSettings();
  }

  /** Returns the object with the settings used for calls to updateInstanceConfig. */
  public OperationCallSettings<
          UpdateInstanceConfigRequest, InstanceConfig, UpdateInstanceConfigMetadata>
      updateInstanceConfigOperationSettings() {
    return ((InstanceAdminStubSettings) getStubSettings()).updateInstanceConfigOperationSettings();
  }

  /** Returns the object with the settings used for calls to deleteInstanceConfig. */
  public UnaryCallSettings<DeleteInstanceConfigRequest, Empty> deleteInstanceConfigSettings() {
    return ((InstanceAdminStubSettings) getStubSettings()).deleteInstanceConfigSettings();
  }

  /** Returns the object with the settings used for calls to listInstanceConfigOperations. */
  public PagedCallSettings<
          ListInstanceConfigOperationsRequest,
          ListInstanceConfigOperationsResponse,
          ListInstanceConfigOperationsPagedResponse>
      listInstanceConfigOperationsSettings() {
    return ((InstanceAdminStubSettings) getStubSettings()).listInstanceConfigOperationsSettings();
  }

  /** Returns the object with the settings used for calls to listInstances. */
  public PagedCallSettings<ListInstancesRequest, ListInstancesResponse, ListInstancesPagedResponse>
      listInstancesSettings() {
    return ((InstanceAdminStubSettings) getStubSettings()).listInstancesSettings();
  }

  /** Returns the object with the settings used for calls to getInstance. */
  public UnaryCallSettings<GetInstanceRequest, Instance> getInstanceSettings() {
    return ((InstanceAdminStubSettings) getStubSettings()).getInstanceSettings();
  }

  /** Returns the object with the settings used for calls to createInstance. */
  public UnaryCallSettings<CreateInstanceRequest, Operation> createInstanceSettings() {
    return ((InstanceAdminStubSettings) getStubSettings()).createInstanceSettings();
  }

  /** Returns the object with the settings used for calls to createInstance. */
  public OperationCallSettings<CreateInstanceRequest, Instance, CreateInstanceMetadata>
      createInstanceOperationSettings() {
    return ((InstanceAdminStubSettings) getStubSettings()).createInstanceOperationSettings();
  }

  /** Returns the object with the settings used for calls to updateInstance. */
  public UnaryCallSettings<UpdateInstanceRequest, Operation> updateInstanceSettings() {
    return ((InstanceAdminStubSettings) getStubSettings()).updateInstanceSettings();
  }

  /** Returns the object with the settings used for calls to updateInstance. */
  public OperationCallSettings<UpdateInstanceRequest, Instance, UpdateInstanceMetadata>
      updateInstanceOperationSettings() {
    return ((InstanceAdminStubSettings) getStubSettings()).updateInstanceOperationSettings();
  }

  /** Returns the object with the settings used for calls to deleteInstance. */
  public UnaryCallSettings<DeleteInstanceRequest, Empty> deleteInstanceSettings() {
    return ((InstanceAdminStubSettings) getStubSettings()).deleteInstanceSettings();
  }

  /** Returns the object with the settings used for calls to setIamPolicy. */
  public UnaryCallSettings<SetIamPolicyRequest, Policy> setIamPolicySettings() {
    return ((InstanceAdminStubSettings) getStubSettings()).setIamPolicySettings();
  }

  /** Returns the object with the settings used for calls to getIamPolicy. */
  public UnaryCallSettings<GetIamPolicyRequest, Policy> getIamPolicySettings() {
    return ((InstanceAdminStubSettings) getStubSettings()).getIamPolicySettings();
  }

  /** Returns the object with the settings used for calls to testIamPermissions. */
  public UnaryCallSettings<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsSettings() {
    return ((InstanceAdminStubSettings) getStubSettings()).testIamPermissionsSettings();
  }

  public static final InstanceAdminSettings create(InstanceAdminStubSettings stub)
      throws IOException {
    return new InstanceAdminSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstanceAdminStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return InstanceAdminStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return InstanceAdminStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return InstanceAdminStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default gRPC ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return InstanceAdminStubSettings.defaultGrpcTransportProviderBuilder();
  }

  /** Returns a builder for the default REST ChannelProvider for this service. */
  @BetaApi
  public static InstantiatingHttpJsonChannelProvider.Builder
      defaultHttpJsonTransportProviderBuilder() {
    return InstanceAdminStubSettings.defaultHttpJsonTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return InstanceAdminStubSettings.defaultTransportChannelProvider();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return InstanceAdminStubSettings.defaultApiClientHeaderProviderBuilder();
  }

  /** Returns a new gRPC builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new REST builder for this class. */
  @BetaApi
  public static Builder newHttpJsonBuilder() {
    return Builder.createHttpJsonDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected InstanceAdminSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for InstanceAdminSettings. */
  public static class Builder extends ClientSettings.Builder<InstanceAdminSettings, Builder> {

    protected Builder() throws IOException {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(InstanceAdminStubSettings.newBuilder(clientContext));
    }

    protected Builder(InstanceAdminSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(InstanceAdminStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    private static Builder createDefault() {
      return new Builder(InstanceAdminStubSettings.newBuilder());
    }

    @BetaApi
    private static Builder createHttpJsonDefault() {
      return new Builder(InstanceAdminStubSettings.newHttpJsonBuilder());
    }

    public InstanceAdminStubSettings.Builder getStubSettingsBuilder() {
      return ((InstanceAdminStubSettings.Builder) getStubSettings());
    }

    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) {
      super.applyToAllUnaryMethods(
          getStubSettingsBuilder().unaryMethodSettingsBuilders(), settingsUpdater);
      return this;
    }

    /** Returns the builder for the settings used for calls to listInstanceConfigs. */
    public PagedCallSettings.Builder<
            ListInstanceConfigsRequest,
            ListInstanceConfigsResponse,
            ListInstanceConfigsPagedResponse>
        listInstanceConfigsSettings() {
      return getStubSettingsBuilder().listInstanceConfigsSettings();
    }

    /** Returns the builder for the settings used for calls to getInstanceConfig. */
    public UnaryCallSettings.Builder<GetInstanceConfigRequest, InstanceConfig>
        getInstanceConfigSettings() {
      return getStubSettingsBuilder().getInstanceConfigSettings();
    }

    /** Returns the builder for the settings used for calls to createInstanceConfig. */
    public UnaryCallSettings.Builder<CreateInstanceConfigRequest, Operation>
        createInstanceConfigSettings() {
      return getStubSettingsBuilder().createInstanceConfigSettings();
    }

    /** Returns the builder for the settings used for calls to createInstanceConfig. */
    public OperationCallSettings.Builder<
            CreateInstanceConfigRequest, InstanceConfig, CreateInstanceConfigMetadata>
        createInstanceConfigOperationSettings() {
      return getStubSettingsBuilder().createInstanceConfigOperationSettings();
    }

    /** Returns the builder for the settings used for calls to updateInstanceConfig. */
    public UnaryCallSettings.Builder<UpdateInstanceConfigRequest, Operation>
        updateInstanceConfigSettings() {
      return getStubSettingsBuilder().updateInstanceConfigSettings();
    }

    /** Returns the builder for the settings used for calls to updateInstanceConfig. */
    public OperationCallSettings.Builder<
            UpdateInstanceConfigRequest, InstanceConfig, UpdateInstanceConfigMetadata>
        updateInstanceConfigOperationSettings() {
      return getStubSettingsBuilder().updateInstanceConfigOperationSettings();
    }

    /** Returns the builder for the settings used for calls to deleteInstanceConfig. */
    public UnaryCallSettings.Builder<DeleteInstanceConfigRequest, Empty>
        deleteInstanceConfigSettings() {
      return getStubSettingsBuilder().deleteInstanceConfigSettings();
    }

    /** Returns the builder for the settings used for calls to listInstanceConfigOperations. */
    public PagedCallSettings.Builder<
            ListInstanceConfigOperationsRequest,
            ListInstanceConfigOperationsResponse,
            ListInstanceConfigOperationsPagedResponse>
        listInstanceConfigOperationsSettings() {
      return getStubSettingsBuilder().listInstanceConfigOperationsSettings();
    }

    /** Returns the builder for the settings used for calls to listInstances. */
    public PagedCallSettings.Builder<
            ListInstancesRequest, ListInstancesResponse, ListInstancesPagedResponse>
        listInstancesSettings() {
      return getStubSettingsBuilder().listInstancesSettings();
    }

    /** Returns the builder for the settings used for calls to getInstance. */
    public UnaryCallSettings.Builder<GetInstanceRequest, Instance> getInstanceSettings() {
      return getStubSettingsBuilder().getInstanceSettings();
    }

    /** Returns the builder for the settings used for calls to createInstance. */
    public UnaryCallSettings.Builder<CreateInstanceRequest, Operation> createInstanceSettings() {
      return getStubSettingsBuilder().createInstanceSettings();
    }

    /** Returns the builder for the settings used for calls to createInstance. */
    public OperationCallSettings.Builder<CreateInstanceRequest, Instance, CreateInstanceMetadata>
        createInstanceOperationSettings() {
      return getStubSettingsBuilder().createInstanceOperationSettings();
    }

    /** Returns the builder for the settings used for calls to updateInstance. */
    public UnaryCallSettings.Builder<UpdateInstanceRequest, Operation> updateInstanceSettings() {
      return getStubSettingsBuilder().updateInstanceSettings();
    }

    /** Returns the builder for the settings used for calls to updateInstance. */
    public OperationCallSettings.Builder<UpdateInstanceRequest, Instance, UpdateInstanceMetadata>
        updateInstanceOperationSettings() {
      return getStubSettingsBuilder().updateInstanceOperationSettings();
    }

    /** Returns the builder for the settings used for calls to deleteInstance. */
    public UnaryCallSettings.Builder<DeleteInstanceRequest, Empty> deleteInstanceSettings() {
      return getStubSettingsBuilder().deleteInstanceSettings();
    }

    /** Returns the builder for the settings used for calls to setIamPolicy. */
    public UnaryCallSettings.Builder<SetIamPolicyRequest, Policy> setIamPolicySettings() {
      return getStubSettingsBuilder().setIamPolicySettings();
    }

    /** Returns the builder for the settings used for calls to getIamPolicy. */
    public UnaryCallSettings.Builder<GetIamPolicyRequest, Policy> getIamPolicySettings() {
      return getStubSettingsBuilder().getIamPolicySettings();
    }

    /** Returns the builder for the settings used for calls to testIamPermissions. */
    public UnaryCallSettings.Builder<TestIamPermissionsRequest, TestIamPermissionsResponse>
        testIamPermissionsSettings() {
      return getStubSettingsBuilder().testIamPermissionsSettings();
    }

    @Override
    public InstanceAdminSettings build() throws IOException {
      return new InstanceAdminSettings(this);
    }
  }
}

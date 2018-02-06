/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.custombaseuri.implementation;

import com.microsoft.azure.v2.AzureProxy;
import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import com.microsoft.rest.v2.annotations.ExpectedResponses;
import com.microsoft.rest.v2.annotations.GET;
import com.microsoft.rest.v2.annotations.HeaderParam;
import com.microsoft.rest.v2.annotations.Host;
import com.microsoft.rest.v2.annotations.HostParam;
import com.microsoft.rest.v2.annotations.UnexpectedResponseExceptionType;
import fixtures.custombaseuri.ErrorException;
import io.reactivex.Completable;
import io.reactivex.Single;
import io.reactivex.annotations.NonNull;

/**
 * An instance of this class provides access to all the operations defined in
 * Paths.
 */
public final class PathsInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private PathsService service;

    /**
     * The service client containing this operation class.
     */
    private AutoRestParameterizedHostTestClientImpl client;

    /**
     * Initializes an instance of PathsInner.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public PathsInner(AutoRestParameterizedHostTestClientImpl client) {
        this.service = AzureProxy.create(PathsService.class, client);
        this.client = client;
    }

    /**
     * The interface defining all the services for Paths to be used by the
     * proxy service to perform REST calls.
     */
    @Host("http://{accountName}{host}")
    interface PathsService {
        @GET("customuri")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> getEmpty(@HostParam("accountName") String accountName, @HostParam("host") String host, @HeaderParam("accept-language") String acceptLanguage);
    }

    /**
     * Get a 200 to test a valid base uri.
     *
     * @param accountName Account Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void getEmpty(@NonNull String accountName) {
        getEmptyAsync(accountName).blockingAwait();
    }

    /**
     * Get a 200 to test a valid base uri.
     *
     * @param accountName Account Name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    public ServiceFuture<Void> getEmptyAsync(@NonNull String accountName, @NonNull ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(getEmptyAsync(accountName), serviceCallback);
    }

    /**
     * Get a 200 to test a valid base uri.
     *
     * @param accountName Account Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    public Single<RestResponse<Void, Void>> getEmptyWithRestResponseAsync(@NonNull String accountName) {
        if (accountName == null) {
            throw new IllegalArgumentException("Parameter accountName is required and cannot be null.");
        }
        if (this.client.host() == null) {
            throw new IllegalArgumentException("Parameter this.client.host() is required and cannot be null.");
        }
        return service.getEmpty(accountName, this.client.host(), this.client.acceptLanguage());
    }

    /**
     * Get a 200 to test a valid base uri.
     *
     * @param accountName Account Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Completable} object if successful.
     */
    public Completable getEmptyAsync(@NonNull String accountName) {
        return getEmptyWithRestResponseAsync(accountName)
            .toCompletable();
    }
}

/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.headexceptions.implementation;

import com.microsoft.azure.v2.AzureProxy;
import com.microsoft.azure.v2.CloudException;
import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import com.microsoft.rest.v2.annotations.ExpectedResponses;
import com.microsoft.rest.v2.annotations.HEAD;
import com.microsoft.rest.v2.annotations.HeaderParam;
import com.microsoft.rest.v2.annotations.Host;
import com.microsoft.rest.v2.annotations.UnexpectedResponseExceptionType;
import fixtures.headexceptions.HeadExceptions;
import io.reactivex.Completable;
import io.reactivex.Single;
import io.reactivex.annotations.NonNull;

/**
 * An instance of this class provides access to all the operations defined in
 * HeadExceptions.
 */
public final class HeadExceptionsImpl implements HeadExceptions {
    /**
     * The proxy service used to perform REST calls.
     */
    private HeadExceptionsService service;

    /**
     * The service client containing this operation class.
     */
    private AutoRestHeadExceptionTestServiceImpl client;

    /**
     * Initializes an instance of HeadExceptionsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public HeadExceptionsImpl(AutoRestHeadExceptionTestServiceImpl client) {
        this.service = AzureProxy.create(HeadExceptionsService.class, client);
        this.client = client;
    }

    /**
     * The interface defining all the services for HeadExceptions to be used by
     * the proxy service to perform REST calls.
     */
    @Host("http://localhost:3000")
    interface HeadExceptionsService {
        @HEAD("http/success/200")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Single<RestResponse<Void, Void>> head200(@HeaderParam("accept-language") String acceptLanguage);

        @HEAD("http/success/204")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Single<RestResponse<Void, Void>> head204(@HeaderParam("accept-language") String acceptLanguage);

        @HEAD("http/success/404")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Single<RestResponse<Void, Void>> head404(@HeaderParam("accept-language") String acceptLanguage);
    }

    /**
     * Return 200 status code if successful.
     *
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void head200() {
        head200Async().blockingAwait();
    }

    /**
     * Return 200 status code if successful.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    public ServiceFuture<Void> head200Async(@NonNull ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(head200Async(), serviceCallback);
    }

    /**
     * Return 200 status code if successful.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    public Single<RestResponse<Void, Void>> head200WithRestResponseAsync() {
        return service.head200(this.client.acceptLanguage());
    }

    /**
     * Return 200 status code if successful.
     *
     * @return the {@link Completable} object if successful.
     */
    public Completable head200Async() {
        return head200WithRestResponseAsync()
            .toCompletable();
    }

    /**
     * Return 204 status code if successful.
     *
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void head204() {
        head204Async().blockingAwait();
    }

    /**
     * Return 204 status code if successful.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    public ServiceFuture<Void> head204Async(@NonNull ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(head204Async(), serviceCallback);
    }

    /**
     * Return 204 status code if successful.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    public Single<RestResponse<Void, Void>> head204WithRestResponseAsync() {
        return service.head204(this.client.acceptLanguage());
    }

    /**
     * Return 204 status code if successful.
     *
     * @return the {@link Completable} object if successful.
     */
    public Completable head204Async() {
        return head204WithRestResponseAsync()
            .toCompletable();
    }

    /**
     * Return 404 status code if successful.
     *
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void head404() {
        head404Async().blockingAwait();
    }

    /**
     * Return 404 status code if successful.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    public ServiceFuture<Void> head404Async(@NonNull ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(head404Async(), serviceCallback);
    }

    /**
     * Return 404 status code if successful.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    public Single<RestResponse<Void, Void>> head404WithRestResponseAsync() {
        return service.head404(this.client.acceptLanguage());
    }

    /**
     * Return 404 status code if successful.
     *
     * @return the {@link Completable} object if successful.
     */
    public Completable head404Async() {
        return head404WithRestResponseAsync()
            .toCompletable();
    }
}

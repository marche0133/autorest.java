/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.http;

import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import io.reactivex.Maybe;
import io.reactivex.Single;
import io.reactivex.annotations.NonNull;

/**
 * An instance of this class provides access to all the operations defined in
 * HttpFailures.
 */
public interface HttpFailures {
    /**
     * Get empty error form server.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the boolean object if successful.
     */
    boolean getEmptyError();

    /**
     * Get empty error form server.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Boolean&gt;} object.
     */
    ServiceFuture<Boolean> getEmptyErrorAsync(@NonNull ServiceCallback<Boolean> serviceCallback);

    /**
     * Get empty error form server.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, Boolean&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Boolean>> getEmptyErrorWithRestResponseAsync();

    /**
     * Get empty error form server.
     *
     * @return the {@link Maybe&lt;Boolean&gt;} object if successful.
     */
    Maybe<Boolean> getEmptyErrorAsync();

    /**
     * Get empty error form server.
     *
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the boolean object if successful.
     */
    boolean getNoModelError();

    /**
     * Get empty error form server.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Boolean&gt;} object.
     */
    ServiceFuture<Boolean> getNoModelErrorAsync(@NonNull ServiceCallback<Boolean> serviceCallback);

    /**
     * Get empty error form server.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, Boolean&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Boolean>> getNoModelErrorWithRestResponseAsync();

    /**
     * Get empty error form server.
     *
     * @return the {@link Maybe&lt;Boolean&gt;} object if successful.
     */
    Maybe<Boolean> getNoModelErrorAsync();

    /**
     * Get empty response from server.
     *
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the boolean object if successful.
     */
    boolean getNoModelEmpty();

    /**
     * Get empty response from server.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Boolean&gt;} object.
     */
    ServiceFuture<Boolean> getNoModelEmptyAsync(@NonNull ServiceCallback<Boolean> serviceCallback);

    /**
     * Get empty response from server.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, Boolean&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Boolean>> getNoModelEmptyWithRestResponseAsync();

    /**
     * Get empty response from server.
     *
     * @return the {@link Maybe&lt;Boolean&gt;} object if successful.
     */
    Maybe<Boolean> getNoModelEmptyAsync();
}

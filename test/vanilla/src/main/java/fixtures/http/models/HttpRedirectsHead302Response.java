/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.http.models;

import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.http.HttpRequest;
import java.util.Map;

/**
 * Contains all response data for the head302 operation.
 */
public final class HttpRedirectsHead302Response extends RestResponse<HttpRedirectsHead302Headers, Void> {
    /**
     * Creates an instance of HttpRedirectsHead302Response.
     *
     * @param statusCode the status code of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param body the deserialized body of the HTTP response.
     */
    public HttpRedirectsHead302Response(HttpRequest request, int statusCode, HttpRedirectsHead302Headers headers, Map<String, String> rawHeaders, void body) {
        super(request, statusCode, headers, rawHeaders, body);
    }

    /**
     * @return the deserialized response headers.
     */
    @Override
    public HttpRedirectsHead302Headers headers() {
        return super.headers();
    }

    /**
     * @return the deserialized response body.
     */
    @Override
    public void body() {
        return super.body();
    }
}
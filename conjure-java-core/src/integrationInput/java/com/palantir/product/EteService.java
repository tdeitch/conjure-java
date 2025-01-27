package com.palantir.product;

import com.palantir.conjure.java.lib.SafeLong;
import com.palantir.ri.ResourceIdentifier;
import com.palantir.tokens.auth.AuthHeader;
import com.palantir.tokens.auth.BearerToken;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.StreamingOutput;

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path("/")
@Generated("com.palantir.conjure.java.services.JerseyServiceGenerator")
public interface EteService {
    /**
     * foo bar baz.
     *
     * <h2>Very Important Documentation</h2>
     *
     * <p>This documentation provides a <em>list</em>:
     *
     * <ul>
     *   <li>Docs rule
     *   <li>Lists are wonderful
     * </ul>
     */
    @GET
    @Path("base/string")
    String string(@HeaderParam("Authorization") @NotNull AuthHeader authHeader);

    /** one <em>two</em> three. */
    @GET
    @Path("base/integer")
    int integer(@HeaderParam("Authorization") @NotNull AuthHeader authHeader);

    @GET
    @Path("base/double")
    double double_(@HeaderParam("Authorization") @NotNull AuthHeader authHeader);

    @GET
    @Path("base/boolean")
    boolean boolean_(@HeaderParam("Authorization") @NotNull AuthHeader authHeader);

    @GET
    @Path("base/safelong")
    SafeLong safelong(@HeaderParam("Authorization") @NotNull AuthHeader authHeader);

    @GET
    @Path("base/rid")
    ResourceIdentifier rid(@HeaderParam("Authorization") @NotNull AuthHeader authHeader);

    @GET
    @Path("base/bearertoken")
    BearerToken bearertoken(@HeaderParam("Authorization") @NotNull AuthHeader authHeader);

    @GET
    @Path("base/optionalString")
    Optional<String> optionalString(@HeaderParam("Authorization") @NotNull AuthHeader authHeader);

    @GET
    @Path("base/optionalEmpty")
    Optional<String> optionalEmpty(@HeaderParam("Authorization") @NotNull AuthHeader authHeader);

    @GET
    @Path("base/datetime")
    OffsetDateTime datetime(@HeaderParam("Authorization") @NotNull AuthHeader authHeader);

    @GET
    @Path("base/binary")
    @Produces(MediaType.APPLICATION_OCTET_STREAM)
    StreamingOutput binary(@HeaderParam("Authorization") @NotNull AuthHeader authHeader);

    /**
     * Path endpoint.
     *
     * @param param Documentation for <code>param</code>
     */
    @GET
    @Path("base/path/{param}")
    String path(
            @HeaderParam("Authorization") @NotNull AuthHeader authHeader,
            @PathParam("param") String param);

    @GET
    @Path("base/externalLong/{param}")
    long externalLongPath(
            @HeaderParam("Authorization") @NotNull AuthHeader authHeader,
            @PathParam("param") long param);

    @GET
    @Path("base/optionalExternalLong")
    Optional<Long> optionalExternalLongQuery(
            @HeaderParam("Authorization") @NotNull AuthHeader authHeader,
            @QueryParam("param") Optional<Long> param);

    @POST
    @Path("base/notNullBody")
    StringAliasExample notNullBody(
            @HeaderParam("Authorization") @NotNull AuthHeader authHeader,
            @NotNull StringAliasExample notNullBody);

    @GET
    @Path("base/aliasOne")
    StringAliasExample aliasOne(
            @HeaderParam("Authorization") @NotNull AuthHeader authHeader,
            @QueryParam("queryParamName") StringAliasExample queryParamName);

    @GET
    @Path("base/optionalAliasOne")
    StringAliasExample optionalAliasOne(
            @HeaderParam("Authorization") @NotNull AuthHeader authHeader,
            @QueryParam("queryParamName") Optional<StringAliasExample> queryParamName);

    @GET
    @Path("base/aliasTwo")
    NestedStringAliasExample aliasTwo(
            @HeaderParam("Authorization") @NotNull AuthHeader authHeader,
            @QueryParam("queryParamName") NestedStringAliasExample queryParamName);

    @POST
    @Path("base/external/notNullBody")
    StringAliasExample notNullBodyExternalImport(
            @HeaderParam("Authorization") @NotNull AuthHeader authHeader,
            @NotNull StringAliasExample notNullBody);

    @POST
    @Path("base/external/optional-body")
    Optional<StringAliasExample> optionalBodyExternalImport(
            @HeaderParam("Authorization") @NotNull AuthHeader authHeader,
            Optional<StringAliasExample> body);

    @POST
    @Path("base/external/optional-query")
    Optional<StringAliasExample> optionalQueryExternalImport(
            @HeaderParam("Authorization") @NotNull AuthHeader authHeader,
            @QueryParam("query") Optional<StringAliasExample> query);

    @POST
    @Path("base/no-return")
    void noReturn(@HeaderParam("Authorization") @NotNull AuthHeader authHeader);

    @GET
    @Path("base/enum/query")
    SimpleEnum enumQuery(
            @HeaderParam("Authorization") @NotNull AuthHeader authHeader,
            @QueryParam("queryParamName") SimpleEnum queryParamName);

    @GET
    @Path("base/enum/list/query")
    List<SimpleEnum> enumListQuery(
            @HeaderParam("Authorization") @NotNull AuthHeader authHeader,
            @QueryParam("queryParamName") List<SimpleEnum> queryParamName);

    @GET
    @Path("base/enum/optional/query")
    Optional<SimpleEnum> optionalEnumQuery(
            @HeaderParam("Authorization") @NotNull AuthHeader authHeader,
            @QueryParam("queryParamName") Optional<SimpleEnum> queryParamName);

    @GET
    @Path("base/enum/header")
    SimpleEnum enumHeader(
            @HeaderParam("Authorization") @NotNull AuthHeader authHeader,
            @HeaderParam("Custom-Header") SimpleEnum headerParameter);

    @Deprecated
    default Optional<Long> optionalExternalLongQuery(AuthHeader authHeader) {
        return optionalExternalLongQuery(authHeader, Optional.empty());
    }

    @Deprecated
    default StringAliasExample optionalAliasOne(AuthHeader authHeader) {
        return optionalAliasOne(authHeader, Optional.empty());
    }

    @Deprecated
    default Optional<StringAliasExample> optionalQueryExternalImport(AuthHeader authHeader) {
        return optionalQueryExternalImport(authHeader, Optional.empty());
    }

    @Deprecated
    default List<SimpleEnum> enumListQuery(AuthHeader authHeader) {
        return enumListQuery(authHeader, Collections.emptyList());
    }

    @Deprecated
    default Optional<SimpleEnum> optionalEnumQuery(AuthHeader authHeader) {
        return optionalEnumQuery(authHeader, Optional.empty());
    }
}

/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.18).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.lizbank.transactionapi.api;

import io.lizbank.transactionapi.models.Filters;
import io.lizbank.transactionapi.models.FindTransactionResponse;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-14T16:51:04.795362+01:00[Europe/Madrid]")
@Api(value = "searchTrByIban", description = "the searchTrByIban API")
public interface SearchTrByIbanApi {

    @ApiOperation(value = "search transactions", nickname = "searchTransactions", notes = "", response = FindTransactionResponse.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "document created", response = FindTransactionResponse.class) })
    @RequestMapping(value = "/searchTrByIban",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<FindTransactionResponse> searchTransactions(@ApiParam(value = "searches for transactions" ,required=true )  @Valid @RequestBody Filters body
);

}
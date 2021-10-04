package jp.co.ogis_ri.nautible.app.customer.inbound.rest;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import jp.co.ogis_ri.nautible.app.customer.api.rest.RestAddress;
import jp.co.ogis_ri.nautible.app.customer.api.rest.RestCreateCustomerRequest;
import jp.co.ogis_ri.nautible.app.customer.api.rest.RestCreateCustomerResponse;
import jp.co.ogis_ri.nautible.app.customer.api.rest.RestCustomer;
import jp.co.ogis_ri.nautible.app.customer.api.rest.RestFindCustomerResponse;
import jp.co.ogis_ri.nautible.app.customer.api.rest.RestGetByCustomerIdResponse;
import jp.co.ogis_ri.nautible.app.customer.api.rest.RestUpdateCustomerRequest;
import jp.co.ogis_ri.nautible.app.customer.config.QuarkusMappingConfig;
import jp.co.ogis_ri.nautible.app.customer.domain.Address;
import jp.co.ogis_ri.nautible.app.customer.domain.Customer;

/**
 * REST APIのRequset/ResponseオブジェクトとDomainのマッピング定義
 */
@Mapper(config = QuarkusMappingConfig.class)
public interface RestCustomerMapper {

    RestCustomerMapper INSTANCE = Mappers.getMapper(RestCustomerMapper.class);

    default RestGetByCustomerIdResponse customerToRestGetByCustomerIdResponse(Customer customer) {
        return new RestGetByCustomerIdResponse().customer(customerToRestCustomer(customer));
    }

    default RestFindCustomerResponse customerToRestFindCustomerResponse(List<Customer> customers) {
        return new RestFindCustomerResponse().customers(customerToRestCustomer(customers));
    }

    default RestCreateCustomerResponse customerToRestCreateCustomerResponse(Customer customer) {
        return new RestCreateCustomerResponse().customer(customerToRestCustomer(customer));
    }

    default RestCreateCustomerResponse customerToRestUpdateCustomerResponse(Customer customer) {
        return new RestCreateCustomerResponse().customer(customerToRestCustomer(customer));
    }

    RestCustomer customerToRestCustomer(Customer customer);

    List<RestCustomer> customerToRestCustomer(List<Customer> customer);

    RestAddress addressToRestAddress(Address address);

    Customer restCustomerToCustomer(RestCustomer customer);

    @Mapping(ignore = true, target = "id")
    Customer restCreateCustomerRequestToCustomer(RestCreateCustomerRequest customer);

    Customer restUpdateCustomerRequestToCustomer(RestUpdateCustomerRequest customer);

    List<Customer> restCustomerToCustomer(List<RestCustomer> customer);

    Address restAddressToAddress(RestAddress address);

}

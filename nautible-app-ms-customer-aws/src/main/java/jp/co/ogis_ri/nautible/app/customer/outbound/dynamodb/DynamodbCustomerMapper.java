package jp.co.ogis_ri.nautible.app.customer.outbound.dynamodb;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import jp.co.ogis_ri.nautible.app.customer.config.QuarkusMappingConfig;
import jp.co.ogis_ri.nautible.app.customer.domain.Address;
import jp.co.ogis_ri.nautible.app.customer.domain.Customer;

/**
 * DynamodbのEntityとDomainのマッピング定義
 */
@Mapper(config = QuarkusMappingConfig.class)
public interface DynamodbCustomerMapper {

    DynamodbCustomerMapper INSTANCE = Mappers.getMapper(DynamodbCustomerMapper.class);

    DynamodbCustomer customerToDynamodbCustomer(Customer customer);

    Customer dynamodbCustomerToCustomer(DynamodbCustomer customer);

    DynamodbAddress addressToDynamodbAddress(Address address);

    Address dynamodbAddressToAddress(DynamodbAddress address);

    List<Customer> dynamodbCustomerToCustomer(List<DynamodbCustomer> customer);

}

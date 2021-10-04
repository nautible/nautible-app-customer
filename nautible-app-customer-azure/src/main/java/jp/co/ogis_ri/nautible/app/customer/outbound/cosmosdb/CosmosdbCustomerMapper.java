package jp.co.ogis_ri.nautible.app.customer.outbound.cosmosdb;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import jp.co.ogis_ri.nautible.app.customer.config.QuarkusMappingConfig;
import jp.co.ogis_ri.nautible.app.customer.domain.Address;
import jp.co.ogis_ri.nautible.app.customer.domain.Customer;

/**
 * CosmosdbのEntityとDomainのマッピング定義
 */
@Mapper(config = QuarkusMappingConfig.class)
public interface CosmosdbCustomerMapper {

    CosmosdbCustomerMapper INSTANCE = Mappers.getMapper(CosmosdbCustomerMapper.class);

    CosmosdbCustomer customerToCosmosdbCustomer(Customer customer);

    Customer cosmosdbCustomerToCustomer(CosmosdbCustomer customer);

    jp.co.ogis_ri.nautible.app.customer.outbound.cosmosdb.CosmosdbAddress addressToCosmosdbAddress(Address address);

    Address cosmosdbAddressToAddress(jp.co.ogis_ri.nautible.app.customer.outbound.cosmosdb.CosmosdbAddress address);

    List<Customer> cosmosdbCustomerToCustomer(List<CosmosdbCustomer> customer);

}

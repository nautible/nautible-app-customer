package jp.co.ogis_ri.nautible.app.customer.inbound.grpc;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

import jp.co.ogis_ri.nautible.app.customer.api.grpc.GrpcAddress;
import jp.co.ogis_ri.nautible.app.customer.api.grpc.GrpcCustomer;
import jp.co.ogis_ri.nautible.app.customer.config.QuarkusMappingConfig;
import jp.co.ogis_ri.nautible.app.customer.domain.Address;
import jp.co.ogis_ri.nautible.app.customer.domain.Customer;

/**
 * gRPCのRequset/ReplyオブジェクトとDomainのマッピング定義
 */
@Mapper(config = QuarkusMappingConfig.class)
public interface GrpcCustomerMapper {

    GrpcCustomerMapper INSTANCE = Mappers.getMapper(GrpcCustomerMapper.class);

    // Grpc request/response check set null and throw NullPointerException.
    // Grpc request/response and builder is not same , therefore mapping annotation
    // should annotate to builder.
    @Mapping(target = "id", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "name", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "age", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "tel", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "address", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    GrpcCustomer customerToGrpcCustomer(Customer from, @MappingTarget GrpcCustomer.Builder to);

    default GrpcCustomer customerToGrpcCustomer(Customer from) {
        return customerToGrpcCustomer(from, GrpcCustomer.newBuilder());
    }

    List<GrpcCustomer> customerToGrpcCustomer(List<Customer> customer);

    // Grpc request/response check set null and throw NullPointerException.
    // Grpc request/response and builder is not same , therefore mapping annotation
    // should annotate to builder.
    @Mapping(target = "zipCode", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "address1", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "address2", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    GrpcAddress addressToGrpcAddress(Address from, @MappingTarget GrpcAddress.Builder to);

    default GrpcAddress addressToGrpcAddress(Address from) {
        return addressToGrpcAddress(from, GrpcAddress.newBuilder());
    }

    Customer grpcCustomerToCustomer(GrpcCustomer customer);

    List<Customer> grpcCustomerToCustomer(List<GrpcCustomer> customer);

    Address grpcAddressToAddress(GrpcAddress address);

}

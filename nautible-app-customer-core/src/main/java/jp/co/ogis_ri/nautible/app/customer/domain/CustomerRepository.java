package jp.co.ogis_ri.nautible.app.customer.domain;

import java.util.List;

/**
 * 顧客レポジトリ
 */
public interface CustomerRepository {
    /**
     * 顧客を取得する
     * @param id Id
     * @return {@link Customer}
     */
    Customer getByCustomerId(int id);

    /**
     * 顧客を検索する
     * @param name 名称
     * @param nameStartWith 名称（前方一致）
     * @param age 年齢
     * @return 顧客のリスト
     */
    List<Customer> find(String name, String nameStartWith, Integer age);

    /**
     * 顧客を削除する
     * @param id Id
     */
    void deleteByCustomerId(int customerId);

    // APIのsuffixにCustomerを付与しているのはPanacheMongoRepositoryBaseのAPIとぶつからないようにするため

    /**
     * 顧客を作成する
     * @param customer 顧客
     * @return {@link Customer}
     */
    Customer createCustomer(Customer customer);

    /**
     * 顧客を更新する
     * @param customer 顧客
     * @return {@link Customer}
     */
    Customer updateCustomer(Customer customer);

}

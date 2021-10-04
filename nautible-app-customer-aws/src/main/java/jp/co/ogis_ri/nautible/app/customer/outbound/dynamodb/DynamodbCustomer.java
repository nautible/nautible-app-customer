package jp.co.ogis_ri.nautible.app.customer.outbound.dynamodb;

import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbAttribute;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbPartitionKey;

/**
 * 顧客ドメイン
 */
@DynamoDbBean
public class DynamodbCustomer {
    /** id */
    private Integer id = null;
    /** 名前 */
    private String name = null;
    /** 年齢 */
    private Integer age = null;
    /** 電話番号 */
    private String tel;
    /** 住所 */
    private DynamodbAddress address = null;

    /**
     * Idを設定する
     * @param id Id
     * @return {@link DynamodbCustomer}
     */
    public DynamodbCustomer id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Idを取得する
     * @return Id
    **/
    @DynamoDbPartitionKey
    @DynamoDbAttribute("Id")
    public Integer getId() {
        return id;
    }

    /**
     * Idを設定する
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 名称を設定する
     * @param name 名称
     * @return {@link DynamodbCustomer}
     */
    public DynamodbCustomer name(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称を取得する
     * @return name 名称
    **/
    @DynamoDbAttribute("Name")
    public String getName() {
        return name;
    }

    /**
     * 名称を設定する
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 年齢を設定する
     * @param age 年齢
     * @return {@link DynamodbCustomer}
     */
    public DynamodbCustomer age(Integer age) {
        this.age = age;
        return this;
    }

    /**
     * 年齢を取得する
     * @return age 年齢
    **/
    @DynamoDbAttribute("Age")
    public Integer getAge() {
        return age;
    }

    /**
     * 年齢を設定する
     * @param age 年齢
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 住所を設定する
     * @param address {@link DynamodbAddress}
     * @return {@link DynamodbCustomer}
     */
    public DynamodbCustomer address(DynamodbAddress address) {
        this.address = address;
        return this;
    }

    /**
     * 電話番号を設定する
     * @param tel 電話番号
     * @return {@link DynamodbCustomer}
     */
    public DynamodbCustomer tel(String tel) {
        this.tel = tel;
        return this;
    }

    /**
     * 電話番号を取得する
     * @return 電話番号
     */
    @DynamoDbAttribute("Tel")
    public String getTel() {
        return tel;
    }

    /**
     * 電話番号を設定する
     * @param tel 電話番号
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * 住所を取得する
     * @return address 住所
    **/
    @DynamoDbAttribute("Address")
    public DynamodbAddress getAddress() {
        return address;
    }

    /**
     * 住所を設定する
     * @param address 住所
     */
    public void setAddress(DynamodbAddress address) {
        this.address = address;
    }

}

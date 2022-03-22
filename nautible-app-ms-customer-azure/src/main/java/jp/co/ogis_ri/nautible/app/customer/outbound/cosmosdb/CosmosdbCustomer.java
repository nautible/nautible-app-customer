package jp.co.ogis_ri.nautible.app.customer.outbound.cosmosdb;

import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.codecs.pojo.annotations.BsonProperty;

import io.quarkus.mongodb.panache.MongoEntity;

/**
 * 顧客ドメイン
 */
@MongoEntity(collection = "Customer")
public class CosmosdbCustomer {
    /** id */
    @BsonId // メソッドに定義すると有効にならないAPIがある。
    private Integer id = null;
    /** 名前 */
    @BsonProperty("Name") // メソッドに定義すると有効にならないAPIがある。
    private String name = null;
    /** 年齢 */
    @BsonProperty("Age")
    private Integer age = null;
    /** 電話番号 */
    @BsonProperty("Tel")
    private String tel;
    /** 住所 */
    @BsonProperty("Address")
    private CosmosdbAddress address = null;

    /**
     * Idを設定する
     * @param id Id
     * @return {@link CosmosdbCustomer}
     */
    public CosmosdbCustomer id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Idを取得する
     * @return Id
    **/
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
     * @return {@link CosmosdbCustomer}
     */
    public CosmosdbCustomer name(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称を取得する
     * @return name 名称
    **/
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
     * @return {@link CosmosdbCustomer}
     */
    public CosmosdbCustomer age(Integer age) {
        this.age = age;
        return this;
    }

    /**
     * 年齢を取得する
     * @return age 年齢
    **/
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
     * @param address {@link CosmosdbAddress}
     * @return {@link CosmosdbCustomer}
     */
    public CosmosdbCustomer address(CosmosdbAddress address) {
        this.address = address;
        return this;
    }

    /**
     * 電話番号を設定する
     * @param tel 電話番号
     * @return {@link CosmosdbCustomer}
     */
    public CosmosdbCustomer tel(String tel) {
        this.tel = tel;
        return this;
    }

    /**
     * 電話番号を取得する
     * @return 電話番号
     */
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
    public CosmosdbAddress getAddress() {
        return address;
    }

    /**
     * 住所を設定する
     * @param address 住所
     */
    public void setAddress(CosmosdbAddress address) {
        this.address = address;
    }

}

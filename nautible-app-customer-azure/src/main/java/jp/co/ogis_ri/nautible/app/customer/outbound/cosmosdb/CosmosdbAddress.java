package jp.co.ogis_ri.nautible.app.customer.outbound.cosmosdb;

import org.bson.codecs.pojo.annotations.BsonProperty;

/**
 * 住所ドメイン
 */
public class CosmosdbAddress {
    /** 郵便番号 */
    @BsonProperty("ZipCode") // cosmosdbの定義。メソッドに定義すると有効にならないAPIがある。
    private String zipCode = null;
    /** 住所１ */
    @BsonProperty("Address1")
    private String address1 = null;
    /** 住所２ */
    @BsonProperty("Address2")
    private String address2 = null;

    /**
     * 郵便番号を設定する
     * @param zipCode 郵便番号
     * @return {@link CosmosdbAddress}
     */
    public CosmosdbAddress zipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    /**
     * 郵便番号を取得する
     * @return 郵便番号
    **/
    public String getZipCode() {
        return zipCode;
    }

    /**
     * 郵便番号を設定する
     * @param zipCode 郵便番号
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * 住所１を設定する
     * @param address1 住所１
     * @return {@link CosmosdbAddress}
     */
    public CosmosdbAddress address1(String address1) {
        this.address1 = address1;
        return this;
    }

    /**
     * 住所１を取得する
     * @return 住所１
    **/
    public String getAddress1() {
        return address1;
    }

    /**
     * 住所１を設定する
     * @param 住所１
     */
    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    /**
     * 住所２を設定する
     * @param address2 住所２
     * @return {@link CosmosdbAddress}
     */
    public CosmosdbAddress address2(String address2) {
        this.address2 = address2;
        return this;
    }

    /**
     * 住所２を取得する
     * @return 住所２
    **/
    public String getAddress2() {
        return address2;
    }

    /**
     * 住所２を設定する
     * @param 住所２
     */
    public void setAddress2(String address2) {
        this.address2 = address2;
    }

}

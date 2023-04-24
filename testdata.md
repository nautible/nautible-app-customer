# 動作確認用テストデータ

## データ作成
- curl

```bash
curl -H "Accept: application/json" -H "Content-type: application/json" -X POST -d "{ \"name\": \"name1001\",\"age\": \"21\",\"tel\": \"03-1234-1234\",\"address\": {\"zipCode\":\"123-4567\",\"address1\":\"address1\",\"address2\":\"address2\" }}" http://localhost:8080/customer
```

- grpcurl

```bash
grpcurl --plaintext -d "{ \"customer\": { \"name\": \"name1001\",\"age\": \"21\",\"tel\": \"03-1234-1234\",\"address\": {\"zipCode\":\"123-4567\",\"address1\":\"address1\",\"address2\":\"address2\" }}}" localhost:9002 customer.CustomerService/Create
```


## データ更新

- curl

```bash
curl -H "Accept: application/json" -H "Content-type: application/json" -X PUT -d "{ \"id\": \"1\",\"name\": \"name10011\",\"age\": \"211\",\"tel\": \"03-1234-1231\",\"address\": {\"zipCode\":\"123-4561\",\"address1\":\"address11\",\"address2\":\"address21\" }}" http://localhost:8080/customer
```

- grpcurl

```bash
grpcurl --plaintext -d "{ \"customer\": { \"id\": \"1\" , \"name\": \"name10011\",\"age\": \"211\",\"tel\": \"03-1234-1231\",\"address\": {\"zipCode\":\"123-4561\",\"address1\":\"address11\",\"address2\":\"address21\" }}}" localhost:9002 customer.CustomerService/Update
```


## 検索

- curl

```bash
curl -H "Accept: application/json" -X GET http://localhost:8080/customer/
```

- grpcurl

```bash
grpcurl --plaintext localhost:9002 customer.CustomerService/Find
```

## ID指定データ取得

- curl

```bash
curl -H "Accept: application/json" -X GET http://localhost:8080/customer/1
```

- grpcurl

```bash
grpcurl --plaintext -d "{\"customerId\": \"1\"}" localhost:9002 customer.CustomerService/GetByCustomerId
```

## データ削除

- curl

```bash
curl -H "Accept: application/json" -X DELETE http://localhost:8080/customer/1
```

- grpcurl

```bash
grpcurl --plaintext -d "{\"customerId\": \"1\"}" localhost:9002 customer.CustomerService/DeleteByCustomerId
```


## Dynamodb（localstack)のデータ確認

- 事前にプロファイルを作成する「/.aws/config」

```bash
[profile localstack]
region = ap-northeast-1
output = json
```

- 事前にプロファイルを作成する「/.aws/credentials」

```
[localstack]
aws_access_key_id = test-key
aws_secret_access_key = test-secret
```

- Orderテーブルの取得

```bash
aws dynamodb scan --table-name=Customer --profile localstack --endpoint-url=http://localhost:4566
```

# マスターデータ登録

## AWS
aws cliで以下を実行する
```bash
aws dynamodb put-item --table-name Customer --item '{ "Id": { "N": "1" }, "Address": { "M": { "Address1": { "S": "東京都品川区西品川1丁目1番1号" }, "Address2": { "S": "住友不動産大崎ガーデンタワー20階" }, "ZipCode": { "S": "141-0033" }}}, "Age": { "N": "21" }, "Name": { "S": "オージス 太郎" }, "Tel": { "S": "03-1234-1234" }}'
```

## Azure
Azure CosmosDBコンソール＞データエクスプローラー＞Stock選択＞NewShell
以下を実行する
```
db.Stock.insertMany([
db.Customer.insertMany([
{
  "_id": 1,
  "Address": {
      "Address1": "東京都品川区西品川1丁目1番1号",
      "Address2": "住友不動産大崎ガーデンタワー20階",
      "ZipCode": "141-0033"
  },
  "Age": 21,
  "Name": "オージス 太郎",
  "Tel": "03-1234-1234",
}
])
```


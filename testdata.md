# 動作確認用テストデータ

## データ作成
- curl

```
curl -H "Accept: application/json" -H "Content-type: application/json" -X POST -d "{ \"name\": \"name1001\",\"age\": \"21\",\"tel\": \"03-1234-1234\",\"address\": {\"zipCode\":\"123-4567\",\"address1\":\"address1\",\"address2\":\"address2\" }}" http://localhost:8080/customer
```

- grpcurl

```
grpcurl --plaintext -d "{ \"customer\": { \"name\": \"name1001\",\"age\": \"21\",\"tel\": \"03-1234-1234\",\"address\": {\"zipCode\":\"123-4567\",\"address1\":\"address1\",\"address2\":\"address2\" }}}" localhost:9002 customer.CustomerService/Create
```


## データ更新

- curl

```
curl -H "Accept: application/json" -H "Content-type: application/json" -X PUT -d "{ \"id\": \"1\",\"name\": \"name10011\",\"age\": \"211\",\"tel\": \"03-1234-1231\",\"address\": {\"zipCode\":\"123-4561\",\"address1\":\"address11\",\"address2\":\"address21\" }}" http://localhost:8080/customer
```

- grpcurl

```
grpcurl --plaintext -d "{ \"customer\": { \"id\": \"1\" , \"name\": \"name10011\",\"age\": \"211\",\"tel\": \"03-1234-1231\",\"address\": {\"zipCode\":\"123-4561\",\"address1\":\"address11\",\"address2\":\"address21\" }}}" localhost:9002 customer.CustomerService/Update
```


## 検索

- curl

```
curl -H "Accept: application/json" -X GET http://localhost:8080/customer/
```

- grpcurl

```
grpcurl --plaintext localhost:9002 customer.CustomerService/Find
```

## ID指定データ取得

- curl

```
curl -H "Accept: application/json" -X GET http://localhost:8080/customer/1
```

- grpcurl

```
grpcurl --plaintext -d "{\"customerId\": \"1\"}" localhost:9002 customer.CustomerService/GetByCustomerId
```

## データ削除

- curl

```
curl -H "Accept: application/json" -X DELETE http://localhost:8080/customer/1
```

- grpcurl

```
grpcurl --plaintext -d "{\"customerId\": \"1\"}" localhost:9002 customer.CustomerService/DeleteByCustomerId
```


## Dynamodb（localstack)のデータ確認

- 事前にプロファイルを作成する「/.aws/config」

```
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

```
aws dynamodb scan --table-name=Customer --profile localstack --endpoint-url=http://localhost:4566
```


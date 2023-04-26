# Payment Service API

This API allows you to manage payments for clients and buyers.

## Endpoints
## Get a specific payment
```http
GET /payments/{id}
```

Parameters
```
|Parameter |	Type	| Description
| id	   |     int	| Required. ID of payment to retrieve.
```

### Response

Returns a specific payment.

Example response:

```json
{
    "id": 1,
    "amount": 96.38,
    "type": "CREDIT_CARD",
    "card": {
        "holderName": "test_98195f8c9a28",
        "number": "test_c182fbd71bf3",
        "expirationDate": "2030-12-27",
        "cvv": "test_d045a6162714"
    },
    "buyer": {
        "name": "test_b291b59a73a4",
        "email": "test_07cea55613e2",
        "cpf": "test_c5a65c67ede1"
    },
    "client": {
        "name": "test_2ed237af3030",
        "email": "test_a5e62079fa06",
        "cpf": "test_5242ee470ecf"
    },
    "successful": false
}
```

## Create a new payment

```http
POST /payments
```

### Example request body:

```json
{
  "amount": 96.38,
  "type": "CREDIT_CARD",
  "card": {
    "holderName": "test_98195f8c9a28",
    "number": "test_c182fbd71bf3",
    "expirationDate": "2030-12-27",
    "cvv": "test_d045a6162714"
  },
  "buyer": {
    "name": "test_b291b59a73a4",
    "email": "test_07cea55613e2",
    "cpf": "test_c5a65c67ede1"
  },
  "client": {
    "name": "test_2ed237af3030",
    "email": "test_a5e62079fa06",
    "cpf": "test_5242ee470ecf"
  },
  "successful": false
}
```

### Response

Example response body:

```json
{
    "id": 1,
    "amount": 96.38,
    "type": "CREDIT_CARD",
    "card": {
        "holderName": "test_98195f8c9a28",
        "number": "test_c182fbd71bf3",
        "expirationDate": "2030-12-27",
        "cvv": "test_d045a6162714"
    },
    "buyer": {
        "name": "test_b291b59a73a4",
        "email": "test_07cea55613e2",
        "cpf": "test_c5a65c67ede1"
    },
    "client": {
        "name": "test_2ed237af3030",
        "email": "test_a5e62079fa06",
        "cpf": "test_5242ee470ecf"
    },
    "successful": false
}
```

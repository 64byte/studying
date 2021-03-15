# Elastic Search



#### Store, search, and Analyze



##### Index some documents

어떤 정보를 인덱싱한다.



아래와 같이 Elastic API를 호출한다.

```PUT /customer/_doc
// customer는 도메인
PUT /customer/_doc/1
{
	"name": "John Doe"
}

// bulk 데이터의 경우
PUT /customer/_bulk
```



이 경우에는 "name": "John Doe"라는 문서가 하나 인덱싱 된다.



여기서 값을 가져오면

```
GET /customer/_doc/1
```



아래와 같이 나타난다.

```console-result
{
  "_index" : "customer",
  "_type" : "_doc",
  "_id" : "1",
  "_version" : 1,
  "_seq_no" : 26,
  "_primary_term" : 4,
  "found" : true,
  "_source" : {
    "name": "John Doe"
  }
}
```



검색의 경우 아래와 같이 할 수 있다.

```
GET /bank/_search
{
  "query": { "match_all": {} },
  "sort": [
    { "account_number": "asc" }
  ]
}
```



이전에 데이터를 넣었다면 아래와 같은 결과가 출력된다

```
{
  "took" : 63,
  "timed_out" : false,
  "_shards" : {
    "total" : 5,
    "successful" : 5,
    "skipped" : 0,
    "failed" : 0
  },
  "hits" : {
    "total" : {
        "value": 1000,
        "relation": "eq"
    },
    "max_score" : null,
    "hits" : [ {
      "_index" : "bank",
      "_type" : "_doc",
      "_id" : "0",
      "sort": [0],
      "_score" : null,
      "_source" : {"account_number":0,"balance":16623,"firstname":"Bradshaw","lastname":"Mckenzie","age":29,"gender":"F","address":"244 Columbus Place","employer":"Euron","email":"bradshawmckenzie@euron.com","city":"Hobucken","state":"CO"}
    }, {
      "_index" : "bank",
      "_type" : "_doc",
      "_id" : "1",
      "sort": [1],
      "_score" : null,
      "_source" : {"account_number":1,"balance":39225,"firstname":"Amber","lastname":"Duke","age":32,"gender":"M","address":"880 Holmes Lane","employer":"Pyrami","email":"amberduke@pyrami.com","city":"Brogan","state":"IL"}
    }, ...
    ]
  }
}
```



`took`:

`timed_out`

`_shards`

`max_score`

`hits.total.value`

`hits.sort`

`hits._score`

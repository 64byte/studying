# ElasticSearch (as Document  DB)

---



### DDL

---



How to get scheme

```http
GET /some-domain/_mapping
```



How to generate scheme

```http
PUT /some-domain/
{
	"mappings":
	{
		"properties": {
			"entity1": {
				"properties": {
					"someField": {
						"type": "text"
					},
					"someField2": {
						"type": "keyword"
					}
				}
			},
			"entity2": {
				"type": "text"
			}
		}
	}
}
```



Get detailed field

```http
GET /some-domain/entity1
```



### DML

---



##### CREATE

```http
PUT /some-domain/
{

}
```



##### READ

```
GET /some-domain/_search
{
	"query": {
		"match_all": {
		}
	}
}
```



##### UPDATE

```

```



##### DELETE

```http
DELETE /some-domain/_doc/1
```

# springbootwithredis
# To initialize, it is required to create a redis docker
# Docker Redis 
`docker run -it --name redis -p 6379:6379 redis:5.0.3`

# Join on Docker
`docker exec -it redis /bin/bash`

# URLs
`http://localhost:8080/hello`

`http://localhost:8080/cancel`


# on the redis, join on the redis-cli
`redis-cli` 

# see the keys
`KEYS *`
`get "[name of the chache]"`


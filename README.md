# squindex
squash indexer

# requirements
# java 11
sdk use java 11.0.21-tem

# build with gradle
./gradlew run

# create docker network
docker network create elasticnetwork

# run elasticsearch docker instance
docker run -d --name elasticsearch --net elasticnetwork -p 9200:9200 -p 9300:9300 -e "discovery.type=single-node" elasticsearch:8.19.10
# create an index and put a document


# create docker compose for elastic
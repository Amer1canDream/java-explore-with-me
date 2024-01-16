up:
	docker rmi --force stats-server && mvn clean package && docker compose up -d
down:
	docker-compose down -v --rmi all
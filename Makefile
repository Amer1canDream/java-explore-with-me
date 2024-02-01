up:
	docker rmi --force stats-server && docker rmi --force ewm-service && mvn clean package && docker compose up -d
down:
	docker-compose down -v --rmi all
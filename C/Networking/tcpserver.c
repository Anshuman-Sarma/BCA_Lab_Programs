/* AnshumanSarma_WAP to implement a TCP server using socket programming in C */


#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>
#include <arpa/inet.h>

int main() {
    int server_sock, client_sock;
    struct sockaddr_in server_addr = {AF_INET, htons(6666), INADDR_ANY};
    char buffer[1024];

    if ((server_sock = socket(AF_INET, SOCK_STREAM, 0)) < 0 || 
        bind(server_sock, (struct sockaddr *)&server_addr, sizeof(server_addr)) < 0 || 
        listen(server_sock, 5) < 0) {
        perror("Error");
        return 1;
    }

    printf("Server waiting for a client...\n");

    if ((client_sock = accept(server_sock, NULL, NULL)) < 0) {
        perror("Accept failed");
        return 1;
    }
    printf("Client connected.\n");

    int n = read(client_sock, buffer, sizeof(buffer) - 1);
    if (n < 0) {
        perror("Read failed");
        return 1;
    }
    buffer[n] = '\0';  // Null-terminate the received message

    printf("Message: %s\n", buffer);

    close(client_sock);
    close(server_sock);
    return 0;
}

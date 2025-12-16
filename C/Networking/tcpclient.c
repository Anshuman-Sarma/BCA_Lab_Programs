/* AnshumanSarma_WAP to implement a TCP client using socket programming in C */


#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>
#include <arpa/inet.h>

int main() {
    int sock;
    struct sockaddr_in server_addr = {AF_INET, htons(6666), inet_addr("127.0.0.1")};
    char *message = "Hello Server";

    if ((sock = socket(AF_INET, SOCK_STREAM, 0)) < 0 || connect(sock, (struct sockaddr *)&server_addr, sizeof(server_addr)) < 0) {
        perror("Error");
        return 1;
    }

    send(sock, message, strlen(message), 0);
    printf("Message sent to the server: %s\n", message);

    close(sock);
    return 0;
}

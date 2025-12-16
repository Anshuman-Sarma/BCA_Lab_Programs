/* AnshumanSarma_WAP to implement a UDP client using socket programming in C */


#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>
#include <arpa/inet.h>

int main() {
    int sock;
    struct sockaddr_in server_addr = {AF_INET, htons(5000), inet_addr("127.0.0.1")};
    char send_data[1024];

    if ((sock = socket(AF_INET, SOCK_DGRAM, 0)) == -1) {
        perror("socket");
        exit(1);
    }

    while (1) {
        printf("Type Something (q or Q to quit): ");
        fgets(send_data, sizeof(send_data), stdin);
        if (send_data[0] == 'q' || send_data[0] == 'Q') break;
        sendto(sock, send_data, strlen(send_data), 0, (struct sockaddr *)&server_addr, sizeof(server_addr));
    }

    close(sock);
    return 0;
}

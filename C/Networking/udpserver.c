/* AnshumanSarma_WAP to implement a UDP server using socket programming in C */


#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>
#include <arpa/inet.h>

int main() {
    int sock, addr_len;
    char recv_data[1024];
    struct sockaddr_in server_addr = {AF_INET, htons(5000), INADDR_ANY}, client_addr;

    if ((sock = socket(AF_INET, SOCK_DGRAM, 0)) == -1 || bind(sock, (struct sockaddr *)&server_addr, sizeof(server_addr)) == -1) {
        perror("Error");
        exit(1);
    }

    printf("\nUDPServer waiting for client on port 5000\n");

    while (1) {
        addr_len = sizeof(client_addr);
        int bytes_read = recvfrom(sock, recv_data, sizeof(recv_data) - 1, 0, (struct sockaddr *)&client_addr, &addr_len);
        recv_data[bytes_read] = '\0';
        printf("\n(%s,%d) said: %s", inet_ntoa(client_addr.sin_addr), ntohs(client_addr.sin_port), recv_data);
    }

    close(sock);
    return 0;
}

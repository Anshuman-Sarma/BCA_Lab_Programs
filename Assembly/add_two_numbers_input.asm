//AnshumanSarma_WAP to read two single-digit numbers from the user and display their sum (remove comment when executing)

.model small
.stack 100h
.data
	msg1 db 10 , 13 , "Enter first Number : $"
	msg2 db 10 , 13 , "Enter second Number : $"
	msg3 db 10 , 13 , "The SUM is : $"
	a db ?
.code
start:
	mov ax , @data
	mov ds , ax

	lea dx , msg1
	mov ah , 09h
	int 21h

	mov ah , 01h
	int 21h

	mov bl , al	

	lea dx , msg2
	mov ah , 09h
	int 21h

	mov ah , 01h
	int 21h

	sub al , 30h
	sub bl , 30h
	
	mov cl , al	

	add bl , cl
	mov al , bl
	add al , 30h

	lea dx , msg3
	mov ah , 09h
	int 21h

	mov dl , al

	mov ah , 02h
	int 21h

	mov ah , 4ch
	int 21h
     end start

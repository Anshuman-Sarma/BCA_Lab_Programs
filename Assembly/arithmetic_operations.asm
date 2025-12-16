//AnshumanSarma_WAP to perform addition, subtraction, multiplication, and division on two input numbers (remove comment when executing)

.model small
.stack 100h
.data
	msg1 db 10,13, "Enter the first number:$"
	msg2 db 10,13, "Enter the second number:$"
	msg3 db 10,13, "The sum is:$"
	msg4 db 10,13, "The difference is:$"
	msg5 db 10,13, "The product is:$"
	msg6 db 10,13, "The quotient is:$"
	a db ?
	b db ?
.code
start:
	mov ax, @data
	mov ds, ax

	lea dx, msg1
	
	mov ah, 09h
	int 21h
	
	mov ah,01h
	int 21h
	
	mov a,al
	lea dx, msg2
	mov ah,09h
	int 21h

	mov ah,01h
	int 21h
	mov b,al

	sub a, 30h
	sub b, 30h
	
	mov al,a
	mov bl,b
	add al,bl
	add al,30h
	
	lea dx, msg3
	mov ah,09h
	int 21h

	mov dl,al
	mov ah,02h
	int 21h

	mov al,a
	
	sub al,bl
	add al,30h

	lea dx, msg4
	mov ah, 09h
	int 21h
	
	mov dl, al
	mov ah, 02h
	int 21h
	
	mov al,a
	mov ah, 00h
	
	mul bl
	add al,30h
	lea dx,msg5
	
	mov ah,09h
	int 21h

	mov dl,al
	mov ah,02h
	int 21h
	
	mov al,a
	mov ah,02h

	div bl
	add al,30h
	lea dx,msg6

	mov ah,09h
	int 21h
	
	mov dl,al
	mov ah,02h
	int 21h
	
	mov ah,4ch
	int 21h
end start
	
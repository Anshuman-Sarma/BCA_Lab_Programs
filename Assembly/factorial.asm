//AnshumanSarma_WAP to find the factorial of a given number (remove comment when executing)

.model small
.stack 100h
.data
	num db 05h
.code
start:
	mov ax,@data
	mov ds,ax

	lea SI,num

	mov al,[SI]
	mov bl,al

	l1:
	dec bl
	jz l2

	mul bl
	jmp l1

	l2:
	mov cl,al

	mov ah,4ch
	int 21h
end start
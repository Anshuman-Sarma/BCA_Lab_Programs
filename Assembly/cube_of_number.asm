//AnshumanSarma_WAP to calculate the cube of a given number (remove comment when executing)

.model small
.stack 100h
.data

	a dw 0003h
	b dw ?
.code
start:
	mov ax,@data

	mov ds,ax
	mov ax,a

	mul a
	mov b,ax

	mul a

	mov ah,4ch
	int 21h
end start
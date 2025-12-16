//AnshumanSarma_WAP to find the smallest number from a given array (remove comment when executing)

.model small
.stack 100h
.data
	num db 01h,06h,03h,04h,05h
.code
start:
	mov ax,@data
	mov ds,ax
	mov cl,05h
	mov al,00h
	lea SI,num

	mov al,[si]

	l1:
	cmp al,[si]
	jc l2
	mov al,[si]

	l2:
	inc si
	COA 7
	dec cl
	jnz l1
	mov cl,al

	mov ah,4ch
	int 21h
end start
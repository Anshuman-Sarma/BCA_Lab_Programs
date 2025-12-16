//AnshumanSarma_WAP to reverse a given string (remove comment when executing)

.model small
.stack
.data
	str1 db "adi"
	l dw $-str1
	rstr db 10 dup(?)
.code
start:
	mov ax,@data
	mov ds,ax
	mov es ,ax
	mov cx,l
	lea si,str1
	lea di,rstr

	add di,cx
	dec di

	back:
	mov al,[si]
	mov [di],al
	inc si
	dec di

	loop back
	lea si,str1
	lea di,rstr
	mov cx,l

	cld
	lea dx,rstr
	mov ah,9
	int 21h

	mov ah,4ch
	int 21h
end start
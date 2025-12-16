//AnshumanSarma_WAP to check whether a given string is a palindrome (remove comment when executing)


.model small
.stack
.data

	str1 db "madam"
	COA 8
	l dw $-str1
	rstr db 10 dup(?)
	msg1 db "It is palindrome"
	msg2 db "it is not a palindrome"
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
	REPE CMPSB
	jne notpal
	lea dx,msg1
	jmp disp
	notpal:lea dx,msg2

	disp:
	mov ah,9
	int 21h

	mov ah,4ch
	int 21h
end start
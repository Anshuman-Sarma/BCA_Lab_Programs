//AnshumanSarma_WAP to sort a set of numbers in ascending order (remove comment when executing)

.model small
.stack 100h
.data
	num db 12h,37h,02h,36h,50h
	len equ ($-num)
	c db ?
.code
	start:
		mov ax, @data
		mov ds, ax
		mov bx, len
		dec bx
	next_p: mov cx,bx
		lea SI,num
	next_cmp: mov al,[SI]
		  cmp al,[SI]
		  jc nxt
		  x chg al, [si+1]
		  mov[si],al
	nxt:      inc SI
		  loop nxt_cmp
		  dec bx
		  jnz nxt_p
		mov ah,4ch
		int 21h
	end start		
//AnshumanSarma_WAP to display predefined messages on the screen (remove comment when executing)

.model small
.stack 100h
.data
	msg1 db 10,13,"Welcome to ADBU$"
	msg2 db 10,13,"We are Happy$"
.code
start:
    		mov ax, @data
    		mov ds, ax
    			
    		lea dx, msg1
    		mov ah, 09h
    		int 21h
    		
    		lea dx, msg2
    		mov ah, 09h
    		int 21h
    		
    		mov ah, 4ch
    		int 21h
    end start
    		

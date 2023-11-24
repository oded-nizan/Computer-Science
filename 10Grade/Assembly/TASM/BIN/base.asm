IDEAL
MODEL small
STACK 100h
DATASEG

; ------------------------
; Your variables here
; ------------------------

CODESEG
start:
    mov ax, @data
    mov ds, ax

; ------------------------
; Your code here

mov cx, 3
add cx, 5
mov bx, cx
inc bx
mov ax, bx
mov dx, cx

; ------------------------

exit:
    mov ax, 4c00h
    int 21h

END start
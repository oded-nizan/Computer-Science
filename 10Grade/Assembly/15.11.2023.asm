IDEAL
MODEL small
STACK 100h
DATASEG
; ------------------------
; Your variables here

var db 12
var1 db 15

; ------------------------

CODESEG
start:
    mov ax, @data
    mov ds, ax

; ------------------------
; Your code here

;example code here:
;mov ax, 10 ; ax = 10
;mov bx, xc ; bx = cx
;mov bx, 4 ; bx = 4
;add ax, bx ; ax = ax + bx
;sub bx, dx ; bx = bx - dx

;(7 - 5) * 3 + 8
;mov ax, 7
;sub ax, 5
;mov bx, 3
;mul bl
;add ax, 8

;(4 + 5) * (3 - 1)
;mov ax, 4
;add ax, 5
;mov bx, 3
;sub bx, 1
;mul bl

;(0abh + 0cdh)
;mov ax, 0abh
;mov bx, 0cdh
;add ax, bx

;(3 + 2) * 4
;mov ax, 3
;add ax, 2
;mov bx, 4
;mul bl

;((8 - 5) * 3) + (5 + 2)
mov ax, 8
sub ax, 5
mov bx, 3
mul bl
mov cx, 5
add cx, 2
add ax, cx

; ------------------------

exit:
    mov ax, 4c00h
    int 21h

END start
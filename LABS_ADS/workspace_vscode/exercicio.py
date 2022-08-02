import math

val = input('Informe um numero: ') #considerando a entrada de numeros inteiros
numero = math.pow(int(val), 3)
if numero > 100:
    print(f'O numero {val} elevado ao cubo e maior que 100.')
elif numero < 100:
    print(f'O numero {val} elevado ao cubo e menor que 100.')

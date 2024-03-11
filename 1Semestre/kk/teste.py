def decimal_to_binary(decimal):
    binary_result = bin(decimal)[2:]
    return binary_result

# Ler a entrada decimal do usuário
decimal_input = int(input("Digite um número decimal: "))

# Converter para binário
binary_output = decimal_to_binary(decimal_input)

# Imprimir o resultado
print(f"O número binário equivalente é: {binary_output}")

programa
{
	
	funcao inicio()
	{
		real janeiro,fevereiro,marco,abril,total,media
		cadeia funcionario
		escreva ("Digite o nome do funcionário:")
		leia (funcionario)
		escreva ("Digite o valor das vendas de janeiro:")
		leia (janeiro)
		escreva ("Digite o valor das vendas de fevereiro:")
		leia (fevereiro)
		escreva ("Digite o valor das vendas de marco:")
		leia (marco)
		escreva ("Digite o valor das vendas de abril:")
		leia (abril)

		total= janeiro+fevereiro+marco+abril
		escreva ("O funcionário: " + funcionario + " vendeu o valor total de: " + total)

		media= (janeiro+fevereiro+marco+abril)/4
		escreva (" e a média das vendas foi de: " + media)
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 626; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
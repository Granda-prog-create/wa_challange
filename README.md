Back-end - Teste WA
Este projeto é um aplicativo de linha de comando desenvolvido com Spring Boot que realiza análises de texto.

Funcionalidades
Análise de Texto: O aplicativo pode analisar uma frase e encontrar correspondências com base em uma profundidade especificada.
Modo Verbose: O modo verbose fornece detalhes adicionais sobre o processo de análise.
Estrutura do Projeto
O projeto é dividido em várias partes:

src/main/java/com/example/teste_wa/: Contém o código-fonte principal do aplicativo.
TesteWaApplication.java: Classe principal do aplicativo Spring Boot.
AnalyzeCommand.java: Comando para realizar a análise de texto.
TextAnalyzerService.java: Serviço responsável pela lógica de análise de texto.
TextAnalyzerShell.java: Configuração do shell para comandos de linha de comando.
src/main/resources/: Contém recursos adicionais e arquivos de configuração.
application.properties: Arquivo de configuração do Spring Boot.
target/: Diretório de saída para o JAR do projeto.
Execução do Projeto
Executar o Servidor
Navegue até o diretório do projeto:

bash
Copiar código
cd path/to/your/project
Execute o JAR gerado para iniciar o servidor:

bash
Copiar código
java -jar target/teste-wa-0.0.1-SNAPSHOT.jar
Executar Comando de Análise
Abra um novo terminal e execute o comando de análise com o seguinte formato:

bash
Copiar código
java -jar target/teste-wa-0.0.1-SNAPSHOT.jar analyze <depth> "<text>" [--verbose]
<depth>: Profundidade da análise.
<text>: Texto a ser analisado.
--verbose: (Opcional) Ativa o modo verbose.
Exemplo:

bash
Copiar código
java -jar target/teste-wa-0.0.1-SNAPSHOT.jar analyze 2 "Eu vi um cachorro e um pombo" --verbose
Resultados Esperados
Quando o comando de análise é executado, o terminal deve mostrar algo como:

mathematica
Copiar código
Analysis complete! Matches at depth 2: <number>
Verbose Mode Enabled
Onde <number> representa o número de correspondências encontradas.

Próximos Passos
Verificar o Resultado da Análise: Examine o número de correspondências e verifique se estão corretas.
Revisar a Configuração do Shell: Verifique e ajuste a lógica de análise no shell conforme necessário.
Testar Novos Casos: Experimente diferentes entradas e profundidades para garantir que o sistema esteja funcionando corretamente.
Documentar e Validar: Documente o comportamento e a configuração do aplicativo para referência futura e valide se todos os requisitos do projeto foram atendidos.


Frontend - Teste WA 


# Hierarquia de Palavras

## Descrição

Esta aplicação web permite ao usuário criar uma hierarquia de palavras e gerar um arquivo JSON com a estrutura criada. O frontend foi desenvolvido utilizando Next.js e TypeScript.

## Funcionalidades

1. Adicionar múltiplos níveis à hierarquia de palavras.
2. Exibir a hierarquia de palavras de forma visual e interativa.
3. Gerar um arquivo JSON contendo a hierarquia criada.
4. Permitir o download do arquivo JSON gerado.

## Tecnologias

- **Framework:** Next.js
- **Linguagem:** TypeScript

## Estrutura do Projeto

- **`src/components/`**: Componentes reutilizáveis da aplicação.
- **`src/pages/`**: Páginas da aplicação.
- **`src/utils/`**: Funções utilitárias.

## Instruções de Desenvolvimento

1. **Instalação das Dependências:**

   ```bash
   npm install
   npm install @mui/icons-material

Se tiver usando yarn, substitua o npm por yarn. 

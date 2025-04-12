## Factory method ##:
Impede o cliente de usar o operador "new" criando um método estático na classe que retorna um objeto da classe
e tornando o construtor protected ou privado.
Os metodos podem ter nomes sugestivos, os objetos retornados podem ser reusados e não novos.  O retorno pode ser uma instância de uma subclasse.

## Abstract factory ##
Cria uma interface de factory que pode ser implementada por várias outras factories. Com insto podemos usar uma factory sem saber qual
será a classe exata do objeto criado.

## Builder ##
Criar um objeto atraves de outro objeto builder. 
Pensar na StringBuilder do java. Cria-se uma instancia de sb e coloca-se nele o conteudo que queremos na string. Depois executamos o toString()
para que o stringBuilder crie uma string com todos os dados passados.
Esta lógica aplica-se a outros construtores. Estes podem criar o objeto no fim ou criar o objeto no inicio e ir adicionando coisas.
Exemplo do NutritionFacts.

## Singleton ##
Padrão simples que garante que uma classe tem apenas uma instância.
A classe tem um atributo estatico (referencia) do unico objeto da classe. O construtor é privado e cria-se um método getInstance que retorna essa referencia.
Temos a versão lazy initialization onde o objeto só é criado depois que o método getInstance é chamado.

## Object Pool ##
Pensar nas thread pools. Cria-se um conjunto de objetos que são passados ao cliente na medida do possivel. Quando não há objetos suficientes estes são então 
criados.
Interfaces: Pool, PooledObjectFactory, PooledObject
O cliente usa o objeto e devolve à pool.

## Prototype ##
Criar um novo objeto atravês da copia de um outro.
Usar super.clone()
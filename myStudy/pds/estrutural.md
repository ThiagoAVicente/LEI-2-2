## Adapter ##
Transformar a interface de uma classe em outra interface compativel com um determinado código.
Cria-se uma classe que implementa a interface desejada e:
  - herda a classe a se adaptar -> por herança / subclassing
  - tem uma referencia para um objeto da classe a se adaptar -> por composição / delegation

## Bridge ##
Separa uma abstração da sua implementação para que a abstração e a implementação sejam independentes.
Cria-se uma interface/classe abstrata ab e no cliente só se espera por um objeto subclasse de ab. Assim o cliente pode estar a usar abcd sem saber pois ele 
não está a par da implementação.
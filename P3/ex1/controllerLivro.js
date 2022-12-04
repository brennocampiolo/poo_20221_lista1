angular.
    module('cadastroLivro').
    component('cadastroLivro', {
        templateUrl: '/P3/livro.html',
        controller: function
cadastroLivroController(){
    this.livros = [
      {
        idLivro: '74543',
        tituloLivro: ' Teste livro',
        autorLivro: 'João alisson',
        numeroPaginas: '120'
      }, {
        idLivro: '24252',
        tituloLivro: 'Teste titulo',
        autorLivro: 'Jeferson alves',
        numeroPaginas: '200'
      }
    ];

    this.orderProp = '';
}
    });
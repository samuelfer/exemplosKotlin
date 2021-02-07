/* Java */
//if (shape instanceof Circle) {
//    Circle circle = (Circle) shape;
//    circle.calCircumference(3.5);
//}

///* Kotlin */
//if (shape is Circle) {
//    shape.calCircumference(3.5)
//}

//O compilador é inteligente para saber que o bloco if será executado somente se o objeto
//shape é uma instância de Circle — assim o mecanismo de conversão é feito nos bastidores para nós.

//Objeto companheiro
//A instanciação de um objeto companion é inerte. Em outras palavras,
//ele será instanciado somente quando necessário pela primeira vez.
//A instanciação de um objeto companion acontece quando é criada uma instância da classe
//companion ou os membros do objeto companion são acessados.
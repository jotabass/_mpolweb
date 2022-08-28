# _Mpolweb
 ## Adcionado idens de cadastro no método PUT.   OBS-> "para testes".

 ## Correção de erro-> no backend na classe JWTCONFIGURATION não dei permissão ao método POST da rota /api/mpol,
      "sem a permissão o tokem não liberava o cadastro". 
         ex para fixar  -> .antMatchers(HttpMethod.POST, "/api/mpol").permitAll() 



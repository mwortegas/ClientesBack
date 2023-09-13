# ClientesBack
Proyecto Sistema ComoHogar
ClientesBack es una api java, cuya url es : http://localhot:8090/comohogar/api
Recursos:
Recursos de Clientes:
get http://localhot:8090/comohogar/api/cli/all                       Obiene todos los clientes de la base de datos

get http://localhot:8090/comohogar/api/cli/calban@ool.com             Obtiene el registro del cliente Carlos Albán

delete http://localhot:8090/comohogar/api/cli/delete/calban@ool.com   Borrará el registro del cliente Carlos Albán

post   http://localhot:8090/comohogar/api/cli/save                   Guardara informacion del cliente Carlos Albán
"Media-Type": "application/json"
{
   "name": "Carlos Alban",
   "eMail": "calban@ool.com",
   "phone": "593 2568987874",
   "store": "SKala Shopping",
   "group": "SK",
   "edit": "",
   "delete": ""
}

post   http://localhot:8090/comohogar/api/cli/save                   Guardará informacion del cliente Marco Botton
"Media-Type": "application/json"
{
   "name": "Carlos Alban",
   "eMail": "mbotton@abc.com",
   "phone": "593 2568987874",
   "store": "SKala Shopping",
   "group": "SK",
   "edit": "",
   "delete": ""
}

Recursos de sk_formatos.json:
get   http://localhot:8090/comohogar/api/sk/all        Obtendrá todos los descuentos del formato sk

post  http://localhot:8090/comohogar/api/sk/save       Guardará un benefico de formato sdk
"Media-Type": "application/json"
{"beneficio": "Gorra ComoHogar"}

Recursos de th_formatos.xml:
get   http://localhot:8090/comohogar/api/th/all        Obtendrá todos los descuentos del formato th










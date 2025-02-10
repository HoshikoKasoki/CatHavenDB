package main;

import Interfaces.Gatos_en_adopcion;
import Interfaces.Inicio;
import Interfaces.Inicio_administrador;
import Interfaces.Inicio_usuario;
import Interfaces.Menu_ad;
import Interfaces.Respuesta_solicitud;
import Interfaces.info_gato;
import Interfaces.menu_usuario;
import Interfaces.regis_administrador;
import Interfaces.regis_adopcion;
import Interfaces.regis_gato;
import Interfaces.regis_usuario;
import Interfaces.solicitud_adopcion;
import Interfaces.ver_regis_adopciones;

public class CatHavenDB {

    public static void main(String[] args) {
        
      new Inicio().setVisible(true);
      new Inicio_usuario().setVisible(true);
      new Inicio_administrador().setVisible(true);
      new regis_usuario().setVisible(true);
      new regis_gato().setVisible(true);   
      new info_gato().setVisible(true);   
      new regis_administrador().setVisible(true);
      new regis_adopcion().setVisible(true);
      new solicitud_adopcion().setVisible(true);
      new ver_regis_adopciones().setVisible(true);
      new Gatos_en_adopcion().setVisible(true);
      new menu_usuario().setVisible(true);
      new Respuesta_solicitud().setVisible(true);
      new Menu_ad().setVisible(true);
      
    }
}

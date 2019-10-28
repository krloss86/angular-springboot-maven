interface InformacionCliente {
  saldos: Saldos;
  equipo: Equipo;
  cliente: Cliente;
  recomendaciones: Recomendaciones;
}

interface Recomendaciones {
  recomendaciones: Recomendacione[];
}

interface Recomendacione {
  titulo: string;
  subTitulo: string;
  descripcion: string;
}

interface Cliente {
  contactos: Contacto[];
}

interface Contacto {
  fecha: string;
  empresa: string;
  descripcion: string;
}

interface Equipo {
  datosEquipo: DatosEquipo[];
}

interface DatosEquipo {
  titulo: string;
  dato: string;
}

interface Saldos {
  datosSaldos: DatosSaldo[];
}

interface DatosSaldo {
  titulo: string;
  fecha: string;
  descripcion: string;
}

Esquema de validacion para la colección oficinas

{
  $jsonSchema: {
    bsonType: 'object',
    required: [
      '_id',
      'nombre',
      'direccion',
      'numeroPtosAtencion'
    ],
    properties: {
      _id: {
        bsonType: 'int'
      },
      nombre: {
        bsonType: 'string'
      },
      direccion: {
        bsonType: 'string'
      },
      numeroPtosAtencion: {
        bsonType: 'int'
      },
      gerente: {
        bsonType: 'array',
        items: {
          bsonType: 'objectId'
        }
      },
      puntosAtencion: {
        bsonType: 'array',
        items: {
          bsonType: 'object',
          required: [
            'tipo',
            'operaciones'
          ],
          properties: {
            tipo: {
              'enum': [
                'Atencion Personalizada',
                'Cajero Automatico',
                'Digital'
              ]
            },
            operaciones: {
              bsonType: 'array',
              items: {
                bsonType: 'string'
              }
            }
          }
        }
      }
    }
  }
}


Esquema de validación para la colección Clientes


{
  $jsonSchema: {
    bsonType: 'object',
    required: [
      '_id',
      'tipo',
      'rol'
    ],
    properties: {
      _id: {
        bsonType: 'int'
      },
      tipo: {
        bsonType: 'string'
      },
      rol: {
        'enum': [
          'Gerente General',
          'Gerente de Oficina',
          'Cajero',
          'Cliente'
        ]
      },
      cuentas: {
        bsonType: 'array',
        items: {
          bsonType: 'object',
          required: [
            'tipoCuenta',
            'estado',
            'saldo'
          ],
          properties: {
            tipoCuenta: {
              'enum': [
                'Ahorros',
                'Corriente',
                'AFC'
              ]
            },
            estado: {
              'enum': [
                'Activa',
                'Cerrada',
                'Desactivada'
              ]
            },
            saldo: {
              bsonType: 'int'
            },
            operaciones: {
              bsonType: 'array',
              items: {
                bsonType: 'object',
                required: [
                  'tipo',
                  'puestoAtencion',
                  'hora',
                  'fecha'
                ],
                properties: {
                  tipo: {
                    'enum': [
                      'Abrir Cuenta',
                      'Cerrar Cuenta',
                      'Consignar',
                      'Retirar dinero',
                      'Transferir dinero'
                    ]
                  },
                  valor: {
                    bsonType: 'int'
                  },
                  puestoAtencion: {
                    'enum': [
                      'Atencion Personalizada',
                      'Cajero Automatico',
                      'Digital'
                    ]
                  },
                  hora: {
                    bsonType: 'int'
                  },
                  fecha: {
                    bsonType: 'date'
                  }
                }
              }
            }
          }
        }
      }
    }
  }
}
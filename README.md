# Análisis y Diseño de Sistemas II Examen Parcial 2

Por favor leer cuidadosamente las instrucciones en su examen.

## Descripción de Componentes

### Capa de Entidades

- **VehicleEntity** almacena los datos de un vehículo. Por ejemplo número de placa, modelo, color, marca, etc.
- **VehicleOwnerEntity** almacena los datos del propietario del vehículo.
- **VehicleServiceHistoryEntryEntity** almacena los datos de un registro individual del historial de servicios que se le han realizado al vehículo. Cada vez que un vehículo egresa del taller, se genera un nuevo registro.
- **ServiceOrderEntity** almacena los datos de una orden de servicio. Cada vez que el vehículo es ingresado al taller se genera una orden nueva.
- **MechanicEntity** almacena los datos específicos de un mecánico.
- **TechnicianEntity** almacena los datos de un técnico automotriz. Por ejemplo su especialidad o área de trabajo.
- **AssistantEntity** almacena los datos de un asistente de mecánica.
- **SparePartEntity** almacena los datos de un repuesto de vehículo. Por ejemplo carburador, fricciones, pastillas, llantas, bombilla de stop, cojinete, faja, etc.
- **ProductEntity** almacena los datos de un producto utilizado durante la realización de un servicio. Por ejemplo 1L de shampoo para lavar autos, 1L de aceite de motor, 1 lata de limpiador de frenos, 1 bola de wipe, etc.
- **ProviderEntity** almacena los datos de un proveedor de servicio o repuestos para todo aquello que no se maneje directamente en el taller. Por ejemplo proveedor de accesorios de carro, proveedor de llantas.
- **AbstractPerson** Clase abstracta para declarar los atributos que debe tener una persona.

### Capa de Acceso a Datos

- **IVehicleDao** operaciones de acceso a datos de un vehículo.
- **IInventoryDao** operaciones de acceso a datos de productos en el inventario del taller.
- **IEmployeeDao** operaciones de acceso a datos de los empleados del taller.
- **IVehicleOwnerDao** operaciones de acceso a datos del propietario de un vehículo.
- **IVehicleServiceHistoryDao** operaciones de acceso a datos históricos de los servicios del vehículo.
- **IProviderDao** operaciones de acceso a datos de los proveedores del taller.
- **IServiceDao** operaciones de acceso a datos de las órdenes de servicio.

### Capa de Lógica de Negocio

- **IVehicleReceiptService** operaciones de recepción y entrega de un vehículo así como también cotización, facturación, cobro, etc.
- **IEngineRepairService** operaciones de reparación de motor de un vehículo.
- **IBrakeRepairService** operaciones de reparación de frenos, tren delantero, tren trasero, llantas.
- **IAutoDeliveryService** operaciones de entrega de vehículos a domicilio. Control de pilotos, horarios de entrega, transporte de pilotos, etc.
- **CarCleaningService** operaciones de lavado exterior, encerado, pulido, lavado de tapicería, lavado de alfombras, lavado de motor, detailing.
- **CustomsService** operaciones de personalización de vehículos, instalación/reemplazo de accesorios, cotizaciones, pedidos al exterior, etc.
- **IPaintingService** operaciones de enderezado y pintura. Importación de piezas, cotización, seguros.
- **IQAControlService** operaciones de revisión pre y post servicio.

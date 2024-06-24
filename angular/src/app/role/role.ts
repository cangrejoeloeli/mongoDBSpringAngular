export interface Permiso {
    id: string;
    nombrePermiso: string;
}

export interface Modulo {
    id: string;
    nombreModulo: string;
}

export interface ModulosPermisosAsignados {
    modulo: Modulo;
    permisos: Permiso[];
}

export interface Role {
    id: string;
    name: string;
    modulo: string;
    modulosAsignados: ModulosPermisosAsignados[]
}

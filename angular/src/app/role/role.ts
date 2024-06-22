export interface Permiso {
    id: string;
    nombrePermiso: string;
}

export interface Modulo {
    id: string;
    nombreModulo: string;
}

export interface Role {
    id: string;
    name: string;
    modulo: string;
    permisos: string[];
}

import { Role } from "../roles/roles";

export interface User {
    id: string | null;
    username: string;
    password: string;
    nombre: string;
    roles: Role[];
}
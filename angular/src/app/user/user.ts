import { Role } from "../role/role";

export interface User {
    id: string | null;
    username: string;
    password: string;
    nombre: string;
    roles: Role[];
}
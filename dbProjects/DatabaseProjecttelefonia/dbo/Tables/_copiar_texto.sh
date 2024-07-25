#!/bin/bash

# Nombre del archivo de salida
output_file="_acerca_db.md"

# Inicializa el contador
counter=1

# Crear o vaciar el archivo de salida
> "$output_file"

# Iterar sobre todos los archivos de texto en la carpeta
for file in *.sql; do
  # Verificar si el archivo existe y es un archivo regular
  if [[ -f "$file" ]]; then
    echo "Procesando $counter name $file..."
    
    # Agregar el nombre del archivo como un encabezado en el archivo de salida
    echo "## $counter: $file" >> "$output_file"
    
    # Elimina las líneas vacías y añade el contenido al archivo de salida
    sed '/^$/d' "$file" >> "$output_file"

    # Copiar el contenido del archivo de texto al archivo de salida
    # cat "$file" >> "$output_file"
    
    # Agregar una línea en blanco después del contenido
    echo -e "\n" >> "$output_file"

    # Incrementa el contador
    ((counter++))
  fi
done

echo "Todos los archivos han sido copiados a $output_file"

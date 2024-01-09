--Consultas

use blockbuster2

SELECT COUNT(products.id) AS Cantidad, formats.format
FROM products 
    LEFT JOIN formats ON products.id_format = formats.id
GROUP BY formats.format 

SELECT COUNT(orders.id) AS 'Cant. Pedidos', clients.name + ' ' + clients.last_name as 'Nombre completo'
FROM orders 
    left JOIN clients ON clients.id = orders.id_client
GROUP BY clients.id, clients.name, clients.last_name

select employees.name, employees.last_name, employees.email from branchs
left join employees on (branchs.id = employees.id_branch)
UNION
select clients.name, clients.last_name, clients.email from branchs
left join clients on (branchs.id = clients.id_branch)
order by name, last_name

select orders.* from orders
where orders.date BETWEEN '2024-01-10' and '2024-01-15'

select top 12 percent orders.* from orders
    left join clients on orders.id_client = clients.id
where clients.is_partner is not null

select count(clients.id) from clients 
    left join locations on clients.id_location = locations.id
    left join cities on locations.id_city = cities.id
where (clients.is_partner = 1)

SELECT count(order_details.id) from clients
    left join orders on clients.id = orders.id_client
    left join order_details on orders.id = order_details.id_order
WHERE (clients.is_partner = 0)

SELECT count(products.id) from products
    left join types on products.id_type = types.id
WHERE types.type = 'Película'

select AVG(employees.id) from branchs
    left join employees on (branchs.id = employees.id_branch)
    left join orders on employees.id = orders.id_employee
    left join order_details on orders.id = order_details.id_order
WHERE (branchs.id = 11 AND order_details.is_buy = 1)

select avg(order_details.id) as prom from order_details
    left join products on order_details.id_product = products.id
    left join types on products.id_type = types.id
where (types.type = 'Serie' and order_details.is_buy = 0)

SELECT SUM(order_details.cant) as 'Cant Alquilada', products.title
FROM  order_details 
    LEFT JOIN products ON products.id = order_details.id_product
GROUP BY products.title, products.id
HAVING SUM(order_details.cant) > 4

SELECT TOP 5 SUM(order_details.cant) AS Generos, genders.gender 
FROM order_details 
    LEFT JOIN products ON order_details.id_product = products.id
    LEFT JOIN genders ON products.id_gender = genders.id
GROUP BY genders.id, genders.gender
ORDER BY Generos DESC

SELECT employees.legajo, employees.name, employees.last_name, max(orders.date) AS fecha
FROM orders
    LEFT JOIN employees ON orders.id_employee = employees.id
WHERE orders.date BETWEEN '2024-01-12' AND '2024-01-15'
GROUP BY employees.legajo, employees.name, employees.last_name
ORDER BY fecha DESC, employees.legajo

SELECT COUNT(payment_methods.id) AS Cantidad, payment_methods.payment_method
FROM payment_methods 
    LEFT JOIN orders ON payment_methods.id = orders.id_payment_method
    LEFT JOIN clients ON orders.id_client = clients.id
WHERE (clients.is_partner = 1)
GROUP BY payment_methods.payment_method
HAVING COUNT(payment_methods.id)>=2

select name, last_name 
from clients 
where id_location in (select id_location from employees)

-- Ordenes (numero, fecha, total) cuyo precio total sea mayor al precio promedio de los productos
use blockbuster2

SELECT orders.number_order, orders.date, orders.total, AVG(cDeta_Products.sum) as prom
FROM orders 
    LEFT JOIN (
        SELECT order_details.id_order AS id, SUM(products.sale_price * order_details.cant) AS sum
        FROM order_details
            LEFT JOIN products ON order_details.id_product = products.id
        GROUP BY order_details.id_order, products.id
              ) AS cDeta_Products ON orders.id = cDeta_Products.id
GROUP BY orders.id, orders.number_order, orders.date, orders.total
HAVING AVG(cDeta_Products.sum)<total

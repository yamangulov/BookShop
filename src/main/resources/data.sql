insert into books (author, title, priceOld, price) values ('Drucie Goodbourn', 'exploit real-time e-commerce', '$203.23', '$43.37');
insert into books (author, title, priceOld, price) values ('Marcia Aggiss', 'utilize real-time interfaces', '$260.31', '$35.96');
insert into books (author, title, priceOld, price) values ('Giovanni Bigg', 'extend strategic e-services', '$272.00', '$151.04');
insert into books (author, title, priceOld, price) values ('Duffie Eynon', 'iterate integrated solutions', '$271.58', '$141.40');
insert into books (author, title, priceOld, price) values ('Anselma McKennan', 'cultivate magnetic e-commerce', '$278.43', '$54.44');
insert into books (author, title, priceOld, price) values ('Gert Kira', 'architect vertical ROI', '$282.54', '$102.61');
insert into books (author, title, priceOld, price) values ('Clerc Djakovic', 'disintermediate extensible architectures', '$295.38', '$181.27');
insert into books (author, title, priceOld, price) values ('Stacee Elsy', 'extend leading-edge methodologies', '$283.08', '$97.96');
insert into books (author, title, priceOld, price) values ('Dorotea Bonhill', 'integrate one-to-one systems', '$258.51', '$52.25');
insert into books (author, title, priceOld, price) values ('Minni Bunney', 'revolutionize 24/7 infrastructures', '$260.79', '$33.69');
insert into books (author, title, priceOld, price) values ('Berty Gandley', 'enhance innovative e-services', '$256.54', '$160.98');
insert into books (author, title, priceOld, price) values ('Raynard Tesdale', 'maximize 24/365 e-tailers', '$262.07', '$34.06');
insert into books (author, title, priceOld, price) values ('Joanna Hutfield', 'scale integrated architectures', '$257.66', '$32.97');
insert into books (author, title, priceOld, price) values ('Dannie Glidder', 'e-enable frictionless web services', '$288.19', '$90.52');
insert into books (author, title, priceOld, price) values ('Timmie Adshede', 'strategize B2B channels', '$232.27', '$44.83');
insert into books (author, title, priceOld, price) values ('Fernando Neads', 'syndicate compelling deliverables', '$287.45', '$101.89');
insert into books (author, title, priceOld, price) values ('Teddy Guilliland', 'utilize bleeding-edge users', '$281.37', '$146.21');
insert into books (author, title, priceOld, price) values ('Paloma Grebert', 'cultivate 24/365 networks', '$270.99', '$184.76');
insert into books (author, title, priceOld, price) values ('Kristos Usher', 'embrace plug-and-play platforms', '$278.36', '$77.71');
insert into books (author, title, priceOld, price) values ('Darcey Rohmer', 'target innovative paradigms', '$298.94', '$130.01');
insert into books (author, title, priceOld, price) values ('Cristie Isacsson', 'generate open-source e-business', '$276.57', '$113.25');
insert into books (author, title, priceOld, price) values ('Lindsay Coutthart', 'implement user-centric e-markets', '$254.70', '$115.31');
insert into books (author, title, priceOld, price) values ('Helyn Schneidar', 'utilize magnetic supply-chains', '$279.70', '$77.86');
insert into books (author, title, priceOld, price) values ('Bette-ann Askem', 'e-enable dot-com supply-chains', '$297.83', '$110.15');
insert into books (author, title, priceOld, price) values ('Dom Robuchon', 'facilitate efficient eyeballs', '$232.30', '$131.48');

insert into authors (author) select distinct author from books;
-- изменение схемы именно здесь, а не в файле data.sql для того, чтобы оно всегда выполнялось после
-- первоначального заполненения БД H2 в оперативной памяти сразу после запуска приложения
ALTER TABLE books ADD CONSTRAINT fk_books_authors FOREIGN KEY (author) REFERENCES authors (author) ON DELETE CASCADE ON UPDATE CASCADE;
-- Genre
INSERT INTO GENRE (libelle) VALUES
('Action'),	 			-- 1
('Animation'),			-- 2
('Aventure'),			-- 3
('Biographique'),		-- 4
('Catastrophe'),		-- 5
('Téléfilm'),			-- 6
('Comédie'),			-- 7
('Comédie Dramatique'),	-- 8
('Comédie Musicale'),	-- 9
('Comédie Policière'),	-- 10
('Comédie Romantique'),	-- 11
('Court Métrage'),		-- 12
('Dessin Animé'),		-- 13
('Documentaire'),		-- 14
('Drame'),				-- 15
('Drame Psychologique'),-- 16
('Thriller'),			-- 17
('Erotique'),			-- 18
('XXX'),				-- 19
('Espionnage'),			-- 20
('Essai'),				-- 21
('Fantastique'),		-- 22
('Film à Sketches'),	-- 23
('Film Musical'),		-- 24
('Guerre'),				-- 25
('Historique'),			-- 26
('Horreur'),			-- 27
('Karaté'),				-- 28
('Manga'),				-- 29
('Westerne'),			-- 30
('Heroic Fantasy'),		-- 31
('Policier'),			-- 32
('Comics'),				-- 33
('Péplum'),				-- 34
('Programme'),			-- 35
('Romance'),			-- 36
('Science Fiction');	-- 37


-- Film
INSERT INTO FILM (titre, annee, duree, synopsis, id_genre) VALUES
('Retour vers le futur', 1985, 106, 'En 1985, Marty, un adolescent comme les autres, mène une existence qu''il juge morne et ennuyeuse. Heureusement, il est épris de la jolie Jennifer et entretient une profonde amitié avec Doc, un savant fou qui prétend avoir inventé une machine à explorer le temps. Un jour, Doc invite Marty à l''essayer. Mais ils sont surpris par des terroristes. Doc est abattu tandis que Marty met l''engin en marche et se retrouve en 1955.', 37),
('Fight Club', 1999, 139, 'Insomniaque, désillusionné par sa vie personnelle et professionnelle, un jeune cadre expert en assurances, mène une vie monotone et sans saveur. Face à la vacuité de son existence, son médecin lui conseille de suivre une thérapie afin de relativiser son mal-être. Lors d''un voyage d''affaires, il fait la connaissance de Tyler Durden, une sorte de gourou anarchiste et philosophe. Ensemble, ils fondent le Fight Club. Cercle très fermé, où ils organisent des combats clandestins et violents, destinés à évacuer l''ordre établi.', 1),
('Forrest Gump', 1994, 144, 'A Savannah, dans l''Etat de Géorgie, Forrest Gump, assis sur un banc public, livre à qui veut l''entendre, l''étrange récit de sa vie mouvementée. Il naît dans un bourg de l''Alabama, affecté d''un quotient intellectuel inférieur à la moyenne et d''une paralysie partielle des jambes. Souvent raillé à l''école, le jeune Forrest se lie d''amitié avec la belle Jenny. Ensemble, ils vont grandir dans l''Amérique des années 1960.', 8),
('Pulp Fiction', 1994, 154, 'L''odyssée sanglante, burlesque et cocasse de petits malfrats dans la jungle de Hollywood à travers trois histoires qui s''entremêlent.', 10),
('L''Empire contre-attaque', 1980, 124, 'Malgré la destruction de l''Etoile noire, l''Empire règne toujours sur la galaxie. Un groupe de l''Alliance rebelle, mené par la princesse Leia se réfugie sur la planète glacée de Hoth. Après avoir subi un assaut des troupes impériales, Leia, Han Solo, Chewbacca et C-3P0 parviennent à s''échapper et se dirigent vers Bespin, la cité des nuages gouvernée par Lando Calrissian, ancien compagnon de Han. De son côté, Luke s''envole pour Dagobah afin d''apprendre l''art des Jedi avec le maître Yoda.', 37),
('Le Seigneur des Anneaux : Le Retour du roi', 2003, 191, 'Les hobbits Frodon et Sam continuent leur route vers le Mordor, guidés par l''étrange Gollum. Leur plan est de passer par le haut col de Cirith Ungol mais ils ignorent encore que Gollum les mène droit à un piège mortel. De leur côté, les autres membres de la Communauté de l''Anneau, accompagnés par Gandalf, se retrouvent en Isengard au pied de la tour d''Orthanc, où Saroumane et son complice Gríma sont retenus prisonniers par les Ents. C''est là que Gandalf met la main sur le palantír de Saroumane avant que toute la compagnie ne reparte vers Edoras pour y fêter la victoire. Au cours de la nuit, poussé par sa curiosité, le Hobbit Pippin regarde dans le palantír, et se révèle à l''Œil de Sauron. Il y voit Minas Tirith, la cité blanche du Gondor, détruite et l''arbre blanc en feu. Cet aperçu du plan de l''ennemi pousse Gandalf à se rendre de toute urgence à Minas Tirith pour donner l''alarme. ', 31 ),
('The Dark Knight - Le Chevalier noir', 2008, 152, 'Avec l''appui du lieutenant de police Jim Gordon et du procureur de Gotham, Harvey Dent, Batman vise à éradiquer le crime organisé qui pullule dans la ville. Leur association est très efficace, mais elle sera bientôt bouleversée par le chaos déclenché par un criminel psychopathe que les citoyens de Gotham connaissent sous le nom de Joker.', 33),
('Blade Runner', 1982, 117, '2019, Los Angeles. La Terre est surpeuplée et l’humanité est partie coloniser l’espace. Les nouveaux colons sont assistés de Replicants, androïdes que rien ne peut distinguer de l''être humain. Conçus comme de nouveaux esclaves, certains parmi les plus évolués s’affranchissent de leurs chaînes et s’enfuient. Rick Deckard, un ancien Blade Runner, catégorie spéciale de policiers chargés de "retirer" ces replicants, accepte une nouvelle mission consistant à retrouver quatre de ces individus qui viennent de regagner la Terre après avoir volé une navette spatiale. Ces replicants sont des Nexus 6, derniers nés de la technologie développée par la Tyrell Corporation.', 37),
('Interstellar', 2014, 169, 'Un groupe d''explorateurs exploite une faille dans l''espace-temps afin de parcourir des distances incroyables dans le but de sauver l''humanité.', 37),
('Le Parrain', 1972, 175, 'New York, 1945. Don Vito Corleone règne sur l''une des familles les plus puissantes de la mafia italo-américaine. Virgil Sollozzo, qui dirige la famille Tattaglia, lui propose de s''associer sur un nouveau marché prometteur : le trafic de drogue, mais celui-ci refuse. Don Vito est alors pris pour cible lors d''une tentative d''assassinat en pleine rue. Criblé de balles, il survit par miracle. Son fils Michael, qui s''était toujours tenu à l''écart des affaires familiales, se porte volontaire pour le venger.', 32),
('2001 : L''Odyssée de l''espace', 1968, 160, 'A l''aube de l''Humanité, dans le désert africain, une tribu de primates subit les assauts répétés d''une bande rivale, qui lui dispute un point d''eau. La découverte d''un monolithe noir inspire au chef des singes assiégés un geste inédit et décisif. En 2001, quatre millions d''années plus tard, un vaisseau spatial évolue en orbite lunaire au rythme langoureux du "Beau Danube Bleu". A son bord, le Dr. Heywood Floyd enquête secrètement sur la découverte d''un monolithe noir qui émet d''étranges signaux vers Jupiter.', 37),
('Le Bon, la Brute et le Truand', 1966, 179, 'Un chasseur de primes rejoint deux hommes dans une alliance précaire. Leur but ? Trouver un coffre rempli de pièces d''or dans un cimetière isolé.', 30),
('Inception', 2010, 148, 'Dom Cobb est un voleur expérimenté, le meilleur dans l''art dangereux de l''extraction : spécialité qui consiste à voler les secrets les plus intimes enfouis au plus profond du subconscient durant une phase de rêve. Très recherché pour ses talents dans l’univers trouble de l’espionnage industriel, Cobb est aussi devenu un fugitif traqué dans le monde entier. Une ultime mission pourrait lui permettre de retrouver sa vie passée, accomplir une « inception ».', 22),
('Le Seigneur des Anneaux : La Communauté de l''anneau ', 2001, 178, 'Frodon reçoit l''Anneau de son oncle Bilbo. Sa vie et son monde sont pourtant en danger, car cet anneau appartient à Sauron, le maître des ténèbres.', 31),
('Apocalypse Now', 1979, 147, 'Durant la guerre du Viêt-nam, le capitaine Willard est contraint de mener une mission périlleuse au Cambodge. Accompagné de quatre soldats, il doit mettre fin au commandement du colonel Kurtz, qui utilise des méthodes jugées trop barbares.', 25),
('Orange mécanique', 1971, 136, 'Dans une Angleterre futuriste et inhumaine, un groupe d''adolescents se déchaînent chaque nuit, frappant et violant d''innocentes victimes. Alex, le leader du gang est arrêté et condamné à 14 ans de prison. Il accepte de se soumettre à une thérapie de choc destinée à faire reculer la criminalité.', 27),
('Princesse Mononoké', 1997, 134, 'Ashitaka est à la recherche d''un remède à la malédiction de Tatarigami. Il se retrouve au milieu d''une guerre entre les dieux de la Forêt et Tatara.', 13),
('Eternal Sunshine of the Spotless Mind', 2004, 108, 'L''idylle entre Clementine et Joel a pris fin, en raison de leurs caractères trop différents et de la routine. Pour apaiser ses souffrances, Clementine a recours à Lacuna, un procédé révolutionnaire qui efface certains souvenirs. Désespéré, Joel décide de suivre le même processus. Une nuit, deux techniciens s''y emploient. Mais quand le passé défile dans sa tête, Joel mesure à quel point il aime toujours Clementine.', 11),
('Old Boy', 2003, 120, 'Après avoir été enlevé et emprisonné durant 15 ans, sans savoir pourquoi, Oh Dae-Su est libéré et recherche les raisons de son enfermement.', 17),
('Mulholland Drive', 2001, 147, 'A Hollywood, durant la nuit, Rita, une jeune femme, devient amnésique suite à un accident de voiture sur la route de Mulholland Drive. Elle fait la rencontre de Betty Elms, une actrice en devenir qui vient juste de débarquer à Los Angeles. Aidée par celle-ci, Rita tente de retrouver la mémoire ainsi que son identité.', 15),
('Le Voyage de Chihiro', 2001, 125, 'Lors du déménagement de sa famille, Chihiro, une fillette de 10 ans, erre dans un monde régi par les dieux, sorcières et monstres.', 29);


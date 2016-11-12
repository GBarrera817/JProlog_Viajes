distancia(london,newyork,3.2).
distancia(london,capetown,5.8).
distancia(london,rome,0.8).
distancia(london,panama,4.5).
distancia(panama,sydney,7.7).
distancia(newyork,sanfrancisco,2.5).
distancia(newyork,panama,1.9).
distancia(sanfrancisco,sydney,6.2).
distancia(sanfrancisco,tokyo,4.5).
distancia(tokyo,calcutta,2.5).
distancia(tokyo,sydney,4.1).
distancia(sydney,calcutta,4.4).
distancia(sydney,capetown,6.0).
distancia(capetowm,rome,5.1).
distancia(calcutta,cairo,2.2).
distancia(cairo,rome,0.9).
conectadas(X,Y,Distancia):- distancia(X,Z,Distancia1),
                          distancia(Z,Y,Distancia2),
                          SumaDistancias is Distancia1+Distancia2,
                          write(SumaDistancias).

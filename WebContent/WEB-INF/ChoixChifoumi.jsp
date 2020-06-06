<%@ page language="java"
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Chifumi</title>
	</head>
	
	<body>
		<header>
			<h1>Chifumi</h1>
		</header>
	    
	    <main>
	    	<h2>Regles du jeu</h2>
			<p>
	    		Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut volutpat eros eget ipsum mollis, vel pulvinar urna euismod. Nullam eleifend quis turpis sed tincidunt. Aenean eu urna suscipit, tempor augue sagittis, dictum sapien. Proin iaculis eros non mi tempor, non tincidunt nisl varius. In metus enim, vestibulum vitae tortor sit amet, euismod ultricies ligula. Vivamus lacinia lacus a ligula pulvinar faucibus. Sed eu volutpat dolor. Suspendisse potenti. Donec nisi nibh, finibus sed nunc a, vulputate elementum nisl. Donec tellus felis, posuere at felis et, sodales cursus erat. Donec sit amet porta leo. Maecenas quis arcu eu libero dapibus auctor quis in mi. Nulla bibendum risus non pellentesque faucibus. Quisque vulputate viverra mauris a pretium. Mauris sagittis libero sit amet ipsum consectetur congue vel rhoncus justo. Etiam venenatis, elit consequat pharetra vehicula, justo libero sagittis ligula, vitae dignissim risus libero eu neque.
			</p>
            
            <form method="post" action="Chifoumi" name="Chifoumi">		<!-- action : nom servlet -->

                    <fieldset>
                        <legend>A vous de jouer</legend>

                        <label for="choix">Votre choix: </label>
                        
                        <select name="choix" id="choix" size="1" placeholder="choix" required>
                            <option value="PIERRE">pierre</option>
                            <option value="FEUILLE">feuille</option>
                            <option value="CISEAUX">ciseaux</option>
                        </select>	                    
                    </fieldset>
                    
                    <button>Valider</button>

                </form>
		</main>
	
</body>
</html>
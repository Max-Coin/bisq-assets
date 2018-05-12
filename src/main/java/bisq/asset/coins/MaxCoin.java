/*
 * This file is part of Bisq.
 *
 * Bisq is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or (at
 * your option) any later version.
 *
 * Bisq is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Affero General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Bisq. If not, see <http://www.gnu.org/licenses/>.
 */

package bisq.asset.coins;

<<<<<<< HEAD
import bisq.asset.RegexAddressValidator;
=======
import bisq.asset.Base58BitcoinAddressValidator;
>>>>>>> cffa1cd9cd79294585134c8c83efca0d837ee8ca
import bisq.asset.Coin;

public class MaxCoin extends Coin {

    public MaxCoin() {
<<<<<<< HEAD
        super("MaxCoin", "MAX", new RegexAddressValidator("^m[1-9A-Za-z]{26,33}$"));
=======
        super("MaxCoin", "MAX", new Base58BitcoinAddressValidator());
>>>>>>> cffa1cd9cd79294585134c8c83efca0d837ee8ca
    }
}

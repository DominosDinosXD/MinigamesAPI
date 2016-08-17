/*
    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.github.mce.minigames.api.arena;

/**
 * An interface for enumerations that represent arena types.
 * 
 * @author mepeisen
 */
public interface ArenaTypeInterface
{
    
    /**
     * Returns the minigame name declaring the arena type.
     * 
     * @return minigame name.
     */
    default String getMinigame()
    {
        try
        {
            final ArenaTypes types = this.getClass().getField(((Enum<?>) this).name()).getAnnotation(ArenaTypes.class);
            return types.minigame();
        }
        catch (NoSuchFieldException ex)
        {
            throw new IllegalStateException(ex);
        }
    }
    
}
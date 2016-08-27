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

import com.github.mce.minigames.api.config.ConfigurationBool;
import com.github.mce.minigames.api.config.ConfigurationString;
import com.github.mce.minigames.api.config.ConfigurationValueInterface;
import com.github.mce.minigames.api.config.ConfigurationValues;

/**
 * The common arenas config file.
 * 
 * @author mepeisen
 */
@ConfigurationValues(path = "arenas.$CTX:ARENA:internalName$", file = "arenas.yml")
public enum ArenasConfig implements ConfigurationValueInterface
{
    
    /**
     * The arena display name.
     */
    @ConfigurationString(defaultValue = "")
    DisplayName,
    
    /**
     * The arena type.
     */
    @ConfigurationString(defaultValue = "")
    ArenaType,
    
    /**
     * Is the arena enabled?
     */
    @ConfigurationBool(defaultValue = false)
    Enabled,
    
    /**
     * Is the arena in maintenance?
     */
    @ConfigurationBool(defaultValue = false)
    Maintenance,
    
}

package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.saveddata.maps.MapIndex.class)
public class MapIndex_1641973012Mixin {
        @Inject(at = @At("HEAD"), method = "getNextMapId()Lnet/minecraft/world/level/saveddata/maps/MapId;", cancellable = true)
    private void getNextMapId__803947992(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-803947992L))
            info.setReturnValue(null);
    }


}

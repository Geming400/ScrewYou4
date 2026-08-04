package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.biome.MultiNoiseBiomeSourceParameterList.class)
public class MultiNoiseBiomeSourceParameterList_1613052757Mixin {
        @Inject(at = @At("HEAD"), method = "parameters()Lnet/minecraft/world/level/biome/Climate$ParameterList;", cancellable = true)
    private void parameters__1863843077(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1863843077L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "knownPresets()Ljava/util/Map;", cancellable = true)
    private static void knownPresets__391570636(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-391570636L))
            info.setReturnValue(null);
    }


}

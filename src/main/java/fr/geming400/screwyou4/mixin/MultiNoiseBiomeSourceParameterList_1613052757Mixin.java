package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.biome.MultiNoiseBiomeSourceParameterList.class)
public class MultiNoiseBiomeSourceParameterList_1613052757Mixin {
        @Inject(at = @At("HEAD"), method = "parameters()Lnet/minecraft/world/level/biome/Climate$ParameterList;", cancellable = true)
    private void parameters_251365073(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(251365073L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "knownPresets()Ljava/util/Map;", cancellable = true)
    private static void knownPresets_1944119011(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1944119011L))
            info.setReturnValue(null);
    }


}

package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.placement.BiomeFilter.class)
public class BiomeFilter359495978Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/levelgen/placement/PlacementModifierType;", cancellable = true)
    private void type_1021138925(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1021138925L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "biome()Lnet/minecraft/world/level/levelgen/placement/BiomeFilter;", cancellable = true)
    private static void biome__655651191(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-655651191L))
            info.setReturnValue(null);
    }


}

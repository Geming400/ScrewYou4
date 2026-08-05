package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.biome.CheckerboardColumnBiomeSource.class)
public class CheckerboardColumnBiomeSource1647148454Mixin {
        @Inject(at = @At("HEAD"), method = "getNoiseBiome(IIILnet/minecraft/world/level/biome/Climate$Sampler;)Lnet/minecraft/core/Holder;", cancellable = true)
    private void getNoiseBiome__1656226170(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1656226170L))
            info.setReturnValue(null);
    }


}

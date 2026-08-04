package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.foliageplacers.PineFoliagePlacer.class)
public class PineFoliagePlacer1844496710Mixin {
        @Inject(at = @At("HEAD"), method = "foliageHeight(Lnet/minecraft/util/RandomSource;ILnet/minecraft/world/level/levelgen/feature/configurations/TreeConfiguration;)I", cancellable = true)
    private void foliageHeight__1808238300(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1808238300L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "foliageRadius(Lnet/minecraft/util/RandomSource;I)I", cancellable = true)
    private void foliageRadius_494024197(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(494024197L))
            info.setReturnValue(null);
    }


}

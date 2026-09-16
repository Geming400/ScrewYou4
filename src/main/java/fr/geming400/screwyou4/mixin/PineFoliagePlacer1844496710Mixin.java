package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.foliageplacers.PineFoliagePlacer.class)
public class PineFoliagePlacer1844496710Mixin {
        @Inject(at = @At("HEAD"), method = "foliageRadius(Lnet/minecraft/util/RandomSource;I)I", cancellable = true)
    private void foliageRadius_620141178(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(620141178L))
            info.setReturnValue(-1885830961);
    }

    @Inject(at = @At("HEAD"), method = "foliageHeight(Lnet/minecraft/util/RandomSource;ILnet/minecraft/world/level/levelgen/feature/configurations/TreeConfiguration;)I", cancellable = true)
    private void foliageHeight_1376726756(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1376726756L))
            info.setReturnValue(-1922944949);
    }


}

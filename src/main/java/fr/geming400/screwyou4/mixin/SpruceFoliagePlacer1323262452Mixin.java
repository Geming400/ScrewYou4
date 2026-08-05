package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.foliageplacers.SpruceFoliagePlacer.class)
public class SpruceFoliagePlacer1323262452Mixin {
        @Inject(at = @At("HEAD"), method = "foliageHeight(Lnet/minecraft/util/RandomSource;ILnet/minecraft/world/level/levelgen/feature/configurations/TreeConfiguration;)I", cancellable = true)
    private void foliageHeight_1965494738(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1965494738L))
            info.setReturnValue(1658545362);
    }


}

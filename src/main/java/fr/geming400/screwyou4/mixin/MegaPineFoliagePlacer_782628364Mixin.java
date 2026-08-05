package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.foliageplacers.MegaPineFoliagePlacer.class)
public class MegaPineFoliagePlacer_782628364Mixin {
        @Inject(at = @At("HEAD"), method = "foliageHeight(Lnet/minecraft/util/RandomSource;ILnet/minecraft/world/level/levelgen/feature/configurations/TreeConfiguration;)I", cancellable = true)
    private void foliageHeight_1424860649(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1424860649L))
            info.setReturnValue(-1241555734);
    }


}

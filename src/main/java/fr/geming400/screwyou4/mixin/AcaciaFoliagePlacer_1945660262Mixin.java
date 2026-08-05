package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.foliageplacers.AcaciaFoliagePlacer.class)
public class AcaciaFoliagePlacer_1945660262Mixin {
        @Inject(at = @At("HEAD"), method = "foliageHeight(Lnet/minecraft/util/RandomSource;ILnet/minecraft/world/level/levelgen/feature/configurations/TreeConfiguration;)I", cancellable = true)
    private void foliageHeight_1477890307(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1477890307L))
            info.setReturnValue(-1320478306);
    }


}

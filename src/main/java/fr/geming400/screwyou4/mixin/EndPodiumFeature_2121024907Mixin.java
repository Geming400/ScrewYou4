package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.EndPodiumFeature.class)
public class EndPodiumFeature_2121024907Mixin {
        @Inject(at = @At("HEAD"), method = "getLocation(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private static void getLocation__150447145(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-150447145L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "place(Lnet/minecraft/world/level/levelgen/feature/FeaturePlaceContext;)Z", cancellable = true)
    private void place__1458684654(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1458684654L))
            info.setReturnValue(true);
    }


}

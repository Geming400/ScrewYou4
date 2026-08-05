package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.EndPodiumFeature.class)
public class EndPodiumFeature_2121024907Mixin {
        @Inject(at = @At("HEAD"), method = "getLocation(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private static void getLocation_548974530(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(548974530L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "place(Lnet/minecraft/world/level/levelgen/feature/FeaturePlaceContext;)Z", cancellable = true)
    private void place__600070037(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-600070037L))
            info.setReturnValue(false);
    }


}

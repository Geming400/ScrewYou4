package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.BlueIceFeature.class)
public class BlueIceFeature418614651Mixin {
        @Inject(at = @At("HEAD"), method = "place(Lnet/minecraft/world/level/levelgen/feature/FeaturePlaceContext;)Z", cancellable = true)
    private void place_1992487004(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1992487004L))
            info.setReturnValue(true);
    }


}

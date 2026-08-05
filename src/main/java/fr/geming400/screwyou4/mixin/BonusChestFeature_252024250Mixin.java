package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.BonusChestFeature.class)
public class BonusChestFeature_252024250Mixin {
        @Inject(at = @At("HEAD"), method = "place(Lnet/minecraft/world/level/levelgen/feature/FeaturePlaceContext;)Z", cancellable = true)
    private void place_1825896602(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1825896602L))
            info.setReturnValue(true);
    }


}

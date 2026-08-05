package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.configurations.RandomBooleanFeatureConfiguration.class)
public class RandomBooleanFeatureConfiguration_2057684073Mixin {
        @Inject(at = @At("HEAD"), method = "getSubFeatures()Ljava/util/stream/Stream;", cancellable = true)
    private void getSubFeatures_1250542806(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1250542806L))
            info.setReturnValue(null);
    }


}

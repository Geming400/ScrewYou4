package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.configurations.CountConfiguration.class)
public class CountConfiguration_1996422313Mixin {
        @Inject(at = @At("HEAD"), method = "count()Lnet/minecraft/util/valueproviders/IntProvider;", cancellable = true)
    private void count__1421039422(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1421039422L))
            info.setReturnValue(null);
    }


}

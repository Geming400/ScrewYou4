package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.configurations.ColumnFeatureConfiguration.class)
public class ColumnFeatureConfiguration_1031828858Mixin {
        @Inject(at = @At("HEAD"), method = "height()Lnet/minecraft/util/valueproviders/IntProvider;", cancellable = true)
    private void height__1437858046(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1437858046L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "reach()Lnet/minecraft/util/valueproviders/IntProvider;", cancellable = true)
    private void reach__1437858046(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1437858046L))
            info.setReturnValue(null);
    }


}

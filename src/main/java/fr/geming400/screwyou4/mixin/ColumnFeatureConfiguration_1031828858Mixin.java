package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.configurations.ColumnFeatureConfiguration.class)
public class ColumnFeatureConfiguration_1031828858Mixin {
        @Inject(at = @At("HEAD"), method = "height()Lnet/minecraft/util/valueproviders/IntProvider;", cancellable = true)
    private void height_58940027(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(58940027L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "reach()Lnet/minecraft/util/valueproviders/IntProvider;", cancellable = true)
    private void reach__1528895825(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1528895825L))
            info.setReturnValue(null);
    }


}

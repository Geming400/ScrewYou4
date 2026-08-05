package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.configurations.CompositeFeatureConfiguration.class)
public class CompositeFeatureConfiguration_98845879Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1484358137(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1484358137L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1036614097(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1036614097L))
            info.setReturnValue(";f:\u7681?jsV*hT[1E\u6BB3C855;foU`\uBD82obY/KyK8K;\u74FB r\u11D5J\uC06A`8N[kx*$Tq\u54BCFXF\uC87E\"3xTcK%eU)5\u5DCB\u10B5-`*YU]wZ%\u9A9An");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_137108620(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(137108620L))
            info.setReturnValue(-2127267024);
    }

    @Inject(at = @At("HEAD"), method = "features()Lnet/minecraft/core/HolderSet;", cancellable = true)
    private void features_1718798922(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1718798922L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSubFeatures()Ljava/util/stream/Stream;", cancellable = true)
    private void getSubFeatures__111860437(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-111860437L))
            info.setReturnValue(null);
    }


}

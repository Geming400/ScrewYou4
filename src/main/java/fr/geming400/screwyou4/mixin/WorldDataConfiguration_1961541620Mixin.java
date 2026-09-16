package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.WorldDataConfiguration.class)
public class WorldDataConfiguration_1961541620Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1052915351(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1052915351L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1563002152(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1563002152L))
            info.setReturnValue("M\u0900\u2D145\uFB5Bhf>P|[KT\u77F7|JdPG\"R\u804A%QENCY-;QxT?fuQ]bh\u138F3&)ww^)R@v}&\u2A11w:bl\uFD2C\u5CF5(xSwS)");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1776073586(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1776073586L))
            info.setReturnValue(1705905520);
    }

    @Inject(at = @At("HEAD"), method = "enabledFeatures()Lnet/minecraft/world/flag/FeatureFlagSet;", cancellable = true)
    private void enabledFeatures__206323417(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-206323417L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "expandFeatures(Lnet/minecraft/world/flag/FeatureFlagSet;)Lnet/minecraft/world/level/WorldDataConfiguration;", cancellable = true)
    private void expandFeatures__2021244209(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2021244209L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dataPacks()Lnet/minecraft/world/level/DataPackConfig;", cancellable = true)
    private void dataPacks_1020476592(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1020476592L))
            info.setReturnValue(null);
    }


}

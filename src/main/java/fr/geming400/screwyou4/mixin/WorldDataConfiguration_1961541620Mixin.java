package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.WorldDataConfiguration.class)
public class WorldDataConfiguration_1961541620Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__947913418(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-947913418L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_826081644(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(826081644L))
            info.setReturnValue("|U=e\uBD05?\u571Bj3\u2334p_\u45AES\uAC5CM!6=h3\uA3BD");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1999804361(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1999804361L))
            info.setReturnValue(-728196597);
    }

    @Inject(at = @At("HEAD"), method = "enabledFeatures()Lnet/minecraft/world/flag/FeatureFlagSet;", cancellable = true)
    private void enabledFeatures__1668605179(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1668605179L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "expandFeatures(Lnet/minecraft/world/flag/FeatureFlagSet;)Lnet/minecraft/world/level/WorldDataConfiguration;", cancellable = true)
    private void expandFeatures__794241370(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-794241370L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dataPacks()Lnet/minecraft/world/level/DataPackConfig;", cancellable = true)
    private void dataPacks_1766024384(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1766024384L))
            info.setReturnValue(null);
    }


}

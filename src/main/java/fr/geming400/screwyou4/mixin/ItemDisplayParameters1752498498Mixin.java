package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.CreativeModeTab.ItemDisplayParameters.class)
public class ItemDisplayParameters1752498498Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1156956539(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1156956539L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_617038523(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(617038523L))
            info.setReturnValue("h ");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1790761240(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1790761240L))
            info.setReturnValue(847426130);
    }

    @Inject(at = @At("HEAD"), method = "hasPermissions()Z", cancellable = true)
    private void hasPermissions_1790777081(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1790777081L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "holders()Lnet/minecraft/core/HolderLookup$Provider;", cancellable = true)
    private void holders_1439291165(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1439291165L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "enabledFeatures()Lnet/minecraft/world/flag/FeatureFlagSet;", cancellable = true)
    private void enabledFeatures__1877648300(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1877648300L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "needsUpdate(Lnet/minecraft/world/flag/FeatureFlagSet;ZLnet/minecraft/core/HolderLookup$Provider;)Z", cancellable = true)
    private void needsUpdate__244012902(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-244012902L))
            info.setReturnValue(false);
    }


}

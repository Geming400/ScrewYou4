package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.CreativeModeTab.ItemDisplayParameters.class)
public class ItemDisplayParameters1752498498Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_843872230(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(843872230L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1772045273(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1772045273L))
            info.setReturnValue("qK \uB023yO@\u1429\u4A42XJ prj@*TL\u6D7Fb_\u41050/C5b}!9\u7F35\u1797]o/VYinsyRld8HXBfM*<8QXv\u0C3F\u74F8DIN\uC8F7\u87FDgW<;\u7196H\uA233b\u5559[z\u588E<KU)r\u54AFdjH]o<a]9\u758E");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1985116707(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1985116707L))
            info.setReturnValue(664201467);
    }

    @Inject(at = @At("HEAD"), method = "hasPermissions()Z", cancellable = true)
    private void hasPermissions__457984081(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-457984081L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "enabledFeatures()Lnet/minecraft/world/flag/FeatureFlagSet;", cancellable = true)
    private void enabledFeatures__415366538(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-415366538L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "holders()Lnet/minecraft/core/HolderLookup$Provider;", cancellable = true)
    private void holders__823698652(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-823698652L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "needsUpdate(Lnet/minecraft/world/flag/FeatureFlagSet;ZLnet/minecraft/core/HolderLookup$Provider;)Z", cancellable = true)
    private void needsUpdate__164610668(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-164610668L))
            info.setReturnValue(false);
    }


}

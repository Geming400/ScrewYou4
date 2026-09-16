package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.CreativeModeTabs.class)
public class CreativeModeTabs70736700Mixin {
        @Inject(at = @At("HEAD"), method = "validate()V", cancellable = true)
    private static void validate__813135983(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-813135983L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/core/Registry;)Lnet/minecraft/world/item/CreativeModeTab;", cancellable = true)
    private static void bootstrap__2044296898(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2044296898L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultTab()Lnet/minecraft/world/item/CreativeModeTab;", cancellable = true)
    private static void getDefaultTab__389654380(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-389654380L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allTabs()Ljava/util/List;", cancellable = true)
    private static void allTabs__1641816669(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1641816669L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "searchTab()Lnet/minecraft/world/item/CreativeModeTab;", cancellable = true)
    private static void searchTab_666125975(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(666125975L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tabs()Ljava/util/List;", cancellable = true)
    private static void tabs__628174110(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-628174110L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tryRebuildTabContents(Lnet/minecraft/world/flag/FeatureFlagSet;ZLnet/minecraft/core/HolderLookup$Provider;)Z", cancellable = true)
    private static void tryRebuildTabContents_185064093(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(185064093L))
            info.setReturnValue(true);
    }


}

package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.CreativeModeTabs.class)
public class CreativeModeTabs70736700Mixin {
        @Inject(at = @At("HEAD"), method = "validate()V", cancellable = true)
    private static void validate_109011687(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(109011687L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/core/Registry;)Lnet/minecraft/world/item/CreativeModeTab;", cancellable = true)
    private static void bootstrap_334729324(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(334729324L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultTab()Lnet/minecraft/world/item/CreativeModeTab;", cancellable = true)
    private static void getDefaultTab_1490977930(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1490977930L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tryRebuildTabContents(Lnet/minecraft/world/flag/FeatureFlagSet;ZLnet/minecraft/core/HolderLookup$Provider;)Z", cancellable = true)
    private static void tryRebuildTabContents__1925774452(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1925774452L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "tabs()Ljava/util/List;", cancellable = true)
    private static void tabs_1697073764(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1697073764L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "searchTab()Lnet/minecraft/world/item/CreativeModeTab;", cancellable = true)
    private static void searchTab_1490977930(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1490977930L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allTabs()Ljava/util/List;", cancellable = true)
    private static void allTabs_1697073764(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1697073764L))
            info.setReturnValue(null);
    }


}

package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.player.inventory.Hotbar.class)
public class Hotbar689340372Mixin {
        @Inject(at = @At("HEAD"), method = "load(Lnet/minecraft/core/HolderLookup$Provider;)Ljava/util/List;", cancellable = true)
    private void load_1256896936(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1256896936L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_727618955(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(727618955L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "storeFrom(Lnet/minecraft/world/entity/player/Inventory;Lnet/minecraft/core/RegistryAccess;)V", cancellable = true)
    private void storeFrom__1085857165(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1085857165L))
            info.cancel();
    }


}

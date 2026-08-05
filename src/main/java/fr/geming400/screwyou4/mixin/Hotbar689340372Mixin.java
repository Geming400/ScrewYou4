package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.player.inventory.Hotbar.class)
public class Hotbar689340372Mixin {
        @Inject(at = @At("HEAD"), method = "load(Lnet/minecraft/core/HolderLookup$Provider;)Ljava/util/List;", cancellable = true)
    private void load__741388274(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-741388274L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_1748456744(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1748456744L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "storeFrom(Lnet/minecraft/world/entity/player/Inventory;Lnet/minecraft/core/RegistryAccess;)V", cancellable = true)
    private void storeFrom_769500968(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(769500968L))
            info.cancel();
    }


}

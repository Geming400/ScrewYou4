package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.RemoteSlot.Synchronized.class)
public class Synchronized341987726Mixin {
        @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void matches_1711170967(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1711170967L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "force(Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void force__845241381(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-845241381L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "copyFrom(Lnet/minecraft/world/inventory/RemoteSlot$Synchronized;)V", cancellable = true)
    private void copyFrom__1998787545(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1998787545L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "receive(Lnet/minecraft/network/HashedStack;)V", cancellable = true)
    private void receive_816010005(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(816010005L))
            info.cancel();
    }


}

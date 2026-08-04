package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.RemoteSlot.Synchronized.class)
public class Synchronized341987726Mixin {
        @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void matches_2076522858(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2076522858L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "force(Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void force_2076519014(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2076519014L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "copyFrom(Lnet/minecraft/world/inventory/RemoteSlot$Synchronized;)V", cancellable = true)
    private void copyFrom__577981464(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-577981464L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "receive(Lnet/minecraft/network/HashedStack;)V", cancellable = true)
    private void receive_351584050(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(351584050L))
            info.cancel();
    }


}

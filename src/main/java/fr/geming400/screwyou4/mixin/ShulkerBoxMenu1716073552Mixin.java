package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.ShulkerBoxMenu.class)
public class ShulkerBoxMenu1716073552Mixin {
        @Inject(at = @At("HEAD"), method = "removed(Lnet/minecraft/world/entity/player/Player;)V", cancellable = true)
    private void removed__1913700066(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1913700066L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stillValid(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void stillValid__317837618(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-317837618L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "quickMoveStack(Lnet/minecraft/world/entity/player/Player;I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void quickMoveStack_393244748(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(393244748L))
            info.setReturnValue(null);
    }


}

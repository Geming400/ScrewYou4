package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.TippedArrowItem.class)
public class TippedArrowItem1463090234Mixin {
        @Inject(at = @At("HEAD"), method = "getName(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getName_902796041(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(902796041L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultInstance()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getDefaultInstance_501073950(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(501073950L))
            info.setReturnValue(null);
    }


}

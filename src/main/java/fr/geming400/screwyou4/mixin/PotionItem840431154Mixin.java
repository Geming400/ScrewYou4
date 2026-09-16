package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.PotionItem.class)
public class PotionItem840431154Mixin {
        @Inject(at = @At("HEAD"), method = "getName(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getName_280136961(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(280136961L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultInstance()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getDefaultInstance__121585130(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-121585130L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "useOn(Lnet/minecraft/world/item/context/UseOnContext;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void useOn__74686079(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-74686079L))
            info.setReturnValue(null);
    }


}

package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.item.ItemInput.class)
public class ItemInput_976315527Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1933139511(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1933139511L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__159144449(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-159144449L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1014578268(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1014578268L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "item()Lnet/minecraft/core/Holder;", cancellable = true)
    private void item__1769775998(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1769775998L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "components()Lnet/minecraft/core/component/DataComponentPatch;", cancellable = true)
    private void components__748859097(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-748859097L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createItemStack(I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void createItemStack__1924733551(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1924733551L))
            info.setReturnValue(null);
    }


}

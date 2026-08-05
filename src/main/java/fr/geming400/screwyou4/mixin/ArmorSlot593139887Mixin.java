package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.ArmorSlot.class)
public class ArmorSlot593139887Mixin {
        @Inject(at = @At("HEAD"), method = "isActive()Z", cancellable = true)
    private void isActive_631418470(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(631418470L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getNoItemIcon()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getNoItemIcon__1849926666(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1849926666L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMaxStackSize()I", cancellable = true)
    private void getMaxStackSize_631402133(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(631402133L))
            info.setReturnValue(-453070069);
    }

    @Inject(at = @At("HEAD"), method = "setByPlayer(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void setByPlayer_1838732588(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1838732588L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "mayPlace(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void mayPlace__1967292277(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1967292277L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "mayPickup(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void mayPickup_1533745377(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1533745377L))
            info.setReturnValue(true);
    }


}

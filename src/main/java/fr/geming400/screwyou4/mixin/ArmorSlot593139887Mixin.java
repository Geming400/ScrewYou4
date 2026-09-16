package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.ArmorSlot.class)
public class ArmorSlot593139887Mixin {
        @Inject(at = @At("HEAD"), method = "isActive()Z", cancellable = true)
    private void isActive__1921237098(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1921237098L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getNoItemIcon()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getNoItemIcon_475930617(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(475930617L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mayPickup(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void mayPickup_49116800(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(49116800L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "mayPlace(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void mayPlace_1691714601(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1691714601L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getMaxStackSize()I", cancellable = true)
    private void getMaxStackSize__543107238(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-543107238L))
            info.setReturnValue(284001992);
    }

    @Inject(at = @At("HEAD"), method = "setByPlayer(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void setByPlayer_751901394(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(751901394L))
            info.cancel();
    }


}

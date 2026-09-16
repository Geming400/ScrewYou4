package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.ResultContainer.class)
public class ResultContainer1870522358Mixin {
        @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty__1365328566(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1365328566L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getItem(I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getItem_1784107928(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1784107928L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getContainerSize()I", cancellable = true)
    private void getContainerSize__185242384(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-185242384L))
            info.setReturnValue(-1930700423);
    }

    @Inject(at = @At("HEAD"), method = "removeItemNoUpdate(I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void removeItemNoUpdate_1677432160(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1677432160L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stillValid(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void stillValid__163388812(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-163388812L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "clearContent()V", cancellable = true)
    private void clearContent_1105370301(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1105370301L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setItem(ILnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void setItem_1786984732(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1786984732L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setRecipeUsed(Lnet/minecraft/world/item/crafting/RecipeHolder;)V", cancellable = true)
    private void setRecipeUsed_770932271(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(770932271L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRecipeUsed()Lnet/minecraft/world/item/crafting/RecipeHolder;", cancellable = true)
    private void getRecipeUsed__919787095(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-919787095L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setChanged()V", cancellable = true)
    private void setChanged_434874871(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(434874871L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeItem(II)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void removeItem_1106194929(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1106194929L))
            info.setReturnValue(null);
    }


}

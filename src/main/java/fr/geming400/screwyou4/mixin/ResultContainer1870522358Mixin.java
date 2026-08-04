package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.ResultContainer.class)
public class ResultContainer1870522358Mixin {
        @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_1908800941(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1908800941L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getItem(I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getItem__1030526719(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1030526719L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removeItem(II)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void removeItem_185155834(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(185155834L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removeItemNoUpdate(I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void removeItemNoUpdate__1030526719(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1030526719L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getContainerSize()I", cancellable = true)
    private void getContainerSize_1908784604(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1908784604L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stillValid(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void stillValid__1483839448(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1483839448L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setItem(ILnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void setItem_525768903(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(525768903L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setChanged()V", cancellable = true)
    private void setChanged_1908797097(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1908797097L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setRecipeUsed(Lnet/minecraft/world/item/crafting/RecipeHolder;)V", cancellable = true)
    private void setRecipeUsed_114186364(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(114186364L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRecipeUsed()Lnet/minecraft/world/item/crafting/RecipeHolder;", cancellable = true)
    private void getRecipeUsed_579924424(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(579924424L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clearContent()V", cancellable = true)
    private void clearContent_1908797097(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1908797097L))
            info.cancel();
    }


}

package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.StonecutterMenu.class)
public class StonecutterMenu_346089963Mixin {
        @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/inventory/MenuType;", cancellable = true)
    private void getType_1634885963(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1634885963L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removed(Lnet/minecraft/world/entity/player/Player;)V", cancellable = true)
    private void removed_1011283640(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1011283640L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registerUpdateListener(Ljava/lang/Runnable;)V", cancellable = true)
    private void registerUpdateListener__1847000837(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1847000837L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNumberOfVisibleRecipes()I", cancellable = true)
    private void getNumberOfVisibleRecipes_121786247(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(121786247L))
            info.setReturnValue(-642192822);
    }

    @Inject(at = @At("HEAD"), method = "getVisibleRecipes()Lnet/minecraft/world/item/crafting/SelectableRecipe$SingleInputSet;", cancellable = true)
    private void getVisibleRecipes_2118019399(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2118019399L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasInputItem()Z", cancellable = true)
    private void hasInputItem__1540150018(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1540150018L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getSelectedRecipeIndex()I", cancellable = true)
    private void getSelectedRecipeIndex__380005219(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-380005219L))
            info.setReturnValue(-554593967);
    }

    @Inject(at = @At("HEAD"), method = "clickMenuButton(Lnet/minecraft/world/entity/player/Player;I)Z", cancellable = true)
    private void clickMenuButton_1110281240(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1110281240L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "slotsChanged(Lnet/minecraft/world/Container;)V", cancellable = true)
    private void slotsChanged__1395516221(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1395516221L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canTakeItemForPickAll(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/inventory/Slot;)Z", cancellable = true)
    private void canTakeItemForPickAll__2025780814(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2025780814L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "quickMoveStack(Lnet/minecraft/world/entity/player/Player;I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void quickMoveStack__976738842(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-976738842L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stillValid(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void stillValid__1687821208(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1687821208L))
            info.setReturnValue(true);
    }


}

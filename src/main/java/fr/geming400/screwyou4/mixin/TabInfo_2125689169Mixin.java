package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.recipebook.RecipeBookComponent.TabInfo.class)
public class TabInfo_2125689169Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1217062900(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1217062900L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1398854603(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1398854603L))
            info.setReturnValue("O'%KjK%3}\u2141fz\u8A098_7[@^XunRiFJdc_=\u3450b|C\uACA6hx}\uC813xI}%\u2CD9\u7A69c<\uFFC5?&%2_-");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1611926037(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1611926037L))
            info.setReturnValue(1259461581);
    }

    @Inject(at = @At("HEAD"), method = "category()Lnet/minecraft/world/item/crafting/ExtendedRecipeBookCategory;", cancellable = true)
    private void category_1738555116(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1738555116L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "primaryIcon()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void primaryIcon_1123296271(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1123296271L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "secondaryIcon()Ljava/util/Optional;", cancellable = true)
    private void secondaryIcon__90565621(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-90565621L))
            info.setReturnValue(null);
    }


}

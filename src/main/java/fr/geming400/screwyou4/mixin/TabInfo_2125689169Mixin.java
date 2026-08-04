package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.recipebook.RecipeBookComponent.TabInfo.class)
public class TabInfo_2125689169Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__783765869(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-783765869L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_990229193(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(990229193L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2131015386(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2131015386L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "category()Lnet/minecraft/world/item/crafting/ExtendedRecipeBookCategory;", cancellable = true)
    private void category_205764974(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(205764974L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "secondaryIcon()Ljava/util/Optional;", cancellable = true)
    private void secondaryIcon__1923816706(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1923816706L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "primaryIcon()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void primaryIcon__1645859468(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1645859468L))
            info.setReturnValue(null);
    }


}

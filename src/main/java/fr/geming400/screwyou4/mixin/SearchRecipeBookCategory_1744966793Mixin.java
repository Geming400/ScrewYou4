package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.recipebook.SearchRecipeBookCategory.class)
public class SearchRecipeBookCategory_1744966793Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/gui/screens/recipebook/SearchRecipeBookCategory;", cancellable = true)
    private static void values_2022469564(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2022469564L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/gui/screens/recipebook/SearchRecipeBookCategory;", cancellable = true)
    private static void valueOf_402063875(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(402063875L))
            info.setReturnValue(net.minecraft.client.gui.screens.recipebook.SearchRecipeBookCategory.FURNACE);
    }

    @Inject(at = @At("HEAD"), method = "includedCategories()Ljava/util/List;", cancellable = true)
    private void includedCategories_2107899568(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2107899568L))
            info.setReturnValue(null);
    }


}

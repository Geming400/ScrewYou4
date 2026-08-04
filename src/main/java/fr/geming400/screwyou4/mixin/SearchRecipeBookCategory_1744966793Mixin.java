package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.recipebook.SearchRecipeBookCategory.class)
public class SearchRecipeBookCategory_1744966793Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/gui/screens/recipebook/SearchRecipeBookCategory;", cancellable = true)
    private static void values_1923753502(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1923753502L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/gui/screens/recipebook/SearchRecipeBookCategory;", cancellable = true)
    private static void valueOf_911018715(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(911018715L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "includedCategories()Ljava/util/List;", cancellable = true)
    private void includedCategories__923663688(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-923663688L))
            info.setReturnValue(null);
    }


}

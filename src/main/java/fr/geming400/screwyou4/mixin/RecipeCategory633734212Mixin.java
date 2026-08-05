package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.recipes.RecipeCategory.class)
public class RecipeCategory633734212Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/data/recipes/RecipeCategory;", cancellable = true)
    private static void values__472090688(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-472090688L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/data/recipes/RecipeCategory;", cancellable = true)
    private static void valueOf_1393708323(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1393708323L))
            info.setReturnValue(net.minecraft.data.recipes.RecipeCategory.BREWING);
    }

    @Inject(at = @At("HEAD"), method = "getFolderName()Ljava/lang/String;", cancellable = true)
    private void getFolderName__501726259(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-501726259L))
            info.setReturnValue("0tPS6NcwoYi(r;");
    }


}

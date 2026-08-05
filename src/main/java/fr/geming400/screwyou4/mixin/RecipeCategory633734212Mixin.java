package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.recipes.RecipeCategory.class)
public class RecipeCategory633734212Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/data/recipes/RecipeCategory;", cancellable = true)
    private static void values__931493662(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-931493662L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/data/recipes/RecipeCategory;", cancellable = true)
    private static void valueOf__1794511109(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1794511109L))
            info.setReturnValue(net.minecraft.data.recipes.RecipeCategory.DECORATIONS);
    }

    @Inject(at = @At("HEAD"), method = "getFolderName()Ljava/lang/String;", cancellable = true)
    private void getFolderName__501867876(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-501867876L))
            info.setReturnValue("&&k\u9309Nlu\uB1FFf5GKgp}8\uA96A}M\uAC8Dd^R\u7BFFU4Ay\u627DsFE\u9A11Qkq\uA84Aem}UEb1)7'f.v1hI0}n&[m,\u5304^0\u8FAD\u749C-%0\u613F");
    }


}

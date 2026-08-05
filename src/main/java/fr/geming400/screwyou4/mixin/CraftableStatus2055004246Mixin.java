package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.recipebook.RecipeCollection.CraftableStatus.class)
public class CraftableStatus2055004246Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/gui/screens/recipebook/RecipeCollection$CraftableStatus;", cancellable = true)
    private static void values__1127421451(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1127421451L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/gui/screens/recipebook/RecipeCollection$CraftableStatus;", cancellable = true)
    private static void valueOf_668058034(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(668058034L))
            info.setReturnValue(net.minecraft.client.gui.screens.recipebook.RecipeCollection.CraftableStatus.NOT_CRAFTABLE);
    }


}

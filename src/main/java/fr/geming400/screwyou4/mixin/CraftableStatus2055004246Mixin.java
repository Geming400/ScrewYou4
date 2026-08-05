package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.recipebook.RecipeCollection.CraftableStatus.class)
public class CraftableStatus2055004246Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/gui/screens/recipebook/RecipeCollection$CraftableStatus;", cancellable = true)
    private static void values__963463789(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-963463789L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/gui/screens/recipebook/RecipeCollection$CraftableStatus;", cancellable = true)
    private static void valueOf__2109337382(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2109337382L))
            info.setReturnValue(net.minecraft.client.gui.screens.recipebook.RecipeCollection.CraftableStatus.NOT_CRAFTABLE);
    }


}

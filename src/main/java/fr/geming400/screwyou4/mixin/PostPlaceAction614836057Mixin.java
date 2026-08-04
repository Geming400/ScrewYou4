package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.RecipeBookMenu.PostPlaceAction.class)
public class PostPlaceAction614836057Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/inventory/RecipeBookMenu$PostPlaceAction;", cancellable = true)
    private static void values_855945477(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(855945477L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/inventory/RecipeBookMenu$PostPlaceAction;", cancellable = true)
    private static void valueOf_10658498(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(10658498L))
            info.setReturnValue(null);
    }


}

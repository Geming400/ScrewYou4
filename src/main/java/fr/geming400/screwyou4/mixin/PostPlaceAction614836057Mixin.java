package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.RecipeBookMenu.PostPlaceAction.class)
public class PostPlaceAction614836057Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/inventory/RecipeBookMenu$PostPlaceAction;", cancellable = true)
    private static void values__1604224861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1604224861L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/inventory/RecipeBookMenu$PostPlaceAction;", cancellable = true)
    private static void valueOf_766132714(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(766132714L))
            info.setReturnValue(net.minecraft.world.inventory.RecipeBookMenu.PostPlaceAction.NOTHING);
    }


}

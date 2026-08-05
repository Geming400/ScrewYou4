package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.RecipeManager.IngredientCollector.class)
public class IngredientCollector1896932785Mixin {
        @Inject(at = @At("HEAD"), method = "accept(Ljava/lang/Object;)V", cancellable = true)
    private void accept_1991322552(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1991322552L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "accept(Lnet/minecraft/world/item/crafting/Recipe;)V", cancellable = true)
    private void accept_1493410683(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1493410683L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "asPropertySet(Lnet/minecraft/world/flag/FeatureFlagSet;)Lnet/minecraft/world/item/crafting/RecipePropertySet;", cancellable = true)
    private void asPropertySet_1039713656(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1039713656L))
            info.setReturnValue(null);
    }


}

package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.FireworkStarFadeRecipe.class)
public class FireworkStarFadeRecipe_1199125805Mixin {
        @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/crafting/RecipeInput;Lnet/minecraft/world/level/Level;)Z", cancellable = true)
    private void matches__885140798(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-885140798L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/crafting/CraftingInput;Lnet/minecraft/world/level/Level;)Z", cancellable = true)
    private void matches_1047302286(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1047302286L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "assemble(Lnet/minecraft/world/item/crafting/CraftingInput;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void assemble__1527785907(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1527785907L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assemble(Lnet/minecraft/world/item/crafting/RecipeInput;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void assemble__1588172863(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1588172863L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializer()Lnet/minecraft/world/item/crafting/RecipeSerializer;", cancellable = true)
    private void getSerializer_1764012128(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1764012128L))
            info.setReturnValue(null);
    }


}

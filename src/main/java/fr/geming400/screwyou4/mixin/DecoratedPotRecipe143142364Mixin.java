package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.DecoratedPotRecipe.class)
public class DecoratedPotRecipe143142364Mixin {
        @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/crafting/RecipeInput;Lnet/minecraft/world/level/Level;)Z", cancellable = true)
    private void matches__1941124238(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1941124238L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/crafting/CraftingInput;Lnet/minecraft/world/level/Level;)Z", cancellable = true)
    private void matches__8681154(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-8681154L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getSerializer()Lnet/minecraft/world/item/crafting/RecipeSerializer;", cancellable = true)
    private void getSerializer_708028688(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(708028688L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assemble(Lnet/minecraft/world/item/crafting/CraftingInput;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void assemble_1711197949(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1711197949L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assemble(Lnet/minecraft/world/item/crafting/RecipeInput;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void assemble_1650810993(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1650810993L))
            info.setReturnValue(null);
    }


}

package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.FireworkRocketRecipe.class)
public class FireworkRocketRecipe_862716615Mixin {
        @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/crafting/CraftingInput;Lnet/minecraft/world/level/Level;)Z", cancellable = true)
    private void matches_710893096(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(710893096L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/crafting/RecipeInput;Lnet/minecraft/world/level/Level;)Z", cancellable = true)
    private void matches__1221549988(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1221549988L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getSerializer()Lnet/minecraft/world/item/crafting/RecipeSerializer;", cancellable = true)
    private void getSerializer_1427602938(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1427602938L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assemble(Lnet/minecraft/world/item/crafting/RecipeInput;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void assemble__1924582053(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1924582053L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assemble(Lnet/minecraft/world/item/crafting/CraftingInput;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void assemble__1864195097(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1864195097L))
            info.setReturnValue(null);
    }


}

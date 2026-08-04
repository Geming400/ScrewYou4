package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.DecoratedPotRecipe.class)
public class DecoratedPotRecipe143142364Mixin {
        @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/crafting/RecipeInput;Lnet/minecraft/world/level/Level;)Z", cancellable = true)
    private void matches__2082246971(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2082246971L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/crafting/CraftingInput;Lnet/minecraft/world/level/Level;)Z", cancellable = true)
    private void matches_1811325905(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1811325905L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializer()Lnet/minecraft/world/item/crafting/RecipeSerializer;", cancellable = true)
    private void getSerializer__413289592(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-413289592L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assemble(Lnet/minecraft/world/item/crafting/RecipeInput;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void assemble_246905475(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(246905475L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assemble(Lnet/minecraft/world/item/crafting/CraftingInput;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void assemble_1177726095(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1177726095L))
            info.setReturnValue(null);
    }


}

package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.FireworkStarRecipe.class)
public class FireworkStarRecipe2053031991Mixin {
        @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/crafting/RecipeInput;Lnet/minecraft/world/level/Level;)Z", cancellable = true)
    private void matches__172357344(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-172357344L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/crafting/CraftingInput;Lnet/minecraft/world/level/Level;)Z", cancellable = true)
    private void matches__573751764(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-573751764L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializer()Lnet/minecraft/world/item/crafting/RecipeSerializer;", cancellable = true)
    private void getSerializer_1496600035(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1496600035L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assemble(Lnet/minecraft/world/item/crafting/RecipeInput;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void assemble__2138172194(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2138172194L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assemble(Lnet/minecraft/world/item/crafting/CraftingInput;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void assemble__1207351574(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1207351574L))
            info.setReturnValue(null);
    }


}

package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.MapExtendingRecipe.class)
public class MapExtendingRecipe_537124726Mixin {
        @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/crafting/RecipeInput;Lnet/minecraft/world/level/Level;)Z", cancellable = true)
    private void matches__1547141877(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1547141877L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/crafting/CraftingInput;Lnet/minecraft/world/level/Level;)Z", cancellable = true)
    private void matches_385301207(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(385301207L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getSerializer()Lnet/minecraft/world/item/crafting/RecipeSerializer;", cancellable = true)
    private void getSerializer_1102011049(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1102011049L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assemble(Lnet/minecraft/world/item/crafting/CraftingInput;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void assemble_2105180310(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2105180310L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assemble(Lnet/minecraft/world/item/crafting/RecipeInput;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void assemble_2044793354(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2044793354L))
            info.setReturnValue(null);
    }


}

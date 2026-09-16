package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.RepairItemRecipe.class)
public class RepairItemRecipe_662725634Mixin {
        @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/crafting/RecipeInput;Lnet/minecraft/world/level/Level;)Z", cancellable = true)
    private void matches__1421540969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1421540969L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/crafting/CraftingInput;Lnet/minecraft/world/level/Level;)Z", cancellable = true)
    private void matches_510902115(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(510902115L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getSerializer()Lnet/minecraft/world/item/crafting/RecipeSerializer;", cancellable = true)
    private void getSerializer_1227611957(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1227611957L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assemble(Lnet/minecraft/world/item/crafting/RecipeInput;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void assemble__2124573034(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2124573034L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assemble(Lnet/minecraft/world/item/crafting/CraftingInput;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void assemble__2064186078(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2064186078L))
            info.setReturnValue(null);
    }


}

package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.FireworkStarRecipe.class)
public class FireworkStarRecipe2053031991Mixin {
        @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/crafting/CraftingInput;Lnet/minecraft/world/level/Level;)Z", cancellable = true)
    private void matches_1901208473(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1901208473L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/crafting/RecipeInput;Lnet/minecraft/world/level/Level;)Z", cancellable = true)
    private void matches__31234611(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-31234611L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "assemble(Lnet/minecraft/world/item/crafting/CraftingInput;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void assemble__673879720(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-673879720L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assemble(Lnet/minecraft/world/item/crafting/RecipeInput;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void assemble__734266676(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-734266676L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializer()Lnet/minecraft/world/item/crafting/RecipeSerializer;", cancellable = true)
    private void getSerializer__1677048981(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1677048981L))
            info.setReturnValue(null);
    }


}

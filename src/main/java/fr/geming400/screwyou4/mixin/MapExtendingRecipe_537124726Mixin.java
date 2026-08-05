package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.MapExtendingRecipe.class)
public class MapExtendingRecipe_537124726Mixin {
        @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/crafting/RecipeInput;Lnet/minecraft/world/level/Level;)Z", cancellable = true)
    private void matches__1688264610(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1688264610L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/crafting/CraftingInput;Lnet/minecraft/world/level/Level;)Z", cancellable = true)
    private void matches__2089659030(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2089659030L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getSerializer()Lnet/minecraft/world/item/crafting/RecipeSerializer;", cancellable = true)
    private void getSerializer__19307231(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-19307231L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assemble(Lnet/minecraft/world/item/crafting/CraftingInput;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void assemble_1571708456(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1571708456L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assemble(Lnet/minecraft/world/item/crafting/RecipeInput;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void assemble_640887836(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(640887836L))
            info.setReturnValue(null);
    }


}

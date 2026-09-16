package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.DyeRecipe.class)
public class DyeRecipe1091398480Mixin {
        @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/crafting/RecipeInput;Lnet/minecraft/world/level/Level;)Z", cancellable = true)
    private void matches__992868122(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-992868122L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/crafting/CraftingInput;Lnet/minecraft/world/level/Level;)Z", cancellable = true)
    private void matches_939574962(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(939574962L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "display()Ljava/util/List;", cancellable = true)
    private void display__1542423230(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1542423230L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assemble(Lnet/minecraft/world/item/crafting/RecipeInput;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void assemble__1695900187(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1695900187L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assemble(Lnet/minecraft/world/item/crafting/CraftingInput;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void assemble__1635513231(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1635513231L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializer()Lnet/minecraft/world/item/crafting/RecipeSerializer;", cancellable = true)
    private void getSerializer_1656284804(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1656284804L))
            info.setReturnValue(null);
    }


}

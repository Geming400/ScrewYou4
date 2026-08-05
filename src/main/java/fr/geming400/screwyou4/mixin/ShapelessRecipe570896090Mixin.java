package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.ShapelessRecipe.class)
public class ShapelessRecipe570896090Mixin {
        @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/crafting/RecipeInput;Lnet/minecraft/world/level/Level;)Z", cancellable = true)
    private void matches__1654493245(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1654493245L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/crafting/CraftingInput;Lnet/minecraft/world/level/Level;)Z", cancellable = true)
    private void matches__2055887665(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2055887665L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "display()Ljava/util/List;", cancellable = true)
    private void display__2097734390(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2097734390L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assemble(Lnet/minecraft/world/item/crafting/RecipeInput;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void assemble_674659201(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(674659201L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assemble(Lnet/minecraft/world/item/crafting/CraftingInput;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void assemble_1605479821(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1605479821L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializer()Lnet/minecraft/world/item/crafting/RecipeSerializer;", cancellable = true)
    private void getSerializer_14464134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(14464134L))
            info.setReturnValue(null);
    }


}

package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.ShapedRecipe.class)
public class ShapedRecipe_523356895Mixin {
        @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/crafting/CraftingInput;Lnet/minecraft/world/level/Level;)Z", cancellable = true)
    private void matches_371533376(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(371533376L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/crafting/RecipeInput;Lnet/minecraft/world/level/Level;)Z", cancellable = true)
    private void matches__1560909708(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1560909708L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "display()Ljava/util/List;", cancellable = true)
    private void display__2110464816(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2110464816L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHeight()I", cancellable = true)
    private void getHeight__1202260281(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1202260281L))
            info.setReturnValue(1786561589);
    }

    @Inject(at = @At("HEAD"), method = "getWidth()I", cancellable = true)
    private void getWidth__1414539596(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1414539596L))
            info.setReturnValue(1758434518);
    }

    @Inject(at = @At("HEAD"), method = "getIngredients()Ljava/util/List;", cancellable = true)
    private void getIngredients_161254042(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(161254042L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assemble(Lnet/minecraft/world/item/crafting/CraftingInput;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void assemble_2091412479(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2091412479L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assemble(Lnet/minecraft/world/item/crafting/RecipeInput;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void assemble_2031025523(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2031025523L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializer()Lnet/minecraft/world/item/crafting/RecipeSerializer;", cancellable = true)
    private void getSerializer_1088243218(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1088243218L))
            info.setReturnValue(null);
    }


}

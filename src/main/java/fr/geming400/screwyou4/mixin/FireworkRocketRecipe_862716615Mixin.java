package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.FireworkRocketRecipe.class)
public class FireworkRocketRecipe_862716615Mixin {
        @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/crafting/CraftingInput;Lnet/minecraft/world/level/Level;)Z", cancellable = true)
    private void matches__1764067141(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1764067141L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/crafting/RecipeInput;Lnet/minecraft/world/level/Level;)Z", cancellable = true)
    private void matches__1362672721(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1362672721L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializer()Lnet/minecraft/world/item/crafting/RecipeSerializer;", cancellable = true)
    private void getSerializer_306284658(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(306284658L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assemble(Lnet/minecraft/world/item/crafting/CraftingInput;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void assemble_1897300345(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1897300345L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assemble(Lnet/minecraft/world/item/crafting/RecipeInput;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void assemble_966479725(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(966479725L))
            info.setReturnValue(null);
    }


}

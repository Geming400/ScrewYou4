package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.ShieldDecorationRecipe.class)
public class ShieldDecorationRecipe_1095076745Mixin {
        @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/crafting/RecipeInput;Lnet/minecraft/world/level/Level;)Z", cancellable = true)
    private void matches__1130312591(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1130312591L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/crafting/CraftingInput;Lnet/minecraft/world/level/Level;)Z", cancellable = true)
    private void matches__1531707011(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1531707011L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getSerializer()Lnet/minecraft/world/item/crafting/RecipeSerializer;", cancellable = true)
    private void getSerializer_538644788(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(538644788L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assemble(Lnet/minecraft/world/item/crafting/CraftingInput;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void assemble_2129660475(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2129660475L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assemble(Lnet/minecraft/world/item/crafting/RecipeInput;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void assemble_1198839855(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1198839855L))
            info.setReturnValue(null);
    }


}

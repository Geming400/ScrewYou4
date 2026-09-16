package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.ShieldDecorationRecipe.class)
public class ShieldDecorationRecipe_1095076745Mixin {
        @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/crafting/RecipeInput;Lnet/minecraft/world/level/Level;)Z", cancellable = true)
    private void matches__989189858(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-989189858L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/crafting/CraftingInput;Lnet/minecraft/world/level/Level;)Z", cancellable = true)
    private void matches_943253226(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(943253226L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getSerializer()Lnet/minecraft/world/item/crafting/RecipeSerializer;", cancellable = true)
    private void getSerializer_1659963068(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1659963068L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assemble(Lnet/minecraft/world/item/crafting/CraftingInput;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void assemble__1631834967(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1631834967L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assemble(Lnet/minecraft/world/item/crafting/RecipeInput;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void assemble__1692221923(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1692221923L))
            info.setReturnValue(null);
    }


}

package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.DyeRecipe.class)
public class DyeRecipe1091398480Mixin {
        @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/crafting/CraftingInput;Lnet/minecraft/world/level/Level;)Z", cancellable = true)
    private void matches__1535385275(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1535385275L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/crafting/RecipeInput;Lnet/minecraft/world/level/Level;)Z", cancellable = true)
    private void matches__1133990855(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1133990855L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "display()Ljava/util/List;", cancellable = true)
    private void display__1577232000(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1577232000L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializer()Lnet/minecraft/world/item/crafting/RecipeSerializer;", cancellable = true)
    private void getSerializer_534966524(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(534966524L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assemble(Lnet/minecraft/world/item/crafting/RecipeInput;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void assemble_1195161591(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1195161591L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assemble(Lnet/minecraft/world/item/crafting/CraftingInput;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void assemble_2125982211(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2125982211L))
            info.setReturnValue(null);
    }


}

package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.TransmuteRecipe.class)
public class TransmuteRecipe_1202016287Mixin {
        @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/crafting/CraftingInput;Lnet/minecraft/world/level/Level;)Z", cancellable = true)
    private void matches_1050192768(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1050192768L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/crafting/RecipeInput;Lnet/minecraft/world/level/Level;)Z", cancellable = true)
    private void matches__882250316(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-882250316L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "display()Ljava/util/List;", cancellable = true)
    private void display__1431805424(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1431805424L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializer()Lnet/minecraft/world/item/crafting/RecipeSerializer;", cancellable = true)
    private void getSerializer_1766902610(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1766902610L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assemble(Lnet/minecraft/world/item/crafting/CraftingInput;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void assemble__1524895425(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1524895425L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assemble(Lnet/minecraft/world/item/crafting/RecipeInput;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void assemble__1585282381(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1585282381L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createWithOriginalComponents(Lnet/minecraft/world/item/ItemStackTemplate;Lnet/minecraft/world/item/ItemStack;I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private static void createWithOriginalComponents_813505384(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(813505384L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createWithOriginalComponents(Lnet/minecraft/world/item/ItemStackTemplate;Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private static void createWithOriginalComponents_143916819(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(143916819L))
            info.setReturnValue(null);
    }


}

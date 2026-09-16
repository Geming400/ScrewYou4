package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.Ingredient.class)
public class Ingredient_159014287Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__749612478(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-749612478L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_716365881(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(716365881L))
            info.setReturnValue(1938144204);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test__1577957425(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1577957425L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void test__1086599912(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1086599912L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/core/HolderSet;)Lnet/minecraft/world/item/crafting/Ingredient;", cancellable = true)
    private static void of__1115012637(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1115012637L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(Ljava/util/stream/Stream;)Lnet/minecraft/world/item/crafting/Ingredient;", cancellable = true)
    private static void of_1132734274(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1132734274L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of([Lnet/minecraft/world/level/ItemLike;)Lnet/minecraft/world/item/crafting/Ingredient;", cancellable = true)
    private static void of_515471318(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(515471318L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/world/level/ItemLike;)Lnet/minecraft/world/item/crafting/Ingredient;", cancellable = true)
    private static void of_1864676047(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1864676047L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_1218130658(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1218130658L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "display()Lnet/minecraft/world/item/crafting/display/SlotDisplay;", cancellable = true)
    private void display__258774853(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-258774853L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "items()Ljava/util/stream/Stream;", cancellable = true)
    private void items_74149443(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(74149443L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "testOptionalIngredient(Ljava/util/Optional;Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private static void testOptionalIngredient__1989987474(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1989987474L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "acceptsItem(Lnet/minecraft/core/Holder;)Z", cancellable = true)
    private void acceptsItem_825719090(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(825719090L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "acceptsItem(Ljava/lang/Object;)Z", cancellable = true)
    private void acceptsItem__302194493(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-302194493L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "optionalIngredientToDisplay(Ljava/util/Optional;)Lnet/minecraft/world/item/crafting/display/SlotDisplay;", cancellable = true)
    private static void optionalIngredientToDisplay_1965506414(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1965506414L))
            info.setReturnValue(null);
    }


}

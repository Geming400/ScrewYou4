package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.Ingredient.class)
public class Ingredient_159014287Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1544526049(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1544526049L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_197276532(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(197276532L))
            info.setReturnValue(-1693984163);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test_1544655009(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1544655009L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void test_1893549418(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1893549418L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "of([Lnet/minecraft/world/level/ItemLike;)Lnet/minecraft/world/item/crafting/Ingredient;", cancellable = true)
    private static void of__468717683(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-468717683L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(Ljava/util/stream/Stream;)Lnet/minecraft/world/item/crafting/Ingredient;", cancellable = true)
    private static void of__1799407239(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1799407239L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/core/HolderSet;)Lnet/minecraft/world/item/crafting/Ingredient;", cancellable = true)
    private static void of_239401484(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(239401484L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/world/level/ItemLike;)Lnet/minecraft/world/item/crafting/Ingredient;", cancellable = true)
    private static void of__1076565960(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1076565960L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_197292869(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(197292869L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "display()Lnet/minecraft/world/item/crafting/display/SlotDisplay;", cancellable = true)
    private void display_895967933(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(895967933L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "items()Ljava/util/stream/Stream;", cancellable = true)
    private void items__51692029(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-51692029L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "optionalIngredientToDisplay(Ljava/util/Optional;)Lnet/minecraft/world/item/crafting/display/SlotDisplay;", cancellable = true)
    private static void optionalIngredientToDisplay__350861916(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-350861916L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "testOptionalIngredient(Ljava/util/Optional;Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private static void testOptionalIngredient_1321801233(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1321801233L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "acceptsItem(Lnet/minecraft/core/Holder;)Z", cancellable = true)
    private void acceptsItem_1705493268(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1705493268L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "acceptsItem(Ljava/lang/Object;)Z", cancellable = true)
    private void acceptsItem_1544655009(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1544655009L))
            info.setReturnValue(true);
    }


}

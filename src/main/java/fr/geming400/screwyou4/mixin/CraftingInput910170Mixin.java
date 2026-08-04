package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.CraftingInput.class)
public class CraftingInput910170Mixin {
        @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_39172416(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(39172416L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1386421933(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1386421933L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_39172416(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(39172416L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(IILjava/util/List;)Lnet/minecraft/world/item/crafting/CraftingInput;", cancellable = true)
    private static void of_1203699041(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1203699041L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_39188753(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(39188753L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "width()I", cancellable = true)
    private void width_39172416(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(39172416L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "items()Ljava/util/List;", cancellable = true)
    private void items_1627246986(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1627246986L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getItem(II)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getItem__1684456354(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1684456354L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getItem(I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getItem_1394828389(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1394828389L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stackedContents()Lnet/minecraft/world/entity/player/StackedItemContents;", cancellable = true)
    private void stackedContents_432055869(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(432055869L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "height()I", cancellable = true)
    private void height_39172416(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(39172416L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ofPositioned(IILjava/util/List;)Lnet/minecraft/world/item/crafting/CraftingInput$Positioned;", cancellable = true)
    private static void ofPositioned_1484342057(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1484342057L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ingredientCount()I", cancellable = true)
    private void ingredientCount_39172416(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(39172416L))
            info.setReturnValue(null);
    }


}

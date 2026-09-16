package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.CraftingInput.class)
public class CraftingInput910170Mixin {
        @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_444641759(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(444641759L))
            info.setReturnValue(100200011);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__907716594(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-907716594L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_558261765(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(558261765L))
            info.setReturnValue(-1954111378);
    }

    @Inject(at = @At("HEAD"), method = "of(IILjava/util/List;)Lnet/minecraft/world/item/crafting/CraftingInput;", cancellable = true)
    private static void of_2141992874(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2141992874L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_1060026542(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1060026542L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "width()I", cancellable = true)
    private void width__1639237830(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1639237830L))
            info.setReturnValue(592101716);
    }

    @Inject(at = @At("HEAD"), method = "items()Ljava/util/List;", cancellable = true)
    private void items__21341878(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-21341878L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getItem(I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getItem__85504260(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-85504260L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getItem(II)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getItem__330128217(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-330128217L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "height()I", cancellable = true)
    private void height__1084438407(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1084438407L))
            info.setReturnValue(-992429711);
    }

    @Inject(at = @At("HEAD"), method = "ingredientCount()I", cancellable = true)
    private void ingredientCount_886224450(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(886224450L))
            info.setReturnValue(-174888066);
    }

    @Inject(at = @At("HEAD"), method = "stackedContents()Lnet/minecraft/world/entity/player/StackedItemContents;", cancellable = true)
    private void stackedContents__1342857156(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1342857156L))
            info.setReturnValue(new net.minecraft.world.entity.player.StackedItemContents());
    }

    @Inject(at = @At("HEAD"), method = "ofPositioned(IILjava/util/List;)Lnet/minecraft/world/item/crafting/CraftingInput$Positioned;", cancellable = true)
    private static void ofPositioned_1078428200(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1078428200L))
            info.setReturnValue(null);
    }


}

package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.SmithingRecipeInput.class)
public class SmithingRecipeInput1432162975Mixin {
        @Inject(at = @At("HEAD"), method = "base()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void base_1955581635(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1955581635L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_1470425221(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1470425221L))
            info.setReturnValue(1557040182);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1477292062(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1477292062L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_296703000(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(296703000L))
            info.setReturnValue("[}\u2355,=\u94BD]AyiDY2Y\u3AA3!\u125Bp+[M}wT1C");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1470425717(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1470425717L))
            info.setReturnValue(1280020974);
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_1470441558(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1470441558L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "template()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void template_1955581635(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1955581635L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getItem(I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getItem__1468886102(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1468886102L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addition()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void addition_1955581635(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1955581635L))
            info.setReturnValue(null);
    }


}

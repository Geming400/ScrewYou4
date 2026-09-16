package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.SmithingRecipeInput.class)
public class SmithingRecipeInput1432162975Mixin {
        @Inject(at = @At("HEAD"), method = "base()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void base__1098714988(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1098714988L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_1875894564(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1875894564L))
            info.setReturnValue(-92114371);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_523536707(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(523536707L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2092380796(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2092380796L))
            info.setReturnValue("lsS");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1989515066(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1989515066L))
            info.setReturnValue(-123843015);
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty__1803687949(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1803687949L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "template()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void template__1973216963(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1973216963L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getItem(I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getItem_1345748545(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1345748545L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addition()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void addition_425450943(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(425450943L))
            info.setReturnValue(null);
    }


}

package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.ItemStackWithSlot.class)
public class ItemStackWithSlot_942156453Mixin {
        @Inject(at = @At("HEAD"), method = "slot()I", cancellable = true)
    private void slot_980418698(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(980418698L))
            info.setReturnValue(-833806267);
    }

    @Inject(at = @At("HEAD"), method = "stack()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void stack_1465575112(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1465575112L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1967298585(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1967298585L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__193303523(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-193303523L))
            info.setReturnValue("+Ue|.1岑!d#{N Ԃfn");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_980419194(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(980419194L))
            info.setReturnValue(-1110825475);
    }

    @Inject(at = @At("HEAD"), method = "isValidInContainer(I)Z", cancellable = true)
    private void isValidInContainer__2138890028(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2138890028L))
            info.setReturnValue(true);
    }


}

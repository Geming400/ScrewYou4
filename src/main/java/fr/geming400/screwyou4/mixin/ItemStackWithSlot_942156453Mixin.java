package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.ItemStackWithSlot.class)
public class ItemStackWithSlot_942156453Mixin {
        @Inject(at = @At("HEAD"), method = "slot()I", cancellable = true)
    private void slot_1576183116(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1576183116L))
            info.setReturnValue(2046741250);
    }

    @Inject(at = @At("HEAD"), method = "stack()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void stack__1584234160(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1584234160L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_33530184(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(33530184L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1712579977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1712579977L))
            info.setReturnValue("\u6E06kApZ]^,dHPI\u28C3w-/L\u17CAUk,g?/\u0E0F\u04A2SkC?\u3F86T\u3786ykX\u8298eqC");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1499508543(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1499508543L))
            info.setReturnValue(465353366);
    }

    @Inject(at = @At("HEAD"), method = "isValidInContainer(I)Z", cancellable = true)
    private void isValidInContainer_981576158(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(981576158L))
            info.setReturnValue(false);
    }


}

package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.CustomData.class)
public class CustomData812580889Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2096874644(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2096874644L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__322879582(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-322879582L))
            info.setReturnValue("");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_850843135(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(850843135L))
            info.setReturnValue(-1950865499);
    }

    @Inject(at = @At("HEAD"), method = "update(Ljava/util/function/Consumer;)Lnet/minecraft/world/item/component/CustomData;", cancellable = true)
    private void update__1165267313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1165267313L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "update(Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V", cancellable = true)
    private static void update_518913049(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(518913049L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/item/component/CustomData;", cancellable = true)
    private static void of_530577704(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(530577704L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_850859472(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(850859472L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "set(Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/nbt/CompoundTag;)V", cancellable = true)
    private static void set_1004554426(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1004554426L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "copyTag()Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void copyTag__757642031(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-757642031L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "matchedBy(Lnet/minecraft/nbt/CompoundTag;)Z", cancellable = true)
    private void matchedBy_1373492955(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1373492955L))
            info.setReturnValue(true);
    }


}

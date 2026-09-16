package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.CustomData.class)
public class CustomData812580889Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__96045875(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-96045875L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1583003918(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1583003918L))
            info.setReturnValue("\u2351E*K9FZkq(Ebb7ieuiwP=ua\u3500\u9E76l?VvK>sJBoFJAjUG4G{w \uF9E7\uA999GZM>'4>4O\uD118a3^5{?fP|&#4\uBBF4");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1369932484(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1369932484L))
            info.setReturnValue(-1450350199);
    }

    @Inject(at = @At("HEAD"), method = "update(Ljava/util/function/Consumer;)Lnet/minecraft/world/item/component/CustomData;", cancellable = true)
    private void update_1386229080(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1386229080L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "update(Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Consumer;)V", cancellable = true)
    private static void update__1857659870(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1857659870L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/item/component/CustomData;", cancellable = true)
    private static void of_313698111(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(313698111L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_1871697261(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1871697261L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "set(Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/nbt/CompoundTag;)V", cancellable = true)
    private static void set__1056610532(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1056610532L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "copyTag()Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void copyTag__300027188(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-300027188L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "matchedBy(Lnet/minecraft/nbt/CompoundTag;)Z", cancellable = true)
    private void matchedBy_663731702(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(663731702L))
            info.setReturnValue(false);
    }


}

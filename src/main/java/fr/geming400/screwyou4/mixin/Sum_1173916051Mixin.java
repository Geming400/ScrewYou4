package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.providers.number.Sum.class)
public class Sum_1173916051Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_265289782(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(265289782L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1944339575(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1944339575L))
            info.setReturnValue("6\u2A4DB\uB82Bhv{`0R}}R:@6\uD3DFaOo8DbP<^fv\uFE00\u52A8iG<B@[>hK5f\u8455/B'u<OF0%scID\u8E96h%oc[n$86E)eI4Yx cC");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1731268141(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1731268141L))
            info.setReturnValue(-1876845303);
    }

    @Inject(at = @At("HEAD"), method = "getInt(Lnet/minecraft/world/level/storage/loot/LootContext;)I", cancellable = true)
    private void getInt_1905875390(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1905875390L))
            info.setReturnValue(-779169822);
    }

    @Inject(at = @At("HEAD"), method = "getFloat(Lnet/minecraft/world/level/storage/loot/LootContext;)F", cancellable = true)
    private void getFloat_944445230(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(944445230L))
            info.setReturnValue(3.939041E8F);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContext;)V", cancellable = true)
    private void validate_155197279(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(155197279L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sum([Lnet/minecraft/world/level/storage/loot/providers/number/NumberProvider;)Lnet/minecraft/world/level/storage/loot/providers/number/Sum;", cancellable = true)
    private static void sum__1688217042(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1688217042L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "summands()Ljava/util/List;", cancellable = true)
    private void summands__1412511552(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1412511552L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__2054605992(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2054605992L))
            info.setReturnValue(null);
    }


}

package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.predicates.TimeCheck.class)
public class TimeCheck_842071235Mixin {
        @Inject(at = @At("HEAD"), method = "value()Lnet/minecraft/world/level/storage/loot/IntRange;", cancellable = true)
    private void value__252981392(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-252981392L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__66555034(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-66555034L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1612494759(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1612494759L))
            info.setReturnValue("%lhf]w*pMq/N:#ftM4}\uA916wt\uA1DD7Y^Cf;>@/XH=Kfk<n`jPUOw?'BlnF o/Jf\uB0E31>WdrCG");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1399423325(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1399423325L))
            info.setReturnValue(1412459458);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/level/storage/loot/LootContext;)Z", cancellable = true)
    private void test__563541242(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-563541242L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test__894900477(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-894900477L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContext;)V", cancellable = true)
    private void validate__176647537(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-176647537L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "clock()Lnet/minecraft/core/Holder;", cancellable = true)
    private void clock__37415184(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-37415184L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "time(Lnet/minecraft/core/Holder;Lnet/minecraft/world/level/storage/loot/IntRange;)Lnet/minecraft/world/level/storage/loot/predicates/TimeCheck$Builder;", cancellable = true)
    private static void time__2068581442(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2068581442L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "period()Ljava/util/Optional;", cancellable = true)
    private void period_139522353(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(139522353L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1908516488(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1908516488L))
            info.setReturnValue(null);
    }


}

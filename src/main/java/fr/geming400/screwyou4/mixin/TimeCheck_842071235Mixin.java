package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.predicates.TimeCheck.class)
public class TimeCheck_842071235Mixin {
        @Inject(at = @At("HEAD"), method = "value()Lnet/minecraft/world/level/storage/loot/IntRange;", cancellable = true)
    private void value_188537921(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(188537921L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2067383803(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2067383803L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__293388741(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-293388741L))
            info.setReturnValue("n2㺊*乜}3m'zQzC0M$ fB⥛/_:Eb3$lH@t[fRw8Zb뭀H1wY)nuἼꗘ#8r%E_");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_880333976(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(880333976L))
            info.setReturnValue(707574841);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/level/storage/loot/LootContext;)Z", cancellable = true)
    private void test__1534877864(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1534877864L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test__2067255339(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2067255339L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContext;)V", cancellable = true)
    private void validate__1876265371(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1876265371L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "clock()Lnet/minecraft/core/Holder;", cancellable = true)
    private void clock__1904020290(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1904020290L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "time(Lnet/minecraft/core/Holder;Lnet/minecraft/world/level/storage/loot/IntRange;)Lnet/minecraft/world/level/storage/loot/predicates/TimeCheck$Builder;", cancellable = true)
    private static void time_1448395883(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1448395883L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "period()Ljava/util/Optional;", cancellable = true)
    private void period_1087532656(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1087532656L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1717042338(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1717042338L))
            info.setReturnValue(null);
    }


}

package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.blockpredicates.UnobstructedPredicate.class)
public class UnobstructedPredicate_875588167Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/levelgen/blockpredicates/BlockPredicateType;", cancellable = true)
    private void type__766891783(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-766891783L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2033866871(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2033866871L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__259871809(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-259871809L))
            info.setReturnValue("\uB9FE>^\u761BC-esZ&0?0\u97DD&\u8F4C(D\u65E19S=\u672EB2mrx\uB1D8'g\uBD58cM pZR5l0k \u36A9qX7\uC320r\uD3B20OPA]/\uBB39`U_9");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_913850908(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(913850908L))
            info.setReturnValue(-295164129);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;Ljava/lang/Object;)Z", cancellable = true)
    private void test_835261429(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(835261429L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void test_2077288964(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2077288964L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "offset()Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void offset_491189702(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(491189702L))
            info.setReturnValue(null);
    }


}

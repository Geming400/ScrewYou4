package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.damagesource.FallLocation.class)
public class FallLocation993028382Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1916426655(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1916426655L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__142431593(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-142431593L))
            info.setReturnValue("/ꛛW{)'lﾑ/-Gs﷿`XN<N`%dg'+F梟A}#@[QmB$(+`Yd+vX遴zSYc&q!>λ[$4lej3$_up7dV(bRx]");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1031291124(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1031291124L))
            info.setReturnValue(1302814344);
    }

    @Inject(at = @At("HEAD"), method = "id()Ljava/lang/String;", cancellable = true)
    private void id__142432089(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-142432089L))
            info.setReturnValue("3/ISU;A憯\"0ᤁt껎JhH呅仏>P");
    }

    @Inject(at = @At("HEAD"), method = "languageKey()Ljava/lang/String;", cancellable = true)
    private void languageKey__142432089(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-142432089L))
            info.setReturnValue("3/ISU;A憯\"0ᤁt껎JhH呅仏>P");
    }

    @Inject(at = @At("HEAD"), method = "getCurrentFallLocation(Lnet/minecraft/world/entity/LivingEntity;)Lnet/minecraft/world/damagesource/FallLocation;", cancellable = true)
    private static void getCurrentFallLocation__866012634(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-866012634L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockToFallLocation(Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/damagesource/FallLocation;", cancellable = true)
    private static void blockToFallLocation_2109308005(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2109308005L))
            info.setReturnValue(null);
    }


}

package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.SpawnData.CustomSpawnRules.class)
public class CustomSpawnRules_957009594Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_48383325(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(48383325L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1727433118(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1727433118L))
            info.setReturnValue("WU:1=DU1C9(?s\uC92Bv3EDm`@`\"ukA[HJ?-\u9ADC\uB818X\uB5546|32>B\u3E5B\u4EC8V<cE<[RJ<A.{bWF1+QI20uWM");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1514361684(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1514361684L))
            info.setReturnValue(980262669);
    }

    @Inject(at = @At("HEAD"), method = "isValidPosition(Lnet/minecraft/core/BlockPos;Lnet/minecraft/server/level/ServerLevel;)Z", cancellable = true)
    private void isValidPosition__148616560(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-148616560L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "blockLightLimit()Lnet/minecraft/util/InclusiveRange;", cancellable = true)
    private void blockLightLimit_454216001(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(454216001L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "skyLightLimit()Lnet/minecraft/util/InclusiveRange;", cancellable = true)
    private void skyLightLimit__1832133843(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1832133843L))
            info.setReturnValue(null);
    }


}

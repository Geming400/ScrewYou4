package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.debug.DebugHiveInfo.class)
public class DebugHiveInfo111625971Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/block/Block;", cancellable = true)
    private void type__645639128(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-645639128L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1497138230(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1497138230L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1023834004(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1023834004L))
            info.setReturnValue("!ၽ.r`tuOYC7@Zc鸝J_q`gZI,I?-s쐽@8ty/2&D");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_149888713(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(149888713L))
            info.setReturnValue(285033004);
    }

    @Inject(at = @At("HEAD"), method = "pack(Lnet/minecraft/world/level/block/entity/BeehiveBlockEntity;)Lnet/minecraft/util/debug/DebugHiveInfo;", cancellable = true)
    private static void pack_1732596562(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1732596562L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sedated()Z", cancellable = true)
    private void sedated_149904554(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(149904554L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "occupantCount()I", cancellable = true)
    private void occupantCount_149888217(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(149888217L))
            info.setReturnValue(488180423);
    }

    @Inject(at = @At("HEAD"), method = "honeyLevel()I", cancellable = true)
    private void honeyLevel_149888217(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(149888217L))
            info.setReturnValue(488180423);
    }


}

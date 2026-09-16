package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.debug.DebugHiveInfo.class)
public class DebugHiveInfo111625971Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/block/Block;", cancellable = true)
    private void type_1274692782(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1274692782L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__797000297(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-797000297L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_882049496(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(882049496L))
            info.setReturnValue("6_{VTtpS4{\uD724x' XU73\u9F53Kaw'^M}dJzLn\u731D,6XgqP\u256AtERxt\uC9A5\uA9E9Lsk\"");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_668978062(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(668978062L))
            info.setReturnValue(1906539996);
    }

    @Inject(at = @At("HEAD"), method = "pack(Lnet/minecraft/world/level/block/entity/BeehiveBlockEntity;)Lnet/minecraft/util/debug/DebugHiveInfo;", cancellable = true)
    private static void pack__1678672103(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1678672103L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "occupantCount()I", cancellable = true)
    private void occupantCount__320670009(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-320670009L))
            info.setReturnValue(-2146894783);
    }

    @Inject(at = @At("HEAD"), method = "honeyLevel()I", cancellable = true)
    private void honeyLevel__596570768(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-596570768L))
            info.setReturnValue(-1650318391);
    }

    @Inject(at = @At("HEAD"), method = "sedated()Z", cancellable = true)
    private void sedated_1914159046(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1914159046L))
            info.setReturnValue(false);
    }


}

package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.TestEnvironmentDefinition.AllOf.class)
public class AllOf1348312082Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1561142955(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1561142955L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_212852107(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(212852107L))
            info.setReturnValue("XB:\u9379^i\uAE4E .\u6CF9@zq4TA;5r\u2631\u5E5D`U8\uCBEBk,V9\uC501");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1386574824(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1386574824L))
            info.setReturnValue(494724774);
    }

    @Inject(at = @At("HEAD"), method = "setup(Lnet/minecraft/server/level/ServerLevel;)Ljava/lang/Object;", cancellable = true)
    private void setup__1361464388(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1361464388L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "setup(Lnet/minecraft/server/level/ServerLevel;)Ljava/util/List;", cancellable = true)
    private void setup__641274799(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-641274799L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "teardown(Lnet/minecraft/server/level/ServerLevel;Ljava/util/List;)V", cancellable = true)
    private void teardown_144608583(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(144608583L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "teardown(Lnet/minecraft/server/level/ServerLevel;Ljava/lang/Object;)V", cancellable = true)
    private void teardown__1469124686(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1469124686L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1210801490(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1210801490L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "definitions()Ljava/util/List;", cancellable = true)
    private void definitions__1320318398(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1320318398L))
            info.setReturnValue(null);
    }


}

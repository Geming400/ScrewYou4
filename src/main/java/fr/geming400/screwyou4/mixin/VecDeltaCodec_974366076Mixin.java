package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.VecDeltaCodec.class)
public class VecDeltaCodec_974366076Mixin {
        @Inject(at = @At("HEAD"), method = "decode(JJJ)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void decode__1577252178(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1577252178L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "delta(Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void delta__1630946176(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1630946176L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBase()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getBase_2072095604(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2072095604L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setBase(Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void setBase_1342102074(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1342102074L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "encodeX(Lnet/minecraft/world/phys/Vec3;)J", cancellable = true)
    private void encodeX_1342090542(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1342090542L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "encodeY(Lnet/minecraft/world/phys/Vec3;)J", cancellable = true)
    private void encodeY_1342090542(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1342090542L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "encodeZ(Lnet/minecraft/world/phys/Vec3;)J", cancellable = true)
    private void encodeZ_1342090542(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1342090542L))
            info.setReturnValue(null);
    }


}

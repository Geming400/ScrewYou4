package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.VecDeltaCodec.class)
public class VecDeltaCodec_974366076Mixin {
        @Inject(at = @At("HEAD"), method = "decode(JJJ)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void decode_1674623516(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1674623516L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "delta(Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void delta__1057969608(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1057969608L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBase()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getBase__841056563(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-841056563L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setBase(Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void setBase_139305741(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(139305741L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "encodeX(Lnet/minecraft/world/phys/Vec3;)J", cancellable = true)
    private void encodeX__1008641744(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1008641744L))
            info.setReturnValue(2668603249267233455L);
    }

    @Inject(at = @At("HEAD"), method = "encodeY(Lnet/minecraft/world/phys/Vec3;)J", cancellable = true)
    private void encodeY__678875983(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-678875983L))
            info.setReturnValue(-8649937789423202594L);
    }

    @Inject(at = @At("HEAD"), method = "encodeZ(Lnet/minecraft/world/phys/Vec3;)J", cancellable = true)
    private void encodeZ__349110222(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-349110222L))
            info.setReturnValue(6926551655219800661L);
    }


}

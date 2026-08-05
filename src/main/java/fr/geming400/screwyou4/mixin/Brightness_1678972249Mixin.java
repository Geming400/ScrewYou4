package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.Brightness.class)
public class Brightness_1678972249Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1230482789(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1230482789L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_543512273(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(543512273L))
            info.setReturnValue("詗,7o诱)z88<u;6kQ=^oX(瘵 FbⰤv侊x!:D&臿Dᘇ|0+9,3$2X1E棒[kCuy871");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1717234990(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1717234990L))
            info.setReturnValue(-1110102192);
    }

    @Inject(at = @At("HEAD"), method = "block()I", cancellable = true)
    private void block_1717234494(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1717234494L))
            info.setReturnValue(-906954772);
    }

    @Inject(at = @At("HEAD"), method = "pack()I", cancellable = true)
    private void pack_1717234494(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1717234494L))
            info.setReturnValue(-906954772);
    }

    @Inject(at = @At("HEAD"), method = "unpack(I)Lnet/minecraft/util/Brightness;", cancellable = true)
    private static void unpack_748724195(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(748724195L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sky()I", cancellable = true)
    private void sky_1717234494(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1717234494L))
            info.setReturnValue(-906954772);
    }


}

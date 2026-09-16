package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.KeyframeTrack.class)
public class KeyframeTrack_819748577Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__88877692(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-88877692L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1590172101(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1590172101L))
            info.setReturnValue("\u0F76\u3A311cGUx%\u37EEt\uC5194n]Y9zs#U6{\uD5BBc\u7C12rYB\u5BDB-E\u8FE4pS7khI\u36A8xRJVHpYJC^d@.\"0wAI4s3=P{u7O.rg*]<y`\u301DAUaN&?=5\uB9D2\u5B19");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1377100667(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1377100667L))
            info.setReturnValue(1161153963);
    }

    @Inject(at = @At("HEAD"), method = "mapCodec(Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private static void mapCodec_469603489(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(469603489L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bakeSampler(Ljava/util/Optional;Lnet/minecraft/world/attribute/LerpFunction;)Lnet/minecraft/util/KeyframeTrackSampler;", cancellable = true)
    private void bakeSampler__1838407076(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1838407076L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validatePeriod(Lnet/minecraft/util/KeyframeTrack;I)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private static void validatePeriod_1915071244(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1915071244L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "keyframes()Ljava/util/List;", cancellable = true)
    private void keyframes_1497454677(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1497454677L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "easingType()Lnet/minecraft/util/EasingType;", cancellable = true)
    private void easingType_1276278113(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1276278113L))
            info.setReturnValue(null);
    }


}

package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.VerticalAnchor.Absolute.class)
public class Absolute_1833106502Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_924480233(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(924480233L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1691437766(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1691437766L))
            info.setReturnValue("1\u8402:\uB717`|DP\u79254i\u3293u&\u4077\uD489|!\uB8C6F\u5B7E`}^do\u5698jcS>:7CS*ZR'.6\uB577mRtT,-\"I6E;`dUx6\uB98FA |AB4\u74543h$,1(i)C\u3D02l\u1B526\u1867C\"\uA903c$*AIK?^_");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1904508704(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1904508704L))
            info.setReturnValue(-1706917651);
    }

    @Inject(at = @At("HEAD"), method = "y()I", cancellable = true)
    private void y_1040528722(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1040528722L))
            info.setReturnValue(-1466854971);
    }

    @Inject(at = @At("HEAD"), method = "resolveY(Lnet/minecraft/world/level/levelgen/WorldGenerationContext;)I", cancellable = true)
    private void resolveY__430113373(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-430113373L))
            info.setReturnValue(1928920118);
    }


}

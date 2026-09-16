package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.heightproviders.VeryBiasedToBottomHeight.class)
public class VeryBiasedToBottomHeight201148199Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_971571228(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(971571228L))
            info.setReturnValue("[[<`}\u22B5A=n)Nu,r;IW!#/F;\"&-u\u80CAFQ7`f\u8714[i\"PZq{}\uCBA6<P2X+ wYK!3D\u339B\"v}Q^@K!em#");
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/world/level/levelgen/VerticalAnchor;Lnet/minecraft/world/level/levelgen/VerticalAnchor;I)Lnet/minecraft/world/level/levelgen/heightproviders/VeryBiasedToBottomHeight;", cancellable = true)
    private static void of_1424776829(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1424776829L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/level/levelgen/heightproviders/HeightProviderType;", cancellable = true)
    private void getType_236253134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(236253134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sample(Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/WorldGenerationContext;)I", cancellable = true)
    private void sample_1882532494(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1882532494L))
            info.setReturnValue(1220440684);
    }


}

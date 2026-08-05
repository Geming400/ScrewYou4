package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.heightproviders.BiasedToBottomHeight.class)
public class BiasedToBottomHeight191467729Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__943992742(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-943992742L))
            info.setReturnValue("5,kwXCy%{vH:(G!1<jM1pI\uFE2D GrL/+k\u9B2B;q[Q|8cg2\u8887-{mWu;\u3415oB4AAl_edG[hY# &VC%o\u7265c");
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/world/level/levelgen/VerticalAnchor;Lnet/minecraft/world/level/levelgen/VerticalAnchor;I)Lnet/minecraft/world/level/levelgen/heightproviders/BiasedToBottomHeight;", cancellable = true)
    private static void of_1746328038(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1746328038L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/level/levelgen/heightproviders/HeightProviderType;", cancellable = true)
    private void getType__1989124312(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1989124312L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sample(Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/WorldGenerationContext;)I", cancellable = true)
    private void sample_156613794(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(156613794L))
            info.setReturnValue(-1207677487);
    }


}

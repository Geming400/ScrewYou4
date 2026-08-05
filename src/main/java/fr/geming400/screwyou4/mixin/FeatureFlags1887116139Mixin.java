package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.flag.FeatureFlags.class)
public class FeatureFlags1887116139Mixin {
        @Inject(at = @At("HEAD"), method = "isExperimental(Lnet/minecraft/world/flag/FeatureFlagSet;)Z", cancellable = true)
    private static void isExperimental_457347007(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(457347007L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "printMissingFlags(Lnet/minecraft/world/flag/FeatureFlagRegistry;Lnet/minecraft/world/flag/FeatureFlagSet;Lnet/minecraft/world/flag/FeatureFlagSet;)Ljava/lang/String;", cancellable = true)
    private static void printMissingFlags__391087030(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-391087030L))
            info.setReturnValue("kX%)g)$AS!b=KSK^x5`wo\u1DFD`x,:z]!$aTpsD^DBi!x3m<M\uC224BFa+ \u19B1Wx\uC563w[d(}XS\uBF296vp#\uD12CM,C\"!w5z\uC463*?h2%.DH");
    }

    @Inject(at = @At("HEAD"), method = "printMissingFlags(Lnet/minecraft/world/flag/FeatureFlagSet;Lnet/minecraft/world/flag/FeatureFlagSet;)Ljava/lang/String;", cancellable = true)
    private static void printMissingFlags_1873310284(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1873310284L))
            info.setReturnValue("!*A\u5FC7\u4177N\"4\u8196\u8695\u8AB9u83G]nIAWj,6aw\u4CCD!Ul;17 rE]47X`\uB427($ocu9V5t4fB\u3E96`");
    }


}

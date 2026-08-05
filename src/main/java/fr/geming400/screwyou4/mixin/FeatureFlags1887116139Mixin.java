package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.flag.FeatureFlags.class)
public class FeatureFlags1887116139Mixin {
        @Inject(at = @At("HEAD"), method = "printMissingFlags(Lnet/minecraft/world/flag/FeatureFlagRegistry;Lnet/minecraft/world/flag/FeatureFlagSet;Lnet/minecraft/world/flag/FeatureFlagSet;)Ljava/lang/String;", cancellable = true)
    private static void printMissingFlags__391087030(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-391087030L))
            info.setReturnValue("kX%)g)$AS!b=KSK^x5`wo᷽`x,:z]!$aTpsD^DBi!x3m<M숤BFa+ ᦱWx앣w[d(}XS뼩6vp#턬M,C\"!w5z쑣*?h2%.DH");
    }

    @Inject(at = @At("HEAD"), method = "printMissingFlags(Lnet/minecraft/world/flag/FeatureFlagSet;Lnet/minecraft/world/flag/FeatureFlagSet;)Ljava/lang/String;", cancellable = true)
    private static void printMissingFlags_1873310284(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1873310284L))
            info.setReturnValue("!*A忇䅷N\"4膖蚕誹u83G]nIAWj,6aw䳍!Ul;17 rE]47X`됧($ocu9V5t4fB㺖`");
    }

    @Inject(at = @At("HEAD"), method = "isExperimental(Lnet/minecraft/world/flag/FeatureFlagSet;)Z", cancellable = true)
    private static void isExperimental_457347007(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(457347007L))
            info.setReturnValue(true);
    }


}

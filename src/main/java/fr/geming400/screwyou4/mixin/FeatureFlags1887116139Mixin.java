package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.flag.FeatureFlags.class)
public class FeatureFlags1887116139Mixin {
        @Inject(at = @At("HEAD"), method = "printMissingFlags(Lnet/minecraft/world/flag/FeatureFlagRegistry;Lnet/minecraft/world/flag/FeatureFlagSet;Lnet/minecraft/world/flag/FeatureFlagSet;)Ljava/lang/String;", cancellable = true)
    private static void printMissingFlags_353293784(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(353293784L))
            info.setReturnValue("H_+y=f}ey2+zt\uACA9pU$H9(( \uD2EBzw`t\u8B274zy7$\u5B9Dx|<cYS$c!F-5*BL\u6E49\uC56A,\uD659");
    }

    @Inject(at = @At("HEAD"), method = "printMissingFlags(Lnet/minecraft/world/flag/FeatureFlagSet;Lnet/minecraft/world/flag/FeatureFlagSet;)Ljava/lang/String;", cancellable = true)
    private static void printMissingFlags__1885588390(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1885588390L))
            info.setReturnValue("Ym!9}:@\u18A5ih\"4_\uD6B2tV6\"@<\u068A.2+(bgF{i\"\u25E9=til1rdJF+Y^p-g1_s<GStvG");
    }

    @Inject(at = @At("HEAD"), method = "isExperimental(Lnet/minecraft/world/flag/FeatureFlagSet;)Z", cancellable = true)
    private static void isExperimental_1389205361(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1389205361L))
            info.setReturnValue(false);
    }


}

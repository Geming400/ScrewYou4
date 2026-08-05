package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.TestEnvironmentDefinition.Weather.Type.class)
public class Type51024116Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/gametest/framework/TestEnvironmentDefinition$Weather$Type;", cancellable = true)
    private static void values_395381909(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(395381909L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/gametest/framework/TestEnvironmentDefinition$Weather$Type;", cancellable = true)
    private static void valueOf__2136370504(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2136370504L))
            info.setReturnValue(net.minecraft.gametest.framework.TestEnvironmentDefinition.Weather.Type.CLEAR);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void apply__927385224(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-927385224L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__1084436355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1084436355L))
            info.setReturnValue("b<`1JVdp%2N}vF14]sF\"WQ FeၭON<\"$oC珛?O!%탂ZGP}d@=AW}bJVQhfBbjJf?w荟Z");
    }


}

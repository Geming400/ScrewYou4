package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.TestEnvironmentDefinition.Weather.Type.class)
public class Type51024116Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/gametest/framework/TestEnvironmentDefinition$Weather$Type;", cancellable = true)
    private static void values__807012809(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-807012809L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/gametest/framework/TestEnvironmentDefinition$Weather$Type;", cancellable = true)
    private static void valueOf_1119513232(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1119513232L))
            info.setReturnValue(net.minecraft.gametest.framework.TestEnvironmentDefinition.Weather.Type.RAIN);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void apply__1478135606(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1478135606L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_139232738(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(139232738L))
            info.setReturnValue("jy.jyORlY\uCF4EEGcIrzVff|E\"LBVp|\u145E k\"/N`");
    }


}

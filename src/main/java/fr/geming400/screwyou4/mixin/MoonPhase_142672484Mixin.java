package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.MoonPhase.class)
public class MoonPhase_142672484Mixin {
        @Inject(at = @At("HEAD"), method = "index()I", cancellable = true)
    private void index_836788919(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(836788919L))
            info.setReturnValue(1448555652);
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/MoonPhase;", cancellable = true)
    private static void values__659956854(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-659956854L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/MoonPhase;", cancellable = true)
    private static void valueOf_98699363(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(98699363L))
            info.setReturnValue(net.minecraft.world.level.MoonPhase.FIRST_QUARTER);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_230881105(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(230881105L))
            info.setReturnValue("1eV!M%x{\u911D\u6F71Abn)\u66C22OyC\u0A30$\uAB98:tUj[!!v\uA6EEU.W\u6BE1Hj0g");
    }

    @Inject(at = @At("HEAD"), method = "startTick()I", cancellable = true)
    private void startTick__341366134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-341366134L))
            info.setReturnValue(-745017859);
    }


}

package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.GenerationStep.Decoration.class)
public class Decoration1477039962Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName_341579491(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(341579491L))
            info.setReturnValue("L;}=H +QDM#4;\uC900KH ^ZXtEr! Jby^QeK0Q#\u9852e)obt\uFF79_W?X>8<(ukz\u73B6T");
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/levelgen/GenerationStep$Decoration;", cancellable = true)
    private static void values_781988848(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(781988848L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/levelgen/GenerationStep$Decoration;", cancellable = true)
    private static void valueOf__63298131(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-63298131L))
            info.setReturnValue(net.minecraft.world.level.levelgen.GenerationStep.Decoration.FLUID_SPRINGS);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_341579491(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(341579491L))
            info.setReturnValue("L;}=H +QDM#4;\uC900KH ^ZXtEr! Jby^QeK0Q#\u9852e)obt\uFF79_W?X>8<(ukz\u73B6T");
    }


}

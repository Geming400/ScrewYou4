package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.MoonPhase.class)
public class MoonPhase_142672484Mixin {
        @Inject(at = @At("HEAD"), method = "index()I", cancellable = true)
    private void index_180934729(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(180934729L))
            info.setReturnValue(-1368043490);
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/MoonPhase;", cancellable = true)
    private static void values__462960408(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-462960408L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/MoonPhase;", cancellable = true)
    private static void valueOf__1871305589(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1871305589L))
            info.setReturnValue(net.minecraft.world.level.MoonPhase.THIRD_QUARTER);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__992787988(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-992787988L))
            info.setReturnValue("><6`%YcYU{8a!7<b[E+hv::j:hcp1#");
    }

    @Inject(at = @At("HEAD"), method = "startTick()I", cancellable = true)
    private void startTick_180934729(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(180934729L))
            info.setReturnValue(-1368043490);
    }


}

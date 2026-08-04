package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.Level.ExplosionInteraction.class)
public class ExplosionInteraction_1296258985Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/Level$ExplosionInteraction;", cancellable = true)
    private static void values_1833980270(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1833980270L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/Level$ExplosionInteraction;", cancellable = true)
    private static void valueOf__1555673045(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1555673045L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_160798513(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(160798513L))
            info.setReturnValue(null);
    }


}

package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.damagesource.DeathMessageType.class)
public class DeathMessageType420757339Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/damagesource/DeathMessageType;", cancellable = true)
    private static void values__1614284867(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1614284867L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/damagesource/DeathMessageType;", cancellable = true)
    private static void valueOf_1355790880(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1355790880L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__714703132(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-714703132L))
            info.setReturnValue(null);
    }


}

package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.DebugEntityNameGenerator.class)
public class DebugEntityNameGenerator_212969516Mixin {
        @Inject(at = @At("HEAD"), method = "getEntityName(Lnet/minecraft/world/entity/Entity;)Ljava/lang/String;", cancellable = true)
    private static void getEntityName_625852915(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(625852915L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEntityName(Ljava/util/UUID;)Ljava/lang/String;", cancellable = true)
    private static void getEntityName__981454504(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-981454504L))
            info.setReturnValue(null);
    }


}

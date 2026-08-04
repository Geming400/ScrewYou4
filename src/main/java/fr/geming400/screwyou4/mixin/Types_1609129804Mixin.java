package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.Heightmap.Types.class)
public class Types_1609129804Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/levelgen/Heightmap$Types;", cancellable = true)
    private static void values__244177017(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-244177017L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/levelgen/Heightmap$Types;", cancellable = true)
    private static void valueOf_1633857924(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1633857924L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isOpaque()Ljava/util/function/Predicate;", cancellable = true)
    private void isOpaque_959244825(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(959244825L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_473669332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(473669332L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sendToClient()Z", cancellable = true)
    private void sendToClient_1647408386(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1647408386L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "keepAfterWorldgen()Z", cancellable = true)
    private void keepAfterWorldgen_1647408386(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1647408386L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializationKey()Ljava/lang/String;", cancellable = true)
    private void getSerializationKey_473669332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(473669332L))
            info.setReturnValue(null);
    }


}

package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.Heightmap.Types.class)
public class Types_1609129804Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/levelgen/Heightmap$Types;", cancellable = true)
    private static void values__1328005979(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1328005979L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/levelgen/Heightmap$Types;", cancellable = true)
    private static void valueOf__1285053780(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1285053780L))
            info.setReturnValue(net.minecraft.world.level.levelgen.Heightmap.Types.WORLD_SURFACE_WG);
    }

    @Inject(at = @At("HEAD"), method = "isOpaque()Ljava/util/function/Predicate;", cancellable = true)
    private void isOpaque__2112445116(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2112445116L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "keepAfterWorldgen()Z", cancellable = true)
    private void keepAfterWorldgen_1329193261(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1329193261L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getSerializationKey()Ljava/lang/String;", cancellable = true)
    private void getSerializationKey_366618841(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(366618841L))
            info.setReturnValue("6q?\u595D|'OF;`\u767693q%%\u4CEDSjKEN\u1725f\u0443VA`aNWR+\u350DrbSu.{FPf&Xjo|\u7C92E|%N)0\u3327!A00a/Eo]KNy\u56A3):1H`h>@d<DB#");
    }

    @Inject(at = @At("HEAD"), method = "sendToClient()Z", cancellable = true)
    private void sendToClient_1620726772(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1620726772L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1697338425(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1697338425L))
            info.setReturnValue("5rw");
    }


}

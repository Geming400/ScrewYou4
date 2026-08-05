package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.players.NameAndId.class)
public class NameAndId_2101264183Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name_965803711(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(965803711L))
            info.setReturnValue(":][1fHjMrvA 1d\u4573&dY[\u105C($\u15B9N\u89E4/BK!9aSyl?x?*");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__808190855(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-808190855L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_965804207(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(965804207L))
            info.setReturnValue("-j9* $K?;{uD2GE+/vWO=Pm>\u046Bor\uFB8EVq{A+\u41BEU1{X;+(.\u58447_`Yomdm*^VA)ANY* BTw?}S_?\u72B4NIQ\u2807%\u7415;i");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2139526924(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2139526924L))
            info.setReturnValue(1708733319);
    }

    @Inject(at = @At("HEAD"), method = "id()Ljava/util/UUID;", cancellable = true)
    private void id__1782568631(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1782568631L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "appendTo(Lcom/google/gson/JsonObject;)V", cancellable = true)
    private void appendTo_667619605(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(667619605L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fromJson(Lcom/google/gson/JsonObject;)Lnet/minecraft/server/players/NameAndId;", cancellable = true)
    private static void fromJson_2084070366(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2084070366L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createOffline(Ljava/lang/String;)Lnet/minecraft/server/players/NameAndId;", cancellable = true)
    private static void createOffline_2012345664(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2012345664L))
            info.setReturnValue(null);
    }


}

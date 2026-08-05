package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.scores.Team.Visibility.class)
public class Visibility_1490570333Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/scores/Team$Visibility;", cancellable = true)
    private static void values__1200856227(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1200856227L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/scores/Team$Visibility;", cancellable = true)
    private static void valueOf_2110373988(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2110373988L))
            info.setReturnValue(net.minecraft.world.scores.Team.Visibility.NEVER);
    }

    @Inject(at = @At("HEAD"), method = "getDisplayName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getDisplayName__1623984794(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1623984794L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1578778954(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1578778954L))
            info.setReturnValue("31;e/*zD\uD6246pDO8\u4001\uC8E3\u611E\u0180TX>wIpOyB/1{IumurI'G\u4203P7HG3-sPY7qGux[o <VM|Xl\u3899\uD2FE*|<B$|<(Kk");
    }


}

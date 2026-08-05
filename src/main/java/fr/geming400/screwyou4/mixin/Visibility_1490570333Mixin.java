package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.scores.Team.Visibility.class)
public class Visibility_1490570333Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/scores/Team$Visibility;", cancellable = true)
    private static void values_155734079(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(155734079L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/scores/Team$Visibility;", cancellable = true)
    private static void valueOf__2134038724(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2134038724L))
            info.setReturnValue(net.minecraft.world.scores.Team.Visibility.HIDE_FOR_OWN_TEAM);
    }

    @Inject(at = @At("HEAD"), method = "getDisplayName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getDisplayName__686338833(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-686338833L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_355109861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(355109861L))
            info.setReturnValue(":g\"YSvy45A&p_q皣bPZgW+-2");
    }


}

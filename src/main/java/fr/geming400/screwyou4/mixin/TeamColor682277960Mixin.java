package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.scores.TeamColor.class)
public class TeamColor682277960Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/scores/TeamColor;", cancellable = true)
    private static void values__478066756(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-478066756L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/scores/TeamColor;", cancellable = true)
    private static void valueOf_1565439491(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1565439491L))
            info.setReturnValue(net.minecraft.world.scores.TeamColor.GREEN);
    }

    @Inject(at = @At("HEAD"), method = "byName(Ljava/lang/String;)Lnet/minecraft/world/scores/TeamColor;", cancellable = true)
    private static void byName_81663837(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(81663837L))
            info.setReturnValue(net.minecraft.world.scores.TeamColor.DARK_RED);
    }

    @Inject(at = @At("HEAD"), method = "rgb()I", cancellable = true)
    private void rgb_1561678209(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1561678209L))
            info.setReturnValue(-15186807);
    }

    @Inject(at = @At("HEAD"), method = "displaySlot()Lnet/minecraft/world/scores/DisplaySlot;", cancellable = true)
    private void displaySlot__1740222477(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1740222477L))
            info.setReturnValue(net.minecraft.world.scores.DisplaySlot.TEAM_GOLD);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_770486582(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(770486582L))
            info.setReturnValue("3, Q+L(?f(bpWb# pMa\uB5AB\u75E9M-/TW'gU!+]B.5RA5");
    }

    @Inject(at = @At("HEAD"), method = "textColor()Lnet/minecraft/network/chat/TextColor;", cancellable = true)
    private void textColor_2076245944(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2076245944L))
            info.setReturnValue(null);
    }


}

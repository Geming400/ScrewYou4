package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.scores.TeamColor.class)
public class TeamColor682277960Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/scores/TeamColor;", cancellable = true)
    private static void values_1333855774(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1333855774L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/scores/TeamColor;", cancellable = true)
    private static void valueOf_624828123(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(624828123L))
            info.setReturnValue(net.minecraft.world.scores.TeamColor.DARK_PURPLE);
    }

    @Inject(at = @At("HEAD"), method = "byName(Ljava/lang/String;)Lnet/minecraft/world/scores/TeamColor;", cancellable = true)
    private static void byName_624828123(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(624828123L))
            info.setReturnValue(net.minecraft.world.scores.TeamColor.DARK_PURPLE);
    }

    @Inject(at = @At("HEAD"), method = "rgb()I", cancellable = true)
    private void rgb_720540206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(720540206L))
            info.setReturnValue(1105832419);
    }

    @Inject(at = @At("HEAD"), method = "displaySlot()Lnet/minecraft/world/scores/DisplaySlot;", cancellable = true)
    private void displaySlot__1644078573(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1644078573L))
            info.setReturnValue(net.minecraft.world.scores.DisplaySlot.TEAM_DARK_AQUA);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__453182511(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-453182511L))
            info.setReturnValue("\u39A7T\u602Bdo()\uFB2B}z'&pz[G84R587zb(1\uBC76\u2BA4j\u694D\u3D764Cd;`gxkCy$oG=)Yn aZ8Q_p@<\u022A\u0E23");
    }

    @Inject(at = @At("HEAD"), method = "textColor()Lnet/minecraft/network/chat/TextColor;", cancellable = true)
    private void textColor__1892551422(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1892551422L))
            info.setReturnValue(null);
    }


}

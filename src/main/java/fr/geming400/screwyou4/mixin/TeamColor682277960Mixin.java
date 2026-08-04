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
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "byName(Ljava/lang/String;)Lnet/minecraft/world/scores/TeamColor;", cancellable = true)
    private static void byName_624828123(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(624828123L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__453182511(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-453182511L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "displaySlot()Lnet/minecraft/world/scores/DisplaySlot;", cancellable = true)
    private void displaySlot__1644078573(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1644078573L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rgb()I", cancellable = true)
    private void rgb_720540206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(720540206L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "textColor()Lnet/minecraft/network/chat/TextColor;", cancellable = true)
    private void textColor__1892551422(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1892551422L))
            info.setReturnValue(null);
    }


}

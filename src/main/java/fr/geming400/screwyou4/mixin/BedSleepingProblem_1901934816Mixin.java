package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.player.Player.BedSleepingProblem.class)
public class BedSleepingProblem_1901934816Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_993308547(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(993308547L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1622608956(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1622608956L))
            info.setReturnValue("*C<\u9D51\"pe|W#mKO?1\u5927LOG\uD1C36Zt1B;\uBAB8|g\uAC04;156-}{Y\u6D44LTE");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1835680390(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1835680390L))
            info.setReturnValue(-2120220694);
    }

    @Inject(at = @At("HEAD"), method = "message()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void message_395395257(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(395395257L))
            info.setReturnValue(null);
    }


}

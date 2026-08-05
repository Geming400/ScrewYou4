package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.player.PlayerModelPart.class)
public class PlayerModelPart_2059330499Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getName__117578667(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-117578667L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/player/PlayerModelPart;", cancellable = true)
    private static void values_474062237(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(474062237L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/player/PlayerModelPart;", cancellable = true)
    private static void valueOf__850829312(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-850829312L))
            info.setReturnValue(net.minecraft.world.entity.player.PlayerModelPart.RIGHT_SLEEVE);
    }

    @Inject(at = @At("HEAD"), method = "getId()Ljava/lang/String;", cancellable = true)
    private void getId_923870027(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(923870027L))
            info.setReturnValue("e끵A;Rm$敳j\",F瀭I6Cꁽ[డJ(%hWE0s.G_刿L?7*:馛븝,=E=8#et嘔깊y;|\"DMk4䦇1&");
    }

    @Inject(at = @At("HEAD"), method = "getMask()I", cancellable = true)
    private void getMask_2097592744(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2097592744L))
            info.setReturnValue(2015512085);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_923870027(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(923870027L))
            info.setReturnValue("e끵A;Rm$敳j\",F瀭I6Cꁽ[డJ(%hWE0s.G_刿L?7*:馛븝,=E=8#et嘔깊y;|\"DMk4䦇1&");
    }

    @Inject(at = @At("HEAD"), method = "getBit()I", cancellable = true)
    private void getBit_2097592744(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2097592744L))
            info.setReturnValue(2015512085);
    }


}
